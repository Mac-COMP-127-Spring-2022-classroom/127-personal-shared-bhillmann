package comp127.PointsOnACircle;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Ellipse;
import edu.macalester.graphics.Line;
import edu.macalester.graphics.Point;

public class PointsOnACircle {    
    public static void main(String[] args) {
        int size = 400;

        CanvasWindow canvas = new CanvasWindow("circle", size, size);

        double radius = size * 0.25;
        Ellipse ellipse = new Ellipse(0, 0, radius, radius);

        // update position of ellipse before drawing line
        ellipse.setCenter(0.5*size, 0.5*size);

        canvas.add(ellipse);

        // clockwise around the clock
        double angleInRadians = 1.75 * Math.PI;

        Point ellipseCenter = ellipse.getCenter();
        double ellipseCenterX = ellipseCenter.getX();
        double ellipseCenterY = ellipseCenter.getY();
        Line line = new Line(
            0.25 * radius*Math.cos(angleInRadians) + ellipseCenterX,
            0.25 * radius*Math.sin(angleInRadians) + ellipseCenterY,
            0.5*radius*Math.cos(angleInRadians) + ellipseCenterX,
            0.5*radius*Math.sin(angleInRadians) + ellipseCenterY
        );

        canvas.add(line);
        canvas.draw();

    }
}
