<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.close.rec.*
	,	chosun.ciis.mt.close.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_CLOSE_7005_LDataSet ds = (MT_CLOSE_7005_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_CLOSE_7005_LCURLIST1Record rec = (MT_CLOSE_7005_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "fac_clsf_nm", rec.fac_clsf_nm);
			rx.add(record, "dstb_rat_cd", rec.dstb_rat_cd);
			rx.add(record, "dstb_rat_nm", rec.dstb_rat_nm);
			rx.add(record, "owh_budg_cd", rec.owh_budg_cd);
			rx.add(record, "budg_cdnm", rec.budg_cdnm);
			rx.add(record, "use_dept", rec.use_dept);
			rx.add(record, "hap_qunt", rec.hap_qunt);
			rx.add(record, "hap_amt", rec.hap_amt);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "matr_nm", rec.matr_nm);
			rx.add(record, "medi_cd", rec.medi_cd);
			rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "sect_nm", rec.sect_nm);
			rx.add(record, "qunt", rec.qunt);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "clos_yymm", rec.clos_yymm);
			//rx.add(record, "fac_clsf", StringUtil.replaceToXml(rec.fac_clsf));
			//rx.add(record, "fac_clsf_nm", StringUtil.replaceToXml(rec.fac_clsf_nm));
			//rx.add(record, "dstb_rat_cd", StringUtil.replaceToXml(rec.dstb_rat_cd));
			//rx.add(record, "dstb_rat_nm", StringUtil.replaceToXml(rec.dstb_rat_nm));
			//rx.add(record, "owh_budg_cd", StringUtil.replaceToXml(rec.owh_budg_cd));
			//rx.add(record, "budg_cdnm", StringUtil.replaceToXml(rec.budg_cdnm));
			//rx.add(record, "use_dept", StringUtil.replaceToXml(rec.use_dept));
			//rx.add(record, "hap_qunt", StringUtil.replaceToXml(rec.hap_qunt));
			//rx.add(record, "hap_amt", StringUtil.replaceToXml(rec.hap_amt));
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "sect_cd", StringUtil.replaceToXml(rec.sect_cd));
			//rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			//rx.add(record, "sect_nm", StringUtil.replaceToXml(rec.sect_nm));
			//rx.add(record, "qunt", StringUtil.replaceToXml(rec.qunt));
			//rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
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
<mt_close_7005_l>
	<dataSet>
		<CURLIST1>
			<record>
				<fac_clsf/>
				<fac_clsf_nm/>
				<dstb_rat_cd/>
				<dstb_rat_nm/>
				<owh_budg_cd/>
				<budg_cdnm/>
				<use_dept/>
				<hap_qunt/>
				<hap_amt/>
				<matr_cd/>
				<matr_nm/>
				<medi_cd/>
				<sect_cd/>
				<medi_nm/>
				<sect_nm/>
				<qunt/>
				<amt/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_close_7005_l>
*/
%>

<% /* 작성시간 : Thu Aug 06 17:51:50 KST 2009 */ %>