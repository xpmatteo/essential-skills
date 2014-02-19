package esad.chapter01.exercise01.solved;


class Organization {
	String id;
	LocalizableString name;
	TelephoneNumber telephone;
	TelephoneNumber fax;
	Person contact;
}

class TelephoneNumber {
	String countryCode;
	String aeaCode;
	String localNumber;
}

class LocalizableString {
	String english;
	String chinese;	
}

class Person {
	LocalizableString firstName;
	LocalizableString lastName;	
	TelephoneNumber telephone;
	TelephoneNumber fax;
	TelephoneNumber mobile;	
}