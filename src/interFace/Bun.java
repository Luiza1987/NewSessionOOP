package interFace;

public class Bun implements Backed{
    @Override
    public void bake() {
        System.out.println("Выпекаем булочку при 190°C в течение 25 минут.");
    }

    @Override
    public void ingredients() {
        System.out.println("Ингредиенты булочки: мука, молоко, сахар, масло, дрожжи.");
    }
}
