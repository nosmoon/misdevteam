<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=EUC-KR" %>
<%@ include file="/jsp/se/comm_jsp/se_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_se_boi_11040_s.jsp
* 기능       : 센터정보관리-신문대금담보-보증인등록의 리스트
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
    SE_BOI_1040_SDataSet ds = ( SE_BOI_1040_SDataSet )request.getAttribute("ds");  // request dataset
%>
<gurtlist>
<%
	if( ds != null ){
		if( (ds.getErrcode() == null || ds.getErrcode().equals( "" )) && ds.tasem_bogurtperscur.size() != 0  ){
%>
	<errinfo>
		<errcode></errcode> 																<!-- 에러코드 -->
		<errmsg></errmsg>																	<!-- 에러메시지 -->
	</errinfo>
<%
		SE_BOI_1040_STASEM_BOGURTPERSCURRecord rec = null;
			for( int i=0; i<ds.tasem_bogurtperscur.size(); i++ ){
				rec = ( SE_BOI_1040_STASEM_BOGURTPERSCURRecord )ds.tasem_bogurtperscur.get( i );
%>
	<gurtinfo>
		<bogurt_clsf><![CDATA[<%=ds.bogurt_clsf %>]]></bogurt_clsf> <!-- 보증인유형-->
		<gurt_pers_flnm><![CDATA[<%=rec.gurt_pers_flnm%>]]></gurt_pers_flnm>	<!-- 보증인성명 -->
		<jont_debt><![CDATA[<%=ds.jont_debtgurt_limt_amt %>]]></jont_debt> <!-- 보증 연대채무보증한도액-->
		<net_sale_amt><![CDATA[<%=ds.net_sale_amt %>]]></net_sale_amt>  <!-- 순매출액 -->
		<add_bogurt_amt><![CDATA[<%=ds.add_bogurt_amt %>]]></add_bogurt_amt>  <!-- 추가보증금 -->
		<mort_amt><![CDATA[<%=ds.mort_amt %>]]></mort_amt>	<!-- 근저당 설정 -->
		<insr_fr_dt><![CDATA[<%=ds.insr_fr_dt %>]]></insr_fr_dt>	<!-- 보험기간 -->
		<insr_to_dt><![CDATA[<%=ds.insr_to_dt %>]]></insr_to_dt>	<!-- 보험기간 -->
		<insr_amt><![CDATA[<%=ds.insr_amt %>]]></insr_amt>	<!-- 가입금액 -->
		<insr_prem><![CDATA[<%=ds.insr_prem %>]]></insr_prem>	<!-- 월보험료 -->
		<gurt_amt><%= ds.gurt_amt %></gurt_amt>		<!--현재보증금-->
		<prn><%=rec.prn%></prn>				<!-- 주민번호 -->
		<zip_1><%=rec.zip_1%></zip_1>		<!-- 우편번호1 -->
		<zip_2><%=rec.zip_2%></zip_2>		<!-- 우편번호1 -->
		<addr><![CDATA[<%=rec.addr%>]]></addr>			<!-- 주소 -->
		<dtls_addr><![CDATA[<%=rec.dtls_addr%>]]></dtls_addr>			<!-- 상세주소 -->
		<tel_no_1><%=rec.tel_no_1%></tel_no_1>		<!-- 전화번호(지역) -->
		<tel_no_2><%=rec.tel_no_2%></tel_no_2>		<!-- 전화번호(국) -->
		<tel_no_3><%=rec.tel_no_3%></tel_no_3>		<!-- 전화번호(번호) -->
		<ptph_no_1><%=rec.ptph_no_1%></ptph_no_1>		<!-- 휴대번호(통신) -->
		<ptph_no_2><%=rec.ptph_no_2%></ptph_no_2>		<!-- 휴대번호(국) -->
		<ptph_no_3><%=rec.ptph_no_3%></ptph_no_3>		<!-- 휴대번호(번호) -->
		<gurt_dt><%=rec.gurt_dt%></gurt_dt>						<!-- 보증계약일 -->
		<reg_resn><%=rec.reg_resn%></reg_resn>		<!-- 등록사유 -->
	</gurtinfo>
<%
			}
		} else if ((ds.getErrcode() == null || ds.getErrcode().equals( "" )) && ds.tasem_bogurtperscur.size()==0 && ds.bogurt_clsf !=null) {  
%>
	<gurtinfo>
		<bogurt_clsf><![CDATA[<%=ds.bogurt_clsf %>]]></bogurt_clsf> <!-- 보증인유형-->
		<gurt_pers_flnm></gurt_pers_flnm>	<!-- 보증인성명 -->
		<jont_debt><![CDATA[<%=ds.jont_debtgurt_limt_amt %>]]></jont_debt> <!-- 보증 연대채무보증한도액-->
		<net_sale_amt><![CDATA[<%=ds.net_sale_amt %>]]></net_sale_amt>  <!-- 순매출액 -->
		<add_bogurt_amt><![CDATA[<%=ds.add_bogurt_amt %>]]></add_bogurt_amt>  <!-- 추가보증금 -->
		<mort_amt><![CDATA[<%=ds.mort_amt %>]]></mort_amt>	<!-- 근저당 설정 -->
		<insr_fr_dt><![CDATA[<%=ds.insr_fr_dt %>]]></insr_fr_dt>	<!-- 보험기간 -->
		<insr_to_dt><![CDATA[<%=ds.insr_to_dt %>]]></insr_to_dt>	<!-- 보험기간 -->
		<insr_amt><![CDATA[<%=ds.insr_amt %>]]></insr_amt>	<!-- 가입금액 -->
		<insr_prem><![CDATA[<%=ds.insr_prem %>]]></insr_prem>	<!-- 월보험료 -->
		<gurt_amt><%= ds.gurt_amt %></gurt_amt>		<!--현재보증금-->	
		<prn></prn>				<!-- 주민번호 -->
		<zip_1></zip_1>		<!-- 우편번호1 -->
		<zip_2></zip_2>		<!-- 우편번호1 -->
		<addr></addr>			<!-- 주소 -->
		<dtls_addr></dtls_addr>			<!-- 상세주소 -->
		<tel_no_1></tel_no_1>		<!-- 전화번호(지역) -->
		<tel_no_2></tel_no_2>		<!-- 전화번호(국) -->
		<tel_no_3></tel_no_3>		<!-- 전화번호(번호) -->
		<ptph_no_1></ptph_no_1>		<!-- 휴대번호(통신) -->
		<ptph_no_2></ptph_no_2>		<!-- 휴대번호(국) -->
		<ptph_no_3></ptph_no_3>		<!-- 휴대번호(번호) -->
		<gurt_dt></gurt_dt>						<!-- 보증계약일 -->
		<reg_resn></reg_resn>		<!-- 등록사유 -->
	</gurtinfo>
	
<%			
		}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 		<!-- 에러코드 -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>			<!-- 에러메시지 -->
	</errinfo>
	<gurtinfo>
	<bogurt_clsf></bogurt_clsf> <!-- 보증인유형-->
	<gurt_pers_flnm></gurt_pers_flnm>	<!-- 보증인성명 -->
	<jont_debt></jont_debt> <!-- 보증 연대채무보증한도액-->
	<net_sale_amt></net_sale_amt>  <!-- 순매출액 -->
	<add_bogurt_amt></add_bogurt_amt>  <!-- 추가보증금 -->
	<mort_amt></mort_amt>	<!-- 근저당 설정 -->
	<insr_fr_dt></insr_fr_dt>	<!-- 보험기간 -->
	<insr_to_dt></insr_to_dt>	<!-- 보험기간 -->
	<insr_amt></insr_amt>	<!-- 가입금액 -->
	<insr_prem></insr_prem>	<!-- 월보험료 -->
	<gurt_amt></gurt_amt>		<!--현재보증금-->
	<prn></prn>				<!-- 주민번호 -->
	<zip_1></zip_1>		<!-- 우편번호1 -->
	<zip_2></zip_2>		<!-- 우편번호1 -->
	<addr></addr>			<!-- 주소 -->
	<dtls_addr></dtls_addr>			<!-- 상세주소 -->
	<tel_no_1></tel_no_1>		<!-- 전화번호(지역) -->
	<tel_no_2></tel_no_2>		<!-- 전화번호(국) -->
	<tel_no_3></tel_no_3>		<!-- 전화번호(번호) -->
	<ptph_no_1></ptph_no_1>		<!-- 휴대번호(통신) -->
	<ptph_no_2></ptph_no_2>		<!-- 휴대번호(국) -->
	<ptph_no_3></ptph_no_3>		<!-- 휴대번호(번호) -->
	<gurt_dt></gurt_dt>						<!-- 보증계약일 -->
	<reg_resn></reg_resn>		<!-- 등록사유 -->
	</gurtinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>																	<!-- 에러코드 -->
		<errmsg><![CDATA[시스템에 문제가 발생하였습니다. 관리자에게 문의하시기 바랍니다.]]></errmsg>		<!-- 에러메시지 -->
	</errinfo>
	</errinfo>
	<gurtinfo>
		<bogurt_clsf></bogurt_clsf> <!-- 보증인유형-->
		<gurt_pers_flnm></gurt_pers_flnm>	<!-- 보증인성명 -->
		<jont_debt></jont_debt> <!-- 보증 연대채무보증한도액-->
		<net_sale_amt></net_sale_amt>  <!-- 순매출액 -->
		<add_bogurt_amt></add_bogurt_amt>  <!-- 추가보증금 -->
		<mort_amt></mort_amt>	<!-- 근저당 설정 -->
		<insr_fr_dt></insr_fr_dt>	<!-- 보험기간 -->
		<insr_to_dt></insr_to_dt>	<!-- 보험기간 -->
 		<insr_amt></insr_amt>	<!-- 가입금액 -->
		<insr_prem></insr_prem>	<!-- 월보험료 -->
		<gurt_amt></gurt_amt>		<!--현재보증금-->
		<prn></prn>				<!-- 주민번호 -->
		<zip_1></zip_1>		<!-- 우편번호1 -->
		<zip_2></zip_2>		<!-- 우편번호1 -->
		<addr></addr>			<!-- 주소 -->
		<dtls_addr></dtls_addr>			<!-- 상세주소 -->
		<tel_no_1></tel_no_1>		<!-- 전화번호(지역) -->
		<tel_no_2></tel_no_2>		<!-- 전화번호(국) -->
		<tel_no_3></tel_no_3>		<!-- 전화번호(번호) -->
		<ptph_no_1></ptph_no_1>		<!-- 휴대번호(통신) -->
		<ptph_no_2></ptph_no_2>		<!-- 휴대번호(국) -->
		<ptph_no_3></ptph_no_3>		<!-- 휴대번호(번호) -->
		<gurt_dt></gurt_dt>						<!-- 보증계약일 -->
		<reg_resn></reg_resn>		<!-- 등록사유 -->
	</gurtinfo>
<%
	}
%>
</gurtlist>