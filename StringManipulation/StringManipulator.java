public class StringManipulator {
    
    public String trimAndConcat(String str1, String str2) {
        
        String newStr = str1.trim() + " " + str2.trim();

        return newStr;
    }

    public Integer getIndexOrNull(String str,char character) {

        int result = str.indexOf(character);

        if(result < 0) {
            return null;
        } else {
            return result;
        }
    }

    public Integer getIndexOrNull2(String str1, String str2) {

        int result = str1.indexOf(str2);

        if (result < 0) {
            return null;
        } else {
            return result;
        }
    }

    public String concatSubstring(String str1, int num1, int num2, String str2) {
        
        return str1.substring(num1, num2) + str2;
    }
}

