public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 78;
        double index = service.calculate(weight);
        System.out.println("Индекс массы тела:");
        System.out.println((int) index);
    }
}