import java.io.*;
import java.util.*;
import java.util.Arrays;

public class TrackCrossings implements USACOProblem
{
    public int num_cows;
    public SingleCow[] src;
    public SingleCow[] dest;
    public final int DEFAULT_SIZE = 10;

    public TrackCrossings()
    {
        src = new SingleCow[DEFAULT_SIZE];
        dest = new SingleCow[DEFAULT_SIZE];
    }

    public TrackCrossings(int starting_size)
    {
        src = new SingleCow[starting_size];
        dest = new SingleCow[starting_size];
    }

    public TrackCrossings(SingleCow[] theCows)
    {
        this(theCows.length);

        num_cows = 0;
        for (SingleCow x : theCows)
        {
            addCow(x);
        }
    }

    public void addCow(SingleCow theCow)
    {
        src[num_cows] = theCow;
        dest[num_cows] = theCow;
        num_cows++;
    }

    public void addCow(int start, int end)
    {
        SingleCow newCow = new SingleCow(start,end);
        addCow(newCow);
    }

    public void readFile(String filename) throws IOException
    {
        BufferedReader input = new BufferedReader(new FileReader(filename));

        String firstLine = input.readLine().trim();
        int num_lines = Integer.parseInt(firstLine);

        num_cows = 0; // incremented by addCow
        src = new SingleCow[num_lines];
        dest = new SingleCow[num_lines];

        for (int k = 0; k < num_lines; k++)
        {
            String[] elts = input.readLine().trim().split(" ");
            addCow(Integer.parseInt(elts[0]),
                   Integer.parseInt(elts[1]));
        }
        input.close();

        // return this;
    }

    public int computeResult()
    {
        return -1;
    }
}

