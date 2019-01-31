package CollectionsFrameworkPractice;

import java.util.HashMap;

import org.testng.annotations.Test;

public class TestingDummy {

	@Test()
	public static void main(HashMap<String, String> data) {

		data.get("username");
		data.get("password");
	}

}
