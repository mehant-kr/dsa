class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 19, 22, 23, 25, 34, 55};
        int target = 25;
        int l = arr.length; // 9

        int left = 0;
        int right = l-1;
        int mid;

        while (left < right) {
            mid = (left+right)/2;
            if (arr[mid] == target) {
                System.out.println("Index: "+ mid);
                break;
            }

            if (target > arr[mid]) left = mid+1;
            else if (target < arr[mid]) right = mid-1;
            else System.out.println("Not Found");
        }
    }
}
