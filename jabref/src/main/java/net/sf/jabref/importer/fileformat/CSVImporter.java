package net.sf.jabref.importer.fileformat;

import java.io.*;
import java.util.*;

import net.sf.jabref.importer.ImportFormatReader;
import net.sf.jabref.importer.OutputPrinter;
import net.sf.jabref.model.entry.BibEntry;
import net.sf.jabref.model.entry.BibtexEntryTypes;

public class CSVImporter extends ImportFormat {

    //Return the name of this import format
    @Override
    public String getFormatName() {
        return "CSV";
    }

    //Check if the file is in the correct format for this importer.
    @Override
    public boolean isRecognizedFormat(InputStream stream) throws IOException {
        return true;
    }

    //Parse the inputs in the selected source and return a list of BibEntry objects
    @Override
    public List<BibEntry> importEntries(InputStream stream, OutputPrinter printer) throws IOException {

        List<BibEntry> items = new ArrayList<>();
        BufferedReader reader = new BufferedReader(ImportFormatReader.getReaderDefaultEncoding(stream));

        String line = reader.readLine();
        while (line != null) {
            if (!line.trim().isEmpty() && !line.contains("author")) {

                BibEntry entry = new BibEntry();

                String[] fields = line.split(";");

                entry.setType(BibtexEntryTypes.TECHREPORT);
                entry.setField("author", fields[0]);
                entry.setField("title", fields[1]);
                entry.setField("year", fields[2]);

                items.add(entry);
            }
            line = reader.readLine();
        }
        return items;
    }

    //Get csv
    @Override
    public String getExtensions() {
        return "csv";
    }
}