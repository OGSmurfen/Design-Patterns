import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{
    private List<Shape> shapes = new ArrayList<Shape>();
    @Override
    public void draw(String fillCOlor) {
        for(Shape sh : shapes){
            sh.draw(fillCOlor);
        }

    }
    public void add(Shape s){
        this.shapes.add(s);
    }
    public void remove(Shape s){
        shapes.remove(s);
    }
    public void clear(){
        System.out.println("Clearing the shapes from drawing");
        this.shapes.clear();
    }
}
