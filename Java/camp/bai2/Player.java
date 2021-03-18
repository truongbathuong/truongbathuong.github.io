import javax.swing.text.Position;
import java.util.List;

public class Player {
    private String fullName;
    private Position position;
    private int number;
    enum Position{
        GK,
        DF,
        MF,
        FW
    }

    public Player(String fullName, Position position, int number) {
        this.fullName = fullName;
        this.position = position;
        this.number = number;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFullName() {
        return fullName;
    }

    public Position getPosition() {
        return position;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Player{" +
                "fullName='" + fullName + '\'' +
                ", position=" + position +
                ", number=" + number +
                '}';
    }
}
