class employee {
	void name() {
		System.out.println("Alika");
	}
}
class role extends employee{
	void work() {
		System.out.println("Software Engineer");
	}
}
class Salary extends employee{
	void salary() {
		System.out.println("80000");
	}
	public static void main(String[] args) {
		Salary s=new Salary();
		role r=new role();
		s.name();
		s.salary();
		r.work();
	}

}