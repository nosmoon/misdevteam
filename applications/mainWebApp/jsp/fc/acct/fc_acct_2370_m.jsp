<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2370_MDataSet ds = (FC_ACCT_2370_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	rx.add(dataSet, "xx_srch_slip_clsf_cd_61", ds.xx_srch_slip_clsf_cd_61);        
	rx.add(dataSet, "xx_mang_clsf_cd1", ds.xx_mang_clsf_cd1);
	rx.add(dataSet, "xx_budg_cd1_010", ds.xx_budg_cd1_010);
	rx.add(dataSet, "xx_budg_cd2_020", ds.xx_budg_cd2_020);
	rx.add(dataSet, "xx_srch_slip_clsf_cd_30", ds.xx_srch_slip_clsf_cd_30);
	rx.add(dataSet, "xx_slip_clsf_cd_30", ds.xx_slip_clsf_cd_30);
	rx.add(dataSet, "xx_slip_clsf_cd_62", ds.xx_slip_clsf_cd_62);
	
	try {
	
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_ACCT_2370_MCURLIST2Record rec = (FC_ACCT_2370_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_abrv_nm", rec.budg_abrv_nm);
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_abrv_nm", StringUtil.replaceToXml(rec.budg_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */
		
		
		
	
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_2370_MCURLISTRecord rec = (FC_ACCT_2370_MCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
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
<fc_acct_2370_m>
	<dataSet>
		<CURLIST2>
			<record>
				<budg_cd/>
				<budg_abrv_nm/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_acct_2370_m>
*/
%>


<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<cd_nm/>
			<cd/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Feb 25 20:08:15 KST 2009 */ %>