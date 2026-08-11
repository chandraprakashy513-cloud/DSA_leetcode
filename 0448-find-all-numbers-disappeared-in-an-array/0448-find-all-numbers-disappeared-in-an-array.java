class Solution {

    public static void swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }

    public List<Integer> findDisappearedNumbers(int[] arr) {

        List<Integer> ans = new ArrayList<>();

        int n = arr.length;
        int i = 0;

        while (i < n) {

            int idx = arr[i] - 1;

            if (arr[i] == arr[idx]) {
                i++;
            } 
            else {
                swap(arr, i, idx);
            }
        }

        for (int j = 0; j < n; j++) {

            if (arr[j] != j + 1) {
                ans.add(j + 1);
            }
        }

        return ans;
    }
}