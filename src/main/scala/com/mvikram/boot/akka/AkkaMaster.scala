package com.mvikram.boot.akka

import akka.actor.ActorSystem
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import akka.actor.Props
import akka.actor.ActorRef

class AkkaMaster {
  
  def init() = {
    val system = ActorSystem.create("actorSystem")
    val actor = system.actorOf(Props[HelloWorld])
    val future = actor ! Request
  }
}

case object Request
case object Response