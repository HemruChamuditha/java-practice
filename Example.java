import java.util.Scanner;
class Example{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][][] marks = {
                {
                        {23, 34, 45},
                        {23, 34, 45},
                        {89, 78, 14}
                },
                {
                        {90, 78, 19},
                        {65, 23, 56},
                        {99, 12, 34}
                },
                {
                        {23, 45, 12},
                        {90, 45, 19},
                        {99, 44, 22}
                },
        };

        System.out.println(marks.length);
        System.out.println(marks[1][1][2]);
    }
}