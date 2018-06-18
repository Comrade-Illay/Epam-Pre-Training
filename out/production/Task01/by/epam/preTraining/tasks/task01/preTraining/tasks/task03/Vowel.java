package by.epam.preTraining.tasks.task03;

public class Vowel {
    public static final int UNICODE_OF_A_LOWERCASE = 65;
    public static final int UNICODE_OF_E_LOWERCASE = 69;
    public static final int UNICODE_OF_I_LOWERCASE = 73;
    public static final int UNICODE_OF_O_LOWERCASE = 79;
    public static final int UNICODE_OF_U_LOWERCASE = 85;
    public static final int UNICODE_OF_Y_LOWERCASE = 89;

    public static final int UNICODE_OF_A_CAPITAL = 97;
    public static final int UNICODE_OF_E_CAPITAL = 101;
    public static final int UNICODE_OF_I_CAPITAL = 105;
    public static final int UNICODE_OF_O_CAPITAL = 111;
    public static final int UNICODE_OF_U_CAPITAL = 117;
    public static final int UNICODE_OF_Y_CAPITAL = 121;

    public static boolean isVowel1(char letter) {

        boolean result = false;
        int unicodeOfLetter = (int) letter;

     if(unicodeOfLetter == UNICODE_OF_A_CAPITAL || unicodeOfLetter == UNICODE_OF_E_CAPITAL ||
                unicodeOfLetter == UNICODE_OF_I_CAPITAL || unicodeOfLetter == UNICODE_OF_O_CAPITAL ||
                unicodeOfLetter == UNICODE_OF_U_CAPITAL || unicodeOfLetter == UNICODE_OF_Y_CAPITAL ||
                unicodeOfLetter == UNICODE_OF_A_LOWERCASE || unicodeOfLetter == UNICODE_OF_E_LOWERCASE ||
                unicodeOfLetter == UNICODE_OF_I_LOWERCASE || unicodeOfLetter == UNICODE_OF_O_LOWERCASE ||
                unicodeOfLetter == UNICODE_OF_U_LOWERCASE || unicodeOfLetter == UNICODE_OF_Y_LOWERCASE){
         result = true;
     }
     return result;
    }

    public static boolean isVowel2(char vowel) {
        return vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u'
                || vowel == 'A' || vowel == 'E' || vowel == 'I' || vowel == 'O' || vowel == 'U';
    }

    public static boolean isVowel3(char vowel) {

        switch (vowel) {
            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
                return true;
            default:
                return false;
        }

    }

    public static boolean isVowel4(char vowel) {

        boolean result = false;

        if (vowel == 'a' || vowel == 'A') {
            result = true;
        }else if (vowel == 'e' || vowel == 'E') {
            result = true;
        }else if (vowel == 'i' || vowel == 'I') {
            result = true;
        }else if (vowel == 'o' || vowel == 'O') {
            result = true;
        }else if (vowel == 'u' || vowel == 'U') {
            result = true;
        }

        return result;
    }

}
