public class StringManipulator {

    public String trimAndConcat(String str1, String str2) {
        return str1.trim().concat(str2.trim());
    }

    public Integer getIndexOrNull(String str1a, char z) {
        if(str1.indexOf(z) == -1){
            return null;
        }
        else{
            return str1.indexOf(z);
        }
    
    }

    public Integer getIndexOrNull2(String str1, String str2) {
        if(str1.indexOf(str2) == -1){
            return null;
        }
        else{
            return str1.indexOf(str2);
        }
    
    }

    public String concatSubstring(String str1, int start, int end, String str2) {
        str1 = str1.substring(start, end);
        return str1.concat(str2);
    }
}

