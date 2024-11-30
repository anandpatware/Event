package com.event.Event.Service;

import com.event.Event.Model.Event;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;

@Service
public class EventService {

    public List<Event> getAllEvents() {
        // Sample data for demonstration purposes
        return Arrays.asList(
                new Event("Painting Exhibition", "2024-12-15", "Art Gallery", "A showcase of local artists' paintings."),
                new Event("Live Music Concert", "2024-12-20", "City Stadium", "An evening of live performances by famous bands."),
                new Event("Kavi Sammelan", "2024-12-25", "Cultural Hall", "A gathering of poets sharing their works."),
                new Event("Dance Performance", "2025-01-10", "Community Center", "Traditional and modern dance performances."),
                new Event("Theater Play", "2025-01-15", "City Theater", "A dramatic play by local theater group.")
        );
    }
}

