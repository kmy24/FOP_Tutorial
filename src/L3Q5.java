import java.util.Scanner;
public class L3Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,d,e,f;
        
        System.out.print("Enter a : ");
        a = input.nextDouble();
        
        System.out.print("Enter b : ");
        b = input.nextDouble();
        
        System.out.print("Enter c : ");
        c = input.nextDouble();
        
        System.out.print("Enter d : ");
        d = input.nextDouble();
        
        System.out.print("Enter e : ");
        e = input.nextDouble();
        
        System.out.print("Enter f : ");
        f = input.nextDouble();
        
        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));
        
        System.out.println("x : " + x);
        System.out.println("y : " + y);
        
        if (((a*d)-(b*c))==0){
            System.out.println("The equation has no solution");
        }
        
    }
    
}
