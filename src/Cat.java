// abstract 추상적 -> 인스턴스 불가능
// 종류 ex) 동물, 식물, 가구, 음식 
abstract class Animal {
    private String name;

    abstract void speak();
}

// interface 추상적 -> 인스턴스 불가능
// 기능 ex) 입, 눈, 코, 귀, 버튼, 손, 발
interface Mouth {
    void eat();
}

interface Ear {
    void hear();
}

// class 구체적 -> 인스턴스 가능
// 고양이
public class Cat extends Animal implements Mouth, Ear {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    void speak() {
        System.out.println("야옹");
    }

    @Override
    public void eat() {
        System.out.println("냠냠");
    }

    @Override
    public void hear() {
       

    }

}