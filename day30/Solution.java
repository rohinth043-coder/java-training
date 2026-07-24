
public class  Solution() {
   }

   public int findContentChildren(int[] var1, int[] var2) {
      Arrays.sort(var1);
      Arrays.sort(var2);
      int var3 = 0;
      byte var4 = 0;

      while(var3 < var1.length && var4 < var2.length) {
         if (var1[var3] <= var2[var4]) {
            ++var3;
         }
      }

      return var3;
   }
}
