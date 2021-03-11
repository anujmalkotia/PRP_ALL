public class Q12{
	public static void main( String args[]){
		int nums[]={1,2,3,4,5,6};
		x=only14(nums);
		System.out.println(x);
public boolean only14(int[] nums) {
  boolean isTrue = true;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] != 1 && nums[i] != 4)
      isTrue = false;
  }
  return isTrue;
  
}
}