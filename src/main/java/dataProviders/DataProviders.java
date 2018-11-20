package dataProviders;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Map;

public class DataProviders {

    @DataProvider
    public Object[] metalsAndColorsDataProvider() throws FileNotFoundException {
        Reader reader = new FileReader("src\\test\\resources\\JDI_ex8_metalsColorsDataSet.json");
        Gson gson = new GsonBuilder().create();

        Map<String, MetalsColorsData> dataMap = gson.fromJson(reader, new TypeToken<Map<String, MetalsColorsData>>() {}.getType());
        return dataMap.values().toArray();
    }
}