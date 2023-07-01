package org.example.University.event.management.Service;

import org.example.University.event.management.Model.Event;
import org.example.University.event.management.Repository.iEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    iEventRepo  iEventrepo;

    public String addEvents(List<Event> eventList) {
        iEventrepo.saveAll(eventList);
        return "Events Added";
    }

    public String deleteEvent(Integer id) {
        iEventrepo.deleteById(id);
        return "Event Deleted";
    }

    public Iterable<Event> eventsByDate(String date) {

        return iEventrepo.findByeventDate(date);
    }

    public Iterable<Event> events() {
        return iEventrepo.findAll();
    }

    public String updateLocation(Integer Id, String location) {
        Optional<Event> events = iEventrepo.findById(Id);
        Event event = null;

        if(events.isPresent())
        {
            event = events.get();
        }
        else{
            return  "Id not found";
        }
        event.setLocationOfEvent(location);
        iEventrepo.save(event);
        return "Location Updated";
    }
}
