class Solution {
    public String intToRoman(int num) {
        String units[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String tens[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String hun[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String thou[] = {"" ,"M","MM","MMM"};
        return (thou[num/1000] + hun[(num/100)%10] + tens[(num/10)%10] + units[num%10]);
    }
}