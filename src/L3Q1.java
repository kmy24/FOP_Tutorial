//test
import java.util.Scanner;
public class L3Q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no1,no2;
        int result=0;
        char operation;
        
        System.out.print("Enter two integer number: ");
        no1=input.nextInt();
        no2=input.nextInt();
        
        System.out.print("Enter the operand: ");
        operation=input.next().charAt(0);
        
        switch(operation) {
            case '+' :
                result=no1+no2;
                break;
            case '-' :
                result=no1-no2;
                break;
            case '*' :
                result=no1*no2;
                break;
            case '/' :
                if(no2!=0){
                    result=no1/no2;    
                }
                else{
                    System.out.println("Invalid !");
                    return;
                }
                break;
            default :
                System.out.println("Invalid operation !");
                return;
         }
        
        
        
        System.out.println(no1 +" "+operation+" "+ no2 + " = " + result );
        
    }
}