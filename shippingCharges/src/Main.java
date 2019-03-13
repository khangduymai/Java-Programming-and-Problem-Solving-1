public class Main {

    public static void main(String args[]){
        System.out.printf("the price is: %.2f", shippingCharge(-1));
    }

    public static double shippingCharge(double num){
        double chargePrice;
        if(num > 0 && num <= 2){
            chargePrice = num * 1.1;
        }
        else if(num > 2 && num <=6){
            chargePrice = num * 2.2;
        }
        else if(num > 6 && num <=10){
            chargePrice = num * 3.7;
        }
        else if(num > 10)
            chargePrice = num * 3.8;
        else{
            System.out.println("Wrong input");
            chargePrice = 0;
        }

        return chargePrice;
    }
}
