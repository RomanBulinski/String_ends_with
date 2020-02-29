public class Solution {

    public static boolean solution(String str, String ending) {
        if(str.length()<ending.length()){
            return false;
        }
        if( str.substring( (str.length()) - ending.length() ).equals( ending ) ){
            return true;
        }
        return false;
    }

}
