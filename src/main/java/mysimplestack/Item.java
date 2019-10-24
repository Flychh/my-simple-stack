package mysimplestack;
import java.util.Random;

public class Item {
    private int item;
    public Item(){
        Random rd = new Random();
        this.item = rd.nextInt(200);
    }

    public int getItem() {
        return item;
    }

}
