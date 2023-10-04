package ex005;

public class Program
{

    public static void main(String[] args) {
        
        // Выяснил что теперь в таком случае нельзя создавать на основе родительского класса
        Orange orange1 = new Orange(2, false);
        Apple apple1 = new Apple(2, false);

        Basicbox<Apple> applebox = new Basicbox<>(new Apple[5]);
        Basicbox<Orange> orangebox = new Basicbox<>(new Orange[6]);

        orangebox.add(orange1);
        applebox.add(apple1);
        
        
        

        
    }
}