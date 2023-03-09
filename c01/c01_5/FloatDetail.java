public class FloatDetail {
    public static void main(String[] args) {
        //Java的浮点类型常量默认为double类型，声明float型常量后需加'f'或者'F'
        //float num1 = 1.1;
        float num2 = 1.1F;
        double num3 = 1.1;
        double num4 = 1.1f;

        double num5 = .123;//等价 0。123

        System.out.println(num5);

        //科学记数法
        //5.12e2[5.12*10的2次方] 5.12E-2[5.12/10的2次方]

        //通常情况下，应该使用double，因为它比float更精确。
        double num9 = 2.1234567851;
        float num10 = 2.1234567851F;

        System.out.println(num9);
        System.out.println(num10);

        //浮点数使用陷阱：2.7和8.1/3比较

        double num11 = 2.7;
        double num12 = 8.1 / 3;

        System.out.println(num11);
        System.out.println(num12);//接近2.7 对运算结果是小数的进行相等判断时，要小心 应该是以两个数的差值的绝对值，在某个精度范围内进行判断


        if (Math.abs(num11 - num12) < 0.00001) {
            System.out.println("相等");
        }
    }
}