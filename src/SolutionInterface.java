import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Siddhartha on 16-09-2018.
 */
public class SolutionInterface {

    public  void  UserInterface(){

        boolean quit =false;
        do{
            System.out.println("************MENU**************");
            System.out.println("Press E to enter mobile number for decoding");
            System.out.println("Press O to exit from program");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            if(Helper.isValidMenuOption(input)){
                switch (input.toLowerCase()){
                    case "e":
                        System.out.println("Please Enter mobile number");
                        sc = new Scanner(System.in);
                        input = sc.next();
                        PerformAction(input);
                        break;
                    case "o":
                        quit=true;
                        default:
                           continue;
                }
            }
            else{
                System.out.println("Please Enter a valid Menu Option from below MENU");
            }

        }while (!quit);

    }
    public boolean PerformAction(String input){

        if(Helper.numberOrNot(input) && (input.length() == 10))
        {
            ArrayList<String> sol =  new BusinessLogic().letterCombinations(input);
            System.out.println(sol);
            return  true;
        }
        else
        {
            System.out.println("*****You have entered invalid mobile number*****");
            return  false;
        }

    }
}
