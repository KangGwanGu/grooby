package com.grooby.api

import groovy.util.logging.Slf4j

@Slf4j
class GroobyTest {
    static void main(String[] args) {
        def m = [
                name:"강관구",
                age:40,
                state:"서울"
        ]

        println "1111111111111111111111111"
        println "1111111111111111111111111"
        println "1111111111111111111111111"

        String s = ("111");



        log.info(m.toString())
        log.info(s)

        def s1 = [1,2,3,4,5]

        println s1.sum()

    }
}
