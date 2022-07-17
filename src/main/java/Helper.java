public class Helper {
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
}