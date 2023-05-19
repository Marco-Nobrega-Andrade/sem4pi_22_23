package eapli.base.utils;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class CsvReaderTest {

    private final String VALID_PATH = "C:\\Users\\windows\\Documents\\sem4pi-22-23-24\\a.csv";
    private final String INVALID_PATH = "a";

    @Test
    void importCsvDataFileNameExist() {
        CsvReader csvReader = new CsvReader();
        Assert.assertTrue(csvReader.importCsvData(VALID_PATH, new ArrayList<>()));
    }

    @Test
    void importCsvDataFileNameDoesntExist() {
        CsvReader csvReader = new CsvReader();
        Assert.assertFalse(csvReader.importCsvData(INVALID_PATH, new ArrayList<>()));
    }

    @Test
    void importCsvDataVerifyImportedData() {
        CsvReader csvReader = new CsvReader();
        List<String> actual = new ArrayList<>();
        csvReader.importCsvData(VALID_PATH, actual);
        List<String> expected = new ArrayList<>();
        expected.add("202300002");
        expected.add("202300001");
        expected.add("202300003");
        Assert.assertEquals(actual, expected);
    }

}