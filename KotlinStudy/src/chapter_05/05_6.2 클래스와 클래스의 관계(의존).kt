package chapter_05

fun main() {
    val patient1 = Patient2("kildong", 1234)
    val doc1 = Doctor2("kimSabu", patient1)
    doc1.patientList()
}
/*
    결과 :
    Doctor: kimSabu, Patient: kildong
    Patient Id: 1234
 */

class Patient2(val name: String, var id: Int) {
    fun doctorList(d: Doctor2) {
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor2(val name: String, private val p: Patient2) {
    private val customerId: Int = p.id

    fun patientList() {
        println("Doctor: $name, Patient: ${p.name}")
        println("Patient Id: $customerId")
    }
}