package leetcode;

public class _200429_2 {
    public static void main(String[] args) {

        int x = -129999934;
        String a = String.valueOf(x);
        String tmp ="";

        for(int i = a.length()-1; i >= 0; i--){

            tmp = tmp + a.charAt(i);

            if( a.contains("-") ==true && i == 1 ){

                int q = Integer.parseInt(tmp) * -1 ;

                System.out.println(q);
            }
        }
    }
}