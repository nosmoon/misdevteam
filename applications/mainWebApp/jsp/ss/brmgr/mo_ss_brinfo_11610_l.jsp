<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_ss_brinfo_11610_l.jsp
* 기능       : 판매-발송관리-마감관리-발송노선 조회_모바일용
* 작성일자   : 2016-12-28
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_L_BSNSDataSet ds = (SS_MO_L_BSNSDataSet)request.getAttribute("ds");
%>
<bsnslist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<%
	if( ds.bsnslist.size() > 0 ){
		SS_MO_L_BSNSBSNSLISTRecord rec = null;
		for( int i=0; i < ds.bsnslist.size(); i++ ){
			rec = (SS_MO_L_BSNSBSNSLISTRecord)ds.bsnslist.get( i );
%>
<bsnsinfo>
	<jpcode><%= rec.jpcode %></jpcode> <!-- 노선코드 -->
	<jpname><![CDATA[<%= rec.jpname %>]]></jpname><!-- 노선명 -->
	<send_rank><%=rec.send_rank %></send_rank> <!-- 발송순서 -->
  	<bocd><%= rec.bocd %></bocd><!-- 센터코드 -->
	<bonm><![CDATA[<%= rec.jiname %>]]></bonm><!-- 센터명 -->
	<jbbalcha><%= rec.jbbalcha %></jbbalcha><!-- 발차시간 -->
	<jbdotime><%= rec.jbdotime %></jbdotime><!-- 도착시간 -->
</bsnsinfo>
<%
			}
		}else{
%>
<bsnsinfo>
	<jpcode></jpcode>
	<jpname></jpname>
	<send_rank></send_rank>
  	<bocd></bocd>
	<bonm></bonm>
	<jbbalcha></jbbalcha>
	<jbdotime></jbdotime>
</bsnsinfo>
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
<bsnsinfo>
	<jpcode></jpcode>
	<jpname></jpname>
	<send_rank></send_rank>
  	<bocd></bocd>
	<bonm></bonm>
	<jbbalcha></jbbalcha>
	<jbdotime></jbdotime>
</bsnsinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
<bsnsinfo>
	<jpcode></jpcode>
	<jpname></jpname>
	<send_rank></send_rank>
  	<bocd></bocd>
	<bonm></bonm>
	<jbbalcha></jbbalcha>
	<jbdotime></jbdotime>
</bsnsinfo>
<%
	}
%>
</bsnslist>