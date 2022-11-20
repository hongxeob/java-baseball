package practice;

import java.util.Scanner;

public class BaseBall1 {
    public static void main(String[] args) {
        int arr[] = new int[3]; // 랜덤 숫자
        int inputArr[] = new int[3]; // 유저가 적은 숫자
        int strike = 0;
        int ball = 0;

        //과정1: 배열의 길이만큼 반복문을 돌려 랜덤 숫자를 뽑고 중복이 있는지 확인
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 9 + 1); // 랜덤 숫자를 배열에 넣기
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    i--;
                    break;
                }
            }
        }
        for (int x : arr) {
            System.out.println(x + "");
        }

        Scanner sc = new Scanner(System.in);
        while (true) {
            //과정 2: inputArr.length만큼 반복해 유저가 입력한 숫자를 순서대로 inputdArr에 넣는다
            for (int i = 0; i < inputArr.length; i++) {
                System.out.println("1~9 사이의 숫자를 적으세요 : ");
                inputArr[i] = sc.nextInt();
                for (int j = 0; j < i; j++) {
                    if (inputArr[j] == inputArr[i]) {
                        System.out.println("중복된 값을 입력했습니다.");
                        i--;
                        break;
                    }
                }
            }
            //과정3: 유저가 입력한 숫자와 랜덤 숫자를 비교하여 볼 스트라이크 구분
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < inputArr.length; j++) {
                    if (arr[i] == inputArr[j] && i == j) {
                        strike++;
                    } else if (arr[i] == inputArr[j] && i != j) {
                        ball++;
                    }
                }
            }
            if (strike == 0 && ball == 0) {
                System.out.println("낫싱");
            } else if (strike == 3) {
                System.out.println("축하합니다 정답입니다.");
                break;
            } else {
                System.out.println(strike + " 스트라이크 " + ball + " 볼");
                System.out.println("============================");
            }
            strike = 0;
            ball = 0;
        }
    }


}

