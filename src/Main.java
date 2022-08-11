public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task(){
        int[]number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;

        double[]number2 = {1.57, 7.654, 9.986};

        boolean[]sentence = new boolean[2];
        sentence[0] = true;
        sentence[1] = false;

        System.out.println(number[0] + "," + number[1] + "," + number[2]);
        System.out.println(number2[0] + "," + number2[1] + "," + number2[2]);
        System.out.println(sentence[0] + "," + sentence[1]);

        System.out.println(number[2] + "," + number[1] + "," + number[0]);
        System.out.println(number2[2] + "," + number2[1] + "," + number2[0]);
        System.out.println(sentence[1] + "," + sentence[0]);

        for(int i = 0; i < number.length; i++){
            if (number[i] % 2 != 0){
                System.out.println(number[i] + 1);
            }
        }
    }
}