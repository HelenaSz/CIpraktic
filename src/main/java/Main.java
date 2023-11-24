import ru.netology.statistic.StatisticsService;

public class Main {

    public static void main(String[] args) {
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        StatisticsService service = new StatisticsService();

        System.out.println("There is an answer: " + service.findMax(incomesInBillions));
    }

}