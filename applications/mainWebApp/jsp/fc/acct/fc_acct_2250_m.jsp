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
	FC_ACCT_2250_MDataSet ds = (FC_ACCT_2250_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");
	
	rx.add(dataSet, "xx_ss_cmpycd", ds.xx_ss_cmpycd);
    rx.add(dataSet, "xx_ss_emp_no", ds.xx_ss_emp_no);
    rx.add(dataSet, "xx_srch_slip_clsf_cd", ds.xx_srch_slip_clsf_cd);
    rx.add(dataSet, "xx_srch_slip_clsf_cd_1", ds.xx_srch_slip_clsf_cd_1);
    rx.add(dataSet, "xx_srch_slip_clsf_cd_2", ds.xx_srch_slip_clsf_cd_2);
	rx.add(dataSet, "xx_srch_slip_clsf_cd_3", ds.xx_srch_slip_clsf_cd_3);
	rx.add(dataSet, "xx_ss_emp_no_010", ds.xx_ss_emp_no_010);
	rx.add(dataSet, "xx_valuematrix", ds.xx_valuematrix);
			
	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			FC_ACCT_2250_MCURLIST1Record rec = (FC_ACCT_2250_MCURLIST1Record)ds.curlist1.get(i);
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
		
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_ACCT_2250_MCURLIST2Record rec = (FC_ACCT_2250_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "cdnm_cd", rec.cdnm_cd);
			rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

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
TrustForm�� Instance ����ο� �����ؼ� ���
<fc_acct_2250_m>
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
</fc_acct_2250_m>
*/
%>

<% /* �ۼ��ð� : Sat Apr 11 15:05:43 KST 2009 */ %>