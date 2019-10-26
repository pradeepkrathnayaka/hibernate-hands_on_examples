package test;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class ConcurrentHashMapTests extends TestBase {

	static ConcurrentHashMap<String, Integer> chm = new ConcurrentHashMap<String, Integer>();

	@Override
	public void setup() throws Exception {
		chm.put("XXX", 1);
	}

	@Test
	@Order(1)
	@DisplayName("")
	public void test_thread_access(TestInfo testInfo) {
		System.out.println(testInfo.getTestMethod());

	}

}
