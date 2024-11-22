package com.hiranmayi.MathQuiz.dto

data class QuestionRequest(
    val question: String,
    val answer: String,
    val hint1: String?,
    val hint2: String?
)
