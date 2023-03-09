//字符类型使用细节
//1.字符常量使用单引号('')扩起来的单个字符。
//2.Java中还允许使用转义字符'\'来将其后的字符转为特殊字符型常量。例如：char c3 = '\n';
//3.在java中，char类型的本质是一个整数，在输出时，是Unicode吗对应的字符。
//4.可以给char赋一个整数，然后输出时，会按照对应的unicode输出
//字符类型的本质探讨
//1.字符型存储到计算机中，需要将字符型对象的码值找出来，例如'a'
//存储：'a' ==> 码值 97 ==> 二进制 ===>存储
//读取：二进制 ==> 97 ===>'a'===>显示
//2.字符和码值对应关系是通过字符编码表决定的


public class CharDetail {

    public static void main(String[] args) {
        char c1 = 97;
        System.out.println(c1);

        char c2 = 'a';
        System.out.println((int) c2);
    }
}