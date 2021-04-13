package creational.prototype;

public class Square extends Shape {

    public Square(){
        type = "정사각형";
    }

    @Override
    public void draw() {
        System.out.println("정사각형을 그렸습니다.");
    }
}