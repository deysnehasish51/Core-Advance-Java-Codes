package com.nit.CollectionFramework;

import java.util.*;
import java.util.function.Predicate;

public class ConferenceManagementSystem {

    public static void main(String[] args) {

        ConferenceManager session1 = new ConferenceManager("Java Session");
        ConferenceManager session2 = new ConferenceManager("Cloud Session");

        session1.addAttendee("Snehasish");
        session1.addAttendee("Rahul");
        session1.addAttendee("Ankit");

        session2.addAttendee("Snehasish");
        session2.addAttendee("Rahul");
        session2.addAttendee("Ankit");

        session1.addAttendees(Arrays.asList("Priya", "Neha"));

        session1.removeAttendee("Neha");

        System.out.println("Is Rahul registered? " + session1.containsAttendee("Rahul"));

        System.out.println("Total attendees: " + session1.getAttendeeCount());
        System.out.println("Is session empty? " + session1.isEmpty());

        session1.mergeSession(session2.getAttendees());

        session1.removeWithdrawn(Arrays.asList("Ankit"));

        session1.retainVIP(Arrays.asList("Snehasish", "Priya"));

        session1.printAttendees();

        session1.toArray();
        session1.toTypedArray();

        System.out.println("Sessions equal? " +
                session1.getAttendees().equals(session2.getAttendees()));

        System.out.println("Session1 hashCode: " + session1.getAttendees().hashCode());
        System.out.println("Session2 hashCode: " + session2.getAttendees().hashCode());

        session1.clearSession();
        System.out.println("After clearing, empty? " + session1.isEmpty());
    }
}

class ConferenceManager {

    private Collection<String> attendees;
    private String sessionName;

    public ConferenceManager(String sessionName) {
        this.sessionName = sessionName;
        this.attendees = new ArrayList<>();
    }

    public void addAttendee(String name) {
        attendees.add(name);
    }

    public void addAttendees(Collection<String> names) {
        attendees.addAll(names);
    }

    public void removeAttendee(String name) {
        attendees.remove(name);
    }

    public boolean containsAttendee(String name) {
        return attendees.contains(name);
    }

    public int getAttendeeCount() {
        return attendees.size();
    }

    public boolean isEmpty() {
        return attendees.isEmpty();
    }

    public void mergeSession(Collection<String> otherSession) {
        attendees.addAll(otherSession);
    }

    public void removeWithdrawn(Collection<String> withdrawn) {
        attendees.removeAll(withdrawn);
    }

    public void retainVIP(Collection<String> vipList) {
        attendees.retainAll(vipList);
    }

    public void clearSession() {
        attendees.clear();
    }

    public Object[] toArray() {
        return attendees.toArray();
    }

    public String[] toTypedArray() {
        return attendees.toArray(new String[0]);
    }

    public void filterAttendees(Predicate<String> predicate) {
        attendees.removeIf(predicate);
    }

    public void printAttendees() {
        System.out.println("\nAttendees of " + sessionName + ":");
        Iterator<String> itr = attendees.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public Collection<String> getAttendees() {
        return attendees;
    }
}
