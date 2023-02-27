public class Arrow {
    public static void main(String[] args) {
        // 1급 객체 : 언어 최상단에서 작성될 수 있는 타입
        // 자바 - class
        // 자스 - class, 함수, 변수 등 많다
        // 함수의 매개변수가 될 수 있는 것
        // 자바에서 1급 객체는 클래스이기 때문에 함수가 담긴 클래스를 넘겨야한다.
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("안녕");
            }
        }).run();
        new Thread(() -> System.out.println("두번째")).run();
    }
}
