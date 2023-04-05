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
            name: 'Dr Sarah Macdonald',
            email: 's.macdonald@myemail.com',
            phone: '01111777',
            qualifications: 'MBChB(Sheffield)',
            position: 'GP, Surgeon',
            password: 'secret222',
            office: 'D-9888',
            bio: 'Lorem ipsum',
            surgery: surgery1
        ).save()

        def doctor2 = new Doctor
        (
            name: 'Dr Satrya Fajri Pratama',
            email: 's.pratama@shu.ac.uk',
            phone: '07824 790385',
            qualifications: 'PhD',
            position: 'Consultant',
            password: 'abc123',
            office: 'X-8888',
            bio: 'Lorem ipsum',
            surgery: surgery2
        ).save()

        def patient1 = new Patient
        (
            name: 'Tom Rivers',
            phone: '0114 222 4444',
            address: '2 One Way Street, Eckington',
            residence: 'Sheffield, Barnsley, Doncaster',
            patientDob: '1988-09-20',
            patientId: 'E25555',
            dateRegistered: '2021-02-26',
            surgery: surgery1
        ).save()

        def patient2 = new Patient
        (
            name: 'Khawlah Zuhayrussyajana Pratiwi',
            phone: '07824 790457',
            address: '17 Bassledene Road, Sheffield S2 1HZ',
            residence: 'Sheffield',
            patientDob: '2019-03-21',
            patientId: 'C2747119',
            dateRegistered: '2022-11-14',
            surgery: surgery2
        ).save()

        def receptionist1 = new Receptionist
        (
            name: 'Rob Kingston',
            email: 'r.kingston@email.com',
            phone: '0114 222 4445',
            username: 'rking',
            password: 'secret2019',
            surgery: surgery1
        ).save()

        def receptionist2 = new Receptionist
        (
            name: 'Musab Khyrissiddiq Pratama',
            email: 'rascove@yahoo.com',
            phone: '07824 790385',
            username: 'musab',
            password: 'abcd1234',
            surgery: surgery2
        ).save()

        def nurse1 = new Nurse
        (
            name: 'Susan Peters',
            email: 's.peters@myemail.com',
            phone: '0114 222 4433',
            qualifications: 'Registered General Nurse',
            office: 'B-455',
            surgery: surgery1
        ).save()

        def nurse2 = new Nurse
        (
            name: 'Lustiana Pratiwi',
            email: 'lustiana@gmail.com',
            phone: '07824 790457',
            qualifications: 'PhD Student',
            office: 'A-777',
            surgery: surgery2
        ).save()

        def appointment = new Appointment
        (
            appDateTime: new Date(2021 - 1900, 3, 11, 15, 0, 0),
            duration: 60,
            roomNumber: 'A-1111',
            surgery: surgery1,
            doctor: doctor1,
            patient: patient1
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
