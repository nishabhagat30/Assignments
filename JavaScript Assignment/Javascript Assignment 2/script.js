async function fetchCategories() {
    let response = await fetch("https://opentdb.com/api_category.php");
    let data = await response.json();

    let select = document.getElementById("category");
    data.trivia_categories.forEach(category => {
        let option = document.createElement("option");
        option.value = category.id;
        option.textContent = category.name;
        select.appendChild(option);
    });

}
fetchCategories();


let currentCategory = null;  
let currentlevel = null;

document.getElementById("startQuiz").addEventListener('click', function() {
    currentCategory = document.getElementById("category").value;
    currentlevel = document.getElementById("level").value;
   
    
    document.getElementById("start-screen").style.display = "none"; 
    document.getElementById("quiz-screen").style.display = "block";
    
    loadQuestion();
  });


  let questionCount = 1;
  const maxQuestions = 15;

let questions = []; 
let questionIndex = 0;

async function fetchQuestions() {
    let Url = `https://opentdb.com/api.php?amount=10&type=multiple&category=${currentCategory}&difficulty=${currentlevel}`;

        let response = await fetch(Url);
        
        if (response.status === 429) {
            setTimeout(fetchQuestions, 2000);
            return;
        }

        let data = await response.json();
        if (data.results.length > 0) {
            questions = data.results;
            questionIndex = 0;
            loadQuestion();
        } else {
            setTimeout(fetchQuestions, 2000);
        }
    } 


function loadQuestion() {
    if (questionCount >= maxQuestions) {
        endQuiz();
        return;
    }
    if (questionIndex < questions.length) {
        display(questions[questionIndex]);
        questionIndex++;
        questionCount++;
        startTimer();
    } else {
        fetchQuestions();
    }
}

    function display(questionData) {
        let questionarea = document.getElementById("question-area");
        questionarea.innerHTML = ""; 
      
        let questionElement = document.createElement("h3");
        questionElement.innerHTML = `Q${questionCount}: ${questionData.question}`;
      

        let answers = questionData.incorrect_answers.concat(questionData.correct_answer);
        answers = answers.sort(() => Math.random() - 0.5);

        let answersDiv = document.createElement("div");
        answersDiv.classList.add("answers");
      
        let answerLabels = ["A", "B", "C", "D"];
      
        answers.forEach((answer, index) => {
            let button = document.createElement("button");
            button.textContent = `${answerLabels[index]}. ${answer}`;
            button.classList.add("answer-btn");
            button.onclick = () => checkAnswer(button, answer, questionData.correct_answer);
            answersDiv.appendChild(button);
        });
      
        questionarea.appendChild(questionElement);
        questionarea.appendChild(answersDiv);
      }

      let timerInterval;
      function startTimer() {
        let timeLeft = 15;
        document.getElementById("timeLeft").innerText = timeLeft;
      
        clearInterval(timerInterval);
        timerInterval = setInterval(() => {
            timeLeft--;
            document.getElementById("timeLeft").innerText = timeLeft;
      
            if (timeLeft === 0) {
                clearInterval(timerInterval);
                showCorrectAnswer() ;
            }
        }, 1000);
      }
      
      function showCorrectAnswer() {
        let allButtons = document.querySelectorAll(".answer-btn");
        let correctAnswer = questions[questionIndex - 1].correct_answer; 
    
        allButtons.forEach(btn => {
            if (btn.textContent.includes(correctAnswer)) {
                btn.classList.add("correct");
            }
        });
    
        setTimeout(() => {
            loadQuestion();
        }, 1000);
    }
    

      let score = 0;
      function checkAnswer(button, selectedAnswer, correctAnswer) {
        clearInterval(timerInterval); 
      
        let allButtons = document.querySelectorAll(".answer-btn");
      
        if (selectedAnswer === correctAnswer) {
            button.classList.add("correct");
            score++; 
            updateScore(); 
        } else {
            button.classList.add("wrong");
      

            allButtons.forEach(btn => {
                if (btn.textContent.includes(correctAnswer)) {
                    btn.classList.add("correct");
                }
            });
        }
      
        
        setTimeout(() => {
            loadQuestion();
        }, 1000);
      }

    function updateScore() {
    document.getElementById("score").innerText = score;
    }

    function endQuiz(){

        document.getElementById("quiz-screen").style.display = "none";
        document.getElementById("end-screen").style.display = "block";

        document.getElementById("Final-score").innerText = score;
        document.getElementById("restart").addEventListener("click", function() {
            location.reload(); 
        });
    }