package other.static_factory_method;

public class Character {
    int STR;
    int DEX;
    int INT;
    int LUK;

    public Character(int STR, int DEX, int INT, int LUK) {
        this.STR = STR;
        this.DEX = DEX;
        this.INT = INT;
        this.LUK = LUK;
    }

    //from : 하나의 매개 변수를 받아서 객체를 생성
    //of : 여러개의 매개 변수를 받아서 객체를 생성
    //getInstance | instance : 인스턴스를 생성. 이전에 반환했던 것과 같을 수 있음.
    //newInstance | create : 새로운 인스턴스를 생성
    //get[OtherType] : 다른 타입의 인스턴스를 생성. 이전에 반환했던 것과 같을 수 있음.
    //new[OtherType] : 다른 타입의 새로운 인스턴스를 생성.

    public static Character newWarrior() {
        return new Character(15, 10,4,4);
    }

    public static Character newArcher() {
        return new Character(10, 15,4,4);
    }

    public static Character newMage() {
        return new Character(4, 4,15,10);
    }

    public static Character newThief() {
        return new Character(4, 10,4,15);
    }
}
