
public class peak {
   public peak() {
   }

   public int findPeakElement(int[] var1) {
      if (var1.length == 1) {
         return 0;
      } else {
         int var2 = 0;
         int var3 = var1.length - 1;

         while(var2 < var3) {
            int var4 = var2 + (var3 - var2) / 2;
            if (var1[var4] < var1[var4 + 1]) {
               var2 = var4 + 1;
            } else {
               var3 = var4;
            }
         }

         return var2;
      }
   }
}