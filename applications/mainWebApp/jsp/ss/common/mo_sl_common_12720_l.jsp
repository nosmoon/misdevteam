<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : mo_sl_common_12720_s.jsp
* 기능 : 도시이름으로 구/군 검색_모바일용
* 작성일자 : 2017-02-17
* 작성자 : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
   // dataset 인스턴스 선언부분
   chosun.ciis.ss.sal.common.ds.CO_L_NEWGUGUNDataSet ds = (chosun.ciis.ss.sal.common.ds.CO_L_NEWGUGUNDataSet)request.getAttribute("ds");  // request dataset
%>
<gugunlist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<%
		if (ds != null){
			for(int i=0; i<ds.curcommlist.size(); i++){
		    	chosun.ciis.ss.sal.common.rec.CO_L_NEWGUGUNCURCOMMLISTRecord rec = (chosun.ciis.ss.sal.common.rec.CO_L_NEWGUGUNCURCOMMLISTRecord)ds.curcommlist.get(i);
%>
	<guguninfo>
		<gugun><![CDATA[<%=rec.cicdynm %>]]></gugun>
	</guguninfo>
<%
			}
		}else{
%>
	<guguninfo>
		<gugun></gugun>
	</guguninfo>
<%
	}
%>
<%
	}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode>
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>
	</errinfo>
	<guguninfo>
		<gugun></gugun>
	</guguninfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<guguninfo>
		<gugun></gugun>
	</guguninfo>
<%
	}
%>
</gugunlist>