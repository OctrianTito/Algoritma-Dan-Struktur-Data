public class Dragon22 {

    int x, y, width, height;

    void moveLeft() {
        x -= 1;
        if (x < 0) {
            detectCollision(x, y);
        }
    }

    void moveRight() {
        x += 1;
        if (x > width) {
            detectCollision(x, y);
        }
    }

    void moveUp() {
        y -= 1;
        if (y < 0) {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        y += 1;
        if (y > height) {
            detectCollision(x, y);
        }
    }

    void printPosition() {
        System.out.println("Your Dragon Position is (" + x + ", " + y + ")");
    }

    void detectCollision(int x, int y) {
        System.out.println("GAME OVER");
        System.out.println("Your Dragon Position is (" + x + ", " + y + ")");
    }

    public Dragon22(int horizontal, int vertical, int mapWidth, int mapHeight) {
        x = horizontal;
        y = vertical;
        width = mapWidth;
        height = mapHeight;
    }
}