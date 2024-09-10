interface DateInterface{
    dateTime:any
}

class MainDate implements DateInterface{
    dateTime = new Date();
    displayDate():void{
        console.log(this.dateTime)
    }
}
 var mainDate = new MainDate();
 mainDate.displayDate();
