<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pr.papmake.rec.*
	,	chosun.ciis.pr.papmake.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PAPMAKE_1052_LDataSet ds = (PR_PAPMAKE_1052_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "ps_matr", "");
		for(int i = 0; i < ds.curlist4.size(); i++) {
			PR_PAPMAKE_1052_LCURLIST4Record rec = (PR_PAPMAKE_1052_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "matr_cd_031", rec.matr_cd_031);
			rx.add(record, "matr_cd_041", rec.matr_cd_041);
			rx.add(record, "matr_cd_042", rec.matr_cd_042);
			rx.add(record, "matr_cd_043", rec.matr_cd_043);
			rx.add(record, "use_qunt_031", rec.use_qunt_031);
			rx.add(record, "use_qunt_041", rec.use_qunt_041);
			rx.add(record, "use_qunt_042", rec.use_qunt_042);
			rx.add(record, "use_qunt_043", rec.use_qunt_043);
			rx.add(record, "use_qunt_099", rec.use_qunt_099);
			//rx.add(record, "sect_cd", rec.sect_cd);
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			//rx.add(record, "use_qunt_1", StringUtil.replaceToXml(rec.use_qunt_1));
			//rx.add(record, "use_qunt_2", StringUtil.replaceToXml(rec.use_qunt_2));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "supsu_matr", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_PAPMAKE_1052_LCURLIST3Record rec = (PR_PAPMAKE_1052_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "use_qunt_1", rec.use_qunt_1);
			rx.add(record, "use_qunt_2", rec.use_qunt_2);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			//rx.add(record, "use_qunt_1", StringUtil.replaceToXml(rec.use_qunt_1));
			//rx.add(record, "use_qunt_2", StringUtil.replaceToXml(rec.use_qunt_2));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "ink_matr", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_PAPMAKE_1052_LCURLIST2Record rec = (PR_PAPMAKE_1052_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "use_qunt_1", rec.use_qunt_1);
			rx.add(record, "use_qunt_2", rec.use_qunt_2);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			//rx.add(record, "use_qunt_1", StringUtil.replaceToXml(rec.use_qunt_1));
			//rx.add(record, "use_qunt_2", StringUtil.replaceToXml(rec.use_qunt_2));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "paper_matr", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PAPMAKE_1052_LCURLIST1Record rec = (PR_PAPMAKE_1052_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "vip_matr_clsf", rec.vip_matr_clsf);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "use_qunt_1", rec.use_qunt_1);
			rx.add(record, "use_qunt_2", rec.use_qunt_2);
			rx.add(record, "seq", rec.seq);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			//rx.add(record, "use_qunt_1", StringUtil.replaceToXml(rec.use_qunt_1));
			//rx.add(record, "use_qunt_2", StringUtil.replaceToXml(rec.use_qunt_2));
			//rx.add(record, "seq", StringUtil.replaceToXml(rec.seq));
			//rx.add(record, "dlco_cd", StringUtil.replaceToXml(rec.dlco_cd));
			//rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
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
<pr_papmake_1052_l>
	<dataSet>
		<CURLIST4>
			<record>
				<matr_cd/>
				<matr_nm/>
				<use_qunt_1/>
				<use_qunt_2/>
				<seq/>
				<dlco_cd/>
				<dlco_nm/>
			</record>
		</CURLIST4>
	</dataSet>
</pr_papmake_1052_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_papmake_1052_l>
	<dataSet>
		<CURLIST3>
			<record>
				<matr_cd/>
				<matr_nm/>
				<use_qunt_1/>
				<use_qunt_2/>
				<seq/>
				<dlco_cd/>
				<dlco_nm/>
			</record>
		</CURLIST3>
	</dataSet>
</pr_papmake_1052_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_papmake_1052_l>
	<dataSet>
		<CURLIST2>
			<record>
				<matr_cd/>
				<matr_nm/>
				<use_qunt_1/>
				<use_qunt_2/>
				<seq/>
				<dlco_cd/>
				<dlco_nm/>
			</record>
		</CURLIST2>
	</dataSet>
</pr_papmake_1052_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_papmake_1052_l>
	<dataSet>
		<CURLIST1>
			<record>
				<matr_cd/>
				<matr_nm/>
				<use_qunt_1/>
				<use_qunt_2/>
				<seq/>
				<dlco_cd/>
				<dlco_nm/>
			</record>
		</CURLIST1>
	</dataSet>
</pr_papmake_1052_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_papmake_1052_l>
	<dataSet>
		<CURLIST5>
			<record>
				<medi_cd/>
				<medi_nm/>
				<sect_cd/>
				<sect_nm/>
			</record>
		</CURLIST5>
	</dataSet>
</pr_papmake_1052_l>
*/
%>

<% /* 작성시간 : Fri Jul 10 19:26:27 KST 2009 */ %>