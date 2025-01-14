$(function() {
	var itemSearchInputArea	= $('#suggestForm .suggest_input'),
		searchFormArea	= $('#suggestForm'),
		itemSearchResetBtn	= $('#suggestForm .suggest_delete');
	
	itemSearchResetBtn.on('click', function(e){
		itemSearchInputArea.val('');
		itemSearchInputArea.focus();
		$(this).css('display', 'none');
		$('#suggestForm .suggest_wrap > div > div > ul').children().remove();
		$('#suggestForm .suggest_wrap').css('display', 'none');
	});

	itemSearchInputArea.on('focus', function(e){
		if ($('.suggest_list > div > ul > li').length > 0) {
			$('.suggest_wrap').css('display', 'block');
		} else {
			var query = itemSearchInputArea.val();
			if (query.length > 0) {
				sub_suggestAjax(query);
			}
		}
	});

	// 영역밖 클릭
	$('body').on('click', function(e){
		if (searchFormArea.has(e.target).length === 0) {// 통합검색 제거
			$('#suggestForm .suggest_wrap').css('display', 'none');
		}
	});
	
	// item search main slider
	$('.searchrank-article').slick({
        dots:			false,
        arrows:			false,
        infinite:		true,	// 루프
        slidesToShow:	1,
        slidesToScroll:	1
	});
	
	$('.searchrank-nav .nav-item > a').on('click', function(e) {
		$('.searchrank-article').slick("slickGoTo", $(this).attr('data-slide')-1);
	});
	
	$('.searchrank-article').on('beforeChange', function(event, slick, currentSlide, nextSlide){
	    $('.searchrank-nav .nav-item').removeClass('on');
	    $('header .searchrank-nav .nav-item').eq(nextSlide).addClass('on');
		$('footer .searchrank-nav .nav-item').eq(nextSlide).addClass('on');
	});
});

// 검색 추천어 설정
var sub_suggestLock = false;
var sub_suggestTimeLock = false;
var sub_pre_suggest;
function sub_searchInputKeyup(obj, e) {
	if (e.keyCode === 37 || e.keyCode === 39) {// 좌우
		return;
	}
	var searchSuggestForm	= $(obj).closest('#suggestForm');
	var searchSuggestWrap	= searchSuggestForm.find('.suggest_wrap');
	var searchSuggestList	= searchSuggestWrap.find('ul');
	var searchDeleteBtn	= searchSuggestForm.children('.suggest_delete');
	var query = $(obj).val();
	var queryLength = query.length;
	
	if (e.keyCode === 38) {// 상
		sub_suggestDirectionKey(obj, false);
		return;
	}
	if (e.keyCode === 40) {// 하
		sub_suggestDirectionKey(obj, true);
		return;
	}
	if (sub_pre_suggest === query) {
		return;
	}
	sub_pre_suggest = query;
	if (queryLength > 0) {
		searchDeleteBtn.css('display', 'inline');
		if (!sub_suggestLock && !sub_suggestTimeLock && suggestEnable === 'true') {
			sub_suggestTimeLock = true;
			setTimeout(function(){
				var searchQuery = $(obj).val();
				if (searchQuery.length > 0) {
					sub_suggestAjax(searchQuery);
				}
				sub_suggestTimeLock = false;
			}, 1000);
		}
	} else {
		searchSuggestList.children().remove();
		searchSuggestWrap.css('display', 'none');
		searchDeleteBtn.css('display', 'none');
	}
}

function sub_suggestAjax(searchQuery) {
	if (sub_suggestLock) {
		return;
	}
	sub_suggestLock = true;
	$.ajax ({
		type:		'post',
		datatype:	'json',
		url:		'/define/suggest',
		data:		{'query': searchQuery, 'limit': 5, 'type': '1'},
		success:function(data){
			if (data.length > 0) {
				$('#suggestForm .suggest_wrap ul').children().remove();
				var suggestHtml = '';
				$.each(data, function(index, item){
					suggestHtml += '<li data-index=\"' + index + '\" data-keyword=\"' + item + '\" onClick="javascript:itemSuggestClick(this);">' + item + '</li>';
				});
				$('#suggestForm .suggest_wrap ul').html(suggestHtml);
				$('#suggestForm .suggest_wrap').css('display', 'block');
			}
			sub_suggestLock = false;
		}, error: function(request, status, error){
			sub_suggestLock = false;
		}
	});
}

function sub_suggestDirectionKey(obj, updown) {
	var searchSuggestForm = $(obj).closest('#suggestForm');
	var suggestList = searchSuggestForm.find('.suggest_wrap > .suggest_list > div > ul > li');
	if (suggestList.length > 0) {
		var focusSuggest = searchSuggestForm.find('.suggest_wrap > .suggest_list > div > ul > .focus');
		if (focusSuggest.length > 0) {
			var curIndex = Number(focusSuggest.attr('data-index'));
			searchSuggestForm.find('.suggest_wrap ul li').removeClass('focus');
			searchSuggestForm.find('.suggest_wrap ul li[data-index=' + (updown ? curIndex + 1 : curIndex - 1) + ']').addClass('focus');
		} else {
			searchSuggestForm.find('.suggest_wrap ul li[data-index=' + (updown ? 0 : suggestList.length - 1) + ']').addClass('focus');
		}
		$(obj).val($('.suggest_wrap > .suggest_list > div > ul > .focus').attr('data-keyword'));
	}
}

function itemSuggestClick(obj) {
	itemSearchForm.keyword.value = $(obj).attr('data-keyword');
	itemSearchForm.submit();
}

function itemSearchCheck(){
	if (!itemSearchForm.keyword.value) {
		return false;
	}
	return true;
}