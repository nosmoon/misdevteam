<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.func.rec.*
	,	chosun.ciis.fc.func.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_FUNC_8050_MDataSet ds = (FC_FUNC_8050_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_leas_clsf_cd", ds.getXx_leas_clsf_cd());
		rx.add(dataSet, "xx_insr_clsf_cd", ds.getXx_insr_clsf_cd());
		
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			FC_FUNC_8050_MCURLIST2Record rec = (FC_FUNC_8050_MCURLIST2Record)ds.curlist2.get(i);
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
			FC_FUNC_8050_MCURLIST1Record rec = (FC_FUNC_8050_MCURLIST1Record)ds.curlist1.get(i);
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
TrustForm�� Instance ����ο� �����ؼ� ���
<fc_func_8050_m>
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
</fc_func_8050_m>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<fc_func_8050_m>
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
</fc_func_8050_m>
*/
%>

<% /* �ۼ��ð� : Fri Apr 10 14:17:26 KST 2009 */ %>