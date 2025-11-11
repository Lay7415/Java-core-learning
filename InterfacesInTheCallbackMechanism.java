public class InterfacesInTheCallbackMechanism {
    public static void main(String[] args) {
        Button button = new Button(new ButtonClickHandler());
        button.click();
        button.setHandler(new ButtonTvClickHandlder());
        button.click();
    }
}

class ButtonClickHandler implements EvenHandler {
    public void execute() {
        System.out.println("Кнопка нажата!");
    }
}

class ButtonTvClickHandlder extends ButtonClickHandler {
    @Override
    public void execute() {
        System.out.println("Кнопка пульта нажата!");
    }
}

interface EvenHandler {
    void execute();
}

class Button {
    EvenHandler handler;

    Button(EvenHandler action) {
        this.handler = action;
    }

    public void click() {
        this.handler.execute();
    }

    public void setHandler(EvenHandler handler) {
        this.handler = handler;
    }

    public EvenHandler getHandler() {
        return handler;
    }
}
