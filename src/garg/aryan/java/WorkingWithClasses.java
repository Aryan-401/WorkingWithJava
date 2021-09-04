package garg.aryan.java;

import java.util.Arrays;

public class WorkingWithClasses {
    public static class Point {
        public int x;
        public int y;
        public Point(int a, int b){
            x = a;
            y = b;
        }
    }

    private static class Rectangle{
        public int height;
        public int width;
        public Point origin;

        private Rectangle(Point p, int w, int h){
            origin = p;
            width = w;
            height= h;
        }

        private void moveTo(int x, int y){
            origin.x = x;
            origin.y = y;
        }

        private int getArea(){
            return (width) * (height);
        }

        private int[][] getCoords(){
            return new int[][]{
                    {origin.x, origin.y}, {origin.x+width, origin.y}, {origin.x+width, origin.y+height}, {origin.x, origin.y+height}
            };
        }
    }

    public static void main(String[] args) {
        Point originPoint = new Point(10,20);
        Rectangle rectTwo = new Rectangle(originPoint, 45, 21);
        rectTwo.moveTo(40,30);
        System.out.println("Coordinates of all points are: " + Arrays.deepToString(rectTwo.getCoords()) + " with an area of " + rectTwo.getArea());
    }
}