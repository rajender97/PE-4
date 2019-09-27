import javax.script.Compilable;
import java.util.Scanner;
import java.util.regex.*;
public class PE4_5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = in.nextLine();
        System.out.println("you entered string is : "+str);
        Pattern p = Pattern.compile("\\sHarry");
        Matcher m = p.matcher(str);
        Boolean b = m.find();
        System.out.print("Is Harry here ? ");
        System.out.println(b);
    }
}
