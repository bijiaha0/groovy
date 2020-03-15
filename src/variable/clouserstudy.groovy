package variable

def clouser = {
    String name -> println "hello ${name}"
}

//clouser("groovy!")

/**
 * 字符串和与闭包结合使用
 */
String str = 'the 2 and 3 is 5'
//str.each { String tmp -> print tmp.multiply(2) }

/**
 * find 来查找符合条件的第一个
 */
println str.find {
    String s -> s.isNumber()
}

def list =  str.findAll{
    String s -> s.isNumber()
}

println list.toListString()

println str.any{
    String s -> s.isNumber()
}

println str.every{
    String s -> s.isNumber()
}

def list2 = str.collect{
    it.toUpperCase()
}

println list2.toListString()


