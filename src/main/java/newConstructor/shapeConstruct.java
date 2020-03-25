package newConstructor;

public class shapeConstruct {
    private int Height;
    private int Base;
    private int x;

    public shapeConstruct(int Height, int Base){
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int Height) {
        Height = Height;
    }

    public int getBase() {
        return Base;
    }

    public void setBase(int Base) {
        Base = Base;
    }

    public int calculateArea (int Base, int Height){
        return Base * Height;
    }

    public int calculateArea(int x){
        return x * 10;
    }

    @Override
    public String toString() {
        return "shapeConstruct{" +
                "Height=" + Height +
                ", Base=" + Base +
                '}';
    }
}
