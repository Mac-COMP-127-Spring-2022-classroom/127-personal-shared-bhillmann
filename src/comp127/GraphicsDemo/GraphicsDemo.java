package comp127.GraphicsDemo;

import java.awt.Color;

import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.Ellipse;
import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.Rectangle;
// importing everything from the graphics library
// import edu.macalester.graphics.*;

public class GraphicsDemo {
    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("demo", 600, 800);

        // Create a GraphicsGroup to add every GraphicsObject to it
        GraphicsGroup emoji = new GraphicsGroup();

        // Create GraphicsObjects at the top left of the screen
        Ellipse circle = new Ellipse(0, 0, 100, 100);
        Rectangle square = new Rectangle(0, 0, 50, 50);

        // Set the colors of the GraphicsObjects
        circle.setFillColor(Color.MAGENTA);
        square.setFillColor(Color.LIGHT_GRAY);
        circle.setStrokeColor(Color.GREEN);

        // Add the GraphicsObjects to the GraphicsGroup
        emoji.add(circle);
        emoji.add(square);

        // Add the GraphicsObjects to the Canvas
        // canvas.add(circle);
        // canvas.add(square);

        // Set position of the square relative to the GraphicsGroup
        square.setCenter(50, 50);

        canvas.add(emoji);

        // Set object positions without a graphics group
        // circle.setCenter(300, 400);
        // square.setCenter(300, 400);

        // Set position of the GraphicsGroup relative to the Canvas
        emoji.setCenter(300, 400);

        // Make sure to call canvas.draw() to immediately draw all Objects
        canvas.draw();
    }
}
