package roomplanner.api

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement

@XmlAccessorType(XmlAccessType.FIELD)
class Plan implements Serializable {
	
	@XmlElement
	List<RoomAssignment> roomAssignments
	
	@XmlElement
	Score score	

}
