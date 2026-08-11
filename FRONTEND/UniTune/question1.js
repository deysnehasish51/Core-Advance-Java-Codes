const inputArray = [
    'racecar',
    'hello',
    'level',
    'Step on no pets',
    'java'
];

function palindromeChecker(...strings) {
    strings.forEach(s => {
        const cleaned = s.replace(/\s+/g, '').toLowerCase();
        const reversed = cleaned.split('').reverse().join('');
        const isPalindrome = cleaned === reversed;
        console.log(`${s}\t${isPalindrome ? 'TRUE' : 'FALSE'}`);
    });
}

palindromeChecker(...inputArray);
