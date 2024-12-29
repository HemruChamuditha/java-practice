import java.util.Scanner;
class Example{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] marks = {
                {34, 23, 56, 78},
                {90, 23, 45}
        };

        System.out.println(marks[0].length);
        System.out.println(marks[1].length);

    }
}