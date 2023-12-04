import {expect, test} from "vitest";

test('should concat two string', ()=>  {
    // given
    let hello = "hello"

    // when
    let hello_world = hello +  " world!";

    // then
    expect(hello_world).equal("hello world!")
})