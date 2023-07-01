package org.example.University.event.management.Controller;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.validation.Valid;
import org.example.University.event.management.Model.Event;
import org.example.University.event.management.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class EventController {

    @Autowired
    EventService eventService;

    //Post mapping to add events
    @PostMapping("addEvents")
    public String addEvents(@RequestBody @Valid List<Event> eventList)
    {
        return eventService.addEvents(eventList);
    }

    //Put mappings to update event
    @PutMapping("updateLocation/{Id}/{location}")
    public String updateLocation(@PathVariable Integer Id, @PathVariable String location)
    {
        return eventService.updateLocation(Id, location);
    }

    //Delete mapping to delete event
    @DeleteMapping("deleteEvent/{Id}")
    public String deleteEvent(@PathVariable Integer Id)
    {
        return  eventService.deleteEvent(Id);
    }

    //Get mapping to get all events by date
    @GetMapping("eventsByDate/{Date}")
    public Iterable<Event> eventsByDate(@PathVariable String Date)
    {
        return eventService.eventsByDate(Date);
    }

    @GetMapping("Events")
    public Iterable<Event> events()
    {
        return eventService.events();
    }
}
