import java.util.Scanner;
import java.util.regex.*;
public class PE4_6 {
        public static void main(String args[]){
            //String content = "ZZZ AA PP AA QQQ AAA ZZ";
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your string: ");
            String str = in.nextLine();

            //String string = "AA";
            Scanner scan = new Scanner(System.in);
            System.out.println("enter your sub string : ");
            String sub = scan.nextLine();
            Pattern pattern = Pattern.compile(sub);
            Matcher matcher = pattern.matcher(str);

            while(matcher.find()) {
                System.out.println("Found at: "+ matcher.start()
                        +
                        " - " + matcher.end());
            }
        }
    }

