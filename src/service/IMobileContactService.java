package service;

import dto.MobileContactInsertDTO;
import dto.MobileContactUpdateDTO;
import model.MobileContact;
import service.exceptions.ContactNotFoundException;
import service.exceptions.PhoneNumberAlreadyExistsException;
import service.exceptions.UserIdAlreadyExistsException;

import java.util.List;

public interface IMobileContactService {
    MobileContact insertMobileContact(MobileContactInsertDTO mobileContactInsertDTO)
            throws PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException;

    MobileContact updateMobileContact(MobileContactUpdateDTO oldDTO, MobileContactUpdateDTO newDTO)
            throws ContactNotFoundException, PhoneNumberAlreadyExistsException, UserIdAlreadyExistsException;

    void deleteMobileContactById(Long id) throws ContactNotFoundException;
    MobileContact getMobileContactById(Long id) throws ContactNotFoundException;
    List<MobileContact> getAllMobileContacts();

    MobileContact getMobileContactByPhoneNumber(String phoneNumber) throws ContactNotFoundException;
    void deleteMobileContactByPhoneNumber(String phoneNumber) throws ContactNotFoundException;
}
