package Part3.Registartion;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.rules.ExpectedException;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationTest {

    /*@BeforeEach
    public void setup() {
        Registration actual = new Registration();
    }*/

    @Test
    void validate_NOT_NULL_login() throws AuthException {
        boolean exceptionThrown = false;
        try {
            Registration actual = new Registration();
            actual.validate(null, "qwerty", "qwerty");
            Assert.assertNotNull(actual);
        } catch (AuthException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }
    @Test
    void validate_NOT_NULL_password() throws AuthException {
        boolean exceptionThrown = false;
        try {
            Registration actual = new Registration();
            actual.validate("qwerty", null, "qwerty");
            Assert.assertNotNull(actual);
        } catch (AuthException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }
    @Test
    void validate_NOT_NULL_confirmPassword() throws AuthException {
        boolean exceptionThrown = false;
        try {
            Registration actual = new Registration();
            actual.validate("qwerty", "qwerty", null);
            Assert.assertNotNull(actual);
        } catch (AuthException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }

    @Test
    void validate_NOT_NULL() {
        Registration actual = new Registration();
        Assert.assertNotNull(actual);
    }

    @Test
    void validate_allDate() throws AuthException {
        Registration actual = new Registration();
        Assert.assertEquals(true, actual.validate("qwerty", "qwerty", "qwerty"));
    }

    @Test
    void validate_allDate_NotNull() throws AuthException {
        Registration actual = new Registration();
        actual.validate("qwerty", "qwerty", "qwerty");
        Assert.assertNotNull(actual);
    }

    @Test
    public void validate_login() {
        boolean exceptionThrown = false;
        try {
            Registration actual = new Registration();
            Assert.assertEquals(AuthException.class, actual.validate("qwegggggggggggggggggrty", "qwerty", "qwerty"));
        } catch (AuthException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }

    @Test
    public void validate_password_confirmPassword() {
        boolean exceptionThrown = false;
        try {
            Registration actual = new Registration();
            Assert.assertEquals(AuthException.class, actual.validate("qwerty", "qwerty1", "qwerty2"));
        } catch (AuthException e) {
            exceptionThrown = true;
        }
        assertTrue(exceptionThrown);
    }
}