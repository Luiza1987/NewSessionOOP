package interFace;

class Bread implements Backed {
    @Override
    public void bake() {
        System.out.println("Выпекаем хлеб при 180°C в течение 30 минут.");
    }

    @Override
    public void ingredients() {
        System.out.println("Ингредиенты хлеба: мука, вода, дрожжи, соль.");
    }
}


