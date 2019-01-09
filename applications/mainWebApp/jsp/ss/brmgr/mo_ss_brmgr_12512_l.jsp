<?xml version="1.0" encoding="EUC-KR"?>
<%@	page contentType="text/html; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x_mobile.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명     : mo_ss_brmgr_12512_l.jsp
* 기능       : 센터현황-매출(센터관리-건전도관리-센터종합정보관리)_모바일용/ 지대마감-지대입금률현황_모바일용(입금관리-지대입금관리-지대입금률현황)
* 작성일자   : 2016-12-19
* 작성자     : 장선희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역   : 가상계좌잔액, 우송대체금액, 가상계좌번호 추가 
             : 센터현황-매출 / 지대마감-지대입금률현황에서 순매출액은 본지+소년으로 함. 조동환차장 요청
* 수정자     : 장선희
* 수정일자   : 2017-03-24
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	SS_MO_SLS_BRMGR_2512_LDataSet ds = (SS_MO_SLS_BRMGR_2512_LDataSet)request.getAttribute("ds");
%>
<curcommlist>
<%
	if(ds != null){
		if (ds.getErrcode()==null || ds.getErrcode().equals("")) {
%>
	<errinfo>
		<errcode></errcode>
		<errmsg></errmsg>
	</errinfo>
<%
	if( ds.curcommlist.size() > 0 ){
		SS_MO_SLS_BRMGR_2512_LCURCOMMLISTRecord rec = null;
		for( int i=0; i < ds.curcommlist.size(); i++ ){
			rec = (SS_MO_SLS_BRMGR_2512_LCURCOMMLISTRecord)ds.curcommlist.get( i );
%>
<amtinfo>
		<yymm><%= rec.yymm %></yymm> <!-- 년월 -->
		<bonm><![CDATA[<%=rec.bonm %>]]></bonm> <!-- 센터명 -->
		<boclsf><![CDATA[<%=rec.boclsf %>]]></boclsf><!-- 센터구분 -->
		<net_sale_amt><%= rec.net_sale_amt %></net_sale_amt> <!-- 순매출액(본지+소년)  -->
		<rcpm_amt><%= rec.rcpm_amt %></rcpm_amt><!-- 지대입금액 -->
		<rcpm_rate><%= rec.rcpm_rate %></rcpm_rate><!-- 입금률 -->
		<now_bal><%= rec.now_bal %></now_bal><!-- 당월미수 -->
		<bal><%= rec.bal %></bal><!-- 누적미수 -->
		<acct_tot_amt><%= rec.acct_tot_amt %></acct_tot_amt><!--가상계좌잔액-->
		<pdlv_altn_amt><%= rec.pdlv_altn_amt %></pdlv_altn_amt><!-- 우송대체금액-->
		<vitl_acct_no><%= rec. vitl_acct_no %></vitl_acct_no><!--가상계좌번호-->
</amtinfo>
<%
			}
		}else{
%>
<amtinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<net_sale_amt></net_sale_amt>
		<rcpm_amt></rcpm_amt>
		<rcpm_rate></rcpm_rate>
		<now_bal></now_bal>
		<bal></bal>
		<acct_tot_amt></acct_tot_amt>
		<pdlv_altn_amt></pdlv_altn_amt>
		<vitl_acct_no></vitl_acct_no>
</amtinfo>
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
<amtinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<net_sale_amt></net_sale_amt>
		<rcpm_amt></rcpm_amt>
		<rcpm_rate></rcpm_rate>
		<now_bal></now_bal>
		<bal></bal>
		<acct_tot_amt></acct_tot_amt>
		<pdlv_altn_amt></pdlv_altn_amt>
		<vitl_acct_no></vitl_acct_no>
</amtinfo>
<%
		}
	}else{
%>
	<errinfo>
		<errcode><![CDATA[-9999]]></errcode>
		<errmsg><![CDATA[SYSTEM ERROR]]></errmsg>
	</errinfo>
<amtinfo>
		<yymm></yymm>
		<bonm></bonm>
		<boclsf></boclsf>
		<net_sale_amt></net_sale_amt>
		<rcpm_amt></rcpm_amt>
		<rcpm_rate></rcpm_rate>
		<now_bal></now_bal>
		<bal></bal>
		<acct_tot_amt></acct_tot_amt>
		<pdlv_altn_amt></pdlv_altn_amt>
		<vitl_acct_no></vitl_acct_no>
</amtinfo>
<%
	}
%>
</curcommlist>