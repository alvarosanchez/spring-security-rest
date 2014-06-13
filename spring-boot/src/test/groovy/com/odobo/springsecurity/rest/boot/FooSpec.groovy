package com.odobo.springsecurity.rest.boot

import spock.lang.Specification


/**
 * Created by mariscal on 13/06/14.
 */
class FooSpec extends Specification {

    def "it works"() {
        given:
        Foo foo = new Foo()

        when:
        foo.bar()

        then:
        true
    }
}