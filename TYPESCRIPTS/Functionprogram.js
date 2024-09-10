var functionProgram = /** @class */ (function () {
    function functionProgram() {
        this.msg = function () {
            return "Anonymous function";
        };
        this.res = function (a, b) {
            return a * b;
        };
        this.foo = function () {
            console.log("Arrow funcion");
        };
        this.foo1 = function (x) {
            x = 10 + x;
            console.log(x);
        };
    }
    functionProgram.prototype.normal_param = function (s1) {
        console.log(s1);
    };
    return functionProgram;
}());
var obj2 = new functionProgram();
obj2.normal_param("normal function");
console.log(obj2.msg());
console.log(obj2.res(10, 20));
obj2.foo();
obj2.foo1(100);
