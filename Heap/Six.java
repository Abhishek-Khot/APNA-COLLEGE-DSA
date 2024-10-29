package Heap;



public class Six {
        public static void heapify(int arr[],int i,int size){
            //comparison
            int left = 2*i+1;
            int right = 2*i+2;
            int maxidx = i;
            if(left<size && arr[left]>arr[maxidx]){
                maxidx = left;

            }
            if(right<size &&arr[right]>arr[maxidx]){
                maxidx = right;

            }
            //swap 
            while (maxidx!=i) {
                int temp = arr[0];
                arr[0]= arr[maxidx];//maxidx is last index
                arr[maxidx]=temp;
                heapify(arr, maxidx, size);
                
            }
        }
        public static void heapSort(int arr[]){
            //1]create the maxheap
            int n = arr.length;
            for(int i =n/2;i>=0;i--){
                heapify(arr,i,n);
            }
            //2]push at last in array
            for(int i=n-1;i>0;i--){
                //swap first and last index 
                int temp =arr[0];
                arr[0]=arr[i];//n-1 is i
                arr[i]=temp;
                heapify(arr,0,i);
            }
        }
        
    
    public static void main(String[] args) {
        int arr[]= {1,2,4,5,3};
        heapSort(arr);
        //print
        for(int i =0;i<arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
