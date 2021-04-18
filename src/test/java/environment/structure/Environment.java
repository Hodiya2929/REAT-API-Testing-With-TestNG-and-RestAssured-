package environment.structure;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Environment implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@XmlElement(name = "host")
	private List<Host> host;
	private String name;
	private int size;
	
	public Environment()
	{
	}
	
	public Environment (String name, int size, List<Host> hosts)
	{
		super();
		this.name = name;
		this.size = size;
		this.host = hosts;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
 
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	
	public List<Host> getHosts() {
		return host;
	}
	

	public void setHosts(List<Host> hosts) {
		this.host = hosts;
	}

	@Override
	public String toString() {
		return "Environment [name=" + name + ", size=" + size + ", hosts=" + host + "]";
	}

}
