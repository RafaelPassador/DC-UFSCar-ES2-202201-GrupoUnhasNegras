package net.sf.jabref.importer.fileformat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jabref.importer.ImportFormatReader;
import net.sf.jabref.importer.OutputPrinter;
import net.sf.jabref.model.entry.BibEntry;

public class CsvImporter extends ImportFormat {

    @Override
    public String getFormatName() {
        return "CSV";
    }

    @Override
    public boolean isRecognizedFormat(InputStream stream) throws IOException {
        return true;
    }

    @Override
    public String getExtensions() {
        return "csv";
    }
}