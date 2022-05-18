import java.util.ArrayList;

public class Box implements Packable{

    private ArrayList<Packable> box;
    private double maxCapacity;

    public Box(double maxCapacity){
        this.maxCapacity = maxCapacity;
        this.box = new ArrayList<>();
    }

    public void add(Packable item){
        if ((this.weight() + item.weight()) < this.maxCapacity){
            this.box.add(item);
        }
    }

    public String toString(){
        return "Box: " + this.box.size() + " items, total weight " + this.weight() + " kg";
    }

    public double weight(){
        double weight = 0;
        for (int i = 0; i < this.box.size(); i++){
            weight = weight + this.box.get(i).weight();
        }

        return weight;
    }
}
