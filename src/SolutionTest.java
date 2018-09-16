/**
 * Created by Siddhartha on 16-09-2018.
 */
import org.jetbrains.annotations.Contract;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    BusinessLogic s1= new BusinessLogic();
    SolutionInterface si = new SolutionInterface();
    @Test
    public  void  validateOutPut(){
        ArrayList<String> result = s1.letterCombinations("9475353249");
        boolean responseIsValid= validateOutPutResponse(result.get(0).toLowerCase());
        assertEquals(true,responseIsValid);
    }
    @Contract(value = "null -> false", pure = true)
    private boolean validateOutPutResponse(String input){
        if(input!="wgpjdjdagw")
            return  true;
        else
            return false;
    }
    @Test
    public void validateInputFormatIsCorrect(){
        boolean result = si.PerformAction("9475353249");
        assertEquals(true,result);
    }
    @Test
    public void validateInputFormatIsNotTenDigit(){
        boolean result = si.PerformAction("947535324");
        assertEquals(false,result);
    }
    @Test
    public void validateInputFormatIsNotAlphabet(){
        boolean result = si.PerformAction("ABCDEFGHIJ");
        assertEquals(false,result);
    }

}
