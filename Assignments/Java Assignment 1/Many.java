import java.util.*;
class Many{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input first number:");
        int a=sc.nextInt();
        System.out.print("Input second number:");
        int b=sc.nextInt();
        int sum=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println(a + "+" + b +  "=" + sum);
        System.out.println(a + "-" + b +  "=" + sub);
        System.out.println(a + "x" + b +  "=" + mul);
        System.out.println(a + "/" + b +  "=" + div);
        System.out.println(a + "%" + b +  "=" + mod);
        
    }
}