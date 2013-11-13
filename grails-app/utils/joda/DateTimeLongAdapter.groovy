package joda

import javax.xml.bind.annotation.adapters.XmlAdapter

import org.joda.time.DateTime

public class DateTimeLongAdapter extends XmlAdapter<Long, DateTime> {
	
		@Override
		public DateTime unmarshal(Long v) throws Exception {
			return new DateTime(v);
		}
	
		@Override
		public Long marshal(DateTime v) throws Exception {
			return v.getMillis();
		}
	
	}
