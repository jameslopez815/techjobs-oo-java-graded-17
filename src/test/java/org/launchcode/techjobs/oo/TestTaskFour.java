package org.launchcode.techjobs.oo;

import mockit.Expectations;
import mockit.Mocked;
import mockit.Tested;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
public class TestTaskFour extends AbstractTest {

    @Tested
    JobTest jobTest;
    @Mocked
    Job job;
    @Mocked
    Assert mockedAssert;

    @Test
    public void testTestSettingJobIdExists() throws ClassNotFoundException {
        Class jobTestClass = getClassByName("JobTest");
        Method testSettingJobIdMethod = null;

        try {
            testSettingJobIdMethod = jobTestClass.getMethod("testSettingJobId");
        } catch (NoSuchMethodException e) {
            fail("JobTest does not have a testSettingId method");
        }
    }

    @Test
    public void testTestJobConstructorSetsAllFieldsExists() throws ClassNotFoundException {
        Class jobTestClass = getClassByName("JobTest");
        Method testSettingJobIdMethod = null;

        try {
            testSettingJobIdMethod = jobTestClass.getMethod("testJobConstructorSetsAllFields");
        } catch (NoSuchMethodException e) {
            fail("JobTest does not have a testJobConstructorSetsAllFields method");
        }
    }

    @Test
    public void testTestJobsForEqualityExists() throws ClassNotFoundException {
        Class jobTestClass = getClassByName("JobTest");

        try {
            jobTestClass.getMethod("testJobsForEquality");
        } catch (NoSuchMethodException e) {
            fail("JobTest does not have a testJobsForEquality method");
        }
    }
}