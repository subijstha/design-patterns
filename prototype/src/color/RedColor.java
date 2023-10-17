package color;

public class RedColor extends Color{

    public RedColor(){
        this.colorName = "Red";
    }
    @Override
    void addColor() {
        System.out.println("Red Color added");
    }
}
