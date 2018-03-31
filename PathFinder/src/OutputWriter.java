import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class OutputWriter {

    private static final Logger LOGGER = Logger.getLogger(OutputWriter.class.getName());

    public void writeOutputData(final List<TestCase> testCases, final String fileName){
        final File file = new File(fileName);
        final String separator = System.getProperty("line.separator");
        DecimalFormat df = new DecimalFormat("#.#####");
        if(testCases != null){
            try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                for(TestCase testCase : testCases) {
                        final StringBuilder builder = new StringBuilder();
                        builder.append(df.format(testCase.average.getPositionX())).append(" ")
                                .append(df.format(testCase.average.getPositionY())).append(" ")
                                .append(df.format(testCase.worstDistance)).append(separator);
                        writer.write(builder.toString());
                }
            } catch (IOException e) {
                LOGGER.log(Level.WARNING, "IO exception occured: " +fileName, e);
            }
        }
    }
}
