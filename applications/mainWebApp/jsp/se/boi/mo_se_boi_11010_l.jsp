<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=EUC-KR" %>
<%@ include file="/jsp/se/comm_jsp/se_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_se_boi_11010_l.jsp
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
    SE_MO_BOI_1010_LDataSet ds = ( SE_MO_BOI_1010_LDataSet )request.getAttribute("ds");  // request dataset
%>
<curlist>
<%
	if( ds != null ){
		if( ds.getErrcode() == null || ds.getErrcode().equals( "" ) ){
%>
	<errinfo>
		<errcode></errcode> 																<!-- 에러코드 -->
		<errmsg></errmsg>																	<!-- 에러메시지 -->
	</errinfo>
<%
			SE_MO_BOI_1010_LCURLISTRecord rec = null;
			for( int i=0; i<ds.curlist.size(); i++ ){
				rec = ( SE_MO_BOI_1010_LCURLISTRecord )ds.curlist.get( i );
%>
	<boinfo>
		<dept_nm><![CDATA[<%=rec.dept_nm%>]]></dept_nm>									<!-- 부서명 -->
		<part_nm><![CDATA[<%=rec.part_nm%>]]></part_nm>									<!-- 파트명 -->
		<area_nm><![CDATA[<%=rec.area_nm%>]]></area_nm>									<!-- 지역명 -->
		<bo_cd><%=rec.bo_cd%></bo_cd>													<!-- 지국코드 -->
		<bo_seq><%=rec.bo_seq%></bo_seq>													<!-- 지국순번 -->
		<bo_nm><![CDATA[<%=rec.bo_nm%>]]></bo_nm>										<!-- 지국명 -->
		<bo_head_nm><![CDATA[<%=rec.bo_head_nm%>]]></bo_head_nm>							<!-- 지국장명 -->
		<bo_head_prn><%=rec.bo_head_prn%></bo_head_prn>									<!-- 지국장주민번호 -->
		<chrg_flnm><![CDATA[<%=rec.chrg_flnm%>]]></chrg_flnm>							<!-- 지국장명 -->
		<bo_telno><%=rec.bo_telno%></bo_telno>											<!-- 지국전화번호 -->
		<bo_cntr_dt><%=rec.bo_cntr_dt%></bo_cntr_dt>										<!-- 계약일자 -->
		<cntr_statnm><![CDATA[<%=rec.cntr_statnm%>]]></cntr_statnm>						<!-- 계약명 -->
		<bo_reg_clsf><%=rec.bo_reg_clsf%></bo_reg_clsf>									<!-- 등록코드 -->
		<bo_reg_clsf_nm><![CDATA[<%=rec.bo_reg_clsf_nm%>]]></bo_reg_clsf_nm>				<!-- 등록여부 -->
		<ern><%=rec.ern%></ern>															<!-- 사입자번호 -->
	</boinfo>
<%
			}
		}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 		<!-- 에러코드 -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>			<!-- 에러메시지 -->
	</errinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>																	<!-- 에러코드 -->
		<errmsg><![CDATA[시스템에 문제가 발생하였습니다. 관리자에게 문의하시기 바랍니다.]]></errmsg>		<!-- 에러메시지 -->
	</errinfo>
	<boinfo>
		<dept_nm></dept_nm>
		<part_nm></part_nm>
		<area_nm></area_nm>
		<bo_cd></bo_cd>
		<bo_seq></bo_seq>
		<bo_nm></bo_nm>
		<bo_head_nm></bo_head_nm>
		<bo_head_prn></bo_head_prn>
		<chrg_flnm></chrg_flnm>
		<bo_telno></bo_telno>
		<bo_cntr_dt></bo_cntr_dt>
		<cntr_statnm></cntr_statnm>
		<bo_reg_clsf></bo_reg_clsf>
		<bo_reg_clsf_nm></bo_reg_clsf_nm>
		<ern></ern>
	</boinfo>
<%
	}
%>
</curlist>