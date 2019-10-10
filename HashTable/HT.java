public class  HT{
	int size=997;
	Node[] harr;
	
	HT()
	{
		harr=new Node[size];
	}

	int hash(int x){
		return ((x * x * x)+ (3*x*x)+1 ) % size ;
	}

	void put(int k,int v )
	{
		int index=hash(k);
		//System.out.println(index);
		Node kv =new Node(k,v);
		harr[index]=kv;
	}

	int get(int k)
	{
		int index=hash(k);
		if (harr[index]==null)
			return -1;
		else{		
			Node temp;
			temp=harr[index];
			return temp.value ;
		}
	}

	void remove()
	{
		//need to write
	}


	void print()
	{
		//need to write	
	}

}