package ex005;

import java.util.Comparator;

public class BoxComporator implements Comparator<Basicbox>{
    
    private Sorttype sorttype;

    public BoxComporator(Sorttype sorttype)
    {
        this.sorttype = sorttype;
    }
    public int compare(Basicbox box1, Basicbox box2)
    {
        return sorttype == sorttype.Ascending ? Integer.compare(box1.getWeightBox(),box2.getWeightBox()):
            Integer.compare(box2.getWeightBox(), box1.getWeightBox());

    }
}
