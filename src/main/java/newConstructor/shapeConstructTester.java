package newConstructor;

public class shapeConstructTester {
    public static void main(String[] args) {

        shapeConstruct Triangle1 = new shapeConstruct(15, 5);
        System.out.println(Triangle1.calculateArea(15,5 ));
        shapeConstruct Triangle2 = new shapeConstruct(30,6);
        System.out.println(Triangle2.calculateArea(2));


    }
}
