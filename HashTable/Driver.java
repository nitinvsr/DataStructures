class Driver{
	public static void main(String[] args) {
		HT h=new HT();
		System.out.println(h.hash(500));
		System.out.println(h.hash(501));
		System.out.println(h.hash(502));
		
		h.put(10,100);
		h.put(5,25);

		System.out.println( h.get(10));
		System.out.println( h.get(50));
		

	}
}