// Animal Class
public class Animal{
    //Put fields here

    private boolean isAlive;

    public Animal() {
        this.isAlive = true;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    // showSpecies method
    public void showSpecies(){
        System.out.println("        Animal: I'm just a regular animal.");
    }
    
    // makeSound method
    public void makeSound(){
        System.out.println("        Animal: Grrrrrr");
    }

    public void showAliveOrDead(){
        if(isAlive){
            System.out.println("This animal is alive");
        }
        else {
            System.out.println("I'm sorry this animal is dead");
        }
    } // end showAliveOrDead

    public void showIfHouseTraining(){

    }
    
}