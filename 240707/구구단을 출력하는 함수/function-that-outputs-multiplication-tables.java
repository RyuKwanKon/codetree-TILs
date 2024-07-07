import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(numbers);
        
        int min = numbers[0];
        int mid = numbers[1];
        int max = numbers[2];
        
        for (int i = min; i <= max; i++) {
            if (i != mid) {
                printMultiplicationTable(i);
            }
        }
    }
    
    private static void printMultiplicationTable(int n) {
        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}