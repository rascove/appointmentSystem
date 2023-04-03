package uk.ac.shu.sp2292.sadp.sheffSurgeries

class BootStrap
{
    def init =
    {
        servletContext ->
        def surgery1 = new Surgery
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

        def surgery2 = new Surgery
        (
            name: 'The White House Surgery',
            address: '1 Fairfax Rise, Sheffield',
            postcode: 'S2 1SL',
            telephone: '0114 224 5878',
            numberOfPatients: 50,
            description: 'Lorem ipsum',
            openingTime: '09:00 - 18:00',
            registeringNewPatients: false
        ).save()

        def doctor1 = new Doctor
        (
            doctorName: 'Dr Sarah Macdonald',
            doctorEmail: 's.macdonald@myemail.com',
            doctorPhone: '01111777',
            qualifications: 'MBChB(Sheffield)',
            position: 'GP, Surgeon',
            password: 'secret222',
            doctorOffice: 'D-9888',
            bio: 'Lorem ipsum',
            surgery: surgery1
        ).save()

        def doctor2 = new Doctor
        (
            doctorName: 'Dr Satrya Fajri Pratama',
            doctorEmail: 's.pratama@shu.ac.uk',
            doctorPhone: '07824 790385',
            qualifications: 'PhD',
            position: 'Consultant',
            password: 'abc123',
            doctorOffice: 'X-8888',
            bio: 'Lorem ipsum',
            surgery: surgery2
        ).save()

        def patient1 = new Patient
        (
            patientName: 'Tom Rivers',
            patientPhone: '0114 222 4444',
            patientAddress: '2 One Way Street, Eckington',
            patientResidence: 'Sheffield, Barnsley, Doncaster',
            patientDob: '1988-09-20',
            patientId: 'E25555',
            dateRegistered: '2021-02-26',
            surgery: surgery1
        ).save()

        def patient2 = new Patient
        (
            patientName: 'Khawlah Zuhayrussyajana Pratiwi',
            patientPhone: '07824 790457',
            patientAddress: '17 Bassledene Road, Sheffield S2 1HZ',
            patientResidence: 'Sheffield',
            patientDob: '2019-03-21',
            patientId: 'C2747119',
            dateRegistered: '2022-11-14',
            surgery: surgery2
        ).save()

        def receptionist1 = new Receptionist
        (
            recepName: 'Rob Kingston',
            recepEmail: 'r.kingston@email.com',
            recepPhone: '0114 222 4445',
            recepUsername: 'rking',
            recepPassword: 'secret2019',
            surgery: surgery1
        ).save()

        def receptionist2 = new Receptionist
        (
            recepName: 'Musab Khyrissiddiq Pratama',
            recepEmail: 'rascove@yahoo.com',
            recepPhone: '07824 790385',
            recepUsername: 'musab',
            recepPassword: 'abcd1234',
            surgery: surgery2
        ).save()

        def nurse1 = new Nurse
        (
            nurseName: 'Susan Peters',
            nurseEmail: 's.peters@myemail.com',
            nursePhone: '0114 222 4433',
            qualifications: 'Registered General Nurse',
            nurseOffice: 'B-455',
            surgery: surgery1
        ).save()

        def nurse2 = new Nurse
        (
            nurseName: 'Lustiana Pratiwi',
            nurseEmail: 'lustiana@gmail.com',
            nursePhone: '07824 790457',
            qualifications: 'PhD Student',
            nurseOffice: 'A-777',
            surgery: surgery2
        ).save()

        def appointment1 = new Appointment
        (
            appDateTime: new Date(2021 - 1900, 3, 11, 15, 0, 0),
            duration: 60,
            roomNumber: 'A-1111',
            surgery: surgery1,
            doctor: doctor1,
            patient: patient1
        ).save()

        def appointment2 = new Appointment
        (
            appDateTime: new Date(2023 - 1900, 3, 3, 12, 0, 0),
            duration: 30,
            roomNumber: 'Room 19',
            surgery: surgery2,
            nurses: [nurse2],
            patient: patient2
        ).save()

        def prescription = new Prescription
        (
            prescriptionNumber: 56788,
            medicine: 'Paracetamol',
            daysSupply: 10,
            totalCost: 5.9,
            dateIssued: new Date(2021 - 1900, 4, 25),
            patientPaying: false,
            doctor: doctor1,
            patient: patient1
        ).save()
    }

    def destroy = {}
}
