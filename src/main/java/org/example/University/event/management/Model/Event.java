package org.example.University.event.management.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Event {

    @Id
    private Integer eventId;
    private String eventName;
    private String locationOfEvent;

    @Pattern(regexp = "^(0[1-9]|[1-2][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}$", message = "Enter valid date DD-MM-YYYY")
    private String eventDate;

    @Pattern(regexp = "^(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9])(:[0-5][0-9])?$", message = "Enter time in valid format HH:MM")
    private String startTime;

    @Pattern(regexp = "^(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9])(:[0-5][0-9])?$", message = "Enter time in valid format HH:MM")
    private String endTime;

}
