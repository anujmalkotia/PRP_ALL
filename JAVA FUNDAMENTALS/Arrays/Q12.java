public class Q12{
	public static void main( String args[]){
		int a[]={1,2,3};
		int b[]={7,8,9};
		x=middleWay(a,b);
		System.out.println(x);
public class middleWay {
    public int[] middleWay(int[] a, int[] b) {
        int[] newArr = new int[2];
        newArr[0] = a[1];
        newArr[1] = b[1];

        return newArr;

    }

}
}