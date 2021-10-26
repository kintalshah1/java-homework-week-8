/*

double radius;
    double height;

    public Cylinder(double radius, double height) {

        super(radius);
        if (height < 0) {
            this.height = height;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {

        return this.height;
    }

    public double getVolume() {

        return height * getArea();
    }

    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }

 */


package poolarea;

public class Rectangle {
    double width;
    double length;

    public Rectangle(double width, double length) {

        if(width<0){
            this.width=0;
        } else {
            this.width = width;
        }

        if(length<0){
            this.length=0;
        }else {
            this.length=length;
        }
    }

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public double getArea(){
        return width*length;
    }



}
