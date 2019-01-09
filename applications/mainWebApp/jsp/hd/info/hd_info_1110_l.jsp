<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_1110_LDataSet ds = (HD_INFO_1110_LDataSet)request.getAttribute("ds");
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
			HD_INFO_1110_LCURLIST2Record rec = (HD_INFO_1110_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "prz_dt", rec.prz_dt);
			rx.add(record, "prz_nm", StringUtil.replaceToXml(rec.prz_nm));
			rx.add(record, "prz_resn", StringUtil.replaceToXml(rec.prz_resn));
			rx.add(record, "prz_amt", rec.prz_amt);
			rx.add(record, "prz_ptcr", StringUtil.replaceToXml(rec.prz_ptcr));
			
			
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_INFO_1110_LCURLIST1Record rec = (HD_INFO_1110_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "main_insp_ocom", rec.main_insp_ocom);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "dty_nm", rec.dty_nm);
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "main_insp_dt", rec.main_insp_dt);
			rx.add(record, "prz_pnsh_nm", rec.prz_pnsh_nm);
			rx.add(record, "prz_grad", rec.prz_grad);
			rx.add(record, "prz_resn_nm", rec.prz_resn_nm);
			rx.add(record, "case_nm", StringUtil.replaceToXml(rec.case_nm));
			rx.add(record, "atic_pubc_dt", rec.atic_pubc_dt);
			rx.add(record, "atic_pubc_side", rec.atic_pubc_side);
			rx.add(record, "prz_amt", rec.prz_amt);
			//rx.add(record, "main_insp_ocom", StringUtil.replaceToXml(rec.main_insp_ocom));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "dty_nm", StringUtil.replaceToXml(rec.dty_nm));
			//rx.add(record, "posi_nm", StringUtil.replaceToXml(rec.posi_nm));
			//rx.add(record, "main_insp_dt", StringUtil.replaceToXml(rec.main_insp_dt));
			//rx.add(record, "prz_pnsh_nm", StringUtil.replaceToXml(rec.prz_pnsh_nm));
			//rx.add(record, "prz_grad", StringUtil.replaceToXml(rec.prz_grad));
			//rx.add(record, "prz_resn_nm", StringUtil.replaceToXml(rec.prz_resn_nm));
			//rx.add(record, "case_nm", StringUtil.replaceToXml(rec.case_nm));
			//rx.add(record, "atic_pubc_dt", StringUtil.replaceToXml(rec.atic_pubc_dt));
			//rx.add(record, "atic_pubc_side", StringUtil.replaceToXml(rec.atic_pubc_side));
			//rx.add(record, "prz_amt", StringUtil.replaceToXml(rec.prz_amt));
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
<hd_info_1110_l>
	<dataSet>
		<CURLIST2>
			<record>
				<dept_nm/>
				<dty_nm/>
				<posi_nm/>
				<prz_dt/>
				<prz_nm/>
				<prz_resn/>
				<prz_amt/>
				<prz_ptcr/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_info_1110_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_info_1110_l>
	<dataSet>
		<CURLIST1>
			<record>
				<main_insp_ocom/>
				<dept_nm/>
				<dty_nm/>
				<posi_nm/>
				<main_insp_dt/>
				<prz_pnsh_nm/>
				<prz_grad/>
				<prz_resn_nm/>
				<case_nm/>
				<atic_pubc_dt/>
				<atic_pubc_side/>
				<prz_amt/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_info_1110_l>
*/
%>

<% /* 작성시간 : Thu Aug 20 10:37:22 KST 2009 */ %>