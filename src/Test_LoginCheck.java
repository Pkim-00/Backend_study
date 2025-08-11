//아이디 대소문자 구분하지 않고 일치시 같은 아이디로 인식

public class Test_LoginCheck {
    public static void main(String[] args) {
        // 아이디값 두개 비교
        String inputId = "Admin";
        String savedId = "admin";


        // 대소문자 구분 없이 비교
        if (inputId.equalsIgnoreCase(savedId)) {
            System.out.println("로그인 성공!");
        } else {
            System.out.println("아이디가 일치하지 않습니다.");
        }

    }
}

