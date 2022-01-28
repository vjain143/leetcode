/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 *
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * Example 2:
 *
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * Example 3:
 *
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 *
 *
 * Constraints:
 *
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
public class RomantoInteger {

    public int romanToInt(String s) {
        int number = 0;
        int  numberI = 1;
        int  numberV = 5;
        int  numberX = 10;
        int  numberL = 50;
        int  numberC = 100;
        int  numberD = 500;
        int  numberM = 1000;
        char valueOld = 0;
        if (1 <= s.length() && s.length() <= 15) {
            for (int index = s.length()-1; index >=0; index--) {
                char value = s.charAt(index);
                switch (value) {
                    case 'I': {
                        if(valueOld == 'V'){
                            number = number-numberI;
                            valueOld = value;
                        } else if(valueOld == 'X'){
                            number = number-numberI;
                            valueOld = value;
                        } else {
                            number = number+numberI;
                            valueOld = value;
                        }
                        break;
                    }
                    case 'V': {
                        number = number+numberV;
                        valueOld = value;
                        break;
                    }
                    case 'X': {
                        if(valueOld == 'L'){
                            number = number - numberX;
                            valueOld = value;
                        } else if(valueOld == 'C'){
                            number = number - numberX;
                            valueOld = value;
                        } else {
                            number = number + numberX;
                            valueOld = value;
                        }
                        break;
                    }
                    case 'L': {
                        number = number+numberL;
                        valueOld = value;
                        break;
                    }
                    case 'C': {
                        if(valueOld == 'D'){
                            number = number - numberC;
                            valueOld = value;
                        } else if(valueOld == 'M'){
                            number = number - numberC;
                            valueOld = value;
                        } else {
                            number = number + numberC;
                            valueOld = value;
                        }
                        break;
                    }
                    case 'D': {
                        number = number+numberD;
                        valueOld = value;
                        break;
                    }
                    case 'M': {
                        number = number+numberM;
                        valueOld = value;
                        break;
                    }
                    default:{
                        System.out.println("Not a roman number");
                        return 0;
                    }
                }
            }
        }
        return number;
    }
}
