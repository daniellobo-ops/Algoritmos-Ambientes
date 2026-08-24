function numeroPrimo(num) {
  if (num <= 1) {
    return false;
  }
  for(let i = 2; i <= num.length; i++) {
    if(num % i === 0) {
      return false;
    }
  }
  return true;
}

console.log(numeroPrimo(7)); 
