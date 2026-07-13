
    public static void main(String[] args) {

        int a[] = {20, 10, 30, 5, 15};
        int temp;

        for (int i = 0; i < a.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < a.length; j++) {

                if (a[j] < a[min]) {
                    min = j;
                }
            }

            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        System.out.println("Sorted Array:");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }