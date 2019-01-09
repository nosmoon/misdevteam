<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_ss_admin_12110_l.jsp
* 기능       : 기초정보관리-모바일관리-직원리스트_모바일용
* 작성일자   : 2017-01-23
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_L_LOGINAPLC_APRVDataSet ds = (SS_MO_L_LOGINAPLC_APRVDataSet)request.getAttribute("ds");
%>
<boemplist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
	<totalcnt><%=ds.totalcnt%></totalcnt>
<%
	if( ds.aplclist.size() > 0 ){
		SS_MO_L_LOGINAPLC_APRVAPLCLISTRecord rec = null;
		for( int i=0; i < ds.aplclist.size(); i++ ){
			rec = (SS_MO_L_LOGINAPLC_APRVAPLCLISTRecord)ds.aplclist.get( i );
%>
<boempinfo>
	<deptcd><%= rec.deptcd %></deptcd> <!-- 팀코드 -->
	<deptnm><![CDATA[<%= rec.deptnm %>]]></deptnm> <!-- 팀명 -->
	<partcd><%= rec.partcd %></partcd> <!-- 파트코드 -->
	<partnm><![CDATA[<%= rec.partnm %>]]></partnm><!-- 파트명 -->
	<areacd><%= rec.areacd %></areacd> <!-- 지역코드 -->
	<areanm><![CDATA[<%= rec.areanm %>]]></areanm> <!-- 지역명 -->
	<bocd><%= rec.bocd %></bocd> <!-- 센터코드 -->
	<bonm><![CDATA[<%= rec.bonm %>]]></bonm><!-- 센터명 -->
	<boemp_no><%= rec.boemp_no %></boemp_no> <!-- 직원코드 -->
	<dutycd><%= rec.dutycd %></dutycd> <!-- 직책코드 -->
	<dutynm><![CDATA[<%= rec.dutynm %>]]></dutynm><!-- 직책명 -->
	<flnm><![CDATA[<%= rec.flnm %>]]></flnm><!-- 직원명 -->
	<boemp_id><%= rec.boemp_id %></boemp_id><!-- 모바일ID -->
	<ptph><%= rec.crm_ptph %></ptph><!-- 휴대폰번호 -->
	<maprvstatcd><%= rec.maprvstatcd %></maprvstatcd><!-- 승인상태코드 -->
	<maprvstatnm><![CDATA[<%= rec.maprvstatnm %>]]></maprvstatnm><!-- 승인상태코드명 -->
</boempinfo>
<%
			}
		}else{
%>
<boempinfo>
	<deptcd></deptcd>
	<deptnm></deptnm>
	<partcd></partcd>
	<partnm></partnm>
	<areacd></areacd>
	<areanm></areanm>
	<bocd></bocd>
	<bonm></bonm>
	<boemp_no></boemp_no>
	<dutycd></dutycd>
	<dutynm></dutynm>
	<flnm></flnm>
	<boemp_id></boemp_id>
	<ptph></ptph>
	<maprvstatcd></maprvstatcd>
	<maprvstatnm></maprvstatnm>
</boempinfo>
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
	<totalcnt></totalcnt>
<boempinfo>
	<deptcd></deptcd>
	<deptnm></deptnm>
	<partcd></partcd>
	<partnm></partnm>
	<areacd></areacd>
	<areanm></areanm>
	<bocd></bocd>
	<bonm></bonm>
	<boemp_no></boemp_no>
	<dutycd></dutycd>
	<dutynm></dutynm>
	<flnm></flnm>
	<boemp_id></boemp_id>
	<ptph></ptph>
	<maprvstatcd></maprvstatcd>
	<maprvstatnm></maprvstatnm>
</boempinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<totalcnt></totalcnt>
<boempinfo>
	<deptcd></deptcd>
	<deptnm></deptnm>
	<partcd></partcd>
	<partnm></partnm>
	<areacd></areacd>
	<areanm></areanm>
	<bocd></bocd>
	<bonm></bonm>
	<boemp_no></boemp_no>
	<dutycd></dutycd>
	<dutynm></dutynm>
	<flnm></flnm>
	<boemp_id></boemp_id>
	<ptph></ptph>
	<maprvstatcd></maprvstatcd>
	<maprvstatnm></maprvstatnm>
</boempinfo>
<%
	}
%>
</boemplist>