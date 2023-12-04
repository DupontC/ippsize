import { describe, expect, test } from 'vitest';
import { Range } from '../src/Range.js';

describe('Range', ()=> {
  test('Hello World', ()=> {
    // GIVEN
    const range = new Range();

    // WHEN
    const result = range.helloWorld();

    // THEN
    expect(result).toEqual('Hello World');
  })
})