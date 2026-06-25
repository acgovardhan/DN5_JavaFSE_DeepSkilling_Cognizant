package DependencyInjectionExample;

public class CustomerService {
    //depends on customer repository
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    public void findCustomer(String id){
        customerRepository.findCustomerById(id);
    }
}
