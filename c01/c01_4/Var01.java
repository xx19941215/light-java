//变量的使用注意事项
//1.变量表示内存中一个存储区域，不同的变量，类型不用，占用空间的大小不用，比如int 4个字节，double就是8个字节。
//2.该区域有自己的名称[变量名]和类型[数据类型]
//3.变量必须先声明，后食用。
//4.该区域的数据可以在同一类型范围内不断变化。
//5.变量在同一作用域内不能重名。
//6.变量=变量名+值+数据类型，变量三要素。
public class Var01 {
    public static void main(String[] args) {
        //声明变量
        int a;
        a = 100;
        System.out.println(a);

        int b = 800;
        System.out.println(b);

        int age = 30;
        double score = 88.9;
        char gender = '男';
        String name = "King";

        System.out.println("人的信息如下：");
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
        System.out.println(gender);

    }
}