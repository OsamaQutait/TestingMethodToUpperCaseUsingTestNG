public class First {
    static String toUpperCase1(String str){
        return str.toUpperCase();
    }

    static String toUpperCase2(String str){
        StringBuilder ans = new StringBuilder();
        for (char c:str.toCharArray()) {
            ans.append(Character.toUpperCase(c));
        }
        return ans.toString();
    }

    static double square1(int num){
        return num*num;
    }

    static double square2(int num){
        return Math.pow(num, 2);
    }

}
