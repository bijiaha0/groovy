package variable

class Student {
    String name
    def pretty = {"My name is ${name}"}
    String toString(){
        println pretty.call()
    }
}

class Teacher{
    String name
}

def stu = new Student(name:'Vander')
def tea = new Teacher(name: 'Qroid')
//1.正常打印学生姓名 This is Vander
stu.toString()
//2.使用委托机制打印老师名称 改变委托对象和委托策略
stu.pretty.delegate = tea
stu.pretty.resolveStrategy = groovy.lang.Closure.DELEGATE_FIRST
stu.toString()
