
$(document).ready(function() {
	$("#card").flip({
	  trigger: 'manual'
	});
});


$(".signup_link").click(function() {

	$(".signin_form").css('opacity', '0');
	$(".signup_form").css('opacity', '100');
	
	
	$("#card").flip(true);
	
	return false;
});

$("#unflip-btn").click(function(){
  
	$(".signin_form").css('opacity', '100');
	$(".signup_form").css('opacity', '0');
	
  	$("#card").flip(false);
	
	return false;
	
});

$('input:not(:submit)').focus(function(){
	$('input:not(:submit)').css('background', '#fff');
	$('input:not(:submit)').css('color', '#000');
});

$('.flip').mouseover(function(){
	$(this).animate({fontSize: '20px'}, 'slow');
});

$('.flip').mouseleave(function(){
	$(this).animate({fontSize: '15px'}, 'fast');
});