/**
 * @param {number} n
 * @return {Function} counter
 */
function createCounter(n) {
  function counter() { return counter._v++; }
  counter._v = n | 0;
  return counter;
}
