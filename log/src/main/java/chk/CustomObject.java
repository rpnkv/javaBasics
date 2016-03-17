package chk;


import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class CustomObject {

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(CustomObject.class);

    private String message;
    private int id;

    public CustomObject() {
        message = "default message";
        id = -1;
    }

    public CustomObject(String message, int id) {
        this.message = message;
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public int getId() {
        return id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            logger.error(Arrays.toString(e.getStackTrace()));
        }

        return "{" + id + "; " + message + "}";
    }
}