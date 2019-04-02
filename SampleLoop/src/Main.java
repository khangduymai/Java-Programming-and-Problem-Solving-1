public class Main {

    public static final int NUM =20;
    public static void main(String args[]){
       int total = 100;

       for(int i = 1; i <= 5; i++){
           //int total =100;
           System.out.println("The first total: " + total);
           total = total - NUM;
           System.out.println("Total for round " + i + " is: " + total);
       }
    }// end main


}
