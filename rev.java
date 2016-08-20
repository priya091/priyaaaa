import java.util.Scanner;

public class JavaApplication4 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len;
        String str,rev="";
        System.out.print("enter the string");
        str=in.nextLine();
        len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            rev = rev+str.charAt(i);
            
        }
        
        System.out.println(rev);
        
        
        
    }
    
}