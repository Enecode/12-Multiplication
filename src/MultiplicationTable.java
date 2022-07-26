import java.util.LinkedHashMap;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("multiplication Table");
        for (int k  = 1; k <= 12; k++)
            System.out.printf("", + k);

        System.out.println("=====================================================");

        for (int l = 1; l <= 12; l++){
            System.out.print(l + " | ");
            for (int m = 1; m <= 12; m++){
                System.out.printf("%4d", l * m);
            }
            System.out.println();
        }
    }

}