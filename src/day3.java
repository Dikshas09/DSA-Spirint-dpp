import java.util.*;
public class day3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
// to get the sum of even no. in a digit......................................................
        int sum=0,r;
        int n= sc.nextInt();
        while(n!=0){
            r=n%10;
            if(r%2==0){
                sum+=r;
            }
            n=n/10;
        }
        System.out.println(sum);
// to get the sum of digits and reverse...........................................................
        int rev=0,n2,n1,os;
        n1= sc.nextInt();
        os=n1;
        while(n1!=0){
            n2=n1%10;
            rev=rev*10+n2;
            n1=n1/10;
        }
        System.out.println("sum of "+rev+"and "+os+" = "+ (rev+os) );
// to get the factorial of n numbers...........................................................................
        int nf;
        nf= sc.nextInt();
        for(int i=1;i<=nf;i++){
            int f=1;
            for(int j=1;j<=i;j++) {
                f = f*j;
            }
        System.out.println(f);
        }
// to get fibonnaci series.......................................
        int n3= sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<=n3;i++){
          int  c=a+b;
           a=b;
           b=c;
            System.out.println(c);
        }
// to get sum of n natural no..........................................................
        int n4=sc.nextInt();
        int sum1=0;
        for(int i=1;i<=n4;i++){
            sum1=sum1+n4;
        }
        System.out.println(sum1);
// to print the prime no. in a range..........................................................
        int n5= sc.nextInt();
        int tn=0;
        for(int j=2;j<=n5;j++){
            int count =1;
            for(int i=2;i<=j;i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if(count==2){
                    System.out.println(j);
                    tn++;
                }
        }
        System.out.println("total no of prime are = "+tn);
// to get the sum of this series 1 - 2 + 3 - 4 + 5 - 6… upto ‘n’.....................................................................
        int ne=0,no=0;
        int n5= sc.nextInt();
        for(int i=1;i<n5;i++){
            if(i%2==0){
                ne+=i;
            }
            else{
                no+=i;
            }
        }
        System.out.println(ne-no);
// gcd.......................................................................................
        int n6,n7;
        n6= sc.nextInt();
        n7= sc.nextInt();
        for(int i =2;i<=n6||i<=n7;i++){
            if(n6%i==0&&n7%i==0){
                if(i==1){continue;}
                System.out.println(i);
            }
        }
// to print cube until n................................................................
        int nc= sc.nextInt();
        for(int i=1;i<=nc;i++){
            System.out.println("the cube of "+i+" = "+i*i*i);
        }
    }
}
