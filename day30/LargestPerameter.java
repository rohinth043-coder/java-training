public class LargestPerameter {
   public LargestPerameter() {
   }

   public int largestPerimeter(int[] var1) {
      Arrays.sort(var1);

      for(int var2 = var1.length - 1; var2 >= 2; --var2) {
         if (var1[var2] < var1[var2 - 1] + var1[var2 - 2]) {
            return var1[var2] + var1[var2 - 1] + var1[var2 - 2];
         }
      }

      return 0;
   }
}
