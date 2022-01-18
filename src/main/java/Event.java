/**
 * This class encapsulates an Event task which inherits from Task.
 */
public class Event extends Task {
    private String at; //date/time of the event.

    public Event(String description, String at) {
        super(description);
        this.at = at;
    }

    @Override
    public String toString() {
        return "[E]" + super.toString() + " (at:" + at + ")";
    }
}
