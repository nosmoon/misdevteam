<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.pl.bas.rec.*
	,	chosun.ciis.pl.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : pl_bas_1420_l.jsp
* ��� : 
* �ۼ����� : 2009-03-05
* �ۼ��� : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	PL_BAS_1420_LDataSet ds = (PL_BAS_1420_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;

	String errcode = ds.errcode;
	String errmsg = ds.errmsg;

	dataSet = rx.add(root, "resform", "");

	try {
		/****** BASEBALLIST BEGIN */
		int BASEBALLIST = rx.add(dataSet, "BASEBALLIST", "");
		for(int i = 0; i < ds.baseballist.size(); i++) {
			PL_BAS_1420_LBASEBALLISTRecord rec = (PL_BAS_1420_LBASEBALLISTRecord)ds.baseballist.get(i);
			int record = rx.add(BASEBALLIST, "record", "");
			rx.add(record, "reg_dt", rec.reg_dt);
			rx.add(record, "reg_seq", rec.reg_seq);
			rx.add(record, "dlco_cd", rec.dlco_cd);
			rx.add(record, "dlco_seq", rec.dlco_seq);
			rx.add(record, "medi_clsf", rec.medi_clsf);
			rx.add(record, "meda_clsf", rec.meda_clsf);
			rx.add(record, "setup_dt", rec.setup_dt);
			rx.add(record, "basi_yymm", rec.basi_yymm);
			rx.add(record, "setup_amt", rec.setup_amt);
			rx.add(record, "dd_clos_yn", rec.dd_clos_yn);
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
		}
		/****** BASEBALLIST END */

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
<dataSet>
	<BASEBALLIST>
		<record>
			<reg_dt/>
			<reg_seq/>
			<dlco_cd/>
			<dlco_seq/>
			<medi_clsf/>
			<meda_clsf/>
			<setup_dt/>
			<basi_yymm/>
			<setup_amt/>
			<dd_clos_yn/>
			<remk/>
		</record>
	</BASEBALLIST>
</dataSet>
*/
%>

<% /* �ۼ��ð� : Thu Mar 05 19:55:11 KST 2009 */ %>