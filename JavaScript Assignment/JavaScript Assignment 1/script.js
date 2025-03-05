document.getElementById("startGame").addEventListener("click", function() {
    let player1 = document.getElementById("player1Name").value;
    let player2 = document.getElementById("player2Name").value;

    document.getElementById("player1").innerText = player1;
    document.getElementById("player2").innerText = player2;

    document.getElementById("turn").innerText = `${player1} Turn`;

   
    document.getElementById("start").style.display = "none";
    document.getElementById("Game").style.display = "flex";
});


let currentPlayer = 1;
let currentScore = 0;
let savedScores = [0, 0]; 

document.getElementById("roll").addEventListener('click', function(){
    let dice = document.getElementById("img");
    dice.setAttribute("src", "./Asset/diceroll.gif");

    setTimeout(() => {
        let random = Math.floor(Math.random() * 6) + 1;
        dice.setAttribute('src', './Asset/dice' + random + '.png');

        if (random == 1) {
            currentScore = 0;
            Pass();
        } else {
            currentScore = random;
        }

        document.getElementById(`currentScore${currentPlayer}`).innerText = currentScore;
    },500);

});

document.getElementById("save").addEventListener("click", function() {
    savedScores[currentPlayer - 1] += currentScore;
    currentScore = 0; 

    document.getElementById(`savedScore${currentPlayer}`).innerText = savedScores[currentPlayer - 1];
    document.getElementById(`currentScore${currentPlayer}`).innerText = currentScore;

   
    let playerName = document.getElementById(`player${currentPlayer}Name`).value;

    
    if (savedScores[currentPlayer - 1] >= 100) {
        document.getElementById("Game").style.display = "none"; // Hide game interface
        document.getElementById("winnerSection").style.display = "block"; // Show winner section
        document.getElementById("winnerMessage").innerText = `${playerName} Wins!!!`;
        return;
    }

    Pass();
});


document.getElementById("restart").addEventListener("click", function() {
    location.reload(); 
});


document.getElementById("reset").addEventListener("click", function() {
    currentPlayer = 1;
    currentScore = 0;
    savedScores = [0, 0];

    document.getElementById("currentScore1").innerText = "0";
    document.getElementById("savedScore1").innerText = "0";
    document.getElementById("currentScore2").innerText = "0";
    document.getElementById("savedScore2").innerText = "0";
    document.getElementById("img").setAttribute("src", "./Asset/dice1.png");

    let player1Name = document.getElementById("player1Name").value;
    document.getElementById("turn").innerText = `${player1Name} Turn`;
});


function Pass() {
    currentScore = 0;
    document.getElementById(`currentScore${currentPlayer}`).innerText = currentScore;

    currentPlayer = currentPlayer === 1 ? 2 : 1;

    let playerName = document.getElementById(`player${currentPlayer}Name`).value;

    document.getElementById("turn").innerText = `${playerName} Turn`;
}


