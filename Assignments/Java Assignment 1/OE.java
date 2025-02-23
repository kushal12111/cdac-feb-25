import java.util.*;
class OE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input a number:");
        int a=sc.nextInt();
        
        if(a%2==0){
            System.out.printf("the number " + a + " is Even");
        }
        else{
            System.out.printf("the number " + a + " is Odd");
        }
    }
}
