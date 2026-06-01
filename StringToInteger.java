public class StringToInteger {
    public static void main(String[] args) {

        String str1 = "7781";

        int num = Integer.valueOf(str1);

        System.out.println(num+1);

        System.out.println("String to integer: "+num);

        String str2 = String.valueOf(num);

        System.out.println(str2+1);

        System.out.println("Integer to String: "+ str2);


    }
}
