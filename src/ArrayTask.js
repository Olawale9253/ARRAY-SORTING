
function squareAndSort(numbers) {
    return numbers
        .map(number => number * number)
        .sort((a, b) => a - b);
}

module.exports = squareAndSort;
