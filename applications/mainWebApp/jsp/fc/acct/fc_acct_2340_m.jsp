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
	FC_ACCT_2340_MDataSet ds = (FC_ACCT_2340_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
	
	rx.add(dataSet, "xx_slip_occr_clsf", ds.xx_slip_occr_clsf);
	rx.add(dataSet, "xx_srch_slip_clsf_cd_61", ds.xx_srch_slip_clsf_cd_61);
	rx.add(dataSet, "xx_budg_cd1_010", ds.xx_budg_cd1_010);
	rx.add(dataSet, "xx_budg_cd3", ds.xx_budg_cd3);
	rx.add(dataSet, "xx_prop_equip_cd", ds.xx_prop_equip_cd);
	rx.add(dataSet, "xx_budg_cd4", ds.xx_budg_cd4);
	rx.add(dataSet, "xx_budg_cd5", ds.xx_budg_cd5);
	rx.add(dataSet, "xx_budg_cd6", ds.xx_budg_cd6);

	try {
		
		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			FC_ACCT_2340_MCURLIST5Record rec = (FC_ACCT_2340_MCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_abrv_nm", rec.budg_abrv_nm);
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_abrv_nm", StringUtil.replaceToXml(rec.budg_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */
		
		
		
		
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			FC_ACCT_2340_MCURLIST4Record rec = (FC_ACCT_2340_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */
		
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			FC_ACCT_2340_MCURLIST3Record rec = (FC_ACCT_2340_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "budg_abrv_nm", rec.budg_abrv_nm);
			//rx.add(record, "budg_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "budg_abrv_nm", StringUtil.replaceToXml(rec.budg_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_ACCT_2340_MCURLIST2Record rec = (FC_ACCT_2340_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_2340_MCURLIST1Record rec = (FC_ACCT_2340_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_nm", rec.cd_nm);
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "cd_nm", StringUtil.replaceToXml(rec.cd_nm));
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<fc_acct_2340_m>
	<dataSet>
		<CURLIST4>
			<record>
				<cd/>
				<cd_abrv_nm/>
			</record>
		</CURLIST4>
	</dataSet>
</fc_acct_2340_m>
*/
%>


<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2340_m>
	<dataSet>
		<CURLIST3>
			<record>
				<budg_cd/>
				<budg_abrv_nm/>
			</record>
		</CURLIST3>
	</dataSet>
</fc_acct_2340_m>
*/
%>



<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2340_m>
	<dataSet>
		<CURLIST2>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_acct_2340_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2340_m>
	<dataSet>
		<CURLIST1>
			<record>
				<cd_nm/>
				<cd/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_2340_m>
*/
%>

<% /* 작성시간 : Thu Apr 09 16:19:00 KST 2009 */ %>