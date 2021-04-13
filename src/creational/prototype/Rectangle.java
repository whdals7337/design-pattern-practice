package creational.prototype;

public class Rectangle extends Shape {

    public Rectangle(){
        type = "직사각형";
    }

    @Override
    public void draw() {
        System.out.println("직사각형을 그렸습니다.");
    }
}