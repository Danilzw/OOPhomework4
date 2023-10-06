package ex005;

public class Apple implements Basicfruits{

    private int Weight;
    private boolean recency;

    public Apple(int Weight,boolean recency)
    {
        this.Weight = Weight;
        this.recency = recency;

    }

    public int getWeight() {
        return Weight;
    }

    public void getRecency()
    {
        if(recency == true)
        {
            System.out.println("Свежий");
        }
        else{
            System.out.println("Не свежий");
        }
    }

    
    
}
