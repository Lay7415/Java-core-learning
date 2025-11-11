public class Generics {
    public static void main(String[] args) {
        EmailMessage email = new EmailMessage("Привет, ты спишь?", "someaddress@hmail.com");
        Messenger<EmailMessage> mailClient = new Messenger<EmailMessage>(email);
        mailClient.send(); 

        SmsMessage sms = new SmsMessage("Hello World", "+71234567890");
        Messenger<SmsMessage> phone = new Messenger<SmsMessage>(sms);
        phone.send();
    }
}

class Message {
    private String text;

    String getText() {
        return text;
    }

    Message(String text) {
        this.text = text;
    }
}

class EmailMessage extends Message {

    private String address;

    String getAddress() {
        return address;
    }

    EmailMessage(String text, String address) {

        super(text);
        this.address = address;
    }
}

class SmsMessage extends Message {

    private String number;

    String getNumber() {
        return number;
    }

    SmsMessage(String text, String number) {
        super(text);
        this.number = number;
    }
}

class Messenger<T extends Message> {

    private T message;

    T getMessage() {
        return this.message;
    }

    Messenger(T message) {
        this.message = message;
    }

    void send() {
        System.out.println("Отправляется сообщение: " + message.getText());
    }
}