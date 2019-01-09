<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.com.rec.*
	,	chosun.ciis.is.com.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_COM_1710_LDataSet ds = (IS_COM_1710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			IS_COM_1710_LCURLIST1Record rec = (IS_COM_1710_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "send_atic_no", rec.send_atic_no);
			rx.add(record, "send_atic_nm", rec.send_atic_nm);
			rx.add(record, "reg_dd", rec.reg_dd);
			rx.add(record, "car_kind", rec.car_kind);
			rx.add(record, "yy_styl", rec.yy_styl);
			rx.add(record, "car_no", rec.car_no);		
			rx.add(record, "tel", rec.tel);
			rx.add(record, "ceph", rec.ceph);
		}
		/****** CURLIST1 END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
