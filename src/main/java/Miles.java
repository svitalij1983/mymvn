public class Miles {
    public static  void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int Miles = service.calculate(price); // должно получиться 500
        System.out.println(Miles);
    }
}
