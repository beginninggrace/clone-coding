// 문제 1)
//
//        **요리 레시피 메모장 만들기**
//
//        - 입력값
//        - 내가 좋아하는 요리 제목을 먼저 입력합니다.
//        - 요리 별점을 1~5 사이의 소수점이 있는 실수로 입력해주세요. (ex. 3.5)
//        - 이어서 내가 좋아하는 요리 레시피를 한 문장씩 10문장을 입력합니다.
//        - 출력값
//        - 입력이 종료되면 요리 제목을 괄호로 감싸서 먼저 출력 해줍니다.
//        - 이어서, 요리 별점을 소수점을 제외한 정수로만 출력해줍니다. (ex. 3)
//        - 바로 뒤에 정수별점을 5점만점 퍼센트로 표현했을 때 값을 실수로 출력해줍니다. (ex. 60.0%)
//        - 이어서, 입력한 모든 문장 앞에 번호를 붙여서 모두 출력 해줍니다.
//

import java.util.Scanner;
public class memo {

        public static void main(String[] args) {
            // 1. 입력값 : scanner -> 결과창에 입력 받을 수 있게 하는 것
            Scanner sc = new Scanner(System.in); // System.in : 입력하는 키보드 기본 세팅 해주는 것
            String title = sc.nextLine(); // .next() : 띄어쓰기를 하더라도 다음 값으로 넘어감
                                          // .nextLine() : 띄어쓰기 해도 다음 값으로 입력되지 않음
            float rate = sc.nextFloat(); // 별점은 float 타입으로 받으나 나중에 출력값에서 int로 자동 형변환해서 출력하게 만들 것임
            String input1 = sc.nextLine();
            String input2 = sc.nextLine();
            String input3 = sc.nextLine();
            String input4 = sc.nextLine();
            String input5 = sc.nextLine();
            String input6 = sc.nextLine();
            String input7 = sc.nextLine();
            String input8 = sc.nextLine();
            String input9 = sc.nextLine();
            String input10 = sc.nextLine();

            title = "[ " + title + " ]";  // [ 제목 ]
            System.out.println(title);
            int intRate = (int)rate; // 강제 형변환
            System.out.println(intRate);
            double percentageRate = intRate * 100 / 5.0; // 자동 형변환
                                                         // 별점을 퍼센트로 표현하기 위해 나눈 값에 100을 곱해줌
            System.out.println(percentageRate);
            System.out.println("1." + input1);
            System.out.println("2." + input2);
            System.out.println("3." + input3);
            System.out.println("4." + input4);
            System.out.println("5." + input5);
            System.out.println("6." + input6);
            System.out.println("7." + input7);
            System.out.println("8." + input8);
            System.out.println("9." + input9);
            System.out.println("10." + input10); // 밑의 창에 값을 입력하면 자동으로 10. 이 따라 나오는 것을 볼 수 있음

        }

    }

