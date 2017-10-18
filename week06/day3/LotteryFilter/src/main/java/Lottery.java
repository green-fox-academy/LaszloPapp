import joptsimple.OptionParser;
import joptsimple.OptionSet;
import com.opencsv.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Lottery {

    public static void main(String[] args) throws IOException {
        OptionParser parser = new OptionParser();
        parser.accepts("l");
        parser.accepts("a").withRequiredArg();
        OptionSet options = parser.parse(args);

        if (options.has("a")) {
            System.out.println("`-a` was given with the argument " + options.valueOf("a"));
        }

        if (options.has("l")) {
            System.out.println("`-l` was given with the no additional information.");
        }

        CSVReader reader = new CSVReader(new FileReader("src/lottery.csv"));
        List<String[]> lines = reader.readAll();
        CSVWriter writer = new CSVWriter(new FileWriter("src/copydata.csv"), CSVWriter.NO_QUOTE_CHARACTER);
        writer.writeAll(lines);
        writer.close();

    }

}
