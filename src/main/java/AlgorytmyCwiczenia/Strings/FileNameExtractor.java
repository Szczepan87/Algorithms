package AlgorytmyCwiczenia.Strings;

public class FileNameExtractor {

    /**Ucina niepoptrzebne fragmenty nazwy pliku*/

    public static String extractFileName(String dirtyFileName) {
        dirtyFileName = dirtyFileName.substring(dirtyFileName.indexOf('_')+1);
        dirtyFileName = String.valueOf(new StringBuilder(dirtyFileName).delete(dirtyFileName.lastIndexOf('.'),dirtyFileName.length()));
        return dirtyFileName;
    }

}
