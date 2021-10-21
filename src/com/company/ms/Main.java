// 2 strings, s is subsequence of t
// len s always <= t


public class Main {

    private static boolean isSubsequence(String s, String t) {
        if(s.isEmpty()) return true;
        if(t.isEmpty() && !s.isEmpty()) return false;

        int count = s.length();

        char c;
        for(int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            for(int j = 0; j < t.length(); j++) {
                if(t.charAt(j) == c) {
                    count--;
                    if(count == 0) return true;
                    continue;
                }
            }            
        }

        return false;
    }

    public static void main(String[] args) {
        String testA = "abc";
        String testB = "tamnbwc";


        System.out.println(isSubsequence(testA, testB));

        String emptyString = "";

        System.out.println(isSubsequence(emptyString, testB));

        System.out.println(isSubsequence(emptyString, emptyString));

        System.out.println(isSubsequence(testB, testB));

        System.out.println(isSubsequence(testB, testA));
    }

}