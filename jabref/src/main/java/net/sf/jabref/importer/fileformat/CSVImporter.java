package net.sf.jabref.importer.fileformat;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import net.sf.jabref.importer.OutputPrinter;
import net.sf.jabref.model.entry.BibEntry;


public class CSVImporter extends ImportFormat {

    @Override
    public boolean isRecognizedFormat(InputStream in) throws IOException {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<BibEntry> importEntries(InputStream in, OutputPrinter status) throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getFormatName() {
        // TODO Auto-generated method stub
        return null;
    }

}
