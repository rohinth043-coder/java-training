
    public class OBJECT {
    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};

        int max = 0;

        for(int i = 0; i < height.length; i++) {
            for(int j = i + 1; j < height.length; j++) {
                int width = j - i;
                int h = Math.min(height[i], height[j]);
                int area = width * h;

                if(area > max)
                    max = area;
            }
        }

        System.out.println("Maximum Water = " + max);
    }
}

