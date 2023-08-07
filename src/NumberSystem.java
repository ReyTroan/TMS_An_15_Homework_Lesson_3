public class NumberSystem {

    public static void main(String[] args) {
        int binary = 0b1111_1111;
        int octal = 0377;
        int decimal = 255;
        int hex = 0xFF;

        System.out.printf(
                "binary = %d \noctal = %d \ndecimal = %d \nhex = %d", binary, octal, decimal, hex
        );
    }

}
