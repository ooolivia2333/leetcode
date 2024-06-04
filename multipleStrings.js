var multiplyOneDigit = function(number, digit, numZeros) {
    let result = [];
    for (let i = 0; i < numZeros; i++) {
        result.push(0);
    }
    let carry = 0;
    for (let i = 0; i < number.length; i++) {
        let mult = Number(number[i]) * Number(digit) + carry;
        carry = Math.floor(mult/10);
        result.push(mult%10);
    }
    return result;
}

var addResults = function(results) {
    let result = [...results[results.length - 1]];
    let answer = [];
    for (let i = 0; i < results.length - 1; i++) {
        let carry = 0;
        answer = [];
        for (let j = 0; j < results[i].length || j < result.length; j++) {
            let digit1 = j < results[i].length? results[i][j]: 0;
            let digit2 = j < result.length? result[j]: 0;
            let sum = digit1 + digit2 + carry;
            carry = Math.floor(sum / 10);
            answer.push(sum%10);
        }
        result = answer;
    }
    return result;
}

var multiply = function(num1, num2) {
    number1 = [...num1];
    number2 = [...num2];

    number1.reverse();
    number2.reverse();

    let results = [];
    for (let i = 0; i < number2.length; i++) {
        results.push(multiplyOneDigit(number1, number2[i], i));
    }
    let result = addResults(results);
    return result.reverse().join('');
} 

console.log(multiply("123", "456"));