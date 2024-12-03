package com.event.Event.Repository;

import com.event.Event.Model.Event;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventRepository extends MongoRepository<Event,String> {

}
