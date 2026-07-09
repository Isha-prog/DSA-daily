import java.util.*;

public class UnionSortedArrays {

    public static ArrayList<Integer> union(int[] arr1, int[] arr2) {

        ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {

                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;

            } else if (arr1[i] > arr2[j]) {

                if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                    result.add(arr2[j]);
                }
                j++;

            } else {

                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                    result.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // Remaining elements of arr1
        while (i < arr1.length) {

            if (result.isEmpty() || result.get(result.size() - 1) != arr1[i]) {
                result.add(arr1[i]);
            }
            i++;
        }

        // Remaining elements of arr2
        while (j < arr2.length) {

            if (result.isEmpty() || result.get(result.size() - 1) != arr2[j]) {
                result.add(arr2[j]);
            }
            j++;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 3, 5};

        System.out.println(union(arr1, arr2));
    }
}
