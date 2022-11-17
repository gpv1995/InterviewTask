package testing.demo.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import testing.demo.nosuchbeanexp.IbeanB;
import testing.demo.nosuchbeanexp.IbeanBimp1;
import testing.demo.nosuchbeanexp.testbean;

@Configuration
public class Myconfig {
	
	
	@Bean
    public IbeanB IbeanBimp1(){
        return new IbeanBimp1();
    }
	
	@Bean
    public testbean testbean(){
        return new testbean();
    }
	
	@Bean
    public testbean testbean1(){
        return new testbean();
    }
	

}
