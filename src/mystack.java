public class mystack 
{

    // implement the stack using an array
	int[] myarray =new int[101];
	// declare additional variables here
	int top=-1;

	public void push(int element) {
		// ..... fill the stub function ......
		if(top==100)
		{
			throw new RuntimeException("Stack is Full");
		}
		else
		{
			top+=1;
			myarray[top]=element;
		}
		
	}

	public int pop() {
		// ..... fill the stub function ......
		if(isEmpty())
		{
			throw new RuntimeException("Stack is Empty");
		}
		else
		{
			int dummy=myarray[top];
			//myarray[top]=null;
			top-=1;
			return dummy;
		
		}
	}

	public boolean isEmpty() {
		// ..... fill the stub function ......
		return(top<0);
	}

	public int getElementAtTopOfStack() {
		// ..... fill the stub function ......
		return myarray[top];
	}
}
