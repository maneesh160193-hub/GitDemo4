package resources;

import java.util.ArrayList;
import java.util.List;

import pojo.AddPlace;
import pojo.Location;

public class TestDataBuild {
	public AddPlace add_Place_Payload() {
		
	
	AddPlace p=new AddPlace();
	p.setAccuracy(50);
	p.setAddress("29, side layout, cohen 09");
	p.setLanguage("French-IN");
	p.setPhone_number("(+91) 983 893 3937");
	p.setWebsite("https://rahulshettyacademy.com");
	p.setName("Frontline house");
	List<String> mylist=new ArrayList<String>();
	mylist.add("shoe park");
	mylist.add("shop");
	Location l=new Location();
	l.setLat(-38.383494);
	l.setLng(33.427362);
	p.setLocation(l);
	return p;
	}
}
