public class For {
    public static void main(String[] args) {
        // while과 for는 둘 다 역할은 같고, 선호하는 방식 사용하면 된다.

        // while
        // 조건을 while문 위에서 설정
        // 조건을 반복문 내에서 계속 변경해줘야함.
        // 보통 횟수가 정해지지 않은 반복에 사용
        int count = 0;
        while(count < 10) {
            count++;
        }
        // for
        // 조건 설정 및 조건 변경을 괄호 안에서 모두 처리
        // 이중 for문은 변수를 바깥쪽과 다르게 설정해야함.
        for (int i = 0; i < 10; i++) {
            
        }
        // 무한 반복 : 코드 내에서 break로 멈춰줘야한다.
        while(true){
            break; // 또는 continue;
        }
        for(int i = 0; true; i++) {
            System.out.println("aa");
            // break; // 또는 continue;
        }
    }
}
