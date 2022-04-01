package HashTable_Linkedlist;

public class HashTable <T> {

    HashNode[] hashArray;
    int size;
    int steps=0;

    public HashTable(int size) {
        this.size = size;
        hashArray = new HashNode[size];
        for (int i=0;i<size;i++){
            hashArray[i] = new HashNode();
        }
    }

    int getHash(int key){
        return key%size;
    }


    public void Add(int key,Object value){

        int Hindex = getHash(key);
        HashNode deger = hashArray[Hindex];
        HashNode yeni = new HashNode(key,value);
        yeni.next = deger.next;
        deger.next = yeni;

    }

    public T get(int key){

        T value = null;
        int Hindex= getHash(key);

        HashNode arrayValue = hashArray[Hindex];

        while (arrayValue !=null){
            steps++;
            if (arrayValue.getKey() == key){
                System.out.println("steps : "+steps);
                value = (T) arrayValue.getObject();
            }

            arrayValue = arrayValue.next;
        }
        return value;
    }


}
