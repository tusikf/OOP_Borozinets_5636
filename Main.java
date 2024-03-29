//Проанализировать персонажей "Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах".
//Для каждого определит 8 полей данных(здоровье, сила итд) 3-4 поля поведения(методов атаковать, вылечить итд).
//Создать абстрактный класс и иерархию наследников.
//Расположить классы в пакет так, чтобы в основной программе небыло видно их полей.
//В не абстрактных классах переопределить метод toString() так чтобы он возвращал название класса или имя.
//Создать в основной программе по одному обьекту каждого не абстрактного класса и вывести в консоль его имя.
//Формат сдачи:
//Ссылка на гитхаб проект
//Подписать фамилию и номер группы


<<<<<<<<< Temporary merge branch 1
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
=========
import units.*;

import java.util.*;
>>>>>>>>> Temporary merge branch 2

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        /* Создание персонажей из 1 семинара, и вывод имени классов
        units.Peasant peasant1 = new units.Peasant("Peasant1");
        peasant1.print();

        units.Outlaw outlaw1 = new units.Outlaw("Outlaw1");
        outlaw1.print();

        outlaw1.Atack(outlaw1,peasant1);
        peasant1.print();


        units.Sniper sniper1 = new units.Sniper("Sniper1");

        units.Spearman spearman1 = new units.Spearman("Spearman1");

        units.Crossbowman crossbowman1 = new units.Crossbowman("Crossbowman1");

        units.Monk monk1 = new units.Monk("Monk1");

        units.Mag mag1 = new units.Mag("Mag1");
        mag1.print();

        System.out.println(peasant1);
        System.out.println(outlaw1);
        System.out.println(sniper1);
        System.out.println(spearman1);
        System.out.println(crossbowman1);
        System.out.println(monk1);
        System.out.println(mag1);
*/
        // Заполняем команды рандомом. Но одинаковыми персонажами, чтобы силы команд были равны.
        int teamcount = 10;
        List<Unit> team1 = new ArrayList<>();
        List<Unit> team2 = new ArrayList<>();
        for (int i = 0; i < teamcount; i++) {
            int val = random.nextInt(7);
            int coordX1 = random.nextInt(10);
            int coordX2 = random.nextInt(10);
            Position xy1 = new Position(coordX1, 0);
            Position xy2 = new Position(coordX2, 9);
            System.out.println(xy1);
            switch (val) {
                case 0:
                    team1.add(new Crossbowman(getName(), xy1));
                    team2.add(new Crossbowman(getName(), xy2));
                    break;
                case 1:
                    team1.add(new Mag(getName(), xy1));
                    team2.add(new Mag(getName(), xy2));
                    break;
                case 2:
                    team1.add(new Monk(getName(), xy1));
                    team2.add(new Monk(getName(), xy2));
                    break;
                case 3:
                    team1.add(new Outlaw(getName(), xy1));
                    team2.add(new Outlaw(getName(), xy2));
                    break;
                case 4:
                    team1.add(new Peasant(getName(), xy1));
                    team2.add(new Peasant(getName(), xy2));
                    break;
                case 5:
                    team1.add(new Sniper(getName(), xy1));
                    team2.add(new Sniper(getName(), xy2));
                    break;
                case 6:
                    team1.add(new Spearman(getName(), xy1));
                    team2.add(new Spearman(getName(), xy2));
                    break;
            }
        }
        // Вывод полного списка команд, чтобы посмотреть, как сработал рандом.
        System.out.println("Команда № 1:");
        for (Unit a : team1){
            a.printShort();

        }
        System.out.println("Команда № 2:");
        for (Unit a : team2){
            a.printShort();
<<<<<<<<< Temporary merge branch 1
=========
        }
/* Из второго семинара
        // Расчет расстояния для двух персонажей
        double dist = team1.get(3).position.distance(team1.get(3),team2.get(2));
        System.out.println(dist);

        // Расчет минимального расстояния например для персонажа номер 2 из 1 команды

        List<Double> distansis = new ArrayList<>();

        for (Unit p : team2) {
            double d = team1.get(1).position.distance(team1.get(1),p);
            distansis.add(d);
        }

        System.out.println(Collections.min(distansis));
        */


        // Добавить в абстрактный класс int поле инициатива.
        // В классах наследников инициализировать это поле.
        // Крестьянин = 0, маги=1, пехота=2, лучники=3.
        // В мэйне сделать так, чтобы сначала делали ход персонажи с наивысшей инициативой из обеих команд,
        // а с наименьшей в конце.

        List<Unit> team3 = new ArrayList<>();
        team3.addAll(team1);
        team3.addAll(team2);
        team3.sort((o1, o2) -> o2.getSpeed() - o1.getSpeed());

        team3.forEach(n-> n.print());

>>>>>>>>> Temporary merge branch 2
        }

        // Расчет расстояния для двух персонажей
        double dist = team1.get(3).position.Distance(team1.get(3),team2.get(2));
        System.out.println(dist);

        // Расчет минимального расстояния например для персонажа номер 2 из 1 команды

<<<<<<<<< Temporary merge branch 1
        List<Double> distansis = new ArrayList<>();

        for (Unit p : team2) {
            double d = team1.get(1).position.Distance(team1.get(1),p);
            distansis.add(d);
        }

        System.out.println(Collections.min(distansis));
        
    }
=========

>>>>>>>>> Temporary merge branch 2
    private static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
    }
}
