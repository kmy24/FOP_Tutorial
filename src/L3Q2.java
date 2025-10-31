import java.util.Random;
public class L3Q2{
    public static void main(String[] args) {
        Random g = new Random();
        int num = g.nextInt(6);
        String num_text = "";
        
        switch(num){
            case 0 :
                num_text="zero";
                break;
            case 1 :
                num_text="one";
                break;
            case 2 :
                num_text="two";
                break;
            case 3 :
                num_text="three";
                break;
            case 4 :
                num_text="four";
                break;
            case 5 :
                num_text="five";
                break;        
        }
        
        System.out.println(num + " is " + num_text);
        
    }
}