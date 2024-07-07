import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());

        // 각 정수에 대해 특정 연산을 수행
        int result1 = performOperation(num1);
        int result2 = performOperation(num2);
        int result3 = performOperation(num3);

        // 결과 출력
        System.out.println(result1 + " " + result2 + " " + result3);
    }
    
    private static int performOperation(int num) {
        if (num % 2 == 0) {
            return num / 2;
        } else {
            return num * 3 - 20;
        }
    }
}