/*
* Numbers ending with zeros are boring.
* They might be fun in your world, but not here.
* Get rid of them. Only the ending ones.
* Zero alone is fine, don't worry about it. Poor guy anyway.
 */

public class noZeros {
    public static void main(String[] args) {
        System.out.println(noBoringZeros(-1050700));
    }

    public static int noBoringZeros(int n) {
        if (n != 0) {
            while (n % 10 == 0) {
                n /= 10;
            }
        }
        return n;
    }
}
