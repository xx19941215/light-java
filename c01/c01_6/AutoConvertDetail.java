//自动类型转换细节
//char -> int -> long -> float -> double
// byte -> short -> int -> long -> float ->double
public class AutoConvertDeatil {
    public static void main(String[] args) {
//1。有多种类型的数据混合运算时，系统首先将所有数据转换成容量最大的那种类型，然后进行计算
        int n1 = 10;
//        float d1 = n1 + 1.1; //错误
//        double d1 = n1 + 1.1; //或者
        float d1 = n1 + 1.1F;
//2。当我们把精度大的数据类型赋值给精度小的数据类型时会报错，反之则会进行自动类型转换。
        double n2 = 1.1; //错误 double -> int
//3。byte,short和char之间不会相互自动转换。
        //当把数赋给byte时，先判断该数是否在byte范围内，如果是就可以
        byte b1 = 10;
//4。byte，short，和char之间不会相互转换
        //当把数赋给byte时，先判断
//        byte b2 = 10; //对，
//        int n2 = 1;
//        byte b2 = n2; //报错
//        char c1 = b1; // 报错 byte不能自动转为char

        //byte short char 他们三者可以计算，在计算时首先转换为int类型
        byte b2 = 1;
        short s1 = 1;
//        short s2 = b2 + s1; //错， b2 + s2 => int
        //boolean类型不参与转换
        //表达式结果的类型自动提升为操作数中最大的类型


    }
}