import graphics.Graphics;
public class AreaGraphics {
    public static void main(String []args){
        Graphics Ob = new Graphics();
        System.out.println("Area of Rectangle : " + Ob.recArea());
        System.out.println("Area of Circle : " + Ob.cirArea());
        System.out.println("Area of Square : " + Ob.squArea());
        System.out.println("Area of Triangle : " + Ob.triArea());
    }
}