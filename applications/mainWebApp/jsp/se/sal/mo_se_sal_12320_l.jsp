<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=EUC-KR" %>
<%@ include file="/jsp/se/comm_jsp/se_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_se_sal_12320_l.jsp
* 기능       :
* 작성일자   :
* 작성자     :
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
    SE_MO_SAL_2320_LDataSet ds = ( SE_MO_SAL_2320_LDataSet )request.getAttribute("ds");  // request dataset
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
<!-- 출장전자료리스트 시작 -->
<%
			if( ds.curlist.size() > 0 ){
				SE_MO_SAL_2320_LCURLISTRecord rec = null;
				for( int i=0; i<ds.curlist.size(); i++ ){
					rec = ( SE_MO_SAL_2320_LCURLISTRecord )ds.curlist.get( i );
%>
	<curlistinfo>
		<bo_nm><![CDATA[<%=rec.bo_nm%>]]></bo_nm>									<!-- 센터 -->
		<bo_head_nm><![CDATA[<%=rec.bo_head_nm%>]]></bo_head_nm>					<!-- 센터대표 -->
		<net_sale_amt><%=rec.net_sale_amt%></net_sale_amt>							<!-- 본사지대 -->
		<app_gurt><%=rec.app_gurt%></app_gurt>										<!-- 추가보증금 -->
		<net_sale_amt_610><%=rec.net_sale_amt_610%></net_sale_amt_610>				<!-- 스포츠지대 -->
		<smt_amt1><%=rec.smt_amt1%></smt_amt1>										<!-- 합계 -->
		<compen_divn_amt><%=rec.compen_divn_amt%></compen_divn_amt>					<!-- 판촉물계산서 -->
		<tax_compen_divn_amt><%=rec.tax_compen_divn_amt%></tax_compen_divn_amt>		<!-- 판촉물세금계산서 -->
		<vat_compen_divn_amt><%=rec.vat_compen_divn_amt%></vat_compen_divn_amt>		<!-- 판촉물부가세 -->
		<smt_amt2><%=rec.smt_amt2%></smt_amt2>										<!-- 판촉물합계 -->
		<pdlv_altn_amt><%= rec.pdlv_altn_amt %></pdlv_altn_amt><!-- 우송대체금액 -->
		<smt><%= rec.smt  %></smt><!-- 총계 -->
	</curlistinfo>
<%
				}
			}else{
%>
	<curlistinfo>
		<bo_nm></bo_nm>																<!-- 센터 -->
		<bo_head_nm></bo_head_nm>													<!-- 센터대표 -->
		<net_sale_amt></net_sale_amt>												<!-- 본사지대 -->
		<app_gurt></app_gurt>														<!-- 추가보증금 -->
		<net_sale_amt_610></net_sale_amt_610>										<!-- 스포츠지대 -->
		<smt_amt1></smt_amt1>														<!-- 합계 -->
		<compen_divn_amt></compen_divn_amt>											<!-- 판촉물계산서 -->
		<tax_compen_divn_amt></tax_compen_divn_amt>									<!-- 판촉물세금계산서 -->
		<vat_compen_divn_amt></vat_compen_divn_amt>									<!-- 판촉물부가세 -->
		<smt_amt2></smt_amt2>														<!-- 판촉물합계 -->
		<pdlv_altn_amt></pdlv_altn_amt><!-- 우송대체금액 -->
		<smt></smt><!-- 총계 -->
	</curlistinfo>
<%
			}
%>
<!-- 출장전자료리스트 끝 -->
<%
		}else{
%>
	<errinfo>
		<errcode><![CDATA[<%=ds.getErrcode() %>]]></errcode> 		<!-- 에러코드 -->
		<errmsg><![CDATA[<%=ds.getErrmsg() %>]]></errmsg>			<!-- 에러메시지 -->
	</errinfo>
	<curlistinfo>
		<bo_nm></bo_nm>																<!-- 센터 -->
		<bo_head_nm></bo_head_nm>													<!-- 센터대표 -->
		<net_sale_amt></net_sale_amt>												<!-- 본사지대 -->
		<app_gurt></app_gurt>														<!-- 추가보증금 -->
		<net_sale_amt_610></net_sale_amt_610>										<!-- 스포츠지대 -->
		<smt_amt1></smt_amt1>														<!-- 합계 -->
		<compen_divn_amt></compen_divn_amt>											<!-- 판촉물계산서 -->
		<tax_compen_divn_amt></tax_compen_divn_amt>									<!-- 판촉물세금계산서 -->
		<vat_compen_divn_amt></vat_compen_divn_amt>									<!-- 판촉물부가세 -->
		<smt_amt2></smt_amt2>														<!-- 판촉물합계 -->
		<pdlv_altn_amt></pdlv_altn_amt><!-- 우송대체금액 -->
		<smt></smt><!-- 총계 -->
	</curlistinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>																	<!-- 에러코드 -->
		<errmsg><![CDATA[시스템에 문제가 발생하였습니다. 관리자에게 문의하시기 바랍니다.]]></errmsg>		<!-- 에러메시지 -->
	</errinfo>
	<curlistinfo>
		<bo_nm></bo_nm>																<!-- 센터 -->
		<bo_head_nm></bo_head_nm>													<!-- 센터대표 -->
		<net_sale_amt></net_sale_amt>												<!-- 본사지대 -->
		<app_gurt></app_gurt>														<!-- 추가보증금 -->
		<net_sale_amt_610></net_sale_amt_610>										<!-- 스포츠지대 -->
		<smt_amt1></smt_amt1>														<!-- 합계 -->
		<compen_divn_amt></compen_divn_amt>											<!-- 판촉물계산서 -->
		<tax_compen_divn_amt></tax_compen_divn_amt>									<!-- 판촉물세금계산서 -->
		<vat_compen_divn_amt></vat_compen_divn_amt>									<!-- 판촉물부가세 -->
		<smt_amt2></smt_amt2>														<!-- 판촉물합계 -->
		<area_nm></area_nm>															<!-- 지역명 -->
		<deposit_only_bank_account></deposit_only_bank_account>						<!-- 가상계좌 -->
		<pdlv_altn_amt></pdlv_altn_amt><!-- 우송대체금액 -->
		<smt></smt><!-- 총계 -->
	</curlistinfo>
<%
	}
%>
</curlist>