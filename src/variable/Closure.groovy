package variable

//闭包的基本使用
/**
 * 向上阶乘  通过upTo方法  => 1 * 2 * 3 * 4 * 5
 */
int upToFab(number) {
    int result = 1
    1.upto(number, { num -> result *= num })
    return result
}

println upToFab(5)

/**
 * 向下阶乘  通过downTo   => 5 * 4 * 3 * 2 * 1
 */
int downToFab(Number number) {
    int result = 1
    number.downto(1, { num -> result *= num })
    return result
}

println downToFab(5)

/**
 * 累加 通过times => 1 + 2 + 3 + 4 + .... + 100
 */
int addCal(Number number) {
    int result = 0
    number.times({
        num -> result += num
    })
    return result
}

println addCal(101)