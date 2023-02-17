class Ll {
    int val;
    Ll next;

    Ll(int val) {
        this.val=val;

    }
}


 class Linklist {
     public static void main(String[] args) {
         Ll x = new Ll(3);
         Ll x1 = new Ll(5);
         x.next = x1;
         while (x != null) {

             System.out.println(x.val);
             x = x.next;

         }


     }
 }
