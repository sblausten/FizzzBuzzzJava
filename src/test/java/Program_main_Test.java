import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

public class Program_main_Test {
	
	@Test
	public void main_ShouldCallPrintln101Times() {
		PrintStream out = mock(PrintStream.class);
        System.setOut(out);
		Program test = new Program();
		test.main(null);
		verify(out, times(101)).println(any(String.class));
	}
}


	

