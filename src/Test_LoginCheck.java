import java.util.Scanner;

public class Test_LoginCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 기준아이디
        String savedId = "Admin";

        System.out.print("아이디를 입력하세요: ");
        String inputId = sc.nextLine();

        // 대소문자 구분 없이 비교
        if (inputId.equalsIgnoreCase(savedId)) {
            System.out.println("로그인 성공!");
        } else {
            System.out.println("아이디가 일치하지 않습니다.");
        }

        sc.close();
    }
}

