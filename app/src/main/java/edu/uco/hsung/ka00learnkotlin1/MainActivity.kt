package edu.uco.hsung.ka00learnkotlin1

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // SAM: single abstract method
        bt_inttypes.setOnClickListener {
            integerTypes()
        }

        bt_floattypes.setOnClickListener({v -> floatTypes()}) // lambda expression

        bt_boolean.setOnClickListener {
            booleanTypes()
        }

        bt_char.setOnClickListener {
            charType()
        }

        bt_string.setOnClickListener {
            stringType()
        }
    }

    private fun integerTypes() : Unit {
        // Unit ==> void ; redundant since no return
        // 'var' for a variable
        // 'val' for an unchanging value once assigned

        var b: Byte = 5 // 8 bits
        var s: Short = 300 // 16 bits
        var i: Int = 67000 // 32 bits, type inference
        var l: Long = 532343L // 64 bits, type inference

        ++b; ++s; ++i; ++l; // semicolon required; multiple statements

        val n = 67000 // type inference

        display.text = "Byte b = $b\nShort s = $s\nInt i = $i\nLong l = $l\nvalue n = $n"
    }

    private fun floatTypes() {
        var f: Float = 3.14F // 32 bits suffix F is required
        var d: Double = 3.14 // 64 bits

        f /= 2;  d /= 2;

        display.text = "Float f = $f\nDouble d= $d"
    }

    private fun booleanTypes() {
        var b1: Boolean = true;
        var b2 = false;
        b1 = b1 or b2
        b2 = b1 and b2

        display.text = "b1 = $b1\nb2 = $b2"
    }

    private fun charType() {
        // 16-bit Unicode
        val c1: Char = 'X'
        val c2 = '\u0058'
        display.text = "c1 = $c1\nc2 = $c2"
    }

    private fun stringType() {
        // """    """ for multi-line String
        val course: String = "Mobile Apps Programming"
        val studentsEnrolled = 25
        val studentsWillFail = 15
        val message = """$course
        has $studentsEnrolled students enrolled.
        But only ${studentsEnrolled - studentsWillFail} students will remain."""

        display.text = message;
    }
}
