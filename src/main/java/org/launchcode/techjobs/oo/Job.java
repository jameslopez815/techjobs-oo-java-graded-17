package org.launchcode.techjobs.oo;

import java.util.Objects;

import static java.lang.System.lineSeparator;//-----------------------------added

public class Job {

    //instance variable (id) and a static variable (nextId)
    private int id; // Each object of the class will have its own id.
    private static int nextId = 1;  // Variable will assign unique IDs to each instance of the class.

    // Attributes represent different aspects of a job listing.
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() { // Ensure that the next job created will have a unique ID.
        id = nextId;
        nextId++;
    }

   // Distinguish between class attributes and parameters.
    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override // toString can be accessed from outside the class and returns a String.
    public String toString() {
        return String.format("%sID: %s%nName: %s%nEmployer: %s%nLocation: %s%nPosition Type: %s%nCore Competency: %s%s", lineSeparator(), checkFieldEmpty(id), checkFieldEmpty(name), checkFieldEmpty(employer), checkFieldEmpty(location), checkFieldEmpty(positionType), checkFieldEmpty(coreCompetency), lineSeparator());
    }

    // Check if a given field is empty and returns a message
    public String checkFieldEmpty(Object field) {
        String stringField = field.toString(); // check if the string representation of the object is empty.
        if (stringField.isEmpty()) {
            return "Data not available";
        } else {
            return stringField;
        }
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override // Object comparison using the equals method. Override a method from the superclass.
    public boolean equals(Object o) {
        if (this == o) return true; // (o) = object being compared
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o; // cast (o) to the Job type, allowing us to access its fields.
        return id == job.id; // Compare the id fields of both Job objects. If equal, the method returns true; otherwise, it returns false.
    }

    @Override // This method is overriding the default hashCode method from the Object class.
    public int hashCode() {
        return Objects.hashCode(id); // Generate hash code based on the id field of the object
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    // Getters and setters access and update private attributes.
    public String getName() {
        return name; //Getters return the value of its corresponding attribute.

    }

    public void setName(String name) {
        this.name = name; // Setters take a parameter and assigns it to the corresponding attribute.
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }


}
