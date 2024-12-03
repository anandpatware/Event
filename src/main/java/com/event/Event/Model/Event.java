package com.event.Event.Model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection="Event")
public class Event {


    private String eventName;
    private String date;
    private String location;
    private String description;


}

