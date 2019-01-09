<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.qty.rec.*
	,	chosun.ciis.se.qty.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SE_QTY_1310_LDataSet ds = (SE_QTY_1310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "resData", "");

	try {
		gridData = rx.add(resData, "gridData", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_QTY_1310_LCURLISTRecord rec = (SE_QTY_1310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "team_nm", rec.team_nm);
			rx.add(record, "part_nm", rec.part_nm);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "bo_seq", rec.bo_seq);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "curmm_val_qty", rec.curmm_val_qty);
			rx.add(record, "curmm_no_val_qty", rec.curmm_no_val_qty);
			rx.add(record, "curmm_qty_tot", rec.curmm_qty_tot);
			rx.add(record, "val_rate", rec.val_rate+" %");
			rx.add(record, "send_qty", rec.send_qty);
			rx.add(record, "diff_qty", rec.diff_qty);
		}

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
