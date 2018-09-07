package AlgorytmyCwiczenia.Strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class FileNameExtractorTest {

    @Test
    public void testSample() {
        assertEquals(
                "FILE_NAME.EXTENSION",
                FileNameExtractor.extractFileName("1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION"));
    }

    @Test
    public void testSample2() {
        assertEquals(
                "FILE_NAME.EXTENSION",
                FileNameExtractor.extractFileName("1_FILE_NAME.EXTENSION.OTHEREXTENSIONadasdassdassds34"));
    }
}