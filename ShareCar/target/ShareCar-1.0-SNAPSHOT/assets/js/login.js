
$(document).ready(function() {
	$("#card").flip({
	  trigger: 'manual'
	});


	$(".signup_link").click(function() {

		$(".signin_form").css('opacity', '0');
		$(".signup_form").css('opacity', '100');
		$("#nombre").focus();
		
		
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
		$('#tipodoc').css('background', '#fff');
		$('#ciudad').css('background', '#fff');
		$('#departamento').css('background', '#fff');
		$('input:not(:submit)').css('color', '#000');
		// $('input').css('color', '#000');
		$('select').css('color', '#000');
	});

	$('.flip').mouseover(function(){
		$(this).animate({fontSize: '20px'}, 'slow');
	});

	$('.flip').mouseleave(function(){
		$(this).animate({fontSize: '15px'}, 'fast');
	});

	$('.btn').mouseover(function(){	
		$('.btn-block').css('border-color', 'cyan');
	});	

	$('.btn').mouseleave(function(){
		$('.btn-block').css('border-color', '#00ffff00');
	});	
});