
public class MathConvert {

    private int inputNumber;

    public MathConvert(){
        this.inputNumber = 0;
    }

    public static void decimalToBinary(int num){
        int total = 0;
        double exp = 0;
        while(num > 0) {
            int extractLastNumber = num % 10;
            int baseTwo = (int) Math.pow(2.0, exp);
            exp ++;
            total += (extractLastNumber * baseTwo);

            num /= 10;
        }
        System.out.println("Decimal: " + total);
    }


}
