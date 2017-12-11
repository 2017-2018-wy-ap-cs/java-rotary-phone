public class USACODummyProblem implements USACOProblem
{
    int result;
    USACODummyProblem(int theResult)
    {
        result = theResult;
    }

    public void readFile(String theFile) {}
    public int computeResult()
    {
        return result;
    }
}
