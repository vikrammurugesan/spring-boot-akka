package com.mvikram.boot.akka

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

@Component
class Scheduler() {
  
  
  @Scheduled(fixedRate = 5000)
  def invoke() = {
    println("test")
  }
}