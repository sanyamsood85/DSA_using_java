class Solution {
    public boolean detectCapitalUse(String word) {
        char[] arr = word.toCharArray();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                count++;
            }
        }

        int c = 0;
        if (arr[0] >= 'A' && arr[0] <= 'Z') {
            c++;
        }

        int b = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                b++;
            }
        }

        if (count == arr.length || count == 0 || (c == 1 && b == 0)) {
            return true;
        } else {
            return false;
        }
    }
}