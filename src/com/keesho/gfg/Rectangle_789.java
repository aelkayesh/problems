package com.keesho.gfg;

import sun.security.x509.CRLDistributionPointsExtension;

import java.util.Scanner;

/**
 * Created by Ahmed.Elkayesh on 02/07/2016.
 */
public class Rectangle_789 {
    public static void main(String[] args) {
        new Rectangle_789().start();
    }

    private void start() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Point [] points = new Point[4];
        while( t > 0){
            for(int i =0 ; i < 4; i++){
                points[i] = new Point(sc.nextInt(), sc.nextInt());
            }
            System.out.println(isOverlapping(points));
            t--;
        }
    }

    private int isOverlapping(Point[] points) {
        
        return    ( Math.abs(points[1].x - points[0].x)  +
                    Math.abs(points[3].x - points[2].x) >
                    Math.abs(points[3].x - points[0].x)
                  )
                  &&
                  ( Math.abs(points[1].y - points[0].y) +
                    Math.abs(points[3].y - points[2].y) >
                    Math.abs(points[3].y - points[0].y)
                  )
                  ? 1 : 0;
    }

    class Point{
        int x,y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
