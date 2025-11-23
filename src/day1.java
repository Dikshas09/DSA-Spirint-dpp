//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*import java.util.*;
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
        System.out.println("temp in fahrenheit= "+ f);
// for discount price.............................................................................
        float op,sp,d;
        op= sc.nextFloat();
        d= sc.nextFloat();
        sp= op*(1-d/100);
        System.out.println("original price= "+ op);
        System.out.println("discount percetage= "+ d);
        System.out.println("selling price = "+ sp);
// for ascii sequence .............................................................................
        String s;
        int a ;
        s= sc.next();
        char c= s.charAt(0);
        a= (int)c;
        System.out.println("given character = "+ c);
        System.out.println("next 1st character = "+ (char)(c+1));
        System.out.println("next 2nd character = "+ (char)(c+2));
//money input..........................................................................................
        int m , n10, mr;
        m= sc.nextInt();
        n10= m/100;
        mr= m%100;
        System.out.println("no. of 100 ruppes notes can be made = "+ n10);
        System.out.println("no. of ruppes remain = "+ mr);
//for average marks in double value...........................................................................
        int m1,m2,m3;
        double avg;
        m1= sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        avg =((m1+m2+m3)/3);
        System.out.println("avg of three marks = "+ avg);
//for taking inputs of two times.................................................................................
        int h2, m2;
        h2 = sc.nextInt();
        m2 = sc.nextInt();
        if(h2>0){
            h2=h2*60;
        }
        System.out.println("total minutes = " + (h2+m2)) ;
// for getting fractional part only................................................................................
        float fr, frp;
        fr = sc.nextFloat();
        int o;
        o=(int)fr;
        frp = fr-o;
        System.out.println("fractional part = "+ frp);
// for getting last two digit .........................................................................
        int d4, count =0,ld,sd=0 ,rs=0 ,rd;
        d4 = sc.nextInt();
        while(count!=2){
            ld= d4%10;
            sd=sd*10+ld;
            d4=d4/10;
            count++;
        }
        while (sd!=0) {
            rd = sd % 10;
            rs = rs * 10 + rd;
            sd = sd / 10;
        }
        System.out.println("last two digits are = "+ rs);
// for getting last digit is even or odd..........................................................................
        int las, rlas;
        las = sc.nextInt();
        rlas = las%10;
        if(rlas%2==0){
            System.out.println(rlas+" even");
        }
        else {
            System.out.println("odd");
        }
//for getting difference in ascii value.................................................................
        String abd,asd;
        abd= sc.next();
        asd= sc.next();
        char ad= abd.charAt(0);
        char assd= asd.charAt(0);
        int y,z;
        y=(int)ad;
        z=(int)assd;
        System.out.println("difference = "+(z-y));
// for type casting double into integer or others..............................................................
        double df;
        df= sc.nextDouble();
        int i;
        i=(int)df;
        float dr;
        dr=(float)(df-i);
        System.out.println("integer part = "+ i);
        System.out.println("decimal part = "+ dr);
    }
}*/