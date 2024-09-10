$(document).ready(function(){
    $(".btn").on("click",function(){
        if($(".right").css("width")=="0px"){
            $(".right").animate({width:"500px"},400);
            $(".btn i").removeClass();
            $(".btn i").addClass("fas fa-minus");
        }else{
            $(".right").animate({width:"0px"},400);
            $(".btn i").removeClass();
            $(".btn i").addClass("fas fa-plus");
        }
    });
});