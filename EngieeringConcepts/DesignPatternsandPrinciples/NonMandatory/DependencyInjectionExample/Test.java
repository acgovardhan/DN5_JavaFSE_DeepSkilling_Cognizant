package DependencyInjectionExample;

public class Test {
    public static void main(String[] args) {
        CustomerService cs = new CustomerService(new CustomerRepositoryImpl());

        cs.findCustomer("john@113");
    }
}
