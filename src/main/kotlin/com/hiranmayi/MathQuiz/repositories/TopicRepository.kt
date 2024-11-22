package com.hiranmayi.MathQuiz.repositories

import com.hiranmayi.MathQuiz.entities.Topic
import org.springframework.data.jpa.repository.JpaRepository

interface TopicRepository : JpaRepository<Topic, Long>
