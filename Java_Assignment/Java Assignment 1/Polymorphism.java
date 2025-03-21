class Shape{
    public void area(){
    System.out.println("This is parent class");
    }

    public void area(String s){
        System.out.println(s);
    }
}
class Rectangle extends Shape{
    public void area(int l,int b){
        System.out.println("Area of rectange is:"+(l*b));
    }
}

class Square extends Shape{
    public void area(int a){
        System.out.println("Area of square is:"+(a*a));
    }
}

public class Polymorphism{
    public static void main(String[] args) {
        Shape s = new Shape();
        s.area(); // Calls parent class method
        s.area("Hello");

        Rectangle r = new Rectangle();
        r.area(4, 5); // Calls Rectangle's method

        Square sq = new Square();
        sq.area(6); // Calls Square's method
    }
}