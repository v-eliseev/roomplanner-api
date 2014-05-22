package roomplanner.api

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter

import joda.DateTimeStringAdapter
import org.joda.time.DateTime

@XmlAccessorType(XmlAccessType.FIELD)
class Pricelist implements Serializable {
	
	@XmlElement Long licenseId
	
	@XmlJavaTypeAdapter(DateTimeStringAdapter.class)
	@XmlElement DateTime fromDate

	@XmlJavaTypeAdapter(DateTimeStringAdapter.class)
	@XmlElement DateTime toDate
	
	@XmlElement List<PricelistItem> items

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		"[licenseId: $licenseId, period: $fromDate-$toDate, size: $items?.size()]"
	}
}