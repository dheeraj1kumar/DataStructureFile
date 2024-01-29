public class Bit_wise_operator {
    public static void main(String[] args) {
        System.out.println(5 & 6);// Bitwise AND (&)

        System.out.println(5 | 6);// Bitwise OR (|)

        System.out.println(5 ^ 6);// XOR

        System.out.println(~5);
        System.out.println(~-4);// One's complete
        System.out.println(~-(-9));
        System.out.println(~0);
        System.out.println(~1);

        System.out.println(5 << 2);// left shift
        // (a<<b=a*2^b)=5*2^2=20

        System.out.println(6 >> 1);// right shift
        // (a/2^b)=>6/2^1=3

    }
}