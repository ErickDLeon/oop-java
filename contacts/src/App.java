import com.app.dto.Contact;
import com.app.dto.ContactManager;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Contact!");

        ContactManager myContactManager = new ContactManager();

        myContactManager.addContact(new Contact("Erick", "erickleonortega21@gmail.com", "4925837341"));
        myContactManager.addContact(new Contact("Paty", "erickleonortega21@gmail.com", "4925837341"));
        myContactManager.addContact(new Contact("Edgar", "erickleonortega21@gmail.com", "4925837341"));

        Contact contact = myContactManager.searchContact("Erick");

        System.out.println("Contact: " + contact);

        myContactManager.ContactsList();
    }
}
