var MainDate = /** @class */ (function () {
    function MainDate() {
        this.dateTime = new Date();
    }
    MainDate.prototype.displayDate = function () {
        console.log(this.dateTime);
    };
    return MainDate;
}());
var mainDate = new MainDate();
mainDate.displayDate();
