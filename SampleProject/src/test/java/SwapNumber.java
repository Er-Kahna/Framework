public class SwapNumber {

    public static void main(String[] args){
        int a=10;
        int b=20;
//        Operation(a,b);
        SwapArray(a,b);
    }

    public static void Operation(int a, int b){
        System.out.println("a ="+a  +" b ="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a ="+a  +" b ="+b);
    }

    public static void SwapArray(int a, int b){
        int[] arr={a, b};
//        int temp= arr[0];
//        arr[0]=arr[1];
//        arr[1]=temp;
        a=arr[1];
        b=arr[0];
        System.out.println("a ="+a  +" b ="+b);
    }

}
