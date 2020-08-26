package kakao.challenges2018;

import java.util.Scanner;

//https://javaplant.tistory.com/4
//https://taesan94.tistory.com/32

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dartResult = scanner.nextLine();

        //System.out.println(solution(dartResult));
        System.out.println(solution2(dartResult));
        //solution(dartResult);
        //1S2D*3T	37
        //1D2S#10S  9
        //1S*2T*3S  23
        //1D#2S*3S  5
        //1T2D3D#   -4
        //10D10T10S 1110
        //10D*10T*10S 2410
    }

    public static int solution(String dartResult) {
        int answer = 0;
        char[] dart = dartResult.toCharArray(); //배열에 한글자씩
        int[] result = new int[3]; //결과값을 담음
        int resultCount = 0;
        String num = ""; // 숫자 붙이기
        int intNum = 0; // 정수형 숫자로 변환
        boolean numCheck = false;

        for (int i = 0; i < dart.length; i++) {
            //숫자일 경우, 10일 경우 (2자리)
            if (Character.isDigit(dart[i])) {
                //초기화
                //초기화 할때 값을 넣어주는 것 때문에 코드가 헷갈림
                if (numCheck) {
                    result[resultCount] = intNum;
                    resultCount++;
                    numCheck = false;
                    num = "";
                    intNum = 0;
                }
                num += dart[i];
                intNum = Integer.valueOf(num);
                continue;
            }

            numCheck = true;

            switch (dart[i]) {
                case 'S':
                    intNum = (int)Math.pow(intNum, 1);
                    break;
                case 'D':
                    intNum = (int)Math.pow(intNum, 2);
                    break;
                case 'T':
                    intNum = (int)Math.pow(intNum, 3);
                    break;
                case '*':
                    intNum *= 2;
                    if (resultCount != 0) {
                        result[resultCount - 1] *= 2;
                    }
                    break;
                case '#':
                    intNum *= -1;
                    break;
            }

            if (resultCount == 2) {
                result[resultCount] = intNum;
            }
        }

        for (int i = 0; i < result.length; i++) {
            answer += result[i];
        }


        return answer;
    }

    public static int solution2(String dartResult) {
        int answer = 0;
        int[] result = new int[3];
        int count = 0;
        String num = "";
        char[] arr = dartResult.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) { //숫자일때, 10일때
                num += arr[i];
            } else {
                if (!num.equals("")) { //10D* 일때 *부분에서 에러가 나기때문
                    result[count++] = Integer.parseInt(num); //count++는 3번만 돌아야됨
                    num = "";
                }

                switch (arr[i]) {
                    case 'S':
                        result[count - 1] = (int)Math.pow(result[count - 1], 1);
                        break;
                    case 'D':
                        result[count - 1] = (int)Math.pow(result[count - 1], 2);
                        break;
                    case 'T':
                        result[count - 1] = (int)Math.pow(result[count - 1], 3);
                        break;
                    case '*':
                        result[count - 1] *= 2;
                        if (count - 1 != 0) {
                            result[count - 2] *= 2;
                        }
                        break;
                    case '#':
                        result[count - 1] *= -1;
                        break;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            answer += result[i];
        }

        return answer;
    }
}
