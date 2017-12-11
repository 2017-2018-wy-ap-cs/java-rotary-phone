import java.io.*;

public class USACOResultLoaderFile implements USACOResultLoader
{
    public int getExpected(String filename) throws IOException
    {
        int result = Integer.MIN_VALUE;

        try {
            BufferedReader input = new BufferedReader(new FileReader(filename));
            String lineOne = input.readLine();
            result = Integer.parseInt(lineOne);
            input.close();
        } catch (FileNotFoundException e) {
            System.err.println("FileNotFoundException: " + e.getMessage());
            throw(new IOException(e));
        }
        return result;
    }
}
