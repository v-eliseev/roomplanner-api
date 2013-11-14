package roomplanner.api

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter

import joda.DateTimeStringAdapter
import org.joda.time.DateTime

@XmlAccessorType(XmlAccessType.FIELD)
class PricelistItem implements Serializable {
	
	@XmlJavaTypeAdapter(DateTimeStringAdapter.class)
	@XmlElement DateTime onDate

	@XmlElement BigDecimal rate
	@XmlElement Long roomId
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		"[onDate: $onDate, roomId: roomId, rate: $rate]"
	}
}