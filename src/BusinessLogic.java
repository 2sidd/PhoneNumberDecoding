/**
 * Created by Siddhartha on 16-09-2018.
 */
import java.util.HashMap;
import java.util.ArrayList;
public class BusinessLogic {
    String digits;

    {
        digits = "";
    }

    public ArrayList<String> letterCombinations(String digits) {
        this.digits = digits;
        ArrayList<String> res = new ArrayList<String>();
        ArrayList<String> preres = new ArrayList<String>();
        res.add("");
        for(int i = 0; i < digits.length(); i++) {
            String letters = map.get(digits.charAt(i));
            if (letters.length() == 0)
                continue;
            for(String str : res) {
                for(int j = 0; j < letters.length(); j++)
                    preres.add(str + letters.charAt(j));
            }
            res = preres;
            preres = new ArrayList<String>();
        }
        return res;
    }

    static final HashMap<Character,String> map = new HashMap<Character,String>(){{
        put('1', "1");
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");
        put('0', "0");
    }} ;
}
