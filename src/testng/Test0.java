package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test0 {

	
		
		@Test(invocationCount=4,priority=-2) //invocation count is how many does0 it has to run here it is 4 times
		public void calls()
		{
			Reporter.log("calls",true);
		}
		
		@Test(priority=-1,invocationCount=2,enabled=true) 
		public void settings()                            //it will skip the test cases if it is false
		{
			Reporter.log("settings",true);
			
		}
		@Test(invocationCount=2)
		public void chats()
		{
			Reporter.log("chats",true);
		}
		
	}


