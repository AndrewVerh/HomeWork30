public class Main {
    public static void main(String[] args) {

        BinOps bins = new BinOps();

        System.out.println(bins.mult("1001", "101110")); //9 * 46 = 414 (110011110)
        System.out.println(bins.sum("101", "1011")); //5 + 11 = 16 (10000)
    }
}
