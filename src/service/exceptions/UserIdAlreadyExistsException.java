package service.exceptions;


import model.MobileContact;

public class UserIdAlreadyExistsException extends Exception {
    private static final long serialVersionUID = 234562997373773378L;

    public UserIdAlreadyExistsException(MobileContact mobileContact) {
        super("Mobile contact with id:" + mobileContact.getId() + " already exists");
    }
}
