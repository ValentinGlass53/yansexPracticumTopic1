public class Main {
    public static void main(String[] args) {
        double rubles = 48562;
        double rateUSD = 74.2;
        double dollars = rubles / rateUSD;
        //System.out.printf("� ����� �������� " + rubles + " ������" + "� �������� ��� - " + dollars + " ��������");
        /*System.out.printf("� ����� �������� %.2f",rubles);
        System.out.printf(" ������ � �������� ��� -  %.2f",dollars);
        System.out.printf(" ��������");*/
        System.out.printf("\n� ����� �������� " + rubles + " ������." + " � �������� ��� - %.2f",dollars);
        System.out.printf(" ��������");
        //
    }
}