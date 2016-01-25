public class myqueue {

    // implement the stack using an array
	int[] myarray =new int[101];
	// declare additional variables here
	int f=0;
	int r=0;
	public void enqueue(int element) {
		// ..... fill the stub function ......
		if(((101-f+r)%101)==100)
		{
			throw new RuntimeException("Queue is full");
		}
		else
		{
			myarray[r]=element;
			r=((r+1)%101);
		}
		
	}

	public int dequeue()  {
		// ..... fill the stub function ......
		if(isEmpty())
		{
			throw new RuntimeException("Queue is Empty");
		}
		else
		{
			int temp = myarray[f];
			//myarray[f]=null;
			f=((f+1)%101);
			return temp;
		}
	}

	public boolean isEmpty() {
		// ..... fill the stub function ......
		return (f==r);
	}
}
