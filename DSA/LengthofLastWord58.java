package DSA;

public class LengthofLastWord58 {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;

        int l = 0;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
            l++;
        }
        return l;
    }
}
