import org.testng.annotations.Test;

public class FirstUnitTest {
    @Test
    void setup(){
        System.out.println("opining browser");
    }

    @Test
    void login(){
        System.out.println("This is login test");
    }

    @Test
    void teardown(){
        System.out.println("closing browser");
    }

    @Test
    void toUpperCase(){
        String x="HelopfdskposkpoetjroaASFERgdsgsa";
        assert First.toUpperCase1(x).equals(First.toUpperCase2(x));
    }

    @Test
    void square(){
        int num = 12;
        assert First.square1(num) == First.square2(num);
        /*if (First.square1(num) == First.square2(num))
            System.out.println("True");*/
    }

}
