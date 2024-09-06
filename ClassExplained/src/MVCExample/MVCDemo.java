package MVCExample;

public class MVCDemo {
    public static void main(String[] args) {
        // Luodaan malli- ja näkymäoliot
        UserModel model = new UserModel();
        UserView view = new UserView();

        // Luodaan ohjainolio ja injektoidaan malli ja näkymä siihen
        UserController controller = new UserController(model, view);

        // Ohjaimen avulla asetetaan käyttäjän nimi ja päivitetään näkymä
        controller.setUserName("John Doe");
        controller.updateView();
    }
}

