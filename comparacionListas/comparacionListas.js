const list1 = [1, 2, 3, 4, 5];
const list2 = [1, 2, 3, 4, 5];

const equal = JSON.stringify(list1) === JSON.stringify(list2);

console.log("Lists are equal:", equal);