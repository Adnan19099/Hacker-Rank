import java.util.*;
import java.io.*;
public class Loops_2 {

        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                double p = 0;
                int sum;
                for(int k = 0; k < n; k++) {
                    p += b*Math.pow(2,k);
                    sum = (int)(a+p);
                    System.out.print(sum+" ");
                }
                System.out.println();
            }

            in.close();
        }
}

