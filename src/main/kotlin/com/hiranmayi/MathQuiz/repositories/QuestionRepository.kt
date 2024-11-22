package com.hiranmayi.MathQuiz.repositories

import com.hiranmayi.MathQuiz.entities.Question
import org.springframework.data.jpa.repository.JpaRepository

interface QuestionRepository : JpaRepository<Question, Long> {
    fun findByTopicId(topicId: Long): List<Question>
}
