package roomplanner.api

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlElement

@XmlAccessorType(XmlAccessType.FIELD)
class Pricelist implements Serializable {
	
	@XmlElement Long licenseId
	@XmlElement Date dateFrom
	@XmlElement Date dateTo
	
	@XmlElement List<PricelistItem> items

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		"[licenseId: $licenseId, period: $fromDate-$toDate, size: $items.size()]"
	}
}