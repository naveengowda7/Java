   import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {

                // Binary search is actually used for sorted array
                // Sorted - the array could be in ascending or descending order

                // Steps To Implement a Binary Search

                // 1. Find a Middle Element
                // 2. Check Target > mid
                //True// ---> Shift the start ---> mid+1
                //False// ---> Shift the end ----> mid-1
                // 3. mid == target
                //True// ---> Yeah we found
                //False// ---> Nope we did'nt found
                int[] arr = {0,1,2,3,5,4,8,9,10,55,3164,4321,8431};
                Scanner in = new Scanner(System.in);
                int target = in.nextInt();
                System.out.println(search(arr,target));
            }
    static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        int mid = 0;
        while(start <= end){
            mid = (start+(end-start)/2);
            if(arr[mid] < target) {
                start = mid + 1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }
            if(target == arr[mid]) {
                return mid;
            }
        }
        //--- here we will return the start index, because the while loop condition will be not valid
        //      it will come out of the loop and just return the value of start
        //          4--5--6--7
        //          s--tar--some--end
        //          14--15--16--17
        //--> here we will get 16 as a mid(if we consider 15 not present in the array
        //      so 16 will be the mid and so now end will be equal to start, then after next start  >  end
        //          e--tar--s
        //          14--15--16
        //--> so as we see the start symbol is at the next number of the target, so now the cieling number is START
        return start;
    }

}

}