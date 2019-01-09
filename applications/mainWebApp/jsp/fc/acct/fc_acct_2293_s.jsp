<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2293_SDataSet ds = (FC_ACCT_2293_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CUR_WHCO_NDSTB_CD_LIST BEGIN */
		recordSet = rx.add(dataSet, "CUR_WHCO_NDSTB_CD_LIST", "");

		for(int i = 0; i < ds.cur_whco_ndstb_cd_list.size(); i++) {
			FC_ACCT_2293_SCUR_WHCO_NDSTB_CD_LISTRecord rec = (FC_ACCT_2293_SCUR_WHCO_NDSTB_CD_LISTRecord)ds.cur_whco_ndstb_cd_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "whco_ndstb_cd", rec.whco_ndstb_cd);
			rx.add(record, "whco_comn_cost_yn", rec.whco_comn_cost_yn);
			//rx.add(record, "whco_ndstb_cd", StringUtil.replaceToXml(rec.whco_ndstb_cd));
			//rx.add(record, "whco_comn_cost_yn", StringUtil.replaceToXml(rec.whco_comn_cost_yn));
		}
		rx.add(recordSet, "totalcnt", ds.cur_whco_ndstb_cd_list.size());
		/****** CUR_WHCO_NDSTB_CD_LIST END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2293_s>
	<dataSet>
		<CUR_WHCO_NDSTB_CD_LIST>
			<record>
				<whco_ndstb_cd/>
				<whco_comn_cost_yn/>
			</record>
		</CUR_WHCO_NDSTB_CD_LIST>
	</dataSet>
</fc_acct_2293_s>
*/
%>

<% /* 작성시간 : Thu Apr 23 11:05:59 KST 2009 */ %>