package com.marybeth.SubscriberList.subscriber;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.marybeth.SubscriberList.subscriber.Subscriber;

public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {

	List<Subscriber> findByLastName(String lastName);
	List<Subscriber> findByUserNameContains(String userName);
}
