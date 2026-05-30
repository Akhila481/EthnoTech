class Employee {

    void name() {
        System.out.println("Akhila");
    }
}

class Role extends Employee {

    void work() {
        System.out.println("Software Engineer");
    }
}

class Salary extends Employee {

    void salary() {
        System.out.println("80000");
    }
}

class Developer extends Employee {

    void developer() {
        System.out.println("Java Full Stack Developer");
    }
}

class Emp_management_Inheritance {

    void tester() {

        Salary s = new Salary();
        Role r = new Role();
        Developer d = new Developer();

        s.name();
        s.salary();

        r.work();

        d.developer();
    }

    public static void main(String[] args) {
        Emp_management_Inheritance t = new Emp_management_Inheritance();
        t.tester();
    }
}