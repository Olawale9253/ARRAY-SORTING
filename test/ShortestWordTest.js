
const findShortestWord = require("./shortestWord");

test("should return the shortest word", () => {
    expect(
        findShortestWord("My name is Olawale, a software engineer")
    ).toBe("a");
});

test("should return the first word when shortest lengths tie", () => {
    expect(findShortestWord("I am a student")).toBe("I");
});

test("should throw an error for an empty sentence", () => {
    expect(() => findShortestWord("")).toThrow();
});

test("should throw an error for null", () => {
    expect(() => findShortestWord(null)).toThrow();
});
