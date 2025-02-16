public class Main {
    public static void main(String[] args) {

        int price = 21000; //для хранения стоимости билета
        int count = 20; //для хранения количества рублей для одной бонусной милли
        int result; //итоговое количество бонусных милль

        result = price / count;

        System.out.println(result);
    }
}
