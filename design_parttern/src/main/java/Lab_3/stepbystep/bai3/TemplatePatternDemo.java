package Lab_3.stepbystep.bai3;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println("");
        game = new Football();
        game.play();
    }
}
