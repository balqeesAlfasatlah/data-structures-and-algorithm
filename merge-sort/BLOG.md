# Tracing :

Sample Array: [5,1,6,4,11,2]

   public static int[] mergeSort(int[] arr) {
        int n = arr.length;
        if (n > 1) {
            int mid = n / 2;
            int[] l = new int[mid];
            int[] r = new int[n - mid];

            for (int i = 0; i < l.length; ++i) {
                l[i] = arr[i];
            }
            for (int j = 0; j < r.length; ++j) {
                r[j] = arr[j + mid];
            }
            mergeSort(l);
            mergeSort(r);
            merge(l, r, arr);
        }
        return arr;
    }

    public static void merge(int[] l, int[] r, int[] arr) {

        int i = 0, j = 0, k = 0;
        while (i < l.length && j < r.length) {
            if (l[i] <= r[j]) {
                arr[k] = l[i];
                i++;
            } else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }
        if (i == l.length) {
            for (int I = j; I < r.length; I++) {
                arr[k++] = r[I];

            }
        } else {
            for (int m = i; m < l.length; m++) {
                arr[k++] = l[m];
            }
        }
    }

    

The following diagram shows the complete merge sort process :

[![trac.png](https://i.postimg.cc/MHwcpmbZ/trac.png)](https://postimg.cc/HcSWS5hF)

   the array is recursively divided into two halves until the size becomes 1 and when the size becomes 1, the merge processes come into action and start merging arrays back while sorting.