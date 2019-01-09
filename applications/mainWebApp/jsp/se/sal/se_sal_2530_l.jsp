<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.ds.*
	,	chosun.ciis.se.sal.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_sal_2530_l.jsp
* 기능 : 계산서단건등록-대상내역조회
* 작성일자 : 2009-07-20
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
	SE_SAL_2530_LDataSet ds = (SE_SAL_2530_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "grid2", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SAL_2530_LCURLISTRecord rec = (SE_SAL_2530_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");
			rx.add(record, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "net_sale_amt", rec.net_sale_amt);
			rx.add(record, "acct_rcpm_rem_amt", rec.acct_tot_amt);
			rx.add(record, "acpt_rcpm_reg_tot_amt", rec.acpt_tot_amt);
			rx.add(record, "amt1", "");
			rx.add(record, "amt2", "");
			rx.add(record, "amt3", "");
			rx.add(record, "amt4", "");
			rx.add(record, "amt5", "");
			rx.add(record, "amt_tot", "0");
			rx.add(record, "rcpm_shet_no", "");
			rx.add(record, "rcpm_rate", "");
			rx.add(record, "select", "선택");
			rx.add(record, "rmtt_dt", rec.rmtt_dt);
			rx.add(record, "rmtt_plac", rec.rmtt_plac);
			rx.add(record, "tran_amt", "");
			rx.add(record, "biz_reg_no", "");
			rx.add(record, "bank_id", "");
			rx.add(record, "acct_num", "");
			rx.add(record, "tran_date_seq", "");
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
			<chrg_pers/>
			<net_sale_amt/>
			<acct_tot_amt/>
			<acpt_tot_amt/>
			<rmtt_dt/>
			<rmtt_plac/>
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

<% /* 작성시간 : Mon Jul 20 20:31:09 KST 2009 */ %>