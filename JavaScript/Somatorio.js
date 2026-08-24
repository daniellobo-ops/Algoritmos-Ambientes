function somatorio(n) {
    if (n < 0) {
        return "Número inválido. Por favor, insira um número não negativo.";
    }
    let soma = 0;
    for (let i = 1; i <= n; i++) {
        soma += i;
    }
    return soma;
}

console.log(somatorio(5));
