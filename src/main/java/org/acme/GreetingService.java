package org.acme;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {
	public String getGreeting(String name)
	{
		return "Hello," + " " + name + "!";
	}

}
