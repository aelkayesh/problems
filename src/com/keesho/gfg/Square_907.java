package com.keesho.gfg;

import java.util.Scanner;

/**
 * Created by Ahmed.Elkayesh on 01/07/2016.
 */
public class Square_907 {


    public static void main(String ...args){
        new Square_907().start();
    }

    private void start() {
        int t = 0;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        Point [] points = new Point[4];
        while(t > 0) {
            for(int i = 0; i < 4 ; i++){
                points[i] = new Point(sc.nextInt(), sc.nextInt());
            }
            System.out.println(isSquare(points));
            t--;
        }
    }

    private int isSquare(Point[] points) {
        return (Math.abs(points[1].x - points[0].x) == Math.abs(points[2].x - points[3].x)
                && Math.abs(points[2].y - points[1].y) == Math.abs(points[3].y - points[0].y)) ? 1 : 0;
    }

    class Point{
        int x,y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

}
