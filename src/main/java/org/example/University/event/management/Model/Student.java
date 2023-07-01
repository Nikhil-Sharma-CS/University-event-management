package org.example.University.event.management.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.AccessType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {

    @Id //Primary Key
    private Integer studentId;

    @Pattern(regexp = "^[A-Z].*$", message = "First letter should be capital") //This will ensure the first letter is always capital
    private String first_name;
    private String last_name;

    @Min(18)
    @Max(25)    //This will define the range of age
    private Integer age;

    @Enumerated(EnumType.STRING)
    private Department department;
}
