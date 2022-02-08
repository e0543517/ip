package duke.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Represents a Deadline task. A Deadline object corresponds to a String description of the Task
 * and the LocalDateTime the task is due.
 */
public class Deadline extends Task {

    private LocalDateTime dateAndTime;

    /**
     * Constructs a deadline task.
     * @param description Description of deadline task.
     * @param dateAndTime LocalDateTime of the deadline task.
     */
    public Deadline(String description, LocalDateTime dateAndTime) {
        super(description);
        this.dateAndTime = dateAndTime;
    }

    /**
     * Returns a String representation of the deadline task in the desired format.
     *
     * @return String representation.
     */
    @Override
    public String toString() {
        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern(" MMM dd yyyy h:mm a");
        String outputDateTime = dateAndTime.format(outputFormat);
        return "[D]" + super.toString() + " (by:" + outputDateTime + ")";
    }
}
