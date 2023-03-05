package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Forecast {
	@Id
	int ForecastNumber;
	@OneToOne
	Event event;
	String result; //  1 | x | 2
	float share;
	
	
	public Forecast(int num,Event e,String w,Float s) {
		ForecastNumber = num;
		event = e;
		result = w;
		share = s;
	}
}
