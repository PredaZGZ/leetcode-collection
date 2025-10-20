/**
 * @param {number} n
 * @return {Function} counter
 */
function createCounter(n) {
  let v = n | 0;            // fuerza Small Integer (SMI)
  return function() { return v++; };
}
