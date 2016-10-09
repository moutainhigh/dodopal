<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/template.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE" />
<!-- InstanceBeginEditable name="doctitle" -->
<#include "../include.ftl"/>
<!-- InstanceEndEditable -->
<script src="${scriptUrl}/common/jquery1.9.1/jquery-1.9.1.min.js"></script>
<script src="${base}/js/calendar.js" type="text/javascript"></script>
<script type="text/javascript">
var c = new Calendar("c");
document.write(c);
</script>
<link href="${styleUrl}/portal/css/calendar.css" rel="stylesheet" type="text/css" />
<link href="${styleUrl}/portal/css/base.css" rel="stylesheet" type="text/css" />
<link href="${styleUrl}/portal/css/index.css" rel="stylesheet" type="text/css" />
<!-- InstanceBeginEditable name="head" -->
<!-- InstanceEndEditable -->
<title>应用中心</title>
</head>
<body>
<#include "../header.ftl"/>
<div class="con-main"> <!-- InstanceBeginEditable name="main" -->
	<div class="application-center clearfix">
		<div class="app-left">
			<ul class="clearfix">
				<li class="snavi01"><a href="一卡通充值-应用产品.html" class="on"><span><i></i>一卡通充值</span></a></li>
				<li class="snavi02"><a href="批量充值-订单查询.html"><span><i></i>批量充值</span></a></li>
				<li class="snavi03"><a href="#"><span><i></i>手机话费</span></a></li>
				<li class="snavi04"><a href="#"><span><i></i>水费缴纳</span></a></li>
				<li class="snavi05"><a href="#"><span><i></i>电费缴纳</span></a></li>
				<li class="snavi06"><a href="#"><span><i></i>天然气缴纳</span></a></li>
				<li class="snavi07"><a href="#"><span><i></i>有线电视费</span></a></li>
			</ul>
		</div>
		<div class="app-right">
			<dl class="app-dl clearfix">
				<dt>所在城市：</dt>
				<dd class="clearfix">北京 [<a href="javascript:;" class="blue" js="setCity">切换城市</a>]
					<div class="set-city" style=" display: none;">
						<ul class="set-city-list">
							<li><a href="javascript:;" class="on">热门</a></li>
							<li><a href="javascript:;">ABCD</a></li>
							<li><a href="javascript:;">EFGH</a></li>
							<li><a href="javascript:;">JKLM</a></li>
							<li><a href="javascript:;">NOPQRS</a></li>
							<li><a href="javascript:;">TUVWX</a></li>
							<li><a href="javascript:;">YZ</a></li>
						</ul>
						<dl class="set-city-dl clearfix">
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
								</ul>
							</dd>
						</dl>
						<dl class="set-city-dl clearfix" style="display: none">
							<dt>A</dt>
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
								</ul>
							</dd>
							<dt>B</dt>
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
								</ul>
							</dd>
							<dt>C</dt>
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
								</ul>
							</dd>
						</dl>
						<dl class="set-city-dl clearfix" style="display: none">
							<dt>E</dt>
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
								</ul>
							</dd>
							<dt>F</dt>
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
								</ul>
							</dd>
							<dt>G</dt>
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
								</ul>
							</dd>
						</dl>
						<dl class="set-city-dl clearfix" style="display: none">
							<dt>G</dt>
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
								</ul>
							</dd>
							<dt>K</dt>
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
								</ul>
							</dd>
							<dt>L</dt>
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
								</ul>
							</dd>
						</dl>
						<dl class="set-city-dl clearfix" style="display: none">
							<dt>N</dt>
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
								</ul>
							</dd>
							<dt>O</dt>
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
								</ul>
							</dd>
							<dt>P</dt>
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
								</ul>
							</dd>
						</dl>
						<dl class="set-city-dl clearfix" style="display: none">
							<dt>T</dt>
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
								</ul>
							</dd>
							<dt>U</dt>
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
								</ul>
							</dd>
							<dt>V</dt>
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
								</ul>
							</dd>
						</dl>
						<dl class="set-city-dl clearfix" style="display: none">
							<dt>Y</dt>
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
								</ul>
							</dd>
							<dt>Z</dt>
							<dd>
								<ul class="clearfix">
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
									<li><a href="#">北京</a></li>
									<li><a href="#">西安</a></li>
									<li><a href="#">深圳</a></li>
									<li><a href="#">宁波</a></li>
								</ul>
							</dd>
						</dl>
					</div>
				</dd>
				<dt>充值金额：</dt>
				<dd class="recharge-amount"><a href="javascript:;">50<s></s></a><a href="javascript:;">100<s></s></a><a href="javascript:;">200<s></s></a></dd>
				<dt>充值订单：</dt>
				<dd>
					<div class="recharge-order">
						<table cellpadding="0" cellspacing="0" summary="">
							<tr>
								<th></th>
								<th>订单号</th>
								<th>充值金额（元）</th>
								<th>来源</th>
							</tr>
							<tr>
								<td><label><input type="radio" name="order1" /></label></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td><label><input type="radio" name="order1" /></label></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td><label><input type="radio" name="order1" /></label></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td><label><input type="radio" name="order1" /></label></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
						</table>
					</div>
				</dd>
				<dt>卡号：</dt>
				<dd class="clearfix">
					<p class="er-set"><i></i>请正确接入设备</p>
				</dd>
				<dt>卡余额：</dt>
				<dd>15.00 元</dd>
				<dt></dt>
				<dd class="btn-recharge"><a href="javascript:;" class="orange-btn-h32" js="qurren">立即充值</a></dd>
			</dl>
			<dl class="app-dl02">
				<dt>充值提示：</dt>
				<dd>1、充值充值提示提示<br />
					2、充值充值充值<br />
					3、提示提示</dd>
			</dl>
		</div>
	</div>
	<!-- InstanceEndEditable --> </div>
	
	<#include "../footer.ftl"/>
<!-- InstanceBeginEditable name="pop" --> 
<script type="text/javascript">
function fnokbtn(obj){
	$(obj).closest('[js="qurrenjiner"]').hide();
	$('[js="qurrenok"]').show();
}
$(document).ready(function(e) {
	var setcity=0;
	$('[js="setCity"]').click(function(event){
		  event.stopPropagation();
		$('.set-city').show();
		setcity=1;
	});
	
	$('body').click(function(){
		if(setcity=1){
			$('.set-city').hide();
		}
	});
	
	$('[js="qurren"]').click(function(){
		$('[js="qurrenjiner"]').show();
		
	});
	


	$('.set-city-list li').click(function(event){
		event.stopPropagation();
		var i=$(this).index();
		$('.set-city-list li').find('a').removeClass('on');
		$(this).find('a').addClass('on');
		$('.set-city-dl').eq(i).show().siblings('.set-city-dl').hide();
	});
	$('.set-city-dl li a').click(function(event){
		event.stopPropagation();
	});
	$('.header-inr-nav ul li a').each(function(){
		if($.trim($(this).text())=="应用产品"){
			$(this).addClass('cur');
		}
	});
	
	
	$('[js="pay-list"] li:gt(4)').hide();
	$('[js="pay-list"] li.only').show();
	var a=0;
	$('[js="pay-list"] li.only').click(function(){
		if(a==0){
			$('[js="pay-list"] li').show();
			a=1;
		}else{
			$('[js="pay-list"] li:gt(4)').hide();
			$('[js="pay-list"] li.only').show();
			a=0;
		}		
	});
$('.recharge-amount a').click(function(){
	$(this).addClass('a-click').siblings("a").removeClass("a-click");
});
$('.payway-ul input').click(function(){
	if(!$(this).attr('checked')){
		$(this).closest('.payway-ul').addClass('payway-ul-click');
	}else{
		$(this).closest('.payway-ul').removeClass('payway-ul-click');
	}
	
})
  $(".pay-navi-ul li").each(function(i){
  $(".pay-navi-ul li").eq(i).click(function(){
  $(this).addClass("on").siblings("li").removeClass("on");
  $(".pay-way-box ul").eq(i).show().siblings().hide();
  });
 });
 
 
});



</script>
<div style="display: none;" js="qurrenjiner" class="pop-win">
	<div class="bg-win"></div>
	<div class="pop-bor" style="height:310px; width: 410px; margin-top: -160px;"></div>
	<div class="pop-box" style="height:300px; width: 400px; margin-top: -155px;">
		<h3>提示信息</h3>
		<div class="popConts">
			<p class="f18 a-center mb20">请确认以下信息是否正确！</p>
			<ul class="jige-ul mb20">
				<li><em>商品名称：</em>一卡通充值</li>
				<li> <em>充值金额：</em><span class="orange">50</span>元</li>
				<li> <em>卡内余额：</em><span class="orange">65</span>元</li>
			</ul>
			<p class="mb10">
				<label>
					<input type="checkbox" />
					不再提示此消息</label>
			</p>
		</div>
		<ul class="ul-btn ul-btn01">
			<li><a onclick="fnokbtn(this)" class="pop-borange" href="javascript:;">确认</a></li>
			<li><a class="pop-bgrange" js="clopop" href="javascript:;">取消</a></li>
		</ul>
	</div>
</div>
<div style="display: none;" js="qurrenok" class="pop-win">
	<div class="bg-win"></div>
	<div class="pop-bor" style="height:410px; width: 410px; margin-top: -205px;"></div>
	<div class="pop-box" style="height:400px; width: 400px; margin-top: -200px;">
		<h3>充值结果</h3>
		<div class="popConts">
			<div class="ok-tips"><i></i>一卡通充值成功！</div>
			<div class="err-tips" style="display:none"><i></i>一卡通充值失败！</div>
			<dl>
				<dt>原因：</dt>
				<dd>原因原因原因原因原因原因
					原因原因原因原因原因原因。</dd>
			</dl>
			<ul class="jige-ul mb20">
				<li><em>订单编号：</em>XXXXXXXXXX</li>
				<li><em>充值金额：</em><span class="orange">50</span>元</li>
				<li><em>充值前卡内余额：</em><span class="orange">65</span>元</li>
				<li><em>充值后卡内余额：</em><span class="orange">65</span>元</li>
				<li><em>订单应收金额：</em><span class="orange">65</span>元</li>
				<li><em>订单实收金额：</em><span class="orange">65</span>元</li>
			</ul>
		</div>
		<ul class="ul-btn ul-btn01">
			<li><a onclick="popclo(this)" class="pop-borange" href="javascript:;">确认</a></li>
			<li><a class="pop-bgrange" js="clopop" href="javascript:;">取消</a></li>
		</ul>
	</div>
</div>
<!-- InstanceEndEditable --> 
<script type="text/javascript">
$(document).ready(function(e) {
	$('.com-table01 tr:even').find('td').css("background-color",'#f6fafe');
	$('.com-table02 tr:even').find('td').css("background-color",'#f6fafe');
	$('.bg-win,[js="clopop"]').click(function(){
		$(this).closest('.pop-win').hide();
	});
	$('.header-nav ul li').click(function(){
		var i=$(this).index();
		$('.header-nav ul li a').removeClass('on');
		$('.header-inr-nav ul').hide();
		$('.header-inr-nav ul').eq(i).show();
		$(this).find('a').addClass('on');
	});
	if($('.header-inr-nav ul li a').hasClass('cur')){
		var i=$('.cur').closest('ul').index();
		$('.header-nav ul li a').removeClass('on').eq(i).addClass('on');
		$('.header-inr-nav ul').hide();
		$('.header-inr-nav ul').eq(i).show()
	};
});

function popclo(obj){
	$(obj).closest('.pop-win').hide();
}

$('.footer-navi .more a').click(function(){
	if($(this).hasClass('open')){
		$(this).removeClass('open');
		$('.footer-navi ul').height(60);
	}else{
		$(this).addClass('open');
		$('.footer-navi ul').removeAttr('style');
	};

});
</script>
<script src="js/select.js" type="text/javascript"></script>
</body>
<!-- InstanceEnd --></html>
