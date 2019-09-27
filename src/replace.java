import java.util.*;
public class replace {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = in.nextLine();
        System.out.println("you entered string is : "+str);

       String Array= str.replace("d","f");
       String res= Array.replace("l","t");
       System.out.println(res);
    }
}
