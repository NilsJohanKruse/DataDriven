package de.axa.ses;

/**
 * Created by User on 05.12.2016.
 */
public class Feedback {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String message;
    private String type;


}
