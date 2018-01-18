/*
You are working with a hospital to develop a patient monitoring system.
The technology they use is very old. 
From their computer you can get a string with "h" for heartbeat and "i" for IV drip. 
Their computer will also give you a number, indicating the amount of time elapsed (in seconds) while taking the string of readings.

* A good enough pulse rate is 50 beats per minute.

* A pulse of less than that is red alert, return value 2.

* A good rate for the IV system is at least 1.5 drips every heartbeat. 

* If the system is not averaging 1.5 drips per heartbeat in the data collection window, 
that is automatically a yellow alert (return value 1). 

* If the pulse is at least 50bpm and the iv rate is 
at least 1.5 drips per heartbeat, then the condition is stable (return value 0).

* The hospital system is a little buggy. Sometimes it will emit
`iiih...hiii`. Any sequence of `iiih` means that the system has
entered a faulty state and is emitting bad data until after the next
`hiii` string. Those garbage strings should be removed from input
before processing.

 */

public class Hospital {
    public static int analyze(String data, int secs) {
        // paste your code here, or call your own function somehow
        //return HospitalSolution.analyze(data,secs);
        return -1;
    }
}
    
