public class Main {
    public static void main(String[] args) {
        int amount = 100;
        int transaction = 1200;

        if (transaction > 1000) {
            int totalBonus = transaction / 100;
            System.out.println("Итоговый бонус: "+ totalBonus);
        } else {
            int totalBonus = 0;
            System.out.println("Итоговый бонус: "+ totalBonus);
        }
    }
}
