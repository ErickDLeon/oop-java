import com.game.bo.Game;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Ahorcado!, ingresa: 0 para salir");

        Game g = new Game();

        g.play();
    }
}
