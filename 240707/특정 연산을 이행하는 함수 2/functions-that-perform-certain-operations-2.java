import java.io.*;
import java.util.*;

public class Main {
    static class Number {
        double value;
        int index;
        
        Number(double value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        List<Number> numbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            numbers.add(new Number(Double.parseDouble(st.nextToken()), i));
        }

        // 가장 큰 수, 중간 수, 가장 작은 수를 각각 구함
        Number smallest = numbers.stream().min(Comparator.comparingDouble(n -> n.value)).get();
        Number largest = numbers.stream().max(Comparator.comparingDouble(n -> n.value)).get();
        Number middle = numbers.stream().filter(n -> n != smallest && n != largest).findFirst().get();

        // 각 수를 조건에 맞게 변환
        int[] result = new int[3];
        result[smallest.index] = (int) Math.floor(smallest.value);
        result[middle.index] = (int) Math.round(middle.value);
        result[largest.index] = (int) Math.ceil(largest.value);

        // 결과 출력
        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }
}