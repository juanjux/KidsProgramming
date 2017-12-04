package net.juanjoalvarez.kidsprogramming

class Behaviour(var activator: Activator,
                var condition: Condition,
                var action: Action) {
    init {
        activator = Activator.Unset
    }
}
