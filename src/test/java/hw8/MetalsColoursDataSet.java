package hw8;

import base.TestBase;
import dataProviders.DataProviders;
import dataProviders.MetalsColorsData;
import enums.Users;
import org.testng.annotations.Test;

import static enums.HeaderMenu.METALS_COLORS;
import static sites.JdiSite.homePage;
import static sites.JdiSite.metalsColoursPage;

public class MetalsColoursDataSet extends TestBase {

    @Test(dataProvider = "metalsAndColorsDataProvider", dataProviderClass = DataProviders.class)
    public void metalsColoursTest(MetalsColorsData data) {

        //1 Login on JDI site as User:
        homePage.open();
        homePage.login(Users.PITER_CHAILOVSKII);

        //2 Open Metals & Colors page by Header menu:
        homePage.header.menu.select(METALS_COLORS);

        //3 Fill Metals & Colors form by data below:
        metalsColoursPage.form.fill(data);

        // Submit Metals & Colors form:
        metalsColoursPage.form.submit();

        //4 Check result section:
        metalsColoursPage.result.checkResultSection(metalsColoursPage.result.results(data));
    }

}
