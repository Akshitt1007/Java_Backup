package g_Recursion.c_Arrays_Questions;

public class c4_Find_element_in_RSA {
    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};

        System.out.println(search(arr, 4, 0, arr.length - 1));
        System.out.println(search(arr, 6, 0, arr.length - 1));
        System.out.println(search(arr, 3, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e-s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m-1);
            } else {
                return search(arr, target, m+1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m+1, e);
        }

        return search(arr, target, s, m-1);
    }
}
