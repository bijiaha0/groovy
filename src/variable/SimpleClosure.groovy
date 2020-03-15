package variable

/**
 * 无参闭包
 */
def closure = { println 'Hello Groovy' }
//执行方法
closure.call()
closure()

/**
 * 有参闭包
 */
def paramClosure = {
    name -> println "Hello  ${name}"
}
paramClosure.call("Vander")
paramClosure("Vander")

/**
 * 多个参数的闭包
 */
def paramsClosure = {
    name, age ->
        println "Hello ${name} , My age is ${age}"
}
paramsClosure.call("Vander", 15)
paramsClosure("Vander", 15)

/**
 * 显式返回值的闭包
 */
def lightReturnClosure = {
    return "Hello groovy"
}
result = lightReturnClosure()
println result

/**
 * 隐式返回值的闭包
 */
def darkReturnClosure = {
    println "Hello Groovy"
}
result = darkReturnClosure()
//返回值为空
println result

/**
 * 当且仅当闭包中有且仅有一个参数，且不显示声明，it具有唯一参数引用的作用
 */
def itClosure = {
        println "Hello ${it}"
}
itClosure.call("name")



