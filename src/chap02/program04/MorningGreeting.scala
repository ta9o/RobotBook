package chap02.program04

import chap02.program03.AbstractGreeting

class MorningGreeting extends AbstractGreeting with GreetingTrait {
  def getMessage():String = {
    "Good morning!"
  }
}
