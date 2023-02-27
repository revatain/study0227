public class temp {
   private String name;
// class 생성자가 없을 경우 내부적으로 기본 생성자가 작동한다.
// 생성자를 직접 하나라도 만들면 내부의 기본 생성자가 없어진다.
public temp(String name) {
    this.name = name;
}
    public String getName() {
        // String name = "가짜";
        return this.name;
    }
}
