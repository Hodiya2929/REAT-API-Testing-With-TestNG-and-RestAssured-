package environment.structure;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="host")
public class Host implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String hostId;
	
	@XmlElementWrapper(name = "access")
	@XmlElement(name = "id")
	private List<String> id;

	public Host() {
	}
	
	public Host(String hostId, List<String> ids)
	{
		super();
		//this.access = access;
		this.hostId = hostId;
		this.id = ids;
	}
	
	public List<String> getId() {
		return id;
	}

	public void setIds(List<String> id) {
		this.id = id;
	}
	public String getHostId() {
		return hostId;
	}
	
	public void setHostId(String hostId) {
		this.hostId = hostId;
	}

	@Override
	public String toString() {
		return "Host [hostId=" + hostId + "]";
	}
	
}
