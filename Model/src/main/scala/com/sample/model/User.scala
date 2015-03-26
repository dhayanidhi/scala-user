package com.sample.model

import java.util.Calendar

/**
 * Created by ddakshin on 3/26/15.
 */

object UserStatus extends Enumeration{
  type UserStatus = Value
  val UNKNOWN, ACCEPTED, ACTIVE, NOT_ACTIVE, DELETED = Value
}

import UserStatus._
trait api {
  case class User(var name: String,var email: String,var age: Int, var id: Int){

  }

  case class UserAccount(var id: Int, var last_time: Calendar, var actions: List[UserAction], var status: Option[UserStatus], var userId:Int){

  }

  case class UserAction(var id: Int, var id_user_action: Int, var message: String){

  }

}

