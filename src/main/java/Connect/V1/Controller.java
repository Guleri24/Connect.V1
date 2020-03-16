package Connect.V1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.web.WebView;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public Button start;
    public Button skip;
    public Button erotic;
    public Button overcomingTheMonster;
    public Button comedy;
    public Button ragsToRiches;
    public Button tragedy;
    public Button theQuest;
    public Button rebirth;
    public Button voyageAndReturn;
    public Button about;
    public WebView description, view;
    public MenuItem OvercomingTheMonster;
    public MenuItem Comedy;
    public MenuItem RagsToRiches;
    public MenuItem Tragedy;
    public MenuItem TheQuest;
    public MenuItem Rebirth;
    public MenuItem VoyageAndReturn;
    public MenuItem Erotic;


    public void setStart() {
        start.setOnAction(e -> {
            try {
                Main.Choose();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }

    public void setDescription() {
        overcomingTheMonster.setOnAction(e -> getHtmlPage("The protagonist sets out to defeat an antagonistic force " +
                "(often evil) which threatens the protagonist and/or protagonist's homeland. ", description));

        comedy.setOnAction(e -> getHtmlPage(" Light and humorous character with a happy or cheerful ending; " +
                "a dramatic work in which the central motif is the triumph over adverse " +
                "circumstance, resulting in a successful or happy conclusion.[3] Booker" +
                " stresses that comedy is more than humor. It refers to a pattern where " +
                "the conflict becomes more and more confusing, but is at last made plain " +
                "in a single clarifying event. The majority of romance films fall into this category.   ", description));

        ragsToRiches.setOnAction(e -> getHtmlPage("The poor protagonist acquires power, wealth, and/or a mate," +
                " loses it all and gains it back, growing as a person as a result.  ", description));

        tragedy.setOnAction(e -> getHtmlPage("The protagonist's character flaw or great mistake which is their undoing. " +
                "Their unfortunate end evokes pity at their folly and the fall of a fundamentally good character.  ", description));

        theQuest.setOnAction(e -> getHtmlPage("The protagonist and companions set out to acquire an important object" +
                " or to get to a location. They face temptations and other obstacles along the way.  ", description));

        rebirth.setOnAction(e -> getHtmlPage("An event forces the main character to change their ways and often become a better person.  ", description));

        voyageAndReturn.setOnAction(e -> getHtmlPage("The protagonist goes to a strange land and, after overcoming the threats " +
                "it poses to them, they return with experience.  ", description));

        erotic.setOnAction(e -> getHtmlPage("Erotic literature comprises fictional and factual stories and accounts of " +
                "eros – passionate, romantic or sexual relationships – intended to arouse similar feelings" +
                " in readers,[1] in contrast to erotica, which focuses more specifically on sexual feelings. ", description));

        about.setOnAction(e -> getHtmlPage(" Connect: connecting people by stories In this desktop application users can share" +
                " and read stories of various type: includes: Quest Tragedy Romance Blue and many more            " +
                " you are my Bytecode, I'm your JavaC.", description));
    }

    @FXML
    private void setSkip() {
        skip.setOnAction(e -> {
            try {
                Main.View();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
    }

    private void getHtmlPage(String info, WebView webView) {
        webView.getEngine().loadContent("<html> \n" +
                "<style type=\"text/css\"> \n" +
                "\n" +
                "                body\n" +
                "                { background-color:  #d6e4f0;\n" +
                "                } \n" +
                "                h1{\n" +
                "                     text-align: center;\n" +
                "                     font-size: 50px;\n" +
                "                     color: #163172;\n" +
                "                }\n" +
                "                h2{\n" +
                "                    text-align: center;\n" +
                "                    color: #1e56a0;\n" +
                "                }\n" +
                "                </style>\n" +
                "                <h1> Welcome to Connect </h1>\n" +
                "                <h2> " + info + "</h2>\n" +
                "                <body>\n" +
                "                    \n" +
                "            \n" +
                "                </body> </html>");
    }

    @FXML
    public void setView() {
        OvercomingTheMonster.setOnAction(e -> getLinkPage("https://drive.google.com/drive/folders/1zAMIuF0MnICBnCspylcadCmIFcQ7vEWR?usp=sharing", view, "Overcoming The Monster"));

        Comedy.setOnAction(e -> getLinkPage("https://drive.google.com/drive/folders/1xdJ50rXCaDT4ldmbfMV2UnVAoZGd2jDZ?usp=sharing ", view, "Comedy"));

        RagsToRiches.setOnAction(e -> getLinkPage("https://drive.google.com/drive/folders/11qR1z6Y7IBDlBaCE9fR8BTKDpwZlDt9l?usp=sharing", view, "Rags To Riches"));

        Tragedy.setOnAction(e -> getLinkPage("https://drive.google.com/drive/folders/1nut8tJt5qqCLOcoZb3s6FTGlufFshG5r?usp=sharing ", view, "Tragedy"));

        TheQuest.setOnAction(e -> getLinkPage("https://drive.google.com/drive/folders/17ldeRUfEti2aDKeGzOvy4TrNionP7mWn?usp=sharing", view, "TheQuest"));

        Rebirth.setOnAction(e -> getLinkPage("https://drive.google.com/drive/folders/14Gt-C4mJeP3h2CGNJKIYfAkF-ttoNxo1?usp=sharing", view, "Rebirth"));

        VoyageAndReturn.setOnAction(e -> getLinkPage("https://drive.google.com/drive/folders/1XcGCsiZMT0wMVkhujQRx2TVU6lZd18vk?usp=sharing", view, "Voyage And Return"));

        Erotic.setOnAction(e -> getLinkPage("https://drive.google.com/drive/folders/18baEyCpKqoNmvzMzDgvnbXxUBXIxlpkf?usp=sharing", view, "Erotic"));

    }

    private void getLinkPage(String info, WebView webView, String item) {
        webView.getEngine().loadContent("<html> \n" +
                "<style type=\"text/css\"> \n" +
                "\n" +
                "                body\n" +
                "                { background-color:  #d6e4f0;\n" +
                "                } \n" +
                "                h1{\n" +
                "                     text-align: center;\n" +
                "                     font-size: 50px;\n" +
                "                     color: #163172;\n" +
                "                }\n" +
                "                h2{\n" +
                "                    text-align: center;\n" +
                "                    color: #1e56a0;\n" +
                "                }\n" +
                "                </style>\n" +
                "                <h1> Welcome to Connect </h1>\n" +
                " <a href=\"" + info + "\">" + "Click to open " + item + " stories </a>" +
                "                <body>\n" +
                "                    \n" +
                "            \n" +
                "                </body> </html>");
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
