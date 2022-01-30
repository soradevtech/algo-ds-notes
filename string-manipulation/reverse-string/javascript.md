/* var rev = function (str) {
    return str.split('').reverse().join('');
} */

/* var rev = function (str) {
    let reversed = '';
    for (let char of str) {
        reversed = char + reversed;
    }
    return reversed;
} */

/* var rev = function (str) {
    // Returning the string with: string being split into an array of its elemements (the letters)
    // The string is then put through a reduce method. First argument is the function that the
    // method is using to add the elements of the now split string array, second is the starting
    // value. The array values are added one by one by the function in the reduce method to the 
    // starting value. There are 2 placeholder arguments for the individual index of each
    // iteration and the result being built after each iteration that the index is being added to.

    return str.split('').reduce((rev, char) => {
        return char + rev;
    }, '');
} */
            
/* var rev = function (str) {
    // Shortened version of the solution explained above
    return str.split('').reduce((rev, char) => char + rev, '')
} */  