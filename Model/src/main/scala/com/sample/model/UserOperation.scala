package com.sample.model

/**
 * Created by ddakshin on 3/26/15.
 */
class UserOperation extends api{

  def addUser(f:Map[String, String] => UserAction): Unit ={

  }

  def removeUser(name:String):Boolean = {
    return false
  }

  def addAction(name:String, x:() => UserAction): Unit = {

  }

  import UserStatus._
  def changeUserStatus(name:String, status: UserStatus):Unit = {

  }

  def getAllUser(name:String):Seq[User]={
    return null
  }
}
