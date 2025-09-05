import java.util.Scanner;
public class arrays3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arrSize = 3;
        int[] arr = new int[arrSize];

        for(int i = 0; i < arrSize; i++){
            System.out.println("Enter monthly expense for each month: ");
            arr[i] = input.nextInt();
        }

        int arrMax = arr[0];
        for (int j = 1; j < arrSize; j++){
            if(arrMax < arr[j]) {
                arrMax = arr[j];
            }
        }

        System.out.println(arrMax + " is the maximum you've spent in the year");

        int arr10k = 0;
        for(int k = 0 ; k < arrSize; k++){
            if(arr[k] > 10000) {
                int monthValue = k+1;
               System.out.println("Months in which you've spent more than 10k is: " + monthValue);
            }
        }

    }
}
