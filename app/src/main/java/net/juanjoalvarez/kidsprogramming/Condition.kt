package net.juanjoalvarez.kidsprogramming

import android.widget.Button

abstract class Condition

class ConditionUnset : Condition()

class ConditionTouch(target: Button) : Condition()

class ConditionDrag(from: Button, to: Button) : Condition()

class ConditionSay(word: String): Condition()
