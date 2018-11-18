package forms;

import com.epam.jdi.uitests.web.selenium.elements.complex.TextList;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class ResultForm extends Section {

    @FindBy(css = ".results > li")
    private TextList results;

    public void checkResultSection(List<String> formResults) {
        assertEquals(formResults, results.getTextList());
    }

}
