public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] number= {1,2,3,4,5,6,7,8};
        System.out.println(number[2]);
        //System.out.println(number[1]);
       // System.out.println(number[5]);
        int[][] matrice = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrice[2][2]);
        System.out.println(matrice[0][1]);
        int[][] matrice2 = {{5,5,7},{1,3,7},{8,12,9}};
        /////
        for(int i= 0;i<matrice2.length;i++)
        {
            for (int j = 0; j < matrice2.length; j++)
            {
                System.out.print(matrice2[i][j] + " ");
            }
            System.out.println();
        }
}}
