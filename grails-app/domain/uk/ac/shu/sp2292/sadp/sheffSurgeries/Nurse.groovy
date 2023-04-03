package uk.ac.shu.sp2292.sadp.sheffSurgeries

class Nurse
{
    String nurseName, qualifications, nurseEmail, nurseOffice, nursePhone

	String toString()
	{
		return nurseName
	}

    static constraints =
    {
        nurseName()
        qualifications()
        nurseEmail()
        nurseOffice()
        nursePhone()
    }

    static hasOne = [surgery: Surgery]

    static hasMany = [appointments: Appointment]

    static belongsTo = Appointment
}
