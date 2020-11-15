package work;
import java.util.Scanner;
public class main {
    public static void main (String[] args){
    int a;
    way couple =new way();
        /* couple.count(); */
    System.out.println("你想做什么？");
    System.out.println("1、计算阶乘  2、计算斐波那契数列项数值");
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        if (a==1) {
            couple.getcount();
        }
        if (a==2) {
            couple.fb();
        }
    }
}
