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
	FC_ACCT_4041_PDataSet ds = (FC_ACCT_4041_PDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_ACCT_4041_PCURLIST2Record rec = (FC_ACCT_4041_PCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "seq_1", rec.seq_1);
			rx.add(record, "compnm_1", rec.compnm_1);
			rx.add(record, "amt1_1", rec.amt1_1);
			rx.add(record, "amt2_1", rec.amt2_1);
			rx.add(record, "amt3_1", rec.amt3_1);
			rx.add(record, "seq_2", rec.seq_2);
			rx.add(record, "compnm_2", rec.compnm_2);
			rx.add(record, "amt1_2", rec.amt1_2);
			rx.add(record, "amt2_2", rec.amt2_2);
			rx.add(record, "amt3_2", rec.amt3_2);
			//rx.add(record, "seq_1", StringUtil.replaceToXml(rec.seq_1));
			//rx.add(record, "compnm_1", StringUtil.replaceToXml(rec.compnm_1));
			//rx.add(record, "amt1_1", StringUtil.replaceToXml(rec.amt1_1));
			//rx.add(record, "amt2_1", StringUtil.replaceToXml(rec.amt2_1));
			//rx.add(record, "amt3_1", StringUtil.replaceToXml(rec.amt3_1));
			//rx.add(record, "seq_2", StringUtil.replaceToXml(rec.seq_2));
			//rx.add(record, "compnm_2", StringUtil.replaceToXml(rec.compnm_2));
			//rx.add(record, "amt1_2", StringUtil.replaceToXml(rec.amt1_2));
			//rx.add(record, "amt2_2", StringUtil.replaceToXml(rec.amt2_2));
			//rx.add(record, "amt3_2", StringUtil.replaceToXml(rec.amt3_2));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_4041_PCURLISTRecord rec = (FC_ACCT_4041_PCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fisc_dt", rec.fisc_dt);
			rx.add(record, "compcd", rec.compcd);
			rx.add(record, "compnm", rec.compnm);
			rx.add(record, "rmks1", rec.rmks1);
			rx.add(record, "rmks2", rec.rmks2);
			rx.add(record, "jpcd", rec.jpcd);
			rx.add(record, "occr_amt", rec.occr_amt);
			rx.add(record, "occr_acct_cd", rec.occr_acct_cd);
			rx.add(record, "occr_acct_nm", rec.occr_acct_nm);
			rx.add(record, "extnc_acct_cd", rec.extnc_acct_cd);
			rx.add(record, "extnc_acct_nm", rec.extnc_acct_nm);
			rx.add(record, "sjamt", rec.sjamt);
			//rx.add(record, "fisc_dt", StringUtil.replaceToXml(rec.fisc_dt));
			//rx.add(record, "compcd", StringUtil.replaceToXml(rec.compcd));
			//rx.add(record, "compnm", StringUtil.replaceToXml(rec.compnm));
			//rx.add(record, "rmks1", StringUtil.replaceToXml(rec.rmks1));
			//rx.add(record, "rmks2", StringUtil.replaceToXml(rec.rmks2));
			//rx.add(record, "jpcd", StringUtil.replaceToXml(rec.jpcd));
			//rx.add(record, "occr_amt", StringUtil.replaceToXml(rec.occr_amt));
			//rx.add(record, "occr_acct_cd", StringUtil.replaceToXml(rec.occr_acct_cd));
			//rx.add(record, "occr_acct_nm", StringUtil.replaceToXml(rec.occr_acct_nm));
			//rx.add(record, "extnc_acct_cd", StringUtil.replaceToXml(rec.extnc_acct_cd));
			//rx.add(record, "extnc_acct_nm", StringUtil.replaceToXml(rec.extnc_acct_nm));
			//rx.add(record, "sjamt", StringUtil.replaceToXml(rec.sjamt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
<fc_acct_4041_p>
	<dataSet>
		<CURLIST2>
			<record>
				<seq_1/>
				<compnm_1/>
				<amt1_1/>
				<amt2_1/>
				<amt3_1/>
				<seq_2/>
				<compnm_2/>
				<amt1_2/>
				<amt2_2/>
				<amt3_2/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_acct_4041_p>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_4041_p>
	<dataSet>
		<CURLIST>
			<record>
				<fisc_dt/>
				<compcd/>
				<compnm/>
				<rmks1/>
				<rmks2/>
				<jpcd/>
				<occr_amt/>
				<occr_acct_cd/>
				<occr_acct_nm/>
				<extnc_acct_cd/>
				<extnc_acct_nm/>
				<sjamt/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_4041_p>
*/
%>

<% /* 작성시간 : Thu Aug 06 18:08:41 KST 2009 */ %>