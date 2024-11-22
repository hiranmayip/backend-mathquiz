package com.hiranmayi.MathQuiz.entities

import jakarta.persistence.*

@Entity
data class Question(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "topic_id", nullable = false)
    val topicId: Long,

    val question: String,
    val answer: String,
    val hint1: String?,
    val hint2: String?
)
{
    // No-argument constructor for JPA
    constructor() : this(0, 0, "", "", null, null)
}


