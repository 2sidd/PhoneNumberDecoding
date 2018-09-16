import org.jetbrains.annotations.Contract;

/**
 * Created by Siddhartha on 16-09-2018.
 */
public class Helper {
    public static boolean numberOrNot(String input)
    {
        try
        {
            Long.parseLong(input.toString());
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
    @Contract(pure = true)
    public  static boolean isValidMenuOption(String input){

            try
            {
                if(input=="E" || input=="e" || input=="O" || input=="o" || input=="")
                    return true;
            }
            catch(NumberFormatException ex)
            {
                return false;
            }
        return true;
    }
}
