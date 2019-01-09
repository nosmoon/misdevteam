<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=EUC-KR" %>
<%@ include file="/jsp/se/comm_jsp/se_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_se_sal_12321_l.jsp
* 기능       : 입금관리-지대입금관리-지대입금률현황 / 모바일) 지대마감-지대입금률현황
* 작성일자   : 2017-05-24
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SE_MO_RCP_2510_LDataSet ds = (SE_MO_RCP_2510_LDataSet)request.getAttribute("ds");
%>
<curlist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>


<%
	if( ds.curlist.size() > 0 ){
		SE_MO_RCP_2510_LCURLISTRecord rec = null;
		for( int i=0; i < ds.curlist.size(); i++ ){
			rec = (SE_MO_RCP_2510_LCURLISTRecord)ds.curlist.get( i );
%>
	<curlistinfo>
		<dept_nm><![CDATA[<%= rec.dept_nm %>]]></dept_nm> <!--팀-->
		<part_nm><![CDATA[<%= rec.part_nm %>]]></part_nm> <!--파트-->
		<area_nm><![CDATA[<%= rec.area_nm %>]]></area_nm> <!--부서-->
		<bo_cd><%= rec.bo_cd %></bo_cd> <!--센터코드-->
		<bo_seq><%= rec.bo_seq %></bo_seq> <!--센터정렬순서-->
		<bo_nm><![CDATA[<%= rec.bo_nm %>]]></bo_nm> <!--센터명-->
		<bo_head_nm><![CDATA[<%= rec.bo_head_nm %>]]></bo_head_nm> <!--센터대표명-->
		<cyov_bal><%= rec.cyov_bal %></cyov_bal> <!--전월이월잔액-->
		<net_sale_amt><%= rec.net_sale_amt %></net_sale_amt><!--순매출액-->
		<today_amt><%= rec.today_amt %></today_amt><!--금일입금액-->
		<pdlv_altn_amt><%= rec.pdlv_altn_amt %></pdlv_altn_amt><!--우송대체금액-->
		<acml_amt><%= rec.acml_amt %></acml_amt><!--입금계-->
		<bal_amt><%= rec.bal_amt %></bal_amt><!--미수금액-->
		<rcpm_rate><%= rec.rcpm_rate %></rcpm_rate><!--입금률-->

	</curlistinfo>
<%
			}
		}else{
%>
	<curlistinfo>
		<dept_nm></dept_nm>
		<part_nm></part_nm>
		<area_nm></area_nm>
		<bo_cd></bo_cd>
		<bo_seq></bo_seq>
		<bo_nm></bo_nm>
		<bo_head_nm></bo_head_nm>
		<cyov_bal></cyov_bal>
		<net_sale_amt></net_sale_amt>
		<today_amt></today_amt>
		<pdlv_altn_amt></pdlv_altn_amt>
		<acml_amt></acml_amt>
		<bal_amt></bal_amt>
		<rcpm_rate></rcpm_rate>
	</curlistinfo>
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
	<curlistinfo>
		<dept_nm></dept_nm>
		<part_nm></part_nm>
		<area_nm></area_nm>
		<bo_cd></bo_cd>
		<bo_seq></bo_seq>
		<bo_nm></bo_nm>
		<bo_head_nm></bo_head_nm>
		<cyov_bal></cyov_bal>
		<net_sale_amt></net_sale_amt>
		<today_amt></today_amt>
		<pdlv_altn_amt></pdlv_altn_amt>
		<acml_amt></acml_amt>
		<bal_amt></bal_amt>
		<rcpm_rate></rcpm_rate>
	</curlistinfo>
<%
		}
	}else{
%>

	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
	<curlistinfo>
		<dept_nm></dept_nm>
		<part_nm></part_nm>
		<area_nm></area_nm>
		<bo_cd></bo_cd>
		<bo_seq></bo_seq>
		<bo_nm></bo_nm>
		<bo_head_nm></bo_head_nm>
		<cyov_bal></cyov_bal>
		<net_sale_amt></net_sale_amt>
		<today_amt></today_amt>
		<pdlv_altn_amt></pdlv_altn_amt>
		<acml_amt></acml_amt>
		<bal_amt></bal_amt>
		<rcpm_rate></rcpm_rate>
	</curlistinfo>
<%
	}
%>
</curlist>