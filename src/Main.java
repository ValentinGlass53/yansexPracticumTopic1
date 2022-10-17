public class Main {
    public static void main(String[] args) {
        double rubles = 48562;
        double rateUSD = 74.2;
        double dollars = rubles / rateUSD;
        //System.out.printf("В вашем кошельке " + rubles + " рублей" + "В долларах это - " + dollars + " долларов");
        /*System.out.printf("В вашем кошельке %.2f",rubles);
        System.out.printf(" рублей В долларах это -  %.2f",dollars);
        System.out.printf(" долларов");*/
        System.out.printf("\nВ вашем кошельке " + rubles + " рублей." + " В долларах это - %.2f",dollars);
        System.out.printf(" долларов");
        //
    }
}