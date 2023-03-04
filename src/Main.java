import java.util.Random;
public class Main {

    public static String GoForAWalk(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30){
            return "Можно идти гулять";
        } else if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";}

    }

    public static void main(String[] args) {
        String action = GoForAWalk(20,-20);
        System.out.println (action);

        action = GoForAWalk(19,0);
        System.out.println (action);

        action = GoForAWalk(46,-10);
        System.out.println (action);

        action = GoForAWalk(19, -20);
        System.out.println (action);

        action = GoForAWalk(19,29);
        System.out.println (action);


/*                     НА СООБРАЗИТЕЛЬНОСТЬ                   */
        test(23, 10);
        test(generateRandomAge(), 10);
    }


    public static int generateRandomAge(){
        int min = 0;
        int max = 100;
        Random random = new Random();

        int age = random.nextInt(max - min + 1) + min;
        return age;
    }

    public static void test(int age, int temperature) {
        String action = GoForAWalk(age, temperature);
        System.out.println (action);

    }
}