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
	FC_ACCT_4020_MDataSet ds = (FC_ACCT_4020_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	rx.add(dataSet, "xx_t_acct_cd", ds.xx_t_acct_cd);
	rx.add(dataSet, "xx_extnc_acct_cd", ds.xx_extnc_acct_cd);
	rx.add(dataSet, "xx_occr_acct_cd1", ds.xx_occr_acct_cd1);
	rx.add(dataSet, "xx_occr_acct_cd2", ds.xx_occr_acct_cd2);	
	rx.add(dataSet, "xx_slip_clsf_cd", ds.xx_slip_clsf_cd);
	
	try {
		
		
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			FC_ACCT_4020_MCURLIST4Record rec = (FC_ACCT_4020_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "acct_cd", rec.acct_cd);
			rx.add(record, "acct_abrv_nm", rec.acct_abrv_nm);
			//rx.add(record, "acct_cd", StringUtil.replaceToXml(rec.acct_cd));
			//rx.add(record, "acct_abrv_nm", StringUtil.replaceToXml(rec.acct_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			FC_ACCT_4020_MCURLIST3Record rec = (FC_ACCT_4020_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "acct_cd", rec.acct_cd);
			rx.add(record, "acct_abrv_nm", rec.acct_abrv_nm);
			//rx.add(record, "acct_cd", StringUtil.replaceToXml(rec.budg_cd));
			//rx.add(record, "acct_abrv_nm", StringUtil.replaceToXml(rec.acct_abrv_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */
		
		
		
		
		
		
		
		
		
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_ACCT_4020_MCURLIST2Record rec = (FC_ACCT_4020_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_4020_MCURLIST1Record rec = (FC_ACCT_4020_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
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
<fc_acct_4020_m>
	<dataSet>
		<CURLIST4>
			<record>
				<acct_cd/>
				<acct_abrv_nm/>
			</record>
		</CURLIST4>
	</dataSet>
</fc_acct_4020_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_4020_m>
	<dataSet>
		<CURLIST3>
			<record>
				<acct_cd/>
				<acct_abrv_nm/>
			</record>
		</CURLIST3>
	</dataSet>
</fc_acct_4020_m>
*/
%>



<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_4020_m>
	<dataSet>
		<CURLIST2>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST2>
	</dataSet>
</fc_acct_4020_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_4020_m>
	<dataSet>
		<CURLIST1>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST1>
	</dataSet>
</fc_acct_4020_m>
*/
%>

<% /* 작성시간 : Thu Apr 23 09:06:40 KST 2009 */ %>