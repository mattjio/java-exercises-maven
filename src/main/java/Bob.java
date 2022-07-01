import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Bob {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        java.lang.String str = sc.nextLine();
        System.out.println("You entered: " + str);
        if (StringUtils.isNumeric(str)) {
            System.out.println(str+" is a number");
        } else {
            System.out.println(str+" is not a number");
        }
        String flipCase = StringUtils.swapCase(str);
        System.out.println("Flipped Case: " + flipCase);
        String reverse = StringUtils.reverse(str);
        System.out.println("Reversed: " + reverse);
    }

}
