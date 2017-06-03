package IfElsePractise

// Student Report Card StandAlone App
fun main (args: Array<String>){

     // Student Record Data
    println("Enter Student Name")
    val studentName= readLine().toString()
    println("Enter Class Name")
    val className= readLine().toString()
    println("Enter Roll Number")
    val rollNum= readLine()!!.toInt()

    // Subjects And Marks Details
    println("Enter Subject 1 Name")
    val sub1= readLine().toString()
    println("Obtain Marks in $sub1")
    val sub1Marks : Double = readLine()!!.toDouble()


    println("Enter Subject 2 Name")
    val sub2= readLine().toString()
    println("Obtain Marks in $sub2")
    val sub2Marks : Double = readLine()!!.toDouble()

    println("Enter Subject 3 Name")
    val sub3= readLine().toString()
    println("Obtain Marks in $sub3")
    val sub3Marks : Double = readLine()!!.toDouble()

    println("Enter Subject 4 Name")
    val sub4 = readLine().toString()
    println("Obtain Marks in $sub4")
    val sub4Marks : Double = readLine()!!.toDouble()

    println("Enter Subject 5 Name")
    val sub5 = readLine().toString()
    println("Obtain Marks in $sub5")
    val sub5Marks : Double = readLine()!!.toDouble()

    val maxMarks :   Double =  100.00
    val obtMarks :   Double =  sub1Marks+sub2Marks+sub3Marks+sub4Marks+sub5Marks
    val TotalMarks : Double =  500.0
    val TotalPerct : Double =  (obtMarks/TotalMarks)*100

    if (sub1Marks<maxMarks &&  sub2Marks<maxMarks && sub3Marks<maxMarks &&
        sub4Marks<maxMarks &&  sub5Marks<maxMarks ) {

        println("*** Student Report Card Application ****")
        println("Name : $studentName Class : $className Roll#: $rollNum ")
        println("****************************************")
        println("1: $sub1=$sub1Marks 2: $sub2=$sub2Marks 3: $sub3=$sub3Marks " +
                "4: $sub4=$sub4Marks 5: $sub5=$sub5Marks")

        println("Obtain Marks : $obtMarks Total Marks : $TotalMarks " +
                "Percentage : $TotalPerct")

    } else
    {
        println("You Have Put Wrong Data !!")
    }

}