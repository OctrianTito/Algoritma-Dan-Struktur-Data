public class DragonMain22 {
    public static void main(String[] args) {
        Dragon22 game = new Dragon22(5, 7, 10, 10);
        game.printPosition();
        game.moveLeft();
        game.moveLeft();
        game.moveLeft();
        game.moveDown();
        game.moveUp();
        game.moveUp();
        game.moveRight();
        game.printPosition();
    }
}