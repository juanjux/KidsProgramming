package net.juanjoalvarez.kidsprogramming

abstract class Action()

abstract class MediaAction(path: String) : Action()

class ActionUnset: Action()

class ActionShowImage(path: String) : MediaAction(path)

class ActionPlayAudio(path: String) : MediaAction(path)

class ActionPlayVideo(path: String) : MediaAction(path)
