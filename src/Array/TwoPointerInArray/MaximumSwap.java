package Array.TwoPointerInArray;

public class MaximumSwap {
    public static void main(String[] args) {
    int num = 98368;
    int result = MaximumSwap.maximumSwap(num);
        System.out.println(result);

    }
    public  static int maximumSwap(int num) {
        String val = String.valueOf(num);
        char[] array = val.toCharArray();

        // find where the digits start increasing, since descending sequences don't need swapping
        int i = 0;
        while (i < array.length - 1 && array[i] >= array[i + 1]) {
            i++;
        }

        if (i == array.length - 1) {
            // whole number has descending digits so no swaps needed
            return num;
        }

        // find max after the digits start increasing
        int j = i + 1;
        char longest = '0';
        int index = j;
        while (j < array.length) {
            if (longest <= array[j]) {
                longest = array[j];
                index = j;
            }
            j++;
        }

        // find correct first index to swap, which is the leftmost digit in descending part of number that is smaller than the digit at index
        int firstIndex = 0;
        for (int k = 0; k <= i; k++) {
            if (array[k] < array[index]) {
                firstIndex = k;
                break;
            }
        }

        // swap
        char temp = array[firstIndex];
        array[firstIndex] = array[index];
        array[index] = temp;

        return Integer.valueOf(new String(array));
    }
}

