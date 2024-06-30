public class Main {
    public static void main(String[] args) {
        int age = 23;
        if (age < 18) {
            System.out.println(" Если возраст человека равен " + age + ", он не достиг совершеннолетия, нужно немного подождать ");
        }
        if (age >= 18) {
            System.out.println(" Если возраст человека равен " + age + ", то он совершеннолетний ");
        }


        int weather = 1;
        if (weather < 5) {
            System.out.println(" На улице " + weather + ", нужно надеть шапку! ");
            if (weather > 5) {
                System.out.println(" На улице " + weather + ", можно идти без шапки ");
            }


            int speed = 80;
            if (speed > 60) {
                System.out.println(" Если скорость " + speed + ", то придется платить штраф ");
            }else if (speed < 60) {
                System.out.println(" Если скорость " + speed + ", то можно ездить спокойно ");
            }


            int child = 4;
            if (child >= 2 && child <= 6) {
                System.out.println("Если возраст человека равен " + child + ", то ему нужно ходить в детский сад.");
            }
            int child2 = 13;
            if (child2 >= 7 && child2 <= 18) {
                System.out.println("Если возраст человека равен " + child2 + ", то ему нужно ходить в школу.");
            }
            int child3 = 21;
            if (child3 > 18 && child3 <= 24) {
                System.out.println("Если возраст человека равен " + child3 + ", то ему нужно ходить университет");
            }
            int child4 = 26;
            if (child4 > 24) {
                System.out.println("Если возраст человека равен " + child4 + " ,то ему нужно ходить на работу");
            }


            int attractions = 18;
            if (attractions <= 5) {
                System.out.println(" Если ребенку меньше " + attractions + " лет, то он не может кататься на аттракционе");
            } else if (attractions >= 5 && attractions <= 14) {
                System.out.println(" Если ребенку больше " + attractions + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
            } else if (attractions > 14) {
                System.out.println(" Если ребенок старше " + attractions + ",то он может кататься без сопровождения взрослого.");
            }


            int people = 43;
            int sit = 5;
            if (people < 102 && sit < 60) {
                System.out.println(" В вагоне есть сидячие места ");
            } else if (people < 102 && sit > 60) {
                System.out.println(" В вагоне стоячие места");
            } else if (people > 102) {
                System.out.println(" В вагоне нет мест");

            }


            int one = 5;
            int two = 3;
            int three = 1;
            if (one > two) {
                System.out.println("то один больше двух");
            } else if (two > three) {
                System.out.println("то два больше трех");
            } else if (three > two) {
                System.out.println("то три больше двух");
            }else if (two == one){
                System.out.println("два равен одному");
            }else if (one > two && one > three){
                System.out.println("один больше двух и больше трех");
            }
        }
    }
}


























