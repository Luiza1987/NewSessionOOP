package polymorphism;

public class Main {
    public static void main(String[] args) {
//        Person[] people = new Person[3];
//        people[0] = new Programmer();
//        people[1] = new Dancer();
//        people[2] = new Singer();
//
//        for (Person person : people) {
//            person.walk();
//        }

//        Home work

        // Создание массива типа Animal
        Animal[] animals = new Animal[3];
        animals[0] = new Shark();
        animals[1] = new Turtle();
        animals[2] = new Eagle();

        // Использование instanceOf и getClass()
        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                Shark shark = (Shark) animal;
                shark.attack();
            } else if (animal instanceof Turtle) {
                Turtle turtle = (Turtle) animal;
                turtle.swim();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.fly();
            }

            // Создание отдельных массивов и добавление животных в соответствующие массивы
            if (animal instanceof Shark) {
                Animal[] sharks = new Animal[1];
                sharks[0] = animal;
                System.out.println("Массив акул:");
                for (Animal a : sharks) {
                    if (a instanceof Shark) {
                        ((Shark) a).attack();
                    }
                }
            }

            if (animal instanceof Turtle) {
                Animal[] turtles = new Animal[1];
                turtles[0] = animal;
                System.out.println("Массив черепах:");
                for (Animal a : turtles) {
                    if (a instanceof Turtle) {
                        ((Turtle) a).swim();
                    }
                }
            }

            if (animal instanceof Eagle) {
                Animal[] eagles = new Animal[1];
                eagles[0] = animal;
                System.out.println("Массив орлов:");
                for (Animal a : eagles) {
                    if (a instanceof Eagle) {
                        ((Eagle) a).fly();
                    }
                }
            }
        }
    }
}
