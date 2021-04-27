package chapter_05

fun main() {
    val doc1 = Doctor("Kimsabu")
    val patient1 = Patient("Kildong")
    doc1.patientList(patient1)
    patient1.doctorList(doc1)
}
/*
    결과 :
    Doctor: Kimsabu, Patient: Kildong
    Patient: Kildong, Doctor: Kimsabu
 */

class Patient(val name: String) {
    fun doctorList(d: Doctor) {// 인자로 참조
        println("Patient: $name, Doctor: ${d.name}")
    }
}

class Doctor(val name: String) {
    fun patientList(p: Patient) { // 인자로 참조
        println("Doctor: $name, Patient: ${p.name}")
    }
}