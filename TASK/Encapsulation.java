class Encapsulation{
	private int id;
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
  	public static void main(String[] args) {
        	Encapsulation s = new Encapsulation();
	        s.setId(10);
        	System.out.println("Student id : " + s.getId());
    	}
}