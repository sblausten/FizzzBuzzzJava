
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class FizzBuzz_processNum_Test {
    @Test public void processNum_ShouldCallSetResponseWithFizz() {
        FizzBuzz test = new FizzBuzz();
        FizzBuzz testSpy = spy(test);
        testSpy.processNum(3);
        verify(testSpy, atMost(1)).setResponse("fizz");
    }
    
    @Test public void processNum_ShouldCallSetResponseWithBuzz() {
        FizzBuzz test = new FizzBuzz();
        FizzBuzz testSpy = spy(test);
        testSpy.processNum(5);
        verify(testSpy, atMost(1)).setResponse("buzz");
    }
    
    @Test public void processNum_ShouldCallSetResponseWithFizzAndBuzz() {
        FizzBuzz test = new FizzBuzz();
        FizzBuzz testSpy = spy(test);
        testSpy.processNum(15);
        verify(testSpy, atMost(1)).setResponse("fizz");
        verify(testSpy, atMost(1)).setResponse("buzz");
    }
    
    @Test public void processNum_ShouldCallSetResponseWithNumber() {
        FizzBuzz test = new FizzBuzz();
        FizzBuzz testSpy = spy(test);
        testSpy.processNum(7);
        verify(testSpy, atMost(1)).setResponse("7");
    }
    
    @Test public void processNum_ShouldCallSetResponseWith0() {
        FizzBuzz test = new FizzBuzz();
        FizzBuzz testSpy = spy(test);
        testSpy.processNum(0);
        verify(testSpy, atMost(1)).setResponse("0");
    }
}
