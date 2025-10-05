package org.example

class Utils implements Serializable {
    def steps

    Utils(steps) {
        this.steps = steps
    }

    def sayHelloJenkins() {
        steps.echo "Hello Jenkins"
    }
}
