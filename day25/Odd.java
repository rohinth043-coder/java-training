import java.util.Objects;

public class Odd {
   public Static void main

   public ListNode ListNode(ListNode var1) {
      if (var1 != null && var1.next != null) {
         ListNode var2 = var1;
         ListNode var3 = var1.next;

         ListNode var4;
         for(var4 = var3; var3 != null && var3.next != null; var3 = var3.next) {
            var2.next = var3.next;
            var2 = var2.next;
            var3.next = var3.next.next;
         }

         var2.next = var4;
         return var1;
      } else {
         return var1;
      }
   }

   class ListNode {
      int val;
      ListNode next;

      ListNode(int var2) {
         Objects.requireNonNull(Odd.this);
          super();
         this.val = var2;
      }
   }
}

    
