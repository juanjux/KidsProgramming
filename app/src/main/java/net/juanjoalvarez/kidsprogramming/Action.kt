package net.juanjoalvarez.kidsprogramming

abstract class Action

class ActionPress(val button: String): Action()

class ActionDrag(val fromButton: String, val toButton: String): Action()

class ActionSay(val word: String): Action()
