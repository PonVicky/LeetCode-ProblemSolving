/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    const array = new Array(26).fill(0);
    let n  = s.length, m = t.length;
    if(n!=m) return false;
    for(let i=0;i<n;i++){
        array[(s.charCodeAt(i)- ('a'.charCodeAt(0)))]++;
    }
    for(let i=0;i<n;i++){
        array[(t.charCodeAt(i)-('a'.charCodeAt(0)))]--;
    }
    for(let i=0;i<26;i++){
        if(array[i] != 0) return false;
    }
    
    return true;

};