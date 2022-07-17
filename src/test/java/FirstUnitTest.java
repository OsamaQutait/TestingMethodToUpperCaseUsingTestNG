import org.testng.annotations.Test;

public class FirstUnitTest {
    @Test
    void toUpperCase(){
        String word="chANge To UppercaSE";
        String wordInUpperCaseFromFirstMethod =  Helper.toUpperCase1(word);
        System.out.println("The output from the first method :: "+wordInUpperCaseFromFirstMethod);
        String wordInUpperCaseFromSecondMethod =  Helper.toUpperCase2(word);
        System.out.println("The output from the second method :: "+wordInUpperCaseFromSecondMethod);
        assert wordInUpperCaseFromFirstMethod.equals(wordInUpperCaseFromSecondMethod) : "there is a bug in your method";
    }
}
