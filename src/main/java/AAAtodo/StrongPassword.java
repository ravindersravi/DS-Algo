package AAAtodo;
/*
1. min 8 characters
2. 1Upper letter
3. 2 lower letter
4. 1 Digit
5. special char !@#$%^&*()_+
6. 2 same char should not be adjecent location
 */
public class StrongPassword {
    public static void main(String[] args) {


    }
    static boolean passwordCheck(String password){
        if(password.length()<8)
            return false;
        boolean lower = false, upper =false, special=false,digits= false;
        String specialChar = "!@#$%^&*()-+";
        for(char c: password.toCharArray()){
            if('a'<=c && c<='z')
                lower = true;
            if('A'<=c && c<='Z')
                upper = true;
            if('0'<=c && c<='9')
                digits = true;
            for(char d: specialChar.toCharArray()){
                if(c == d) special = true;
            }
        }
        if(!lower ||!upper || !special || !digits) return false;

        for(int i=1;i<password.length();i++){
            if(password.charAt(i)==password.charAt(i-1)){
                return false;
            }
        }
        return true;
    }
}
