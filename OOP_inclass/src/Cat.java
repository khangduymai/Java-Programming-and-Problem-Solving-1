// Cat Class
public class Cat extends Animal{
    // showSpecies method
    public void showSpecies(){
        System.out.println("        Cat: I'm a cat.");
    }
    
    // makeSound method
    public void makeSound(){
        if(isAlive()){
            System.out.println("        Cat: Meow");
        }
    }
}