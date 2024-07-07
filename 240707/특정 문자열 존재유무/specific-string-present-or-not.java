import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        String target = st.nextToken();
        
        List<String> strings = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            strings.add(bf.readLine());
        }
        
        for (String str : strings) {
            if (str.contains(target)) {
                System.out.println(str);
            }
        }
    }
}