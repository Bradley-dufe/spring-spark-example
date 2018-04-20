package com.zhuinden.sparkexperiment

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component

/**
  * Author: YangLei(ERP:yanglei118)
  * Description:
  * Date: Create in 下午9:40 2018/4/19
  * update in 下午9:40 2018/4/19
  */
class test {
  def main(args: Array[String]): Unit ={
    for(i <- 1 to 100){
      Thread.sleep(2000)
    }
  }
  def sayHello: Unit ={
    println("hello")
  }
}
