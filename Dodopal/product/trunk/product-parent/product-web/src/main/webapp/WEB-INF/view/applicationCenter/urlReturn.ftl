<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"><!-- InstanceBegin template="/Templates/template.dwt" codeOutsideHTMLIsLocked="false" -->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="x-ua-compatible" content="IE=edge" />
<!-- InstanceBeginEditable name="doctitle" -->
<title>跳转页面</title>
<#include "../include.ftl"/>
<!-- InstanceEndEditable -->
<script>
var soruce = '${soruce}';
var bcode = '${bcode}';

$(function() {
	 window.location.href=$.base+"/cardRecharge/toApplicationPage?bcode="+bcode+"&soruce="+soruce;
});

</script>

<!-- InstanceBeginEditable name="head" -->
<!-- InstanceEndEditable -->
</head>
<body>
</body>
</html>
