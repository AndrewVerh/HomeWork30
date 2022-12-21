public class BinOps {
    public String sum(String a, String b) {

        int intA = Integer.parseInt(a, 2);

        int intB = Integer.parseInt(b, 2);

        int result = intA + intB;

        return Integer.toBinaryString(result);
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
    }

    public String mult(String a, String b) {

        int intA = Integer.parseInt(a, 2);
        int intB = Integer.parseInt(b, 2);

        int result = intA * intB;

        return Integer.toBinaryString(result);
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
    }
}