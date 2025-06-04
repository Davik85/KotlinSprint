package org.example.Lesson17

class QuizItem(val question: String, answer: String) {

    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}
