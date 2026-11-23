
public class SearchingRange {
    public static void main(String[] args) {

        int[] arr ={23, 54, 34, 12, 76, 97, 57, 37, 88};
        int target = 97;
        System.out.println(linearsearch(arr, target, 1, 7));

    }
    static int linearsearch(int[] arr, int target, int start, int end) {
        if ( arr.length == 0) {
            return -1;
        }
    
    for ( int index = start; index <= end; index++) {
        // CHECK FOR ELEMENT AT EVERY INDEX IF IT IS = TARGET.
        int element = arr[index];
        if ( element == target){
        return index;
    }
}
return -1;

}

}

