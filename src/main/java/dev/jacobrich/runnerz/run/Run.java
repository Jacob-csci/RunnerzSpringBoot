package dev.jacobrich.runnerz.run;


import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;


public record Run(
    @Id
    Integer id,
    String title,
    LocalDateTime startedOn,
    LocalDateTime completedOn,
    Integer miles,
    Location location,
    @Version
    Integer version
) {}

