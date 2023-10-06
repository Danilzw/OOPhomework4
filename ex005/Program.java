package ex005;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.sound.midi.Soundbank;

public class Program
{

    public static void main(String[] args) {
        
        // Выяснил что теперь в таком случае нельзя создавать на основе родительского класса
        Orange orange1 = new Orange(1, false);
        Apple apple1 = new Apple(4, false);
        Apple apple2 = new Apple(2, true);

        Basicbox<Apple> applebox = new Basicbox<>(new Apple[5]);
        Basicbox<Orange> orangebox = new Basicbox<>(new Orange[6]);
        Basicbox<Apple> applebox2 = new Basicbox<>(new Apple[5]);


        List<Basicbox> generallist = new ArrayList<>();

        orangebox.add(orange1);
        applebox.add(apple1);
        applebox.add(apple2);

        generallist.add(applebox);
        generallist.add(orangebox);


        
        applebox.moveto(applebox2);

        System.out.println(applebox);
        System.out.println(applebox2);
        

       // System.out.println(applebox.getWeightBox());

        // Sorttype sorttype = Sorttype.Ascending;

        // BoxComporator boxComparator = new BoxComporator(Sorttype.Ascending);

        // Collections.sort(generallist,boxComparator);

        // for(Object item : generallist)
        // {
        //     System.out.println(item);
        // }
        
        
        

        
    }
}