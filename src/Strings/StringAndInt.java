package Strings;

public class StringAndInt {
    private int myInt;
    private String myStr;



    public StringAndInt(int x){
        this.setMyInt(x);
    }

    public StringAndInt(String x){
        this.myStr = x;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public String getMyStr() {
        return myStr;
    }

    public void setMyStr(String myStr) {
        this.myStr = myStr;
    }

    public String intToStr(){
        boolean isNegative = false;
        if(this.myInt < 0){
            isNegative = true;
        }

        StringBuilder str = new StringBuilder();
        do{
            str.append((char)('0' + Math.abs(this.myInt % 10)));
            this.myInt /= 10;
        } while (this.myInt != 0);

        if(isNegative){
            str.append('-');
        }
        str.reverse();
        return str.toString();
    }

    public int strToInt(){
        int result = 0;
        for(int i = this.myStr.charAt(0) == '-' ? 1 : 0; i < this.myStr.length(); ++i){
            final int digit = this.myStr.charAt(i) - '0';
            result = result * 10 + digit;
        }
        return this.myStr.charAt(0) == '-' ? -result : result;
    }
}
