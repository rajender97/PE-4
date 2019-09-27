import java.util.*;

public class PE4_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = in.nextLine();
        System.out.println("you entered string is : "+str);


        Scanner sc = new Scanner(System.in);
        System.out.println("enter char to search : ");
        String ch = sc.nextLine();

        System.out.println("Length Of String:" + str.length());
        System.out.println("Length Of String Without ch :" + str.replace(ch, "").length());
        int charcount = str.length() - str.replaceAll(ch, "").length();
        System.out.println("Occurrence Of A Char In String: " + charcount);
    }
    }

