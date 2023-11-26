import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )

        //todo реализовать ввод пользователем кол-ва ингредиентов.
        System.out.println("***Добро пожаловать в программу составления эликсиров!*** " +
                "\n\nРецепты эликсиров: " +
                "\n1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости" +
                "\n2. 2 кости ворона + 4 пельменя - Эликсир стойкости" +
                "\n3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности" +
                "\n4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир " +
                "\n\nПри вводе определенного числа, вам будет выдаваться один ингредиент, " +
                "\n1 - жабьи глаза \n2 - слезы вурдалака \n3 - кости ворона \n4 - пельмени \n5 - прервать сбор и приступить к готовке" +
                "\n\nP.S. Максимум каждого ингредиента - это 20 экземляров, если какой-либо ингредиент достигнет 20, " +
                "то накопление ВСЕХ ингредиентов прекратиться полностью и вы приступите к готовке эликсира!" +
                "\n\nВвод:");
        while (toadEyesCount < 20 && ghoulTearsCount < 20 && ravenBonesCount < 20 && dumplingsCount < 20) {

            int input = new Scanner(System.in).nextInt();
            if (input == 1) {
                toadEyesCount += 5;
            } else if (input == 2) {
                ghoulTearsCount += 5;
            } else if (input == 3) {
                ravenBonesCount += 5;
            } else if (input == 4) {
                dumplingsCount += 5;
            } else if (input == 5) {
                break;
            } else {
                System.out.println("Введен неверный ингредиент!");
            }

            System.out.println("На данный момент у вас: " +
                    toadEyesCount + " - жабьих глаз, " +
                    ghoulTearsCount + " - слез вурдалака, " +
                    ravenBonesCount + " - костей ворона, " +
                    dumplingsCount + " - пельменей.");

        }

        //todo дописать логику программы сюда
        System.out.println("Для приготовления эликсира нужно прожать определенное число: 1 - Эликсир зоркости, " +
                "2 - Эликсир стойкости, 3 - Эликсир скрытности, 4 - Запретный эликсир.");
        int input = new Scanner(System.in).nextInt();
        if (input == 1) {
            if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
                System.out.println("*Приготовлен Эликсир зоркости!*");
            } else {
                System.out.println("Недостаточно ингредиентов!!!");
            }
        } else if (input == 2) {
            if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
                System.out.println("*Приготовлен Эликсир стойкости!*");
            } else {
                System.out.println("Недостаточно ингредиентов!!!");
            }
        } else if (input == 3) {
            if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
                System.out.println("**Приготовлен Эликсир скрытности!**");
            } else {
                System.out.println("Недостаточно ингредиентов!!!");
            }
        } else if (input == 4) {
            if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
                System.out.println("***Приготовлен Запретный эликсир! Будьте осторожны в его применении!***");
            } else {
                System.out.println("Недостаточно ингредиентов!!!");
            }
        } else {
            System.out.println("Ошибка!");
        }
    }
    }
