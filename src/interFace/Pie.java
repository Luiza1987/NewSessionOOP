package interFace;

public class Pie implements Backed{
    @Override
    public void bake() {
        System.out.println("Выпекаем пирог при 200°C в течение 40 минут.");
    }

    @Override
    public void ingredients() {
        System.out.println("Ингредиенты пирога: мука, яйца, масло, сахар, начинка.");
    }
}
