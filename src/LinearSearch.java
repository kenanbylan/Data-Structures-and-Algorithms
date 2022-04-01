public class LinearSearch {

    public  static int search(int array[],int search) {

        int steps=0;

        for (int i=0;i< array.length;i++ ) {
            steps++;
            if (array[i] ==search ) {
                System.out.println("steps : "+steps);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        //Big-0 notation O(log(n)) 'dir.  slow algorithm.

        int array[] =  {1,21,32,4,53,6,8,99};
        int array2[] =  {1,2,3,4,5,6,8,9};


        int aranan = 8;
        int result = LinearSearch.search(array, aranan);

        if(result == -1){
            System.out.print(aranan+" not found ");
        }
        else{
            System.out.print(aranan+"valu found , index " + result);
        }

    }




}

