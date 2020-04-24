package Programmers;

    public class _200423 {
        public static void main(String[] args) {

            String answer = "222444";
            int length = answer.length();
            String F = answer.substring(answer.length() - 4, answer.length());
            String a = "";
            String sum = "*";

            if (4 <= length || length >= 20) {
                for (int i = 0; i < length - 4; i++) {
                    a = a.concat(sum);
                }
                System.out.println(a + F);
            }
        }
    }
