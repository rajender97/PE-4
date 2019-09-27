import java.util.*;
public class PE4_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = in.nextLine();
        str=str.toLowerCase();
        String[] Array = str.split(" ");
        Arrays.sort(Array);
        for (String a:Array)
            System.out.printf(a +" ");


    }
}
