package other.static_factory_method;

public class patternDemo {

    public static void main(String[] args) {
        // 생성자
        Character warrior1 = new Character(15, 10,4,4);
        Character archer1 = new Character(10, 15,4,4);
        Character mage1 = new Character(4, 4,15,10);
        Character thief1 = new Character(4, 10,4,15);

        // 정적 팩토리 메서드
        Character warrior2 = Character.newWarrior();
        Character archer2 = Character.newArcher();
        Character mage2 = Character.newMage();
        Character thief2 = Character.newThief();
    }
}
