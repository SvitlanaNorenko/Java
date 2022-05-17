public class Examples {
    public static void main(String[] args) {
        System.out.println(max3(12, 25, 8));
        System.out.println("hello, java".length());
    }

    public static int max3(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num3 && num2 > num1) {
            return num2;

        } else return num3;

    }


}

