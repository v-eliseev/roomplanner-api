package roomplanner.api

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlAttribute
import javax.xml.bind.annotation.XmlElement

@XmlAccessorType(XmlAccessType.NONE)
class RoomAssignment implements Serializable {

	@XmlAttribute	Long id
	@XmlElement		Room room
	@XmlElement		Reservation reservation
	@XmlElement		Boolean moveable = true

	@Override
	public String toString() {
		return reservation.toString() + " @ " + room.toString();
	}

}
