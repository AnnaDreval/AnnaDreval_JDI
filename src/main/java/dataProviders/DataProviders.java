package dataProviders;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class DataProviders {

    @DataProvider
    public Object[][] metalsAndColorsDataProvider() {

        Path jsonPath = Paths.get("src\\test\\resources\\JDI_ex8_metalsColorsDataSet.json");
        StringBuilder builder = new StringBuilder();

        try (Stream<String> stream = Files.lines(jsonPath)) {
            stream.forEach(s -> builder.append(s).append("\n"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        Type rows = new TypeToken<HashMap<String, MetalsColorsData>>() {
        }.getType();
        Map<String, MetalsColorsData> row = new Gson().fromJson(builder.toString(), rows);
        Object[][] data = new Object[row.size()][1];
        int i = 0;

        for (Map.Entry entry : row.entrySet()) {
            data[i++][0] = entry.getValue();
        }

        return data;
    }

}
