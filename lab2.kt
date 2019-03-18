fun main() {                        
	//println("Hello, World!")        
    f29()
}

fun f1() {
    val num = arrayOf(10,20,33,95)
    //println(num)
    println(num.contentToString())
}

fun f2() {
    val numbers = arrayOf(1, 3, 5, "test")
    println(numbers.contentToString())
}

fun f3() {
    val animals =arrayOf("dog", "cat", "mouse")
    val cat = animals.get(1) //get cat
    println(cat)
    
}

fun f4() {
    val num = arrayOf(4, 4, 5, 6, 6, 8, 9)
    num.set(0,3)
    println(num.contentToString())    
}

fun f5() {
    val animals =arrayOf("dog", "cat", "mouse")
    val dog = animals[0] //get dog with []
    println(dog)
}

fun f6() {
    val letters = arrayOf('a', 'a', 'c', 'd')
    letters[1] = 'b'
    //use [] to set fix 'b'
    println(letters.contentToString())
    
}

fun f7() {
    val num = arrayOf(4, 4, 5, 6, 6, 8, 9)
    println(num[7])    
    
}

fun f8() {
    val luckyNumber = arrayOf(1, 3, 5, 7, 9, 11)
    val numOfElement = luckyNumber.size
    println(numOfElement)
    
}

fun f9() {
    val luckyNumber = arrayOf(1, 3, 5, 7, 9, 11)
    val numOfElement = luckyNumber.size
    val lastElement = luckyNumber[numOfElement-1]
    println(lastElement)
    
}

fun f10() {
    val player = arrayOf("Alice", "Bob", "James")
    player[0] = "Tim" //set "Alice" to "Tim"
    println(player.contentToString())
}

fun f11() {
    val player = arrayOf("Tim", "Bob", "James")
    val size = player.size //find number of element
    val last = player[size-1]
    println(last)
    
}

fun f12() {
    val letter = 'a'
    println(letter) //print a
    
}

fun f13() {
    val greeting = "Hello"
    println(greeting) //print Hello
    
}

fun f14() {
    val username = "maximus"
    val length = username.length
    if (length < 30) {
        println("Valid username")
    }
}

fun f15() {
    val output = "The cat " + "ate the mouse"
    println(output) //print The cat ate the mouse
    
}

fun f16() {
    var question = "Hello,"
    question += " where is the cat"
    println(question)
    
}

fun f17() {
    var shoutMouse = "Mouse"
    shoutMouse += '!'
    println(shoutMouse)
    
    
}

fun f18() {
    var phase = "Watch the cat"
    phase += ' '
    phase += "fish!"
    println(phase) //print Watch the cat fish!
}

fun f19() {
    val input = "  cool cat  "
    val username = input.trim()
    println(username) //print cool cat by trim
    
}

fun f20() {
    val livesLeft = 9
    val output = "${livesLeft} lives left for catman."
    println(output) //use ${val_name} to print 9 lives left for catman.
    
}

fun f21() {
    val output = "She said \"I love coding\", after building her first app."
    println(output) //print She said "I love coding", after building her first app.
    
}

fun f22() {
    val accountNumber = 1234
    val output = "Account number: ${accountNumber}"
    println(output)
    
}

fun f23() {
    repeat (4) { //
        println("Time for loop!")
    }
    
}


fun f24() {
    repeat (2) {
        println("No, Polly")
    }
}

fun f25() {
    repeat (4) {
        println("Captain marvel is great!")
    }
    
}

fun f26() {
    var counter = 0
    repeat(4) {
        counter+=1
        println(counter)
        //print 1
        //      2
        //      3
        //      4
    }
    
}

fun f27() {
    var index = 0
    while (index < 6) { //use while
        index += 1
        println(index)
    }
    
}

fun f28() {
    val names = arrayOf("Tom", "Sam", "Alex")
    for (n in names) {
        println(n)
    }
    //use for in
    
}

fun f29() {

    for (number in 2..5) {
        println(number)
    }
    //2..5

    
}
