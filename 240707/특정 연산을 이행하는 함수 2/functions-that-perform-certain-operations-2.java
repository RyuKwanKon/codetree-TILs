import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        double num1 = Double.parseDouble(st.nextToken());
        double num2 = Double.parseDouble(st.nextToken());
        double num3 = Double.parseDouble(st.nextToken());

        // 3개의 숫자를 리스트에 추가
        List<Double> numbers = new ArrayList<>();
        numbers.add(num1);
        numbers.add(num2);
        numbers.add(num3);

        // 정렬
        Collections.sort(numbers);

        // 각각의 수를 변환
        int smallest = (int) Math.floor(numbers.get(0));
        int middle = (int) Math.round(numbers.get(1));
        int largest = (int) Math.ceil(numbers.get(2));

        // 결과 출력
        System.out.println(largest + " " + smallest + " " + middle);
    }
}