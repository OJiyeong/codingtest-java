/*
[그리디]
백준 2839번 설탕 배달

- 5kg 최대한 많이 사용
- 남은 무게가 3의 배수인가
- 안 되면 5kg 하나 줄이면서
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;

        while (N >= 0) {
            if (N % 5 == 0) {
                count += N / 5;
                System.out.println(count);
                return;
            }
            N -= 3;
            count++;
        }

        System.out.println(-1);
    }
}