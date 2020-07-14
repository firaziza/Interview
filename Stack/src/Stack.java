
public class Stack {
	
	int top = -1;
	int[] stackArray = new int[5];
	
	public void push(int data) {
		
		top++;
		
		stackArray[top]=data;
			
	}
	
	public int pop(){
		
		int i=0;
		int x;
		
		x=stackArray[top];
		
		
		stackArray[top]=i;

		top--;
		
		return i;
		
	}
	
	public void show() {
		
		for(int n=4; n>=0;n--) {
		
			System.out.println(stackArray[n]+" ");
		}
		
	}

}
   