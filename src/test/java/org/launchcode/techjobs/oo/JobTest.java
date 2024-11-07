package org.launchcode.techjobs.oo;


import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

    @Test // * Compare objects to check if they refer to the same memory location / actual content of the objects
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2); // Check that these two instances are not equal.
    }

    @Test // Verify that all fields of the Job object are correctly set when an instance is created.
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", job1.getName());
        assertEquals("ACME", job1.getEmployer().getValue());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Quality control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue()); // Check if the actual value returned by the Job object matches the expected value

        assertTrue(job1.getName() instanceof String);
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency); // Check if the type of the returned value is correct
    } //Each assertion corresponds to a specific field in the Job class, ensuring that the constructor sets all fields correctly.

    @Test // Tests the equality of two Job objects
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(job1, job2); // To work correctly, the Job class must have an overridden equals() method that compares the relevant fields of the objects.
    }

    @Test // Check if the toString representation of a Job object starts and ends with a new line character. (Task 5)
    public void testToStringStartsAndEndsWithNewLine() { //Instantiate a Job object with various parameters
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(job.toString().startsWith(lineSeparator()), true);
        assertEquals(job.toString().endsWith(lineSeparator()), true);
    }//lineSeparator() ensures compatibility across different operating systems.

    @Test // Verify that the toString method of the Job class returns the correct string representation of a job object
    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(String.format("%nID: %d%nName: %s%nEmployer: %s%nLocation: %s%nPosition Type: %s%nCore Competency: %s%n", job1.getId(), "Product tester", "ACME", "Desert", "Quality control", "Persistence"), job1.toString());
   } // Check if the returned string matches the expected formatted string. If equal, the test passes.

    @Test // Test the toString method of a Job object when some fields are empty
    public void testToStringHandlesEmptyField() {
        Job job1 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        String notAvailable = "Data not available";
        assertEquals(String.format("%nID: %d%nName: %s%nEmployer: %s%nLocation: %s%nPosition Type: %s%nCore Competency: %s%n", job1.getId(), "Product tester", notAvailable, "Desert", notAvailable, "Persistence"), job1.toString());
    } // Output: formatted string with job's ID, name, and other fields, replacing empty fields with "Data not available".

}