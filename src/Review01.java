
public class Review01 {

    public static void main(String[] args) {
        int cost = 1500;
        int tax = Tax(cost);
        int costs = cost + tax;
        System.out.println(cost + "円の商品の税込価格は" + costs + "円（消費税は" + tax + "円）です。");
    }

    public static int Tax(int num1){
        int taxCharge = num1 * 10 / 100;
        return (int) taxCharge;
    }
}
