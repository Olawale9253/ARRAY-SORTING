
const squareAndSort = require("./numberSquares");

test("should return squares in ascending order", () => {
    expect(squareAndSort([3, 2, 7, 1, 4]))
        .toEqual([1, 4, 9, 16, 49]);
});

test("should handle negative numbers", () => {
    expect(squareAndSort([-4, -2, 3, 1]))
        .toEqual([1, 4, 9, 16]);
});

test("should handle an empty array", () => {
    expect(squareAndSort([])).toEqual([]);
});

test("should handle duplicate numbers", () => {
    expect(squareAndSort([2, 2, 1]))
        .toEqual([1, 4, 4]);
});

test("should handle zeros", () => {
    expect(squareAndSort([0, 3, 0, 1]))
        .toEqual([0, 0, 1, 9]);
});
