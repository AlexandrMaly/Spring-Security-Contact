package example.app.service;

import example.app.dto.ContactDto;
import example.app.entity.Contact;

import java.util.List;

public interface ContactService {
    void saveContact(ContactDto contactDto);
    Contact findByEmail(String email);
    List<ContactDto> findAllContacts();
}
