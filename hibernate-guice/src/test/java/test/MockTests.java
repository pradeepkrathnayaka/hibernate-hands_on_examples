package test;

import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.mockito.BDDMockito.*;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.exceptions.verification.NoInteractionsWanted;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.Answer;

@ExtendWith(MockitoExtension.class)
public class MockTests {
	
	@Mock
	List fooMock; 
	
	 //mock creation
	 List mockedList = mock(List.class);
	
	@Test
	@DisabledOnOs(OS.WINDOWS)
	void testSomethingPlatformSpecific() {
	  // ...
	}
	
	@Test
	public void stubbingReturnValue() {
		/*when(mockEcho.echo("Hello Mockito World")).thenReturn(echoResponse("0042"));
		assertEquals(echoResponse("0042"), mockEcho.echo("Hello Mockito World"));*/
	}
	
	
	@Test
	public void capturingArguments() {
		/*ArgumentCaptor<EchoRequest> captorRequest = 
		    ArgumentCaptor.forClass(EchoRequest.class);
		EchoRequest echoRequest = new EchoRequest();
		echoRequest.id = "23";
		mockEcho.echo(echoRequest, "0000");
		verify(mockEcho).echo(captorRequest.capture(), eq("0000"));
		assertEquals("23", captorRequest.getValue().id);*/
	}
	
	
	

}
