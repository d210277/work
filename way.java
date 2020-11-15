package work;
import java.util.Scanner;
public class way {

////    void count(){
////        int numbers,x=1;
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("请输入numbers");
////        numbers=scanner.nextInt();
////        for(int i=1;i<=numbers;i++){
////            x=x*i;
////        }
//    }
    void getcount(){
        int numbers,x=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入numbers");
        numbers=scanner.nextInt();
        for(int i=1;i<=numbers;i++){
            x=x*i;
        System.out.println(""+x);
        }
    }
    void fb(){
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你想计算的斐波那契数列项数");
        n=scanner.nextInt();
        int x=1,y=0,num=0;
        for (int j=1;j<=n;j++){
            num = x + y;
            x = y;
            y = num;
            if (j==1){
                num=0;
            }if (j==2){
                num=1;
            }
        }
        System.out.println(""+num);

    }
}
