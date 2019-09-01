package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int [] array = {6,8,3,5,1};
        for(int i=1; i<array.length; i++){
            int j= i-1;
            int point = array[i];
            while(j>=0 && array[j]>point) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j+1] = point;
        }

        for(int n=0; n<array.length; n++){
            System.out.println(array[n]);
        }
    }
}
