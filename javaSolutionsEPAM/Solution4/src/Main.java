public class Main {
    public static void main(String[] args)
    {
        Bird bird = new Bird("Птица");
        bird.toFly(); bird.laysEggs(); bird.hatchChicks();
        Hen hen = new Hen("Наседка");
        hen.toFly(); hen.laysEggs(); hen.hatchChicks();
        Sparrow sparrow = new Sparrow("Воробей");
        sparrow.toFly(); sparrow.laysEggs(); sparrow.hatchChicks();
    }
}