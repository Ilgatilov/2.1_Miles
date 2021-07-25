public class Main {
    public static void main(String[] args) {
        int ticket_price = 600; // стоимость одного билета, в рублях
        int one_mile = 20; // шаг для получения одной бонусной мили, в рублях

        int total_miles = ticket_price / one_mile;
        System.out.println(total_miles);

    }
}
