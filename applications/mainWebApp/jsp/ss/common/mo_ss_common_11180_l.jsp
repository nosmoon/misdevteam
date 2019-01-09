<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_ss_common_11180_l.jsp
* 기능       : 
* 작성일자   : 
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SL_MO_L_BOLISTDataSet ds = (SL_MO_L_BOLISTDataSet)request.getAttribute("ds");
%>
<bolistcur>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>


<%
	if( ds.bolistcur.size() > 0 ){
		SL_MO_L_BOLISTBOLISTCURRecord rec = null;
		for( int i=0; i < ds.bolistcur.size(); i++ ){
			rec = (SL_MO_L_BOLISTBOLISTCURRecord)ds.bolistcur.get( i );
%>
<boinfo>
     <bocd><%= rec.bocd %></bocd>                                               <!--지국지사코드      -->       
      <bonm><![CDATA[<%=rec.bonm %>]]></bonm>                              <!--지국지사명        -->
</boinfo>
<%
			}
		}else{
%>
<boinfo>
	<bocd></bocd>
	<bonm></bonm>
</boinfo>
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
<boinfo>
	<bocd></bocd>
	<bonm></bonm>
</boinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
<boinfo>
	<bocd></bocd>
	<bonm></bonm>
</boinfo>
<%
	}
%>
</bolistcur>