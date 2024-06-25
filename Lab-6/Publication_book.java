class Book{
	private String author_name;

	Book(string author_name){
		this.author_name = author_name;
	}
	public void printDetails(){
		System,.out.println(this.author_name);
	}

	class Book_Publication extends Book{
		private String tittle;

		Book_Publication(String tittle,String author_name){
			super(author_name);
			this.tittle = tittle;
		}

		public void printDetails(){
			super.printDetails;
			System.out.println(this.tittle);
			System.out.println(this,author_name);
		}
	}
}