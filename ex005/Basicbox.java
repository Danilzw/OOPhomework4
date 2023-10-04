package ex005;

public class Basicbox<T extends Basicfruits>{
    
    private T [] array;
    private int index = -1;

    public Basicbox(T[]array)
    {
        this.array = array;
    }

    public void add(T value)
    {
        if(index+1 < array.length)
        {
            array[++index] = value;
        }
    }

    public int amount()
    {
        return index+1;
    }

    public int getWeightBox()
    {
        int totalWeight = 0;
        for(int i=0;i<array.length;i++)
        {
            
            totalWeight = totalWeight + array[i].getWeight();
        }
        return totalWeight;
    }



    

    // public String toString()
    // {
    //     return String.format("В коробке:%d фруктов,масса коробки:%d");
    // }


    
}
