import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        Set<Product> theBasket = new HashSet<>();

        Product banan = new Product("Банан", 15, 1.5);
        System.out.println(banan);
        Product avakado = new Product("Авакадо", 30, 2);
        System.out.println(avakado);
        Product apples = new Product("Яблоко", 15, 1.75);
        System.out.println(apples);
        Product apelsin = new Product("Апельсин", 40, 3);
        System.out.println(apelsin);
        Product grusha = new Product("Груша", 28, 5);
        System.out.println(grusha);

        banan.productsInTheBasket(theBasket);
        avakado.productsInTheBasket(theBasket);
        apples.productsInTheBasket(theBasket);
        apelsin.productsInTheBasket(theBasket);
        grusha.productsInTheBasket(theBasket);

        System.out.println("Задание 2");

        Set<Recipe> recipe = new HashSet<>();

        Recipe fruitSalad1 = new Recipe("Салат 1");
        System.out.println(fruitSalad1);
        Recipe fruitSalad2 = new Recipe("Салат 2");
        System.out.println(fruitSalad2);
        Recipe fruitSalad3 = new Recipe("Салат 3");
        System.out.println(fruitSalad3);
        Recipe fruitSalad4 = new Recipe("Салат 4");
        System.out.println(fruitSalad4);
        Recipe fruitSalad5 = new Recipe("Салат 5");
        System.out.println(fruitSalad5);

        fruitSalad1.ProductInRecipe(banan, apples);
        fruitSalad2.ProductInRecipe(grusha, apples);
        fruitSalad3.ProductInRecipe(banan, avakado);
        fruitSalad4.ProductInRecipe(apelsin, avakado);
        fruitSalad5.ProductInRecipe(grusha, apelsin);

        fruitSalad1.addResipeInSet(recipe);
        fruitSalad2.addResipeInSet(recipe);
        fruitSalad3.addResipeInSet(recipe);
        fruitSalad4.addResipeInSet(recipe);
        fruitSalad5.addResipeInSet(recipe);

        System.out.println("Задание 3");

        Set<Integer> integerSet = new HashSet<>();

        for (int i = 0; i < 21; i++) {
            integerSet.add((int) (Math.random() * 1000) + 1);
        }
        integerSet.removeIf(integer -> integer % 2 != 0);
        System.out.println(integerSet);

        System.out.println("Задание 5");

        int[][] Mas = new int[15][3];
        for (int i = 0; i < Mas.length; i++) {
            for (int h = 0; h < Mas[i].length; h++) {
                Mas[i][h] = (int) (Math.random() * 8) + 2;
                if (h == Mas[i].length - 1) {
                    Mas[i][h] = Mas[i][h - 2] * Mas[i][h - 1];
                    for (int q = 0; q < i; q++) {
                        if (Mas[i][h] == Mas[q][h]) {
                            if (Mas[i][h - 1] == Mas[q][h - 1] || Mas[i][h - 2] == Mas[q][h - 2]) --i;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < Mas.length; i++) {
            System.out.print("Задание №" + (i + 1) + " Умножить ");
            for (int h = 0; h < Mas[i].length; h++) {
                if (h == 0)
                    System.out.print(Mas[i][h] + " на ");
                if (h == 1)
                    System.out.println(Mas[i][h]);
            }
        }

        System.out.println("Задание 6");
        Passport passport1 = new Passport(
                5402567680L,
                "Лещётный",
                "Алексей",
                "Петрович",
                "16.10.2000");
        Passport passport2 = new Passport(
                5402567670L,
                "Лещётный",
                "Алексей",
                "Викторович",
                "16.10.2005");
        Passport passport3 = new Passport(
                5402567660L,
                "Лещётный",
                "Владимир",
                "Петрович",
                "15.10.2001");
        Passport passport4 = new Passport(
                5402567650L,
                "Лещётный",
                "Алексей",
                "Михайлович",
                "10.09.2010");

        HashMap<Long, Passport> passportMap = new HashMap<>();

        passportMap.put(passport1.getNumPassport(), passport1);
        passportMap.put(passport2.getNumPassport(), passport2);
        passportMap.put(passport3.getNumPassport(), passport3);
        passportMap.put(passport4.getNumPassport(), passport4);
        System.out.println(passportMap);

        System.out.println("Задание 7");

        //Я бы использовал коллекцию HashSet, так как среднее время contains у HashSet(а) 0(1)
    }
}