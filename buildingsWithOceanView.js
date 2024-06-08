var findBuildings = function(heights) {
    let stack = [];
    for (let i = 0; i < heights.length; i++) {
        while (stack.length > 0 && heights[i] >= heights[stack[stack.length-1]]) {
            stack.pop();
        }
        stack.push(i);
    }

    return stack;
};

console.log(findBuildings([4, 2, 3, 1]));