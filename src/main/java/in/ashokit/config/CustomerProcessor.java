package in.ashokit.config;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Customer;

@Component
public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer item) throws Exception {

		// logic

		return item;
	}

}
