
 public class RotatedSortedArray {
    public int search(int[] n, int target) {
        public Static void main(String[] args); {
            RotatedSortedArray rsa = new RotatedSortedArray();
            int[] n = {4, 5, 6, 7, 0, 1, 2};
            System.out.println(rsa.search(n, 0)); 
        }
        int start= 0,end=n.length-1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (n[mid]>n[end]) {          
             start = mid+1;
            }else {
                end = mid;
            }
        }
        return start;
    }
 }

    

