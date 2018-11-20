package pages;

import com.epam.jdi.uitests.web.selenium.elements.complex.TextList;
import com.epam.jdi.uitests.web.selenium.elements.composite.Section;
import dataProviders.MetalsColorsData;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import static enums.Results.*;
import static org.testng.Assert.assertEquals;

public class ResultsSection extends Section {

    @FindBy(css = ".results > li")
    private TextList results;

    public void checkResultSection(List<String> formResults) {
        assertEquals(formResults, results.getTextList());
    }

    public List<String> results(MetalsColorsData data) {
        List<String> results = new ArrayList<>();
        results.add(SUM.title + String.valueOf(data.summary.get(0) + data.summary.get(1)));
        results.add(ELEM.title + String.join(", ", data.elements));
        results.add(COLOR.title + data.color);
        results.add(METAL.title + data.metals);
        results.add(VEG.title + String.join(", ", data.vegetables));
        return results;
    }

}
