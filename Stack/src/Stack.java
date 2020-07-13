
public class Stack {
	
	int top = -1;
	int[] stackArray = new int[5];
	
	public void push(int data) {
		
		top++;
		
		stackArray[top]=data;
			
	}
	
	public int pop(){
		
		Integer i= 20;
		
		int x = stackArray[top];
		i=null;
		stackArray[top]=i;
		i.toString(null);
		
		top--;
		
		return x;
		
	}
	
	public void show() {
		
		for(int n=4; n>=0;n--) {
		
			System.out.println(stackArray[n]+" ");
		}
		
	}

}
   