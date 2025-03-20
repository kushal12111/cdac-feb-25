import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Event {
    private int eventId;
    private String eventName;
    private LocalDate eventDate;
    private String eventType;
    private List<Participant> participantsList;

    public Event(int eventId, String eventName, LocalDate eventDate, String eventType, List<Participant> participantsList) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventType = eventType;
        this.participantsList = participantsList;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public List<Participant> getParticipantsList() {
        return participantsList;
    }

    public void setParticipantsList(List<Participant> participantsList) {
        this.participantsList = participantsList;
    }
}

class Participant {
    private int participantId;
    private String participantName;
    private int age;
    private String email;
    private String phone;

    public Participant(int participantId, String participantName, int age, String email, String phone) {
        this.participantId = participantId;
        this.participantName = participantName;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

public class EventManager {
    private Map<Integer, Event> eventMap = new HashMap<>();

    public void addEvent(Event event) {
        if (!eventMap.containsKey(event.getEventId())) {
            eventMap.put(event.getEventId(), event);
            System.out.println("Event added successfully!");
        } else {
            System.out.println("Event ID already exists!");
        }
    }

    public Event getEvent(int eventId) {
        return eventMap.get(eventId);
    }

    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        List<Participant> participants = new ArrayList<>();
        participants.add(new Participant(1, "John Doe", 25, "john.doe@example.com", "1234567890"));
        participants.add(new Participant(2, "Jane Smith", 30, "jane.smith@example.com", "0987654321"));

        Event event = new Event(101, "Tech Workshop", LocalDate.of(2025, 3, 20), "Workshop", participants);

        eventManager.addEvent(event);

        Event retrievedEvent = eventManager.getEvent(101);
        System.out.println("Event Name: " + retrievedEvent.getEventName());
    }
}
