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
	FC_ACCT_2020_MDataSet ds = (FC_ACCT_2020_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	rx.add(dataSet, "xx_ch_var", ds.xx_ch_var);
	rx.add(dataSet, "xx_incm_clsf_cd_temp_1", ds.xx_incm_clsf_cd_temp_1);
	rx.add(dataSet, "xx_incm_clsf_cd_temp_2", ds.xx_incm_clsf_cd_temp_2);
	rx.add(dataSet, "xx_incm_clsf_cd_temp_3", ds.xx_incm_clsf_cd_temp_3);
	rx.add(dataSet, "xx_incm_clsf_cd_temp_4", ds.xx_incm_clsf_cd_temp_4);
	rx.add(dataSet, "xx_incm_clsf_cd_temp_5", ds.xx_incm_clsf_cd_temp_5);
	rx.add(dataSet, "xx_ch_incm_clsf_cd", ds.xx_ch_incm_clsf_cd);
	rx.add(dataSet, "xx_ch_old_dlco_clsf_cd_1", ds.xx_ch_old_dlco_clsf_cd_1);
	rx.add(dataSet, "xx_ch_old_dlco_clsf_cd_2", ds.xx_ch_old_dlco_clsf_cd_2);
	rx.add(dataSet, "xx_ch_old_dlco_clsf_cd_3", ds.xx_ch_old_dlco_clsf_cd_3);
	rx.add(dataSet, "xx_old_dlco_cd", ds.xx_old_dlco_cd);
	rx.add(dataSet, "xx_medi_cd", ds.xx_medi_cd);
	rx.add(dataSet, "xx_medi_cd_110", ds.xx_medi_cd_110);

	try {
		
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			FC_ACCT_2020_MCURLIST4Record rec = (FC_ACCT_2020_MCURLIST4Record)ds.curlist4.get(i);
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
			FC_ACCT_2020_MCURLIST3Record rec = (FC_ACCT_2020_MCURLIST3Record)ds.curlist3.get(i);
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
			FC_ACCT_2020_MCURLIST2Record rec = (FC_ACCT_2020_MCURLIST2Record)ds.curlist2.get(i);
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
			FC_ACCT_2020_MCURLIST1Record rec = (FC_ACCT_2020_MCURLIST1Record)ds.curlist1.get(i);
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
<fc_acct_2020_m>
	<dataSet>
		<CURLIST4>
			<record>
				<cd/>
				<cd_abrv_nm/>
			</record>
		</CURLIST4>
	</dataSet>
</fc_acct_2020_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2020_m>
	<dataSet>
		<CURLIST3>
			<record>
				<budg_cd/>
				<budg_abrv_nm/>
			</record>
		</CURLIST3>
	</dataSet>
</fc_acct_2020_m>
*/
%>






<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2020_m>
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
</fc_acct_2020_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2020_m>
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
</fc_acct_2020_m>
*/
%>

<% /* 작성시간 : Mon May 04 17:56:43 KST 2009 */ %>