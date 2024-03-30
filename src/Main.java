public class Main {
    public static void main(String[] args) {
            var dog =  8.0;
            var cat = 3.6;
            var paper = 763789;
            System.out.println(dog + "\n" + cat + "\n" + paper + "\n");
            dog += 4;
            cat += 4;
            paper += 4;
            System.out.println(dog + "\n" + cat + "\n" + paper + "\n");
            dog -= 3.5;
            cat -= 1.6;
            paper -= 7639;
            System.out.println(dog + "\n" + cat + "\n" + paper + "\n");

            var friend = 19;
            friend += 2;
            System.out.println(friend);
            friend /=7;
            System.out.println(friend + "\n");

            var frog = 3.5;
            System.out.println(frog);
            frog *=10;
            System.out.println(frog);
            frog /= 3.5;
            System.out.println(frog);
            frog += 4;
            System.out.println(frog + "\n");

            var firstWeight = 78.2;
            var secondWeight = 82.7;
            var sumWeight = firstWeight + secondWeight;
            var difWeight = firstWeight - secondWeight;
            System.out.println("Общая масса бойцов = " + sumWeight + " кг");
            System.out.println("Разница в массе = " +Math.abs(difWeight) + " кг" + "\n");

            var remWeight = secondWeight / firstWeight;
            System.out.println("Остаток от деления масс = " + remWeight + "\n");

            var hours = 640;
            var person = hours / 8;
            System.out.println("Всего работников в компании - " + person + " человек");
            var person2 = person + 94;
            var hoursByPerson = person2 *8;
            System.out.println("Если в компании работает "+ person2 + " человек, то всего " + hoursByPerson + " часов работы может быть поделено между сотрудниками");
        }
    }