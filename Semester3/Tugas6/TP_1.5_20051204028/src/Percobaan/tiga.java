package Percobaan;

public class tiga {
    public static void main(String[] args) {
        int[][] twoD = new int[512][128];
        twoD[100][100]=100;
        char[][][] threeD = new char[8][16][24];
        threeD[3][6][9]='a';
        String[][] dogs = {{"terry","brown"},
        {"kristin","white"},
        {"toby","gray"},
        {"fido","black"}};

        System.out.println(dogs[2][1]);
        System.out.println(twoD[100][100]);
        System.out.println(threeD[3][6][9]);
    }
}
