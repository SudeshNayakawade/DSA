public class Pivot_Target {
    public static void main(String[] args) {
        int arr[] = {  3, 0, 9, 6, 7,8 };
        int ans = pivot(arr, 0, arr.length - 1);
        System.out.println(ans);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }

    public static int pivot(int arr[],int si,int ei){
        int element = arr[ei];
        int pi =si;
        for(int i=si;i<=ei;i++){
            if(element>arr[i]){
                int temp = arr[i];
                arr[i]=arr[pi];
                arr[pi]=temp;
                pi++;
            }
        }
        int temp = arr[ei];
        arr[ei]=arr[pi];
        arr[pi]=temp;
        return pi;
    }
}
