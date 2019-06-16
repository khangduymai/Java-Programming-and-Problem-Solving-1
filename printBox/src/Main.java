import java.awt.*;

public class Main {
    

    public static void main(String args[]){
        int row = 6, col = 6;

        /*for(int i = 0; i < row; i++){
            if(i==0 || i == (row-1)){
                for(int j = 0; j < col; j++){
                    System.out.print("X");
                }
                System.out.println();
            }
            else{
                for(int j = 0; j < col; j++){
                    if(j==0 || j == col-1){
                        System.out.print("H");
                    }
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }*/

           /* if(i>0 && i<row-2){
                for(int j = 0; j < col; j++){
                    if(j==0 || j == col-1){
                        System.out.print("H");
                    }
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }*/

/*           for(int i = 0; i < row; i++){
               for(int j = 0; j < col; j++){
                   if(i==0 || i == row-1){
                       System.out.print("*");
                   }
                   else if(j==0 || j== (col-1)){
                       System.out.print("H");
                   }
                   else
                       System.out.print(" ");
               }
            System.out.println();

        } //end big loop for row
        */

    /*
             *
            **
           ***
          ****
         *****
        ******
     */

        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                if(c >= col - r){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    } //end main

} //end class
