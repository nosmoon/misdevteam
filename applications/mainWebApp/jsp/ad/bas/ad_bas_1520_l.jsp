<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*
			    ,chosun.ciis.ad.bas.ds.*
			    ,chosun.ciis.co.base.util.*
			    ,somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BAS_1520_LDataSet ds = (AD_BAS_1520_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int curlist3 = rx.add(root, "curlist3", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1520_LCURLISTRecord rec = (AD_BAS_1520_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(curlist3, "record", "");
			rx.add(record, "night_shift_dt", rec.night_shift_dt);
			rx.add(record, "duty_main_empno", rec.duty_main_empno);
			rx.add(record, "duty_sub_empno", rec.duty_sub_empno);
			rx.add(record, "make_centr_main_empno", rec.make_centr_main_empno);
			rx.add(record, "make_centr_sub_empno", rec.make_centr_sub_empno);
			rx.add(record, "dd_nwsp_cont", StringUtil.replaceToXml(rec.dd_nwsp_cont));
			rx.add(record, "seq", rec.seq);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
