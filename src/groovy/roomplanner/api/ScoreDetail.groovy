package roomplanner.api

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement

@XmlAccessorType(XmlAccessType.FIELD)
class ScoreDetail implements Serializable {

	@XmlElement	String constraintName
	@XmlElement List<RoomAssignment> roomAssignments
	@XmlElement Double weight
}