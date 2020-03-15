package variable

/**
 * 例1
 */
def simpleClosure = {
    println "simpleClosure this : " + this  //指向离该闭包最近的封闭类
    println "simpleClosure owner : " + owner    //指向离该闭包最近的封闭类或对象
    println "simpleClosure delegate : " + delegate  //默认值和owner一样,但是可以自定义
}
/**
 * 此时 this / owner / delegate 指向的对象都是最外层的ClosureVar对象
 */
//simpleClosure.call()

/**
 * 例2  静态闭包的指向
 */
class Person {
    def static classClosure = {
        println "classClosure this :" + this
        println "classClosure owner :" + owner
        println "classClosure delegate : " + delegate
    }

    def static say() {
        def methodClosure = {
            println "methodClosure this : " + this
            println "methodClosure owner : " + owner
            println "methodClosure delegate :" + delegate
        }
        methodClosure.call()
    }
}

def person = new Person()
/**
 * 所有对象全部指向Person这个Class,而不是变量 ,这是因为static 静态变量默认在class 创建时 产生
 */
//person.classClosure.call()
//person.say()

/**
 * 例3  this 与 owner到底有什么不同
 */
class ClosureCompare {
    def outerClosure = {
        def innerClosure = {
            println "innerClosure this :" + this
            println "innerClosure owner :" + owner
            println "innerClosure delegate : " + delegate
        }
        innerClosure.call()
    }
}

def closureCompare = new ClosureCompare()
/**
 * 在这里this 指向的是外层类 ClosureCompare对象,而Owner和delegate指向是外层的闭包对象outerClosure
 */
closureCompare.outerClosure.call()

