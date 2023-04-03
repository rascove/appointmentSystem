package uk.ac.shu.sp2292.sadp.sheffSurgeries

class Patient
{
    String patientName, patientAddress, patientResidence, patientId, patientPhone
    Date patientDob, dateRegistered

	String toString()
	{
		return patientName
	}

    static constraints =
    {
        patientName()
        patientAddress()
        patientResidence()
        patientDob()
        patientId()
        dateRegistered()
        patientPhone()
    }

    static hasOne = [surgery: Surgery]

    static hasMany =
    [
        appointments: Appointment,
        prescriptions: Prescription
    ]
}
