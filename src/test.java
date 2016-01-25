public class test {

	public boolean isStackSortablePermutation(myqueue input) 
	{
		mystack s = new mystack();
		myqueue output = new myqueue();
		// ..... fill the stub function ......
		for( ;!input.isEmpty();)
		{
			int element =input.dequeue();
			for( ;!s.isEmpty() && element>s.getElementAtTopOfStack(); )
			{
				output.enqueue(s.pop());
			}
			s.push(element);
		}
		
		for( ;!s.isEmpty(); )
		{
			int element= s.pop();
			output.enqueue(element);
		}
		
		s.push(output.dequeue());
		for( ;!output.isEmpty(); )
		{
			int dummy=output.dequeue();
			if(s.getElementAtTopOfStack()>dummy)
			{
				return false;
			}
			else
			{
				s.push(dummy);	
			}
		}
	return true;
	}
}
