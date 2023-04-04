package uk.ac.shu.sp2292.sadp.sheffSurgeries

class AppointmentController
{
    def scaffold = Appointment

    def index()
    {
        if (session.receptionist)
        {
            [appointmentList: Appointment.findAllBySurgery(session.receptionist.surgery)]
        }
        else if (session.doctor)
        {
            [appointmentList: Appointment.findAllByDoctor(session.doctor)]
        }
        else
        {
            response.sendError(401)
        }
    }

    def show()
    {
        if (session.receptionist)
        {
            [appointment: Appointment.findByIdAndSurgery(params.id, session.receptionist.surgery)]
        }
        else if (session.doctor)
        {
            [appointment: Appointment.findByIdAndDoctor(params.id, session.doctor)]
        }
        else
        {
            response.sendError(401)
        }
    }

    def create()
    {
        if (session.receptionist)
        {
            def surgery = session.receptionist.surgery

            [
                appointment: new Appointment(),
                surgery: surgery,
                doctorList: Doctor.findAllBySurgery(surgery),
                patientList: Patient.findAllBySurgery(surgery),
                nurseList: Nurse.findAllBySurgery(surgery)
            ]
        }
        else
        {
            response.sendError(401)
        }
    }

    def edit()
    {
        response.sendError(401)
    }

    def update()
    {
        response.sendError(401)
    }

    def delete()
    {
        response.sendError(401)
    }
}