import java.awt.desktop.ScreenSleepEvent;

public class Test {

    public static void main(String args[]){

        display(1);
    }


    public static String getString(int num){
        switch (num){
            case 1: return "ONE";
            default: return "TWO";
        }
    }

    public static void display(int num){
        System.out.println(getString(num));
    }
}
