class Node
{
	int data;
	Node next;
	public Node(int data)
 	{
	  this.data=data;
	  this.next=next;
	}
 }	
 class LinkedList	
 {
 	Node head;
 	public void insert(int data)
 	{
 		Node newNode = new Node(data);
 		if(head==null)
 		{
 		 head=newNode;
 		 return;
 		}
 	Node temp= head;
 	
 	while(temp.next!=null)
 	{
 	 	temp=temp.next;
 	}
 	   temp.next=newNode;
 	   }
 	public void show()
 	{
 		Node temp=head;
 		while(temp!=null)
 		{
 			System.out.print(temp.data +"->");
 			temp=temp.next;
 		}
 	}
 }
 class Sample
 {
 	public static void main(String s[])
 	{
 		LinkedList l1= new LinkedList();
 		l1.insert(10);
 		l1.insert(30);
 		l1.insert(40);
 		l1.insert(60);
 		System.out.print("LinkedList is");
 		l1.show();
 	}
 }		
 					   
 	    		
