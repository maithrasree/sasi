package org.Sample;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

//Suite Execution

public class RunnerClass {
	@Test
	public void tc() {
		Result r=JUnitCore.runClasses(A.class,B.class);
	
			System.out.println("Failure Count ="+r.getFailureCount());
			System.out.println("IgnoreCount ="+r.getIgnoreCount());
			System.out.println("Run Count"+r.getRunCount());
			List<Failure> l = r.getFailures();
			for(Failure f:l) {
				System.out.println(f);
			}

	}

}
