package uk.ac.shu.sp2292.sadp.sheffSurgeries

class PrescriptionController
{
    def scaffold = Prescription

    def results(String query)
    {
        [prescriptionList: Prescription.findAllByMedicineIlikeOrDaysSupplyOrTotalCost('%' + query + '%', query?.isInteger() ? query as Integer : Integer.MAX_VALUE, query?.isDouble() ? query as Double : 0)]
    }

    def index()
    {
        if (session.doctor)
        {
            [prescriptionList: Prescription.findAllByDoctor(session.doctor)]
        }
        else
        {
            response.sendError(401)
        }
    }

    def show()
    {
        if (session.doctor)
        {
            [prescription: Prescription.findByIdAndDoctor(params.id, session.doctor)]
        }
        else
        {
            response.sendError(401)
        }
    }

    def create()
    {
        if (session.doctor)
        {
            [
                prescription: new Prescription(),
                surgery: session.doctor.surgery,
                doctor: session.doctor
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