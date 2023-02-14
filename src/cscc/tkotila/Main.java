package cscc.tkotila;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        ContactInfo tylerContactInfo = new ContactInfo("Tyler Kotila", "tkotila@student.cscc.edu");

        addressBook.addContactInformation(tylerContactInfo);
        addressBook.addContactInformation("Mark Killoran", "mkilloran@cscc.edu");

        System.out.println(addressBook.getContactInfoByEmail("mkilloran@cscc.edu"));
        System.out.println(addressBook.getContactInfoByName("Tyler Kotila"));
    }
}
