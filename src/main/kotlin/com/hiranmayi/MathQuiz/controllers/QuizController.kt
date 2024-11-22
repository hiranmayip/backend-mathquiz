package com.hiranmayi.MathQuiz.controllers

import com.hiranmayi.MathQuiz.dto.QuestionRequest
import com.hiranmayi.MathQuiz.entities.Question
import com.hiranmayi.MathQuiz.entities.Topic
import com.hiranmayi.MathQuiz.services.QuizService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class QuizController(private val service: QuizService) {

    @GetMapping("/topics")
    fun getAllTopics(): List<Topic> = service.getAllTopics()

    @GetMapping("/topics/{topicId}/questions")
    fun getQuestions(@PathVariable topicId: Long): List<Question> = service.getQuestionsByTopic(topicId)

    @PostMapping("/topics")
    fun addTopic(@RequestBody topic: Topic): Topic {
        return service.addTopic(topic.name)
    }

    @PostMapping("/topics/{topicId}/questions")
    fun addQuestion(
        @PathVariable topicId: Long,
        @RequestBody questionRequest: QuestionRequest
    ): Question {
        return service.addQuestion(
            topicId = topicId,
            question = questionRequest.question,
            answer = questionRequest.answer,
            hint1 = questionRequest.hint1,
            hint2 = questionRequest.hint2
        )
    }
}
