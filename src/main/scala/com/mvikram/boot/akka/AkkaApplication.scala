package com.mvikram.boot.akka

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.scheduling.annotation.EnableScheduling

object AkkaApplication extends App {
  override def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[AkkaConfig]);
  }
}