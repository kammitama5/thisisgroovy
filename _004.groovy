def ice = "I love Ice cream" =~ /(I|i)ce/

println ice[0][0] //prints Ice
println ice[0][1] //prints I
println ice[0][2] //prints null
​