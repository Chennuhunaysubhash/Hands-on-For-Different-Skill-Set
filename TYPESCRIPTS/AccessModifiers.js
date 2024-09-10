var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Greetings = /** @class */ (function () {
    function Greetings() {
        this.x = "private access modifiers";
        this.y = "protected access modifiers";
        this.z = "public access modifiers";
        console.log("with in constructor");
        console.log("x: " + this.x);
    }
    Greetings.prototype.stringDisplay = function () {
        //var obj  = new Greetings();
        console.log("with in function");
        console.log("x: " + this.x);
        console.log("y: " + this.y);
        console.log("z: " + this.z);
    };
    return Greetings;
}());
var Msg = /** @class */ (function (_super) {
    __extends(Msg, _super);
    function Msg() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Msg.prototype.getData = function (greeting, msg) {
        console.log(greeting.z);
        this.y = "Msg protected";
        this.z = "Msg Public";
        console.log(msg.y);
        console.log(msg.z);
        console.log();
    };
    return Msg;
}(Greetings));
var obj = new Greetings();
obj.stringDisplay();
var obj1 = new Msg();
obj1.getData(obj, obj1);
