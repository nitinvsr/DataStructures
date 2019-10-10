class Driver{
	public static void main(String[] args) {
		HT h=new HT();
		System.out.println(h.hash(500));
		System.out.println(h.hash(501));
		System.out.println(h.hash(502));
		
		h.put(10,100);
		h.put(5,25);
		h.put(6,36);
		h.put(8,64);

		h.print();

		h.remove(5);
		h.remove(6);

		h.print();
	}
}