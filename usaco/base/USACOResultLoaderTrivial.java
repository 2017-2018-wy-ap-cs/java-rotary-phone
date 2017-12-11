public class USACOResultLoaderTrivial implements USACOResultLoader
{
    private int result;
    USACOResultLoaderTrivial(int theResult)
    {
        result = theResult;
    }

    public int getExpected(String filename)
    {
        return result;
    }
}
