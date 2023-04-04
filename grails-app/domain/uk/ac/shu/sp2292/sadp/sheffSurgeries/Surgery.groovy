package uk.ac.shu.sp2292.sadp.sheffSurgeries

class Surgery
{
	String name, address, postcode, telephone, description, openingTime
	int numberOfPatients
	boolean registeringNewPatients
	
	static constraints =
	{
		name()
		address()
		postcode()
		telephone()
		numberOfPatients(min: 1)
		description()
		openingTime()
		registeringNewPatients()
	}
	
	static hasMany =
	[
		doctors: Doctor,
		nurses: Nurse,
		receptionists: Receptionist,
		patients: Patient,
		appointments: Appointment
	]
}
