package Strings;

public class TestStringAndInt {
    public static void main(String[] args){
        StringAndInt test = new StringAndInt(13151321);
        StringAndInt test1 = new StringAndInt("-12351361");
        System.out.println(test.intToStr());
        System.out.println(test1.strToInt());
    }
}
