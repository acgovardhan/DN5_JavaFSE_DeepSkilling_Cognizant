package DependencyInjectionExample;

public class CustomerRepositoryImpl implements CustomerRepository{

        @Override
        public void findCustomerById(String id){
            System.out.println("found customer with id: "+id);
        }
}
