package uk.ac.shu.sp2292.sadp.sheffSurgeries

class AppointmentController
{
    def scaffold = Appointment

    def index()
    {
        if (session.user instanceof Receptionist)
        {
            [appointmentList: Appointment.findAllBySurgery(session.user.surgery)]
        }
        else if (session.user instanceof Doctor)
        {
            [appointmentList: Appointment.findAllByDoctor(session.user)]
        }
        else
        {
            response.sendError(404)
        }
    }

    def show()
    {
        if (session.user instanceof Receptionist)
        {
            [appointment: Appointment.findByIdAndSurgery(params.id, session.user.surgery)]
        }
        else if (session.user instanceof Doctor)
        {
            [appointment: Appointment.findByIdAndDoctor(params.id, session.user)]
        }
        else
        {
            response.sendError(404)
        }
    }

    def create()
    {
        if (session.user instanceof Receptionist)
        {
            def surgery = session.user.surgery

            [
                appointment: new Appointment(),
                surgery: surgery,
                patientList: Patient.findAllBySurgery(surgery),
                doctorList: Doctor.findAllBySurgery(surgery),
                nurseList: Nurse.findAllBySurgery(surgery)
            ]
        }
        else
        {
            response.sendError(404)
        }
    }

    def edit()
    {
        response.sendError(404)
    }

    def update()
    {
        response.sendError(404)
    }

    def delete()
    {
        response.sendError(404)
    }
}