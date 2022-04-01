package HashTable_Linkedlist;

public class HashNode {

    int key;
    Object value;
    HashNode next;

    public HashNode(int key, Object value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public HashNode() {
        next = null;
    }

    public int getKey() {
        return key;
    }

    public Object getObject(){
        return value;
    }




}
