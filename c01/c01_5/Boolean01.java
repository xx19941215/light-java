//不可以使用0或者非0的整数代替true 或者false
public class Boolean01 {
    public static void main(String[] args) {
        boolean isPass = true;

        if (isPass == true) {
            System.out.println("考试通过，恭喜");
        } else {
            System.out.println("下次努力");
        }
    }
}