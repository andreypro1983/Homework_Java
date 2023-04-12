public class Homework6 {
    public static void main(String[] args) {
        Employee e0 = new Employee(32, "Ильнар", "Шафигулин", "Сергеевич", 20.0,"преподаватель");
        Employee e1 = new Employee(30, "Владимир", "Петров", "Сергеевич", "электрик");
        Employee e2 = new Employee(26, "Ольга", "Фролова", "Александровна", "менеджер");
        Employee e3 = new Employee(26, "Ольга", "Фролова","Александровна", "менеджер");
        System.out.println(e1);
        System.out.println(e2.getFullName());
        System.out.println(e1.equals(e2));
        System.out.println(e2.equals(e3));
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());
        System.out.println(e1.olderThan(e3));
        System.out.println(e3.olderThan(e2));
        System.out.println(e3.getSalary());
        e3.upgrade(100.0);
        System.out.println(e3.getSalary());
        e0.upgrade(200.0);
        System.out.println(e0.getSalary());
      
    }
}
