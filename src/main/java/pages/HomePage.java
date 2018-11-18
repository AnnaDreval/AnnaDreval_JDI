package pages;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import enums.Users;

@JPage(url = "/index.html", title = "Home Page")
public class HomePage extends WebPage {

    public Header header;

    public void login(Users user) {
        header.profilePhoto.click();
        header.loginForm.loginAs(user);
    }

}
