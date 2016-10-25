def list = [1, 2, 3, 4, 5]

println list[2] // will print 3
println list[-1] // will print 5

if (2 in list) {
    println "2 is in this list"
}

// will print "2 is in this list"

list.each {
    println it
}
//prints [1, 2, 3, 4, 5]

def div3 = list.findAll { it % 3 == 0}​​​​​​​​ // prints 3