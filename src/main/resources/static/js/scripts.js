function executaAjaxGet(urlChamada, divDestino, preExecute, posExecute) {
	$.ajax({
		type : "GET",
		url : urlChamada,
		beforeSend : preExecute,

		success : function(response) {

			$('#' + divDestino).replaceWith(response);
		},
		complete : function() {
			posExecute;
			afterReload();
		},
		error : function(xhr) {
			alert("Um erro ocorreu: " + xhr.status + " - " + xhr.statusText);
		}
	});

}

function afterReload() {
	$('.multipleSelect').multiselect({
		maxHeight : 200,
		dropUp : true,
		buttonWidth : '100%',
		enableCaseInsensitiveFiltering : true,
		nonSelectedText : 'Selecione',
		allSelectedText : 'Todos...',
		includeSelectAllOption : true,
		selectAllText : "Todos"

	});
	$.datetimepicker.setLocale('pt-BR');
	$('.usaCalendario').datetimepicker({
		format : 'd/m/Y H:i'
	});
	
	 $('#formDadosOcorrencia').ajaxForm(function (resposta) {
		 $('#corpo').replaceWith(resposta);
		 afterReload();
     });
	 $('#formPesquisaEnvolvido').ajaxForm(function (resposta) {
		 $('#corpo').replaceWith(resposta);
		 afterReload();
     });
}

function ajaxindicatorstart(text) {
	$('#resultLoading').css({
		'width' : '100%',
		'height' : '100%',
		'position' : 'fixed',
		'z-index' : '10000000',
		'top' : '0',
		'left' : '0',
		'right' : '0',
		'bottom' : '0',
		'margin' : 'auto'
	});

	$('#resultLoading .bg').css({
		'background' : '#000000',
		'opacity' : '0.7',
		'width' : '100%',
		'height' : '100%',
		'position' : 'absolute',
		'top' : '0'
	});

	$('#resultLoading>div:first').css({
		'width' : '250px',
		'height' : '75px',
		'text-align' : 'center',
		'position' : 'fixed',
		'top' : '0',
		'left' : '0',
		'right' : '0',
		'bottom' : '0',
		'margin' : 'auto',
		'font-size' : '16px',
		'z-index' : '10',
		'color' : '#ffffff'

	});

	$('#resultLoading .bg').height('100%');
	$('#resultLoading').fadeIn(300);
	$('body').css('cursor', 'wait');
}

function ajaxindicatorstop() {
	$('#resultLoading .bg').height('100%');
	$('#resultLoading').fadeOut(300);
	$('body').css('cursor', 'default');
}

$(document).on({
	ajaxStart : function() {
		ajaxindicatorstart('Carregando... Aguarde');
	},
	ajaxStop : function() {
		ajaxindicatorstop();
	}
});

function navClick() {
	if (document.getElementById("menuLateral").style.width == "250px")
		document.getElementById("menuLateral").style.width = "0px";
	else
		document.getElementById("menuLateral").style.width = "250px";

}

$(document).ready(function() {
	$('body').on("swipeleft", function() {
		document.getElementById("menuLateral").style.width = "0px";
	});
	$('body').on("swiperight", function() {
		document.getElementById("menuLateral").style.width = "250px";
	});

	console.log("document loaded");
});

function proximaAba(event) {
	$('#abasNavegacao li a.active').parent().next('li').find('a').trigger(
			"click");
	event.preventDefault();

}

function abaAnterior() {
	$('#abasNavegacao li a.active').parent().prev('li').find('a').trigger(
			"click");
}
