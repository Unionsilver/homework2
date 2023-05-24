public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //задача1
    }
    public static void task2() {
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
        //задача2
    }
    public static void task3() {
        var dog = 8.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(paper);
        //задача3

    }
    public static void task4() {
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        //задача4
    }
    public static void task5() {
        var frog = 3.5;
        System.out.println(frog);
        frog = frog + 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        //задача5
    }
    public static void task6() {
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес бойцов " + totalWeight + " кг !");
        var differentWeight = boxer2 - boxer1;
        System.out.println("Разница веса " + differentWeight + " кг !");
        //задача6
    }
    public static void task7() {
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var differentWeight = boxer2 - boxer1;
        System.out.println("Разница веса " + differentWeight + " кг !");
        var leftWeight = boxer2 % boxer1;
        System.out.println(leftWeight + " остаток от деления % ");
        //задача7
    }
    public static void task8() {
        var totalHoursOfWorkers = 640;
        var oneDayWorkersWork = 8;
        var workers = totalHoursOfWorkers / oneDayWorkersWork;
        System.out.println("Всего работников в компании — " + workers + " человек");
        var newWorkersAdd = workers + 94;
        var nowHoursTheyWork = totalHoursOfWorkers / newWorkersAdd;
        System.out.println("Если в компании работает " + newWorkersAdd + " человек, то всего " + nowHoursTheyWork
                + " часов работы может быть поделено между сотрудниками");
        //задача8
    }
}