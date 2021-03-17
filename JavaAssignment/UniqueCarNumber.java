import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UniqueCarNumber {
    public void uniqueCarNumber() {
        System.out.println("Please enter the number of cars");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Random r = new Random();
        int[] carnumber = new int[n];
        boolean status;

        for (int i = 0; i < n; i++) {
            int carNum = r.nextInt(9999);
            for (int j=0;j<n;j++) {
                if (carnumber[i] == carNum) {
                    break;
                }
                carnumber[i] = carNum;


            }
        }
            for (int k = 0; k < carnumber.length; k++) {
                System.out.println("The car number is : RH" + carnumber[k]);
            }

        }


    public static void main(String[] args) {
        UniqueCarNumber u=new UniqueCarNumber();
        u.uniqueCarNumber();
    }
}

//
//problem: Generate Unique car numbers. car number is in "MH"<4 digits>
//
//Algo:
//1. get the number of car numbers to be generated from user
//2.
//3.
//4.

