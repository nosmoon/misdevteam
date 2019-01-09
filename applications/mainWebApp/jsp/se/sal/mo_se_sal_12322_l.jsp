<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=EUC-KR" %>
<%@ include file="/jsp/se/comm_jsp/se_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_se_sal_12322_l.jsp
* 기능       : 입금관리-지대입금관리-입금확인(가상계좌) / 모바일) 지대마감-입금확인(가상계좌)
* 작성일자   : 2017-05-30
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   :
* 수정자     :
* 수정일자   :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SE.RCP.DS.SE_RCP_1010_LDataSet ds = (SE.RCP.DS.SE_RCP_1010_LDataSet)request.getAttribute("ds");
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
		SE.RCP.REC.SE_RCP_1010_LCURLISTRecord rec = null;
		for( int i=0; i < ds.curlist.size(); i++ ){
			rec = (SE.RCP.REC.SE_RCP_1010_LCURLISTRecord)ds.curlist.get( i );
%>
	<curlistinfo>
		<cnfm_yn><%= rec.cnfm_yn %></cnfm_yn> <!--확인여부-->
		<area_nm><![CDATA[<%= rec.area_nm %>]]></area_nm> <!--지역-->
		<bo_cd><%= rec.bo_cd %></bo_cd> <!--센터코드 -->
		<bo_nm><![CDATA[<%= rec.bo_nm %></bo_nm>]]><!--센터명-->
		<chrg_flnm><![CDATA[<%= rec.chrg_flnm %>]]></chrg_flnm> <!--담당자-->
		<bo_head_nm><![CDATA[<%= rec.bo_head_nm %>]]></bo_head_nm> <!--센터대표명-->
		<tran_date><%= rec.tran_date %></tran_date> <!--입금일자-->
		<tran_time><%= rec.tran_time %></tran_time> <!--입금시간-->
		<rcpm_pers><![CDATA[<%= rec.rcpm_pers %>]]></rcpm_pers> <!--입금인-->
		<acct_no><%= rec.acct_no %></acct_no> <!--계좌번호-->
		<tran_amt><%= rec.tran_amt %></tran_amt> <!--입금액-->
	</curlistinfo>
<%
			}
		}else{
%>
	<curlistinfo>
		<cnfm_yn></cnfm_yn>
		<area_nm></area_nm>
		<bo_cd></bo_cd>
		<bo_nm></bo_nm>
		<chrg_flnm></chrg_flnm>
		<bo_head_nm></bo_head_nm>
		<tran_date></tran_date>
		<tran_time></tran_time>
		<rcpm_pers></rcpm_pers>
		<acct_no></acct_no>
		<tran_amt></tran_amt>
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
		<cnfm_yn></cnfm_yn>
		<area_nm></area_nm>
		<bo_cd></bo_cd>
		<bo_nm></bo_nm>
		<chrg_flnm></chrg_flnm>
		<bo_head_nm></bo_head_nm>
		<tran_date></tran_date>
		<tran_time></tran_time>
		<rcpm_pers></rcpm_pers>
		<acct_no></acct_no>
		<tran_amt></tran_amt>
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
		<cnfm_yn></cnfm_yn>
		<area_nm></area_nm>
		<bo_cd></bo_cd>
		<bo_nm></bo_nm>
		<chrg_flnm></chrg_flnm>
		<bo_head_nm></bo_head_nm>
		<tran_date></tran_date>
		<tran_time></tran_time>
		<rcpm_pers></rcpm_pers>
		<acct_no></acct_no>
		<tran_amt></tran_amt>
	</curlistinfo>
<%
	}
%>
</curlist>