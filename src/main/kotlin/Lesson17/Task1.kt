package org.example.Lesson17

class QuizItem(question: String, answer: String) {

    private var _question = question
    private var _answer = answer

    val question: String
        get() = _question

    var answer: String
        get() = _answer
        set(value) {
            _answer = value
        }
}
