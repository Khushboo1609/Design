 class Doubleyll {
    public int value;
    public Doubleyll next;
     public Doubleyll prev;


 }
class Double {
    Doubleyll head;
    Doubleyll tail;
    int size;

     Doubleyll creatdll(int NodeValue) {
        head = new Doubleyll();
        Doubleyll newNode = new Doubleyll();
        newNode.value = NodeValue;
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }
}

class x{
    public static void main(String[] args) {
        Double dll=new Double();
        dll.creatdll(1);
    }

}
