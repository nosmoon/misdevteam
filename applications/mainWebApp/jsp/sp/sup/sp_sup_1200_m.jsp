<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sup.rec.*
	,	chosun.ciis.sp.sup.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SUP_1200_MDataSet ds = (SP_SUP_1200_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			SP_SUP_1200_MCURLIST4Record rec = (SP_SUP_1200_MCURLIST4Record)ds.curlist4.get(i);
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
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			SP_SUP_1200_MCURLIST3Record rec = (SP_SUP_1200_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "area_nm", rec.area_nm);
			//rx.add(record, "area_cd", StringUtil.replaceToXml(rec.area_cd));
			//rx.add(record, "area_nm", StringUtil.replaceToXml(rec.area_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			SP_SUP_1200_MCURLIST2Record rec = (SP_SUP_1200_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "sp_comp_chrg_pers_emp_no", rec.sp_comp_chrg_pers_emp_no);
			rx.add(record, "sp_comp_chrg_pers_emp_nm", rec.sp_comp_chrg_pers_emp_nm);
			//rx.add(record, "sp_comp_chrg_pers_emp_no", StringUtil.replaceToXml(rec.sp_comp_chrg_pers_emp_no));
			//rx.add(record, "sp_comp_chrg_pers_emp_nm", StringUtil.replaceToXml(rec.sp_comp_chrg_pers_emp_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			SP_SUP_1200_MCURLIST1Record rec = (SP_SUP_1200_MCURLIST1Record)ds.curlist1.get(i);
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

		/****** CURLIST7 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST7", "");

		for(int i = 0; i < ds.curlist7.size(); i++) {
			SP_SUP_1200_MCURLIST7Record rec = (SP_SUP_1200_MCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist7.size());
		/****** CURLIST7 END */

		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST6", "");

		for(int i = 0; i < ds.curlist6.size(); i++) {
			SP_SUP_1200_MCURLIST6Record rec = (SP_SUP_1200_MCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			SP_SUP_1200_MCURLIST5Record rec = (SP_SUP_1200_MCURLIST5Record)ds.curlist5.get(i);
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
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */

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
<sp_sup_1200_m>
	<dataSet>
		<CURLIST4>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST4>
	</dataSet>
</sp_sup_1200_m>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<sp_sup_1200_m>
	<dataSet>
		<CURLIST3>
			<record>
				<area_cd/>
				<area_nm/>
			</record>
		</CURLIST3>
	</dataSet>
</sp_sup_1200_m>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<sp_sup_1200_m>
	<dataSet>
		<CURLIST2>
			<record>
				<sp_comp_chrg_pers_emp_no/>
				<sp_comp_chrg_pers_emp_nm/>
			</record>
		</CURLIST2>
	</dataSet>
</sp_sup_1200_m>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<sp_sup_1200_m>
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
</sp_sup_1200_m>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<sp_sup_1200_m>
	<dataSet>
		<CURLIST7>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</CURLIST7>
	</dataSet>
</sp_sup_1200_m>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<sp_sup_1200_m>
	<dataSet>
		<CURLIST6>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</CURLIST6>
	</dataSet>
</sp_sup_1200_m>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<sp_sup_1200_m>
	<dataSet>
		<CURLIST5>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST5>
	</dataSet>
</sp_sup_1200_m>
*/
%>

<% /* �ۼ��ð� : Fri Jul 20 11:33:18 KST 2012 */ %>