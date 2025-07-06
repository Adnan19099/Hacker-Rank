import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Static_initializer_Block {
        static int B;
        static int H;
        static boolean flag = true;

        static {
            Scanner sc = new Scanner(System.in);
            H = sc.nextInt();
            B = sc.nextInt();
            try{
                if(H<=0 || B<= 0) {
                    flag = false;
                    throw new Exception("Breadth and height must be positive");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }

        public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }

        }

}



