package net.juanjoalvarez.kidsprogramming

abstract class Condition {

}

class TouchCondition : Condition() {

}

class DragCondition : Condition() {

}

class SayCondition: Condition() {
    var word: String = ""
}
