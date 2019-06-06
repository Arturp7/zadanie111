
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj wielkość tablicy");
        int j = in.nextInt();
        Bird[] birds = new Bird[j];

        do {
            for (int i = 0; i < birds.length; i++) {
                Scanner input = new Scanner(System.in);
                System.out.println("Podaj nazwę Ptaka");
                bird.setName(input.nextLine());
                birds[i] = new Bird(bird.getName(), 0);
                System.out.println("Podaj wagę Ptaka");
                bird.setWeight(input.nextInt());
                birds[i] = new Bird(bird.getName(), bird.getWeight());
                System.out.println(birds[i]);


            }
        } while (birds[j-j].equals(birds[(j-j)+1])||birds[j-j].equals(birds[j-j+2]));
        System.out.println(Arrays.toString(birds));


    }


}
