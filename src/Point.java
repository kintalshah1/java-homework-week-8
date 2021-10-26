public class Point {

    int x,y;

    public Point (){


    }

    public Point (int x,int y){

        this.x =x;
        this.y =y;

    }

    public int getX(){
        return x;

    }
    public int getY(){
        return y;

    }

    public int setX(int x) {
        return x;

    }
public int setY(int y){
        return y;
}

public double distance(){

        return Math.sqrt((x*x) + (y*y));

}


public double distance (int x, int y){


        return Math.sqrt((this.x -x) * (this.x - x) + (this.y -y) * (this.y-y));

}

public double distance (Point point){

        return Math.sqrt((this.x - point.getX()) * (this.x - point.getX()) +
                (this.y -point.getY()) * (this.y - point.getY()));


}

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point();
        System.out.println("distance()= " + point.distance());

    }

}



