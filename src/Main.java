//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//for sum of digit......................................................
        int s1= 0, r1;
        int n = sc.nextInt();
        System.out.println(n);
        while (n != 0) {
            r1 = n % 10;
            s1 = s1 + r1;
            n = n / 10;
        }
        System.out.println("sum of the digit=" + s1);
//for reverse....................................................................
        int s2=0,r2;
        int n2= sc.nextInt();
        int n3=n2;
        while(n2!=0){
           r2=n2%10;
           s2=s2*10+r2;
           n2=n2/10;
        }
        System.out.println("reverse of given no "+ n3 + " = "+ s2);
//for age in days.................................................................................
        int n4= sc.nextInt();
        System.out.println("age in years= "+ n4);
        System.out.println("age in days= "+ n4*365);
//for time in hours and minutes...............................................................
        int n5= sc.nextInt();
        int h,m;
        System.out.println("time in minutes= "+ n5);
        if(n5<=60){
            System.out.println("time =  "+ n5 +" minutes");
        }
        else {
            h=n5/60;
            m=n5%60;
            System.out.println("time = "+ h +" hours "+ m + " minutes");
        }
//for time in hours minutes and seconds...........................................................
        int n6= sc.nextInt();
        int ho,mi,se;
        System.out.println("time in minutes= "+ n6);
        if(n6<=60){
            System.out.println("time =  "+ n6 +" seconds");
        }
        else {
            ho=n6/3600;
            mi=n6/60;
            se=n6%60;
            System.out.println("time = "+ ho+" hours "+ mi + " minutes "+ se +" seconds");
        }
//for temp converter...............................................................................
        int f;
        int c= sc.nextInt();
        System.out.println("temp in celsius= "+ c);
        f = c * 9/5 + 32;
        System.out.println("temp in fehranit= "+ f);
    }
}