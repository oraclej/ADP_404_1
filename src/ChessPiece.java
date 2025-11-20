public class ChessPiece {
    private String name;
    private String color;
    private int x;
    private int y;
    private boolean isCaptured;

    public ChessPiece(String name, String color, int x, int y) {
        this.name = name;
        this.color = color;
        this.x = x;
        this.y = y;
        isCaptured = false;
    }

    public void move(int moveX, int moveY) {
        if (isAllowed(moveX, moveY))
            if ((x + moveX <= 7) && (y + moveY <= 7)) {
                x += moveX;
                y += moveY;
            }
    }

    public boolean isAllowed(int moveX, int moveY) {
        if (name.equals("HORSE")) {
            if (moveX != 0 && moveY != 0)
                if (Math.abs(moveX) + Math.abs(moveY) == 3)
                    return true;
            return false;
        } else if (name.equals("QUEEN")) {
            if (moveX == moveY)
                return true;
            if (moveX == 0 && moveY != 0)
                return true;
            if (moveY == 0 && moveX != 0)
                return true;
            return false;
        }
        return false;
    }
}
