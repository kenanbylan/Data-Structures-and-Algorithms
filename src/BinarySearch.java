public class BinarySearch {

    int binarySearch(int array[], int target){

        int min =0; //array first index.
        int max = array.length-1; //array latest index.
        int steps=0;


        if(target < array[min] || target > array[max]){
            return  -1;
        }

        while (min<=max){
            int mid = (max+min)/2;
            steps++;

            if (array[mid] == target){
                System.out.println("(steps) : "+steps);
                return mid;
            }else if (array[mid]> target){
                max = mid-1;
            }else{
                min = mid +1 ;
            }
        }

      return  -1;
    }


    public static void main(String[] args) {

        //Big o notation : logn(x)

        BinarySearch search = new BinarySearch();

        int arr[] = {1,3,5,7,9}; //even distribution algorithm
        int arr2[] = {12,21,9,7,123,61,27,13,88}; // not even distribution algorithm


        int aranan = 12;  //search value.
        int Result = search.binarySearch(arr2,aranan);

        if (Result ==-1 ){
            System.out.println(aranan +"not found.");
        } else{
            System.out.println(aranan +" found,  index : "+Result);
        }


    }
}
