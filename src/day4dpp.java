import java.util.*;
public class day4dpp {
    public static void main(String[] arg) {
        Scanner sc= new Scanner(System.in);
// question 1..................................................................
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print(i);
            }
            System.out.println("");
        }
// question 2  ...................................................................
        int n1= sc.nextInt();
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n1+1-i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
// question 3.................................................................
        int n2= sc.nextInt();
        for(int i=1;i<=n2;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j + 64));
            }
            System.out.println("");
        }
// question 4.................................................................
        int n3= sc.nextInt();
        for(int i=1;i<=n3+1;i++) {
            for (int j = 1; j <= i; j++) {
                if(i%2==0){
                    System.out.print((char)(j + 64));
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
 // question 5............................................................
        int n4= sc.nextInt();
        for(int i=1;i<=n4;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=n4;i++) {
            for (int j = 1; j <=n4-i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
// question 6.......................................................
        int n5= sc.nextInt();
        int m= sc.nextInt();
        for(int i=1;i<=n5;i++) {
            for (int j = 1; j <=m ; j++) {
                if(i==1||i==n5) {
                    System.out.print("*");
                }
                else if (j==1||j==m) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
// question 7..........................................................
        int n6= sc.nextInt();
        for(int i=1;i<=n6;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
      }
// question 8.....................................................................
        int n7= sc.nextInt();
        for(int i=1;i<=n7;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j + 64));
            }
            System.out.println("");
        }
// question 9...................................................
        int n8= sc.nextInt();
        for(int i=1;i<=n8;i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
// question 10............................................
        int n9= sc.nextInt();
        for(int i=1;i<=n9;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(j+96));
            }
            System.out.println("");
        }
    }
}