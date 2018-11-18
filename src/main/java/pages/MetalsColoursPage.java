package pages;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import forms.MetalColorsForm;
import forms.ResultForm;

@JPage(url = "/metals-colors.html", title = "Metal and Colors")
public class MetalsColoursPage extends WebPage {

    public MetalColorsForm form;
    public ResultForm resultForm;

}
