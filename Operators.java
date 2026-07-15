package basics;

public class Operators {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalTests = 20;
		int passedTests = 14;
		int failedTests = 6;
		int retryLimit = 3;
		int currentRetry = 0;
		boolean isCriticalTestPassed = true;
		boolean isRegressionComplete = false;
		
		int remainingTests = totalTests - (passedTests+failedTests);
		
		if (passedTests > failedTests )
		{
			System.out.println("PassedTest are more :" +passedTests);
		}
		if (isCriticalTestPassed && isRegressionComplete )
		{
			System.out.println("Suite Complete");
		}
		else
		{
			System.out.println("Suite IComplete");
		}
		for(currentRetry = 1; currentRetry <=3; currentRetry++) {
			System.out.println(currentRetry);
		}
		int passpercentage = (passedTests*100)/totalTests ;
		System.out.println(passpercentage);
		String Result = (passedTests > 15) ? "pass" :"fail";		
		System.out.println("Result :" +Result)	;
		System.out.println("-----------Final Report---------------------");
		System.out.println("Total "+totalTests +"passed " +passedTests +"Failed " +failedTests +"passpercentage " +passpercentage + "status " +Result);
	

	}
}
