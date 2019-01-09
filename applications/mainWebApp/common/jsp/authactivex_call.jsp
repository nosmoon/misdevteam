<%@page contentType="text/html;charset=UTF-8"%>
<%
	String site= (request.getParameter ("site") == null) ? "" : request.getParameter("site").trim();

	if(site != null && site.equals("eip")) {
		site = "http//eipt.chosun.com:7777";
	} else {
		site = "http://ciis.chosun.com:9020/common/jsp/logout.jsp";
	}

%>
<html>
<head>
<script src="/js/prototype.js" type="text/javascript"></script>
<script language="javascript">

	String.prototype.ltrim = function() {
    var re = /\s*((\S+\s*)*)/;
    return this.replace(re, "$1");
   }
 
   String.prototype.rtrim = function() {
    var re = /((\s*\S+)*)\s*/;
    return this.replace(re, "$1");
   }
 
   String.prototype.trim = function() {
    return this.ltrim().rtrim();
   }



function callactivex() {
	// fĢ¹®Z¿­ ¸¸µ鲢
	var	paramString = "";

	//"model_savetype=remove" + "&mvSeqnum=" + mvSeqnum;

	// »遦 ajaxȣĢ

	var	uri = "authactivex.jsp";		

	if(document.ipinfo.ipinfoflag.value == "false") { // parent °ª¿¡ ipinfoflag °ª; ¼³dȑµؠ»耫¿¹d

		var myReq = new Ajax.Request(uri,
			{
			  method: "post"
			, parameters: paramString 
			, onComplete: getResult
			}
		);
	
		function getResult(transport)
		{
			var	result = transport.responseText.trim();

			if(result=="N") {
				auth();
			} else {
				document.ipinfo.ipinfoflag.value ="true";
				return;
			}
		}
	} else {
		auth();
	}
}

function idpw() {
	// fĢ¹®Z¿­ ¸¸µ鲢
	var	paramString = "";

	//"model_savetype=remove" + "&mvSeqnum=" + mvSeqnum;

	// »遦 ajaxȣĢ

	paramString = "uid=da20702&pw=1234";

	var	uri = "pwcheck.jsp";		


		var myReq = new Ajax.Request(uri,
			{
			  method: "post"
			, parameters: paramString 
			, onComplete: getResult
			}
		);
	
		function getResult(transport)
		{
			var	result = transport.responseText.trim();

			alert(result);
		}
}

function auth() {
	if (ChosunAuth2.IsValid() == 0) {
	     usbserial = ChosunAuth2.GetSerial();
	} else {
	    usbserial = "Nothing Key";
		alert(usbserial);
		location.href = "<%=site%>";
	}
}

</script>

<!--
<BODY onload="idpw();">
-->
<BODY onload="callactivex();">
	<object id="ChosunAuth2" width=0 height=0 classid="CLSID:98652349-A6FA-4DA2-9C44-498A1C7C1352"  codebase="http://220.73.135.221:9020/html/authactivex/ChosunAuth2.cab#version=1,0,0,1" onerror="javascript:window.alert('ActiveX ŁƮ·Ҁ» ¼³ġȘ ½ñ࠹ٶ�.')">

	</object>
<form name="ipinfo">
<input type="hidden" name="ipinfoflag" value="false">
</form>
</BODY>
 
<%-- ´ٸ¥ ¹溽 
	var myReq = new Ajax.Request(uri,
		{
		  method: "post"
		, parameters: paramString 
		, onComplete: function(transport)
		{
			var	result = transport.responseText;
			//var	result2 = transport.responseXML;

			if(result=="N") {
				auth();
			}
		}
		}
	);
--%>