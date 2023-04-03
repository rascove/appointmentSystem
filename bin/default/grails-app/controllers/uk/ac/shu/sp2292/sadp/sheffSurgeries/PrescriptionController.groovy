package uk.ac.shu.sp2292.sadp.sheffSurgeries

class PrescriptionController
{
    def scaffold = Prescription

    def results(String query)
    {
        [prescriptionList: Prescription.findAllByMedicineIlikeOrDaysSupplyOrTotalCost('%' + query + '%', query?.isInteger() ? query as Integer : Integer.MAX_VALUE, query?.isDouble() ? query as Double : 0)]
    }
}