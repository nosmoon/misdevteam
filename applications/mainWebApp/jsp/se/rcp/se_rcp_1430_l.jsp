<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.rcp.ds.*
	,	chosun.ciis.se.rcp.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_rcp_1430_l.jsp
* 기능 : 외환입금등록 - 대상내역 조회
* 작성일자 : 2009-04-30
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_RCP_1430_LDataSet ds = (SE_RCP_1430_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resform = rx.add(root, "resform", "");

	try {
		if(ds.curlist.size() > 0) {
			SE_RCP_1430_LCURLISTRecord rec = (SE_RCP_1430_LCURLISTRecord)ds.curlist.get(0);
			
			rx.add(resform, "occr_dt", "");
			rx.add(resform, "slip_clsf", "");
			rx.add(resform, "seq", "");
			rx.add(resform, "rcpm_dt", "");
			rx.add(resform, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(resform, "bo_nm", rec.bo_nm);
			rx.add(resform, "area_cd", rec.area_cd);
			rx.add(resform, "chrg_pers", rec.chrg_pers);
			rx.add(resform, "net_sale_amt", rec.net_sale_amt);
			rx.add(resform, "bal", rec.bal);
			rx.add(resform, "hjamt", "");
			rx.add(resform, "rcpm_amt", "");
			rx.add(resform, "budg_cd", "");
			rx.add(resform, "bank_cd", "");
			rx.add(resform, "rmtt_dt", "");
			rx.add(resform, "rmtt_plac", "");
			rx.add(resform, "yhcs", "");
			rx.add(resform, "yhci", "");
			rx.add(resform, "frex_amt", "");
			rx.add(resform, "biz_reg_no", "");
			rx.add(resform, "bank_id", "");
			rx.add(resform, "acct_num", "");
			rx.add(resform, "tran_date_seq", "");
			rx.add(resform, "acct_tonghwa", "");
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURLIST>
		<record>
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<area_cd/>
			<chrg_pers/>
			<net_sale_amt/>
			<bal/>
		</record>
	</CURLIST>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Thu Apr 30 14:03:29 KST 2009 */ %>