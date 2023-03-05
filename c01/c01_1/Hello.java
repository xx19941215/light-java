//文件中有中文，如何处理
//设置文件编码GBK即可
// ---------javac编译--------------java运行----
//.java文件------------->.class文件------------>结果
//源文件-----------------字节码文件
//什么是编译？
//1.有了java源文件，通过编译器将其编译成JVM可以识别的字节码文件。
//2.在该源文件目录下，通过javac编译工具对Hello.java文件进行编译
//3.如果程序没有错误，也没有任何提示，但在当前目录下会出现一个Hello.class文件，该文件成为字节码文件，也是可以执行的java程序。
//什么是运行？
//1.有可可执行的Java程序（Hello.class字节码文件）
//2.通过运行工具java.exe对字节码文件进行执行。本质就是.class装载到虚拟机执行
//Java程序开发注意事项
//对修改后的Hello.java源文件需要重新编译，生成新的class文件后，再进行执行，才能生效。
//Java开发注意事项和细节说明
//1.Java源文件以.java为扩展名。源文件的基本组成部分是类（class），如本类中的Hello类。
//2.Java应用程序的执行入口是main方法。它有固定的书写格式：
//public static void main(String[] args) {}
//3.Java语言严格区分大小写。
//4.Java方法由一条语句构成，每个语句以；结束。
//5.大括号都是成对出现，缺一不可。
//6.一个源文件中最多只能只能由一个public类。其他类的个数不限。
//7.如果源文件包含一个public类，则文件名必须按照该类名命名。
//8.一个源文件中最多有一个public类，其他类的个数不限制，也可以将main方法写在非public类中，然后指定运行非public类，这样的入口方法就是非public的main方法。
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello,world");
    }
}

class Dog {
    public static void main(String [] args) {
        System.out.println("hello，小狗狗");
    }
}

class Tiger {
    public static void main(String[] args) {
        System.out.println("hello，小老虎");
    }
}