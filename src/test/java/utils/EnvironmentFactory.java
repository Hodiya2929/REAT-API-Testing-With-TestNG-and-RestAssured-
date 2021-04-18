package utils;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import environment.structure.Environment;

public class EnvironmentFactory {

	public static Environment getEnvironment(String fileName)
	{
		
		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		InputStream is = classloader.getResourceAsStream(fileName + ".xml");

		JAXBContext jaxbContext;
		Environment environment = null;

		try
		{
			jaxbContext = JAXBContext.newInstance(Environment.class);  
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			environment = (Environment) jaxbUnmarshaller.unmarshal(is);
		}
		catch (JAXBException e) 
		{
			e.printStackTrace();
		}
		return environment;
	}
}
