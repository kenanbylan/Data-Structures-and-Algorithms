public class InterpolasyonSearch {



    public static int InterpolasyonSearch(int array[] ,int search ,int low,int high ){

        int pos;
        int steps=1;


        while (low <=high ){

            if (search >= array[low] && search <= array[high]){

            pos = low+ (((high - low) / (array[high] - array[low])) * (search - array[low]));
            steps++;

            if (array[pos] == search){
                System.out.println("steps : "+steps);
                return pos ;

            }else if (array[pos] < search){
                return InterpolasyonSearch(array,search,pos+1,high);

            } else if (array[pos] > search){
                return InterpolasyonSearch(array,search,low,pos-1);
            }
        }

        }
        return  -1; //not found.
    }


    public static void main(String[] args) {

        //big -O notasyonu 0(log(logn)) .


        int arr[] = { 10, 12, 13, 16, 18, 19, 20, 21,22, 23, 24, 33, 35, 42, 47 };
        int arr2[] = { 10, 11, 12, 13, 14, 15, 16, 17,18, 19, 20, 21, 22, 23, 24 };

        int search =12;
        int low = 0;
        int high = arr2.length -1; //last index.

        int Result = InterpolasyonSearch(arr2,search,low,high);


        if (Result == -1){
            System.out.println(search+"value not found.");
        }else {
            System.out.println(search+" value found ,index : "+Result);
        }

    }

}
