class Employee {
    private int id;
    private String name;
    private double salary;

    public void setId(int id) {
        if (id > 0)
            this.id = id;
        else
            System.out.println("Invalid ID");
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty())
            this.name = name;
        else
            System.out.println("Invalid Name");
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        if (salary > 0)
            this.salary = salary;
        else
            System.out.println("Invalid Salary");
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.setId(101);
        e.setName("Rahul");
        e.setSalary(25000);

        System.out.println("Employee ID: " + e.getId());
        System.out.println("Employee Name: " + e.getName());
        System.out.println("Employee Salary: " + e.getSalary());
    }
}