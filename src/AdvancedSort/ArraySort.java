package AdvancedSort;

public class ArraySort {
    private long[] dizi;
    private int elemanSayisi;

    public ArraySort(int max) {
        dizi = new long[max];
        elemanSayisi = 0;
    }

    public void insert(long d) {
        dizi[elemanSayisi] = d;
        elemanSayisi++;
    }

    public void display() {
        for (int i = 0; i < elemanSayisi; i++)
            System.out.print(dizi[i] + " ");
        System.out.println("");
    }

    public void mergeSort() {
        long[] workSpace = new long[elemanSayisi];
        recMergeSort(workSpace, 0, elemanSayisi - 1);
    }

    private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound)
            return;
        else {
            int mid = (lowerBound + upperBound) / 2;
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid + 1, upperBound);
            merge(workSpace, lowerBound, mid + 1, upperBound);
        }
    }

    private void merge(long[] workSpace, int lowPtr, int highPtr, int upperBound) {
        int i = 0;
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1;

        while (lowPtr <= mid && highPtr <= upperBound)
            if (dizi[lowPtr] < dizi[highPtr])
                workSpace[i++] = dizi[lowPtr++];
            else
                workSpace[i++] = dizi[highPtr++];
        while (lowPtr <= mid)
            workSpace[i++] = dizi[lowPtr++];
        while (highPtr <= upperBound)
            workSpace[i++] = dizi[highPtr++];
        for (i = 0; i < n; i++)
            dizi[lowerBound + i] = workSpace[i];
    }

    public void shellSort() {
        int i, j;
        long temp;
        int h = 1;
        while (h <= elemanSayisi / 3)
            h = h * 3 + 1; //1 4 13 40 121 .....
        while (h > 0) {
            for (i = h; i < elemanSayisi; i++) {
                temp = dizi[i];
                j = i;

                while (j > h - 1 && dizi[j - h] >= temp) {
                    dizi[j] = dizi[j - h];
                    j -= h;
                }
                dizi[j] = temp;
            }
            h = (h - 1) / 3;
        }
    }

    public void quickSort(){
        recQuickSort(0,elemanSayisi-1);
    }

    private void recQuickSort(int left, int right){
        if (right-left <=0)
            return;
        else{
            long pivot = dizi[right];
            int partition = partitionIt(left, right, pivot);
            recQuickSort(left, partition-1);
            recQuickSort(partition+1, right);
        }
    }

    private int partitionIt(int left, int right, long pivot){
        int leftPtr = left-1;
        int rightPtr = right;
        while (true){
            while (dizi[++leftPtr]<pivot);
            while (rightPtr > 0 && dizi[--rightPtr] > pivot);
            if (leftPtr > rightPtr)
                break;
            else
                swap(leftPtr, right);
        }
        swap(leftPtr, right);
        return leftPtr;
    }

    private void swap(int index1, int index2){
        long temp = dizi[index1];
        dizi[index1] = dizi[index2];
        dizi[index2] = temp;
    }

}
