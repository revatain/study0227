public class Arrow {
    // Arrow.java
    public static void main(String[] args) {
        // 1급 객체
        // 1급 객체란 언어 최상단에서
        // 작성될 수 있는 타입을 말한다
        // 자바 - class
        // 자스 - class, 함수, 변수 등 많음

        // 함수의 매개변수가 될 수 있는 것

        // Thread가 생성될 때 필요한 것은 함수
        // run함수가 필요하다.
        // 자바에서 매개변수로 넘길 수 있는
        // 1급 객체는 class뿐이기 때문에
        // 함수가 담긴 클래스를 넘겨야 한다
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("안녕");
            }
        }).run();
        // 자바에서 화살표 함수(람다)는
        // 익명함수를 매개변수로 넘겨줄 때 사용한다
        new Thread(() -> System.out.println("두번째")).run();

    }

}
