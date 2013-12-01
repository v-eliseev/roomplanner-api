package roomplanner.api

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement

@XmlAccessorType(XmlAccessType.FIELD)
class Status implements Serializable {
	
	@XmlElement Long uptime
	@XmlElement Long requestsServed
}
