function typeEffect(element,speed){
    var text= element.innerHTML;
    element.innerHTML="";

    var i=0;
    var timer=setInterval(function(){
        if(i<text.length){
            element.append(text.charAt(i));
            i++;
        }
        else{
            clearInterval(timer);
        }
    }, speed);
}
var speed=75;
var h1=document.querySelector('h1');
var p=document.querySelector('p');
var delay=h1.innerHTML.length*speed+speed;
 typeEffect(h1,speed);

 setTimeout(function(){
     p.style.display="inline-block";
     typeEffect(p.speed);
 },delay);