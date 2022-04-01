package HashTable_Linkedlist;

public class HashTest {



    public static void main(String[] args) {

        HashTable <Integer> test = new HashTable<>(10);

        test.Add(1,1);
        test.Add(2,2);
        test.Add(3,3);
        test.Add(4,4);
        test.Add(5,5);
        test.Add(6,6);

        System.out.println(test.get(6));
        System.out.println(test.get(3));
        System.out.println(test.get(4));

    }






}
