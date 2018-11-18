package forms;

import com.epam.jdi.uitests.web.selenium.elements.common.Button;
import com.epam.jdi.uitests.web.selenium.elements.complex.CheckList;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.composite.Form;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects.JDropdown;
import dataProviders.MetalsColorsData;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import static enums.Results.*;
import static enums.Vegetables.VEGETABLES;

public class MetalColorsForm extends Form<MetalsColorsData> {

    @FindBy(css = "#odds-selector > p")
    private CheckList oddSum;

    @FindBy(css = "#even-selector > p")
    private CheckList evenSum;

    @FindBy(css = "#elements-checklist > p")
    private CheckList elements;

    @JDropdown(
            root = @FindBy(css = "#colors"),
            list = @FindBy(tagName = "li"),
            value = @FindBy(tagName = "button")
    )
    private Dropdown colors;

    @JDropdown(
            root = @FindBy(css = ".metals"),
            list = @FindBy(tagName = "li"),
            value = @FindBy(css = ".filter-option"),
            expand = @FindBy(css = ".caret")
    )
    private Dropdown metals;

    @JDropdown(
            root = @FindBy(css = "#salad-dropdown"),
            list = @FindBy(tagName = "li"),
            value = @FindBy(tagName = "button")
    )
    private Dropdown vegetables;

    @FindBy(css = "#submit-button")
    private Button submit;

    public void submit() {
        submit.click();
    }

    public void fill(MetalsColorsData data) {
        oddSum.check(data.summary.get(0).toString());
        evenSum.check(data.summary.get(1).toString());
        for (String element : data.elements) elements.check(element);
        colors.select(data.color);
        metals.select(data.metals);
        if (vegetables.getValue().equals(VEGETABLES.toString())) vegetables.select(VEGETABLES.toString());
        for (String vegetable : data.vegetables) vegetables.select(vegetable);
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
