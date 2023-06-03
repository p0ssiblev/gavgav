import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите размер массива: ");
        int size = scanner.nextInt();
        double[] nums = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            nums[i] = Math.random() * 50;
            System.out.println("Массив: " + Arrays.toString(nums));
        }
        double result = avarage(nums);
        System.out.println("Ср знач:" + result);
    }
    public static double avarage(double[] nums){
        if(nums.length < 2){
            throw new IllegalArgumentException("Массив должен два эл.");
        }
        double sum = 0;
        for(double num : nums){
            sum += num;
        }
        return sum / nums.length;
    }
}