package org.example.University.event.management.Repository;

import org.example.University.event.management.Model.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface iEventRepo extends CrudRepository<Event, Integer> {

    Iterable<Event> findByeventDate(String eventDate);  //This is a custom finder to find events by date
}
