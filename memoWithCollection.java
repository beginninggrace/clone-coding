//- 입력값
//        - 저장할 자료구조명을 입력합니다. (List / Set / Map)
//        - 내가 좋아하는 요리 제목을 먼저 입력합니다.
//        - 이어서 내가 좋아하는 요리 레시피를 한문장씩 입력합니다.
//        - 입력을 마쳤으면 마지막에 “끝” 문자를 입력합니다.
//- 출력값
//        - 입력이 종료되면 저장한 자료구조 이름과 요리 제목을 괄호로 감싸서 먼저 출력 해줍니다.
//        - 이어서, 입력한 모든 문장앞에 번호를 붙여서 입력 순서에 맞게 모두 출력 해줍니다.

package week02;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
public class memoWithCollection {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String collectionName = sc.nextLine();
            String title = sc.nextLine();

            switch (collectionName) {
                case "List":
                    ArrayList<String> strList = new ArrayList<>();
                    while (true) {
                        // 한줄씩 입력받아서 strList 에 저장
                        String text = sc.nextLine();
                        if (Objects.equals(text, "끝")) {
                            break;
                        }
                        strList.add(text);
                    }

                    title = "[ List로 저장된 " + title + " ]";  // [ 제목 ]
                    System.out.println(title);
                    // strList 한줄씩 출력
                    for (int i = 0; i < strList.size(); i++) {
                        int number = i + 1; // i가 위에서 0번째로 시작하기 때문에 1 더해주기
                        System.out.println(number + ". " + strList.get(i)); // get()하면 strList에 추가(add)했던 것들 가져와준다, i번째 가져오기
                    }
                    break;
                case "Set":
                    LinkedHashSet<String> strSet = new LinkedHashSet<>();
                    while (true) {
                        // 한줄씩 입력받아서 strList 에 저장
                        String text = sc.nextLine();
                        if (Objects.equals(text, "끝")) {
                            break;
                        }
                        strSet.add(text);
                    }

                    title = "[ Set 으로 저장된 " + title + " ]";  // [ 제목 ]
                    System.out.println(title);

                    Iterator iterator = strSet.iterator(); // Iterator : 하나씩 순회하게 만드는 구조, 이렇게 strSet을 넘겨주면 하나씩 빙글빙글 돌아가게 만들어준다
                    // strList 한줄씩 출력
                    for (int i = 0; i < strSet.size(); i++) {
                        int number = i + 1;
                        System.out.println(number + ". " + iterator.next()); // iterator.next()로! - 하나하나 불러와서 그 다음 것으로 불러온다~
                    }
                    break;
                case "Map":
                    Map<Integer, String> strMap = new HashMap<>();
                    int lineNumber = 1;
                    while (true) {
                        // 한줄씩 입력받아서 strList 에 저장
                        String text = sc.nextLine();
                        if (Objects.equals(text, "끝")) {
                            break;
                        }
                        strMap.put(lineNumber++, text); // 1부터 시작해서 하나씩 올라가는 번호
                    }

                    title = "[ Map 으로 저장된 " + title + " ]";  // [ 제목 ]
                    System.out.println(title);

                    // strList 한줄씩 출력
                    for (int i = 0; i < strMap.size(); i++) {
                        int number = i + 1;
                        System.out.println(number + ". " + strMap.get(i + 1)); // key값(lineNumber)을 1부터 저장했기 때문에 1 더해준다
                    }
                    break;
                default:
                    System.out.println("저장할 수 없는 자료구조 입니다.");
            }
        }
    }

