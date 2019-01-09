<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.submatrcla.rec.*
	,	chosun.ciis.mt.submatrcla.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATRCLA_3102_LDataSet ds = (MT_SUBMATRCLA_3102_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_SUBMATRCLA_3102_LCURLISTRecord rec = (MT_SUBMATRCLA_3102_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			rx.add(record, "part_cd", StringUtil.replaceToXml(rec.part_cd));
			rx.addCData(record, "part_nm", StringUtil.replaceToXml(rec.part_nm));
			rx.addCData(record, "std_modl", StringUtil.replaceToXml(rec.std_modl));
			rx.add(record, "unit", StringUtil.replaceToXml(rec.unit));
			rx.add(record, "usag", StringUtil.replaceToXml(rec.usag));
			rx.add(record, "purc_uprc", StringUtil.replaceToXml(rec.purc_uprc));
			rx.add(record, "clam_qunt", StringUtil.replaceToXml(rec.clam_qunt));
			rx.add(record, "fix_qunt", StringUtil.replaceToXml(rec.fix_qunt));
			rx.add(record, "amt", StringUtil.replaceToXml(rec.amt));
			rx.add(record, "res_yn", StringUtil.replaceToXml(rec.res_yn));
			rx.add(record, "buy_proc_stat", StringUtil.replaceToXml(rec.buy_proc_stat));
			rx.add(record, "sub_seq", StringUtil.replaceToXml(rec.sub_seq));
			rx.add(record, "dlco_no", StringUtil.replaceToXml(rec.dlco_no));
			rx.add(record, "dlco_nm", StringUtil.replaceToXml(rec.dlco_nm));
			rx.add(record, "ern", StringUtil.replaceToXml(rec.ern));
			rx.add(record, "part_clas1", StringUtil.replaceToXml(rec.part_clas1));
			rx.add(record, "part_clas1_nm", StringUtil.replaceToXml(rec.part_clas1_nm));
			rx.add(record, "frex_unit", StringUtil.replaceToXml(rec.frex_unit));																		
			
			//rx.add(record, "matr_cd", rec.matr_cd);
			//rx.add(record, "matr_nm", rec.matr_nm);
			//rx.add(record, "std_modl", rec.std_modl);
			//rx.add(record, "unit", rec.unit);
			//rx.add(record, "usag", rec.usag);
			//rx.add(record, "purc_uprc", rec.purc_uprc);
			//rx.add(record, "clam_qunt", rec.clam_qunt);
			//rx.add(record, "fix_qunt", rec.fix_qunt);
			//rx.add(record, "amt", rec.amt);
			//rx.add(record, "res_yn", rec.res_yn);
			//rx.add(record, "buy_proc_stat", rec.buy_proc_stat);
			//rx.add(record, "sub_seq", rec.sub_seq);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
<mt_submatrcla_3102_l>
	<dataSet>
		<CURLIST>
			<record>
				<matr_cd/>
				<matr_nm/>
				<std_modl/>
				<unit/>
				<usag/>
				<purc_uprc/>
				<clam_qunt/>
				<fix_qunt/>
				<amt/>
				<res_yn/>
				<buy_proc_stat/>
				<sub_seq/>
			</record>
		</CURLIST>
	</dataSet>
</mt_submatrcla_3102_l>
*/
%>

<% /* 작성시간 : Wed Jul 08 19:54:28 KST 2009 */ %>