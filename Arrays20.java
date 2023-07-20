/**
 * Arrays20
 */
public class Arrays20 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        //bring nums1 to another array
        int temp[] = new int[m];
        for(int i=0;i<m;i++){
            temp[i] = nums1[i];
        }

        int i=0, j=0, k=0;
        while(i < m && j < n){
            if(temp[i] > nums2[j]){
                nums1[k] = nums2[j];
                j++;
            }else{
                nums1[k] = temp[i];
                i++;
            }
            k++;
        }

        //leftover
        while(i < m){
            nums1[k++] = temp[i++];
        }
        while(j < n){
            nums1[k++] = nums2[j++];
        }
    }
    public static void main(String[] args) {
        //88. Merge Sorted Array

    }
}