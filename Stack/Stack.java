public class Stack extends LinkedList
{
Node head;
public void push(int data)
{
	insertFirst(data);
}

public int peek()
{
	return head.data;
}

public void pop()
{
	Node curr=head;
	head=curr.next;

}

public void print()
{
	Node curr=head;
	while(curr.next!=null)
		{System.out.println(curr.data);
		curr=curr.next;}	
}

}