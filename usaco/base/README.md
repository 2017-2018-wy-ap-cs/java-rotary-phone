
This directory contains a framework for locally testing computing olympiad problems in Java.

## Specifics of Testing

* `TrackCrossings`: My actual USACO problem with the solution part
ripped out. **Contains file reading code.**

* `CrossingsTest`: Adapt this file to your own problem if you want
to use automated testing.

* `SingleCow`: Junk file needed to make my old example work.

## Testing Framework

* `USACOProblem`: An interface that any USACO problem should
implement.

* `USACOResultLoader`: An interface for loading results.

    - `USACOResultLoaderFile`: Class implementing the interface, gets expected result from a file.
    - `USACOResultLoaderTrivial`: Knows expected result when constructed.

* `USACOTest`: Framework for testing results.

* `USACODummyProblem`: An implementation of the USACOProblem interface
that actually does nothing but return the result given at 
construction time.

