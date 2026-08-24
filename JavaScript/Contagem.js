function contagem(dados, N) {
  if (!dados || dados.length === 0) return 0;

  const primeiro = dados[0];
  const min = Math.min(primeiro, N);
  const max = Math.max(primeiro, N);
  let contador = 0;

  for (let i = 0; i < dados.length; i++) {
    const valor = dados[i];
    if (Number.isInteger(valor) && valor >= min && valor <= max) {
      contador++;
    }
  }

  return contador;
}


const conjunto = [3, 4.5, 5, 7, 10, 12];
console.log(contagem(conjunto, 10)); //
