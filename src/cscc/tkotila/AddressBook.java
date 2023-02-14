package cscc.tkotila;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AddressBook {
    private List<ContactInfo> contactInfoList;

    public AddressBook() {
        this.contactInfoList = new ArrayList<>();
    }

    public void addContactInformation(ContactInfo contactInformation) {
        contactInfoList.add(contactInformation);
    }

    public void addContactInformation(String name, String emailAddress) {
        contactInfoList.add(new ContactInfo(name, emailAddress));
    }

    public ContactInfo getContactInfoByName(String name) {
        return contactInfoList.stream()
                .filter(contactInfo -> Objects.equals(contactInfo.getName(), name))
                .findFirst()
                .orElseThrow();
    }

    public ContactInfo getContactInfoByEmail(String emailAddress) {
        return contactInfoList.stream()
                .filter(contactInfo -> Objects.equals(contactInfo.getEmailAddress(), emailAddress))
                .findFirst()
                .orElseThrow();
    }
}
