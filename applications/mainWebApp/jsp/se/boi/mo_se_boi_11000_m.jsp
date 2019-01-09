<?xml version="1.0" encoding="EUC-KR"?>
<%@ page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/se/comm_jsp/se_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_se_boi_11000_m.jsp_모바일용
* 기능       :  센터정보관리-초기화면
* 작성일자   :  2016-12-01
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SE_BOI_1000_MDataSet ds = ( SE_BOI_1000_MDataSet )request.getAttribute("ds");  // request dataset
%>
<sech_list>
<%
	if(ds != null){

		if(ds.getErrcode()==null || ds.getErrcode().equals("")){
%>
<errinfo>
	<errcode></errcode> 																<!-- 에러코드 -->
	<errmsg></errmsg>																	<!-- 에러메시지 -->
</errinfo>
<!-- 지역리스트시작 -->
<%
			SE_BOI_1000_MCOMMCDCUR2Record rec1 = null;
			for(int i=0; i<ds.commcdcur2.size(); i++){
				rec1 = (SE_BOI_1000_MCOMMCDCUR2Record)ds.commcdcur2.get(i);

					String areacd = rec1.cd;
					String areanm = rec1.cdnm;
%>
	<area_info>
		<areacd><%=areacd %></areacd>												<!-- 지역코드 -->
		<areanm><![CDATA[<%=areanm %>]]></areanm>									<!-- 지역코드명 -->
	</area_info>
<%
				}
%>
<!-- 지역리스트 끝 -->
<!-- 계약리스트 시작 -->
<%
			SE_BOI_1000_MCOMMCDCUR3Record rec2 = null;
			for(int i=0; i<ds.commcdcur3.size(); i++){
				rec2 = (SE_BOI_1000_MCOMMCDCUR3Record)ds.commcdcur3.get(i);

				String cntrcd = rec2.cd;
				String cntrnm = rec2.cdnm;
%>
	<cntr_info>
		<cntrcd><%=cntrcd %></cntrcd>												<!-- 계약코드 -->
		<cntrnm><![CDATA[<%=cntrnm %>]]></cntrnm>									<!-- 계약코드명 -->
	</cntr_info>
<%
			}
%>
<!-- 계약리스트 끝 -->
<%
		// 에러코드가 있을때
		} else {
%>
<errinfo>
	<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 		<!-- 에러코드 -->
	<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>			<!-- 에러메시지 -->
</errinfo>
	<area_info>
		<areacd></areacd>																	<!-- 지역코드 -->
		<areanm></areanm>																	<!-- 지역코드명 -->
	</area_info>
	<cntr_info>
		<cntrcd></cntrcd>																	<!-- 계약코드 -->
		<cntrnm></cntrnm>																	<!-- 계약코드명 -->
	</cntr_info>
<%
		}
	// ds가 널일때
	} else {
%>
<errinfo>
	<errcode><![CDATA[-9999]]></errcode>							<!-- 에러코드 -->
	<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>		<!-- 에러메시지 -->
</errinfo>
	<area_info>
		<areacd></areacd>																	<!-- 지역코드 -->
		<areanm></areanm>																	<!-- 지역코드명 -->
	</area_info>
	<cntr_info>
		<cntrcd></cntrcd>																	<!-- 계약코드 -->
		<cntrnm></cntrnm>																	<!-- 계약코드명 -->
	</cntr_info>
<%
	}
%>
</sech_list>
