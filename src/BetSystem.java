import java.util.*;

import com.lotus.customer.Customer;

public class BetSystem {
	List<Customer> customerList;
	List<Event> eventList;
	
	BetSystem(){
		customerList  = new ArrayList();
		eventList  = new ArrayList();
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	public List<Event> getEventList() {
		return eventList;
	}

	public void setEventList(List<Event> eventList) {
		this.eventList = eventList;
	}

}
