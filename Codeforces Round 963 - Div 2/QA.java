import java.util.*;

public class QA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int q = sc.nextInt();
            String ans = sc.next();
            int[] options = new int[4];
            for (int j = 0; j < ans.length(); j++) {
                if (ans.charAt(j) == '?') {
                    continue;
                }
                options[ans.charAt(j) - 'A']++;
            }
            int marks = 0;
            for (int j = 0; j < 4; j++) {
                if (options[j] >= q) {
                    marks += q;
                } else {
                    marks += options[j];
                }
            }
            System.out.println(marks);
        }
        sc.close();
    }
}
