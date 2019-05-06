public class Array_17 {

    public static void main(String[] args) {

        int arr[][]=new int[5][5];
        int i,j;                                    //переменные количества столбов и строчек (соответственно)


        for (i=0;i<arr.length/2+1;i++){             //заполняем первую половину
            for (j=0;j<arr[i].length;j++){          //массива нулями и единицами
                if ((j<i) || (j>=(arr[i].length-i)))
                    arr[i][j]=0;
                else
                    arr[i][j]=1;

            }

        }
        for (i=arr.length-1; i>=arr.length/2; i--){ //заполняем вторую половину
            for (j=0; j<arr[i].length; j++){        //массива нулями и единицами
                if ((j<(arr[i].length-1-i)) || (j>i))
                    arr[i][j]=0;
                else
                    arr[i][j]=1;}
        }
        for (i=0;i<arr.length;i++){                 //выводим в консоль
            for(j=0;j<arr[i].length;j++){           //массив столбов и строчек
               System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}