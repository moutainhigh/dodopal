<div class="header-top">
	<div class="w1030 clearfix">
		<p class="header-top-left" title="都都宝-24小时免费服务电话"><i class="phone-icon"></i>400-817-1000</p>
		<div class="warning"><span></span></div>
		<ul class="header-top-right clearfix">
			<li><a href="${base}/ddp/showAccountSetInfo">您好，${(sessionUser.merUserNickName)!}</a></li>
			<li><a href="${base}/logout">退出</a></li>
		</ul>
	</div>
</div>
<div class="wd-header">
	<div class="w1030 clearfix"> <a class="dodopal-logo" href="${base}/login"></a>
		<div class="header-nav">
			<ul class="clearfix">
			   <@sec.accessControl permission="ddp">
				<li><a href="javascript:void(0);">我的都都宝<i></i></a></li>
				</@sec.accessControl>
				<@sec.accessControl permission="tran">
				<li><a href="javascript:void(0);">交易记录<i></i></a></li>
				</@sec.accessControl>
				<@sec.accessControl permission="app">
				<li><a href="javascript:void(0);">应用中心<i></i></a></li>
				</@sec.accessControl>
				<@sec.accessControl permission="merchant">
				<li><a href="javascript:void(0);">商户管理<i></i></a></li>
				</@sec.accessControl>
				
			</ul>
		</div>
	</div>
</div>
<div class="header-inr-nav">
	<div class="w1030">
		<@sec.accessControl permission="ddp">
		<ul class="clearfix"  style="display:none;">
			<li><a href="${base}/index">首页</a></li>
			<@sec.accessControl permission="ddp.recharge">
		    <li><a href="${base}/ddp/recharge">账户充值</a></li>
			</@sec.accessControl>
			<@sec.accessControl permission="ddp.transfer">
			<li><a href="${base}/ddp/transfer">转账</a></li>
			</@sec.accessControl>
			<@sec.accessControl permission="ddp.acct">
			<li><a href="${base}/ddp/showAccountSetInfo">账户设置</a></li>
			</@sec.accessControl>
			<@sec.accessControl permission="ddp.amt">
			<li><a href="${base}/ddp/showAccountChange">资金变更记录</a></li>
			</@sec.accessControl>
			<@sec.accessControl permission="ddp.profit">
				<li><a href="${base}/ddp/profitManage">分润查询</a></li>
			</@sec.accessControl>
			<@sec.accessControl permission="ddp.card">
			    <li><a href="${base}/ddp/card">卡片管理</a></li>
			</@sec.accessControl>
			<@sec.accessControl permission="ddp.limit">
			    <li><a href="${base}/ddp/merLimitMgmt">额度提取管理</a></li>
			</@sec.accessControl>
		</ul>
		</@sec.accessControl>
		<@sec.accessControl permission="tran">
		<ul class="clearfix" style="display:none;">
			<@sec.accessControl permission="tran.record">
				<li><a href="${base}/tran/record">交易记录</a></li>
			</@sec.accessControl>
			<@sec.accessControl permission="tran.card">
			<li><a href="${base}/tran/cardRecord">卡片交易记录</a></li>
			</@sec.accessControl>
			<@sec.accessControl permission="tran.history.merchant">
			<li><a href="${base}/merJointQuery/toChargeOrderPage">历史交易记录</a></li>
			</@sec.accessControl>
			<@sec.accessControl permission="tran.history.proxy">
			<li><a href="${base}/tran/cardTradeList">历史交易记录</a></li>
			</@sec.accessControl>
		</ul>
		</@sec.accessControl>
		<@sec.accessControl permission="app">
		<ul class="clearfix" style="display:none;">	
			<@sec.accessControl permission="app.product">	
			<li><a href="${base}/application/toApplication" >应用产品</a></li>
			</@sec.accessControl>
			<@sec.accessControl permission="app.prdmgmt">	
			<li><a href="${base}/product/toProductMge">产品管理</a></li>
			</@sec.accessControl>
		</ul>
		</@sec.accessControl>
		
		<@sec.accessControl permission="merchant">
		<ul class="clearfix">
			<@sec.accessControl permission="merchant.user">
			<li>
					<a href="${base}/merchantUser/merchantUserMgmt">用户管理</a>
			</li>
			</@sec.accessControl>
			<@sec.accessControl permission="merchant.role">
			<li>
					<a href="${base}/merchantRole/merchantRoleMgmt">角色管理</a>
			</li>
			</@sec.accessControl>
			<@sec.accessControl permission="merchant.pos">
			<li>
				<a href="${base}/pos/toPosList">POS管理</a>
			</li>
			</@sec.accessControl>
			<@sec.accessControl permission="merchant.child">
			<li>
					<a href="${base}/childMerchant/childMerchantTypeMgr">子商户管理</a>
			</li>
			</@sec.accessControl>
			<@sec.accessControl permission="merchant.dep">
			<li>
					<a href="${base}/merchantGroupDep/merchantDepMgmt">部门管理</a>
			</li>
			</@sec.accessControl>
			<@sec.accessControl permission="merchant.ps">
			<li>
					<a href="${base}/merchantGroupUser/merchantGroupUserMgmt">人员管理</a>
			</li>
			</@sec.accessControl>
			<@sec.accessControl permission="merchant.info">
			<li>
					<a href="${base}/merchant/showMerchantInfo">商户信息</a>
			</li>
			</@sec.accessControl>
			
			<@sec.accessControl permission="merchant.rebate">
			<li>
				<a href="${base}/merchant/merDiscount">折扣管理</a>
			</li>
			</@sec.accessControl>
			<@sec.accessControl permission="merchant.ordersum">
			<li><a href="${base}/businessOrder/toBusinessOrderPage">业务订单汇总</a></li>
			</@sec.accessControl>
		</ul>
		</@sec.accessControl>
		<@sec.accessControl permission="prvd">
		<ul class="clearfix">
		   <@sec.accessControl permission="prvd.merchant">
		     <li><a href="${base}/prvd/merchant">商户信息</a></li>
		    </@sec.accessControl>
		     <@sec.accessControl permission="prvd.pos">
			 <li><a href="${base}/prvd/rechargeForSupplier">POS信息管理</a></li>
			 </@sec.accessControl>
			 <@sec.accessControl permission="prvd.security">
		     <li><a href="${base}/supplier/showSupplierSecure">安全设置</a></li>
		     </@sec.accessControl>
		</ul>
		</@sec.accessControl>
	</div>
</div>
<div class="header-banner">
	<div class="w1030 clearfix">
		<div class="header-photo">
			<div class="bg01"></div>
			<img src="${styleUrl}/portal/images/img_code.png" alt="" /></div>
		<div class="header-txt-box">
			<p><i><span id="_timeText"></span>${(sessionUser.merUserNickName)!}</i></p><p>
			<#if sessionUser.merType !='99'>
			<span>商户名称：${(sessionUser.merName)!}</span>
			<i class="i-line">|</i>
			<span>业务城市：${(sessionUser.cityName)!}</span>
			<#else>
			<span>业务城市：${(sessionUser.cityName)!}</span>
			</#if>
			<i class="i-line">|</i>
			<span class="span01">上次登录时间：${(sessionUser.merUserLastLoginDate?string("yyyy-MM-dd HH:mm:ss"))!}</span></p>
		</div>
	</div>
</div>
<script type="text/javascript">
$(document).ready(function(e) {
	$('.bg-win,[js="clopop"]').click(function(){
		$(this).closest('.pop-win').hide();
	});
	$('.header-nav ul li').click(function(){
		var i=$(this).index();
		$('.header-nav ul li a').removeClass('on');
		$('.header-inr-nav ul').hide();
		$('.header-inr-nav ul').eq(i).show();
		$(this).find('a').addClass('on');
		var href = $('.header-inr-nav ul').eq(i).find('li').first().find('a').attr('href');		
		if(href!=''){
			window.location = href;
		}
	});
	if($('.header-inr-nav ul li a').hasClass('cur')){
		var i=$('.cur').closest('ul').index();
		$('.header-nav ul li a').removeClass('on').eq(i).addClass('on');
		$('.header-inr-nav ul').hide();
		$('.header-inr-nav ul').eq(i).show()
	};
	
	getText();
});
function popclo(obj){
	$(obj).closest('.pop-win').hide();
}

<#--openNewPage不要删除-->
function openNewPage(businesscode){
	ddpAjaxCall({
				url : $.base+"/application/checkAppStatus",
				data : businesscode,
				successFn : function(data) {
					if(data.code=="000000"){
						window.open($.base+"/application/toApplicationPage?businesscode="+businesscode,"app","","true");
					}else{
						$.messagerBox({type: 'warn', title:"温馨提示", msg: data.message});
					}
				}
				});
}


function getText(){
	var _date = new Date();
	var _time = _date.getHours();
	var _text = '';
	if(_time>=6&&_time<9){
	_text = '早上好,';
	}else if(_time>=9&&_time<11){
	_text = '上午好,';
	}else if(_time>=11&&_time<13){
	_text = '中午好,'
	}else if(_time>=13&&_time<17){
	_text = '下午好,';
	}else{
	_text = '晚上好,';
	}
	$("#_timeText").html(_text);
}


	var timer= setInterval(function(){
		$('.warning span').animate({'left':-230+'px'},10000,"linear").animate({'left':$('.warning').width()+'px'},0);
		},500);
</script>