package Programmers;

public class _200424 {
    public static void main(String[] args) {

     int T = 12;
     int W = T / 2;
    String A = "수박";
    String B = "수";
    String temp = "";

    if(T <= 10000){

        if(T % 2 == 0){

            for(int i = 0; i < W; i++ ){
                temp = A.concat(temp);
            }
        }else{

            if(T==1){
                temp = B;
            }

            for(int i = 0; i < W; i++ ){
                temp = A.concat(temp);
                if(i== W-1 ){
                    temp = temp.concat(B);
                }
            }
        }
        }
        System.out.println((temp));
    }
}
