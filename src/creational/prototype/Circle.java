package creational.prototype;

public class Circle extends Shape {

    public Circle(){
        type = "원";
    }

    @Override
    public void draw() {
        System.out.println("원을 그렸습니다.");
    }
}
