package comp127.CellAndGrid;


import edu.macalester.graphics.CanvasWindow;
import edu.macalester.graphics.GraphicsGroup;

public class Grid extends GraphicsGroup {

    protected int num_rows, num_cols;

    protected double size, padding;

    protected Cell[][] cells;

    public Grid(int num_rows, int num_cols, double size, double padding) {
        this.num_rows = num_rows;
        this.num_cols = num_cols;
        this.size = size;
        this.padding = padding;
        createGrid();
    }

    private void createGrid() {
        cells = new Cell[num_rows][num_cols];

        double x = padding;
        double y = padding;
        for (int i = 0; i < num_rows; i++) {
            for (int j = 0; j < num_cols; j++) {
                Cell cell = new Cell(size);
                cell.getGraphics().setPosition(x, y);
                cells[i][j] = cell;
                this.add(cell.getGraphics());
                x += cell.getSize() + padding;
            }
            x = padding;
            y += cells[i][0].getSize() + padding;
        }
    }

    public static void main(String[] args) {
        CanvasWindow canvas = new CanvasWindow("test", 600, 800);

        Grid grid = new Grid(10, 10, 20, 0);

        canvas.add(grid);
        grid.setCenter(300, 400);

        canvas.draw();
    }

}
