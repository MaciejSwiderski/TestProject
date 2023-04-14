import java.util.Arrays;

public class Testowo {

    public static int[]toSort(int[]toSort){
        //int[]sorted= new int[toSort.length];


        int temp=0;
        for(int i=0;i<toSort.length;i++){
            for(int j=0;j<toSort.length-1;j++){
                if(toSort[j]>toSort[j+1]){
                    temp=toSort[j];
                    toSort[j]=toSort[j+1];
                    toSort[j+1]=temp;
                }
            }
        }



        return toSort;
    }


    public static void main(String[] args) {


        int[]myTable={24,55,21,999,234,3,654,5,90};
        System.out.println(Arrays.toString(toSort(myTable)));

    }
}
