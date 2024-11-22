package com.hiranmayi.MathQuiz.services

import com.hiranmayi.MathQuiz.entities.Question
import com.hiranmayi.MathQuiz.entities.Topic
import com.hiranmayi.MathQuiz.repositories.QuestionRepository
import com.hiranmayi.MathQuiz.repositories.TopicRepository
import org.springframework.stereotype.Service

@Service
class QuizService(
    private val topicRepo: TopicRepository,
    private val questionRepo: QuestionRepository
) {
    fun getAllTopics(): List<Topic> = topicRepo.findAll()

    fun getQuestionsByTopic(topicId: Long): List<Question> {
        val questions = questionRepo.findByTopicId(topicId)
        println("Questions found: $questions")  // Add this line to debug
        return questions

    }

    fun addTopic(name: String): Topic = topicRepo.save(Topic(name = name))

    fun addQuestion(topicId: Long, question: String, answer: String, hint1: String?, hint2: String?): Question {
        return questionRepo.save(Question(topicId = topicId, question = question, answer = answer, hint1 = hint1, hint2 = hint2))
    }

}
