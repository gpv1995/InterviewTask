package testing.demo.nosuchbeanexp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class IbeanBimp1 implements IbeanB{
	
	public void test()
	{
		System.out.println("IbeanBimp1..............");
	}

}
