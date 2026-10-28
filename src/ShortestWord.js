
function findShortestWord(sentence) {
    if (typeof sentence !== "string" || sentence.trim() === "") {
        throw new Error("Sentence cannot be empty");
    }

    const words = sentence.trim().split(/\s+/);
    let shortest = words[0];

    for (const word of words) {
        if (word.length < shortest.length) {
            shortest = word;
        }
    }

    return shortest;
}

module.exports = findShortestWord;
