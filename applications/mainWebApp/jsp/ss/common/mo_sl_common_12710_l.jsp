<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명   : mo_sl_common_12720_l.jsp
* 기능     : 공통 우편번호 검색을 통해 조회된 목록_모바일용
* 작성일자 : 2017-02-17
* 작성자   : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    //getting dataset
	CO_MO_L_NEW_ADDRDataSet ds = (CO_MO_L_NEW_ADDRDataSet)request.getAttribute("ds");
%>
<addrlist>
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
		if(ds != null){
			CO_MO_L_NEW_ADDRCURCOMMLISTRecord rec = null;

			for(int i=0; i<ds.curcommlist.size(); i++){
				rec = (CO_MO_L_NEW_ADDRCURCOMMLISTRecord)ds.curcommlist.get(i);
%>
	<addrinfo>
		<zip><%=rec.zip %></zip>  <!-- 우편번호 -->
		<rd_addr><![CDATA[<%=rec.rd_addr %>]]></rd_addr> <!-- 도로명주소 -->
		<bldgnm><![CDATA[<%=rec.bldgnm %>]]></bldgnm>  <!-- 시군구용건물명 -->
		<rd_fulladdr><![CDATA[<%=rec.rd_fulladdr %>]]></rd_fulladdr>  <!-- 도로명주소전체 -->
		<bj_addr><![CDATA[<%=rec.bj_addr %>]]></bj_addr>		<!-- 번지주소 -->
		<bonm><![CDATA[<%=rec.bonm %>]]></bonm>				<!-- 센터명 -->
		<bldmngnn><%=rec.bldmngnn %></bldmngnn> <!-- 건물관리번호 -->
		<bj_addr_fst><![CDATA[<%=rec.bj_addr_fst %>]]></bj_addr_fst> <!-- 번지주소의 동 부분 -->
		<bj_addr_lst><%=rec.bj_addr_lst %></bj_addr_lst> <!-- 번지주소의 번지 부분 -->
		<bocd><%=rec.bocd %></bocd> <!-- 센터코드 -->
		<telno1><%=rec.telno1 %></telno1> <!-- 센터전화번호1 -->
		<telno2><%=rec.telno2 %></telno2> <!-- 센터전화번호2-->
		<telno3><%=rec.telno3 %></telno3> <!-- 센터전화번호3 -->
		<sellnetclsf><![CDATA[<%=rec.sellnetclsf %>]]></sellnetclsf>  <!-- 판매망구분 -->
	</addrinfo>
<%
			}
		}else{
%>
	<addrinfo>
		<zip></zip>
		<rd_addr></rd_addr>
		<bldgnm></bldgnm>
		<rd_fulladdr></rd_fulladdr>
		<bj_addr></bj_addr>
		<bonm></bonm>
		<bldmngnn></bldmngnn>
		<bj_addr_fst></bj_addr_fst>
		<bj_addr_lst></bj_addr_lst>
		<bocd></bocd>
		<telno1></telno1>
		<telno2></telno2>
		<telno3></telno3>
		<sellnetclsf></sellnetclsf>
	</addrinfo>
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
	<addrinfo>
		<zip></zip>
		<rd_addr></rd_addr>
		<bldgnm></bldgnm>
		<rd_fulladdr></rd_fulladdr>
		<bj_addr></bj_addr>
		<bonm></bonm>
		<bldmngnn></bldmngnn>
		<bj_addr_fst></bj_addr_fst>
		<bj_addr_lst></bj_addr_lst>
		<bocd></bocd>
		<telno1></telno1>
		<telno2></telno2>
		<telno3></telno3>
		<sellnetclsf></sellnetclsf>
	</addrinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<totalcnt></totalcnt>
	<addrinfo>
		<zip></zip>
		<rd_addr></rd_addr>
		<bldgnm></bldgnm>
		<rd_fulladdr></rd_fulladdr>
		<bj_addr></bj_addr>
		<bonm></bonm>
		<bldmngnn></bldmngnn>
		<bj_addr_fst></bj_addr_fst>
		<bj_addr_lst></bj_addr_lst>
		<bocd></bocd>
		<telno1></telno1>
		<telno2></telno2>
		<telno3></telno3>
		<sellnetclsf></sellnetclsf>
	</addrinfo>
<%
	}
%>
</addrlist>