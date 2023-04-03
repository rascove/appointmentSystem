package uk.ac.shu.sp2292.sadp.sheffSurgeries

class BootStrap
{
    def init =
    {
        servletContext ->
        def surgery = new Surgery
        (
            name: 'City Health Centre',
            address: '21 Marble Street, Sheffield',
            postcode: 'S11 5TY',
            telephone: '0114 555 555',
            numberOfPatients: 50,
            description: 'Lorem ipsum',
            openingTime: '09:00 - 17:00',
            registeringNewPatients: true
        ).save()

        def doctor = new Doctor
        (
            doctorName: 'Dr Sarah Macdonald',
            doctorEmail: 's.macdonald@myemail.com',
            doctorPhone: '01111777',
            qualifications: 'MBChB(Sheffield)',
            position: 'GP, Surgeon',
            password: 'secret222',
            doctorOffice: 'D-9888',
            bio: 'Lorem ipsum',
            surgery: surgery
        ).save()

        def patient = new Patient
        (
            patientName: 'Tom Rivers',
            patientPhone: '0114 222 4444',
            patientAddress: '2 One Way Street, Eckington',
            patientResidence: 'Sheffield, Barnsley, Doncaster',
            patientDOB: '1988-09-20',
            patientID: 'E25555',
            dateRegistered: '2021-02-26',
            surgery: surgery
        ).save()

        def receptionist = new Receptionist
        (
            recepName: 'Rob Kingston',
            recepEmail: 'r.kingston@email.com',
            recepPhone: '0114 222 4445',
            recepUsername: 'rking',
            recepPassword: 'secret2019',
            surgery: surgery
        ).save()

        def nurse = new Nurse
        (
            nurseName: 'Susan Peters',
            nurseEmail: 's.peters@myemail.com',
            nursePhone: '0114 222 4433',
            qualifications: 'Registered General Nurse',
            nurseOffice: 'B-455',
            surgery: surgery
        ).save()

        def appointment = new Appointment
        (
            appDateTime: new Date(2021 - 1900, 3, 11, 15, 0, 0),
            duration: 60,
            roomNumber: 'A-1111',
            surgery: surgery,
            doctor: doctor,
            nurses: nurse,
            patient: patient
        ).save()

        def prescription = new Prescription
        (
            prescriptionNumber: 56788,
            medicine: 'Paracetamol',
            daysSupply: 10,
            totalCost: 5.9,
            dateIssued: new Date(2021 - 1900, 4, 25),
            patientPaying: false,
            doctor: doctor,
            patient: patient
        ).save()
    }

    def destroy = {}
}
