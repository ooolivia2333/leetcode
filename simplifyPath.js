var simplifyPath = function(path) {
    let items = path.split("/");
    let ans = [];
    for (let item of items) {
        if (item.length === 0 || item === "/" || item === ".") continue;
        if (item === "..") {
            if (ans.length > 0) ans.pop();
        } else {
            ans.push(item);
        }
    }
    return "/" + ans.join('/');
}
console.log(simplifyPath("/.../a/../b/c/../d/./"));