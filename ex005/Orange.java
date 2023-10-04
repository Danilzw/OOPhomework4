package ex005;

public class Orange implements Basicfruits{

    private int Weight;
    private boolean recency;

    public Orange(int Weight,boolean recency)
    {
        this.Weight= Weight;
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
