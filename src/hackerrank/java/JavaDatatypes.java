package hackerrank.java;

import java.util.Scanner;

/*
https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
byte 8-bit signed -2^7 ~ 2^7 - 1 = -128 ~ 127
short 16-bit signed -2^15 ~ 2^15 - 1 = -32768 ~ 32767
int 32-bit signed -2^31 ~ 2^31 - 1 = -2147483648 ~ 2147483647
long 64-bit signed -2^63 ~ 2^63 - 1 = -9223372036854775808 ~ 9223372036854775807
 */
public class JavaDatatypes {
    public static void main(String[] args) {

        /*byte b1 = -128;
        byte b2 = 127;
        System.out.println(b1);
        System.out.println(b2);

        short s1 = -32768;
        short s2 = 32767;
        System.out.println(s1);
        System.out.println(s2);

        int i1 = -2147483648;
        int i2 = 2147483647;
        System.out.println(i1);
        System.out.println(i2);

        long l1 = -9223372036854775808L;
        long l2 = 9223372036854775807L;
        System.out.println(l1);
        System.out.println(l2);*/

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                }
                if (x >= -2147483648 && x <= 2147483647) {
                    System.out.println("* int");
                }
                if (x >= -9223372036854775808L && x <= 9223372036854775807L) {
                    System.out.println("* long");
                }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
