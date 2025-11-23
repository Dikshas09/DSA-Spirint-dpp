import java.util.*;
public class Day1dpp {
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
// for printing alpha inter.....................................................
         int n2= sc.nextInt();
        for(int i=0; i<n2;i++){
            System.out.println("Alpha Intern");
        }
// for printing 1 to n..............................................................
        int n1= sc.nextInt();
        for(int i=0; i<=n1;i++){
            System.out.println(i);
        }
  // for printing n to 1........................................................
        int nd = sc.nextInt();
        for(int i=nd;i>=0;i--){
            System.out.println(i);
        }
// for printing even ........................................................
        int ne= sc.nextInt();
        for(int i=2;i<=ne;i+=2){
            System.out.println(i);
        }
 // for printing odd....................................................
        int no= sc.nextInt();
        for(int i=1;i<=no;i+=2) {
            System.out.println(i);
        }
// for printing ap series......................................................
        int a , d , n;
        a= sc.nextInt();
        d = sc.nextInt();
        n = sc.nextInt();
        for(int i=0;i<a+(n-1)*d;i=i+d){
            System.out.println(i);
        }
// for printing downward series of ap from 100 to last positive no. ........................................
        int count=0;
        int a1=100;
        for (int i=1;a1>=0;i++){
            System.out.println(a1);
            a1-=3;
            count++;
        }
        System.out.println(count);
//for printing gp series..................................................................
        int a2=3,ng;
        ng =sc.nextInt();
        for (int i=1;i<=ng;i++){
            System.out.println(a2);
            a2*=3;
        }
// for printing 1 to n..........................................
        int nc=1;
        int l=sc.nextInt();
        while(nc<=l){
            System.out.println(nc);
            nc++;
        }
// for printing sum..........................................................................
        int nc1=1,sum=0;
        int l1=sc.nextInt();
        while(nc1<=l1){
            nc1++;
            sum+=nc1;
        }
        System.out.println(sum);
// for getting multiples of n................................................................
        int nl= sc.nextInt();
        int i=1;
        while(i<=nl){
            System.out.println(3*i);
            i++;
        }
// for printing factorial...............................................................
        int nf= sc.nextInt();
        int f=1;
        for(int i=1;i<nf;i++){
            f=f*i;
        }
        System.out.println(f);
    }
}