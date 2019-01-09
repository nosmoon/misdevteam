<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.saly.rec.*
	,	chosun.ciis.hd.saly.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_SALY_1500_LDataSet ds = (HD_SALY_1500_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "gridData1", "");
  
	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_SALY_1500_LCURLISTRecord rec = (HD_SALY_1500_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_cd", rec.dty_cd);
			rx.add(record, "posi_cd", rec.posi_cd);
			rx.add(record, "dty_nm", rec.dty_nm);  
			rx.add(record, "posi_nm", rec.posi_nm);
			rx.add(record, "base_saly_be", rec.base_saly_be);
			rx.add(record, "base_saly_nw", rec.base_saly_nw);
			rx.add(record, "posk_saly_be", rec.posk_saly_be);
			rx.add(record, "posk_saly_nw", rec.posk_saly_nw);
			rx.add(record, "rgla_saly_be", rec.rgla_saly_be);  
			rx.add(record, "rgla_saly_nw", rec.rgla_saly_nw);
			rx.add(record, "dty_alon_be" , rec.dty_alon_be);
			rx.add(record, "dty_alon_nw" , rec.dty_alon_nw);
			rx.add(record, "posk_alon_be", rec.posk_alon_be);
			rx.add(record, "posk_alon_nw", rec.posk_alon_nw);
			rx.add(record, "food_alon_be", rec.food_alon_be);
			rx.add(record, "food_alon_nw", rec.food_alon_nw);
			rx.add(record, "care_alon_be", rec.care_alon_be);
			rx.add(record, "care_alon_nw", rec.care_alon_nw);
			rx.add(record, "evngt_saly_be", rec.evngt_saly_be);
			rx.add(record, "evngt_saly_nw", rec.evngt_saly_nw);
		}
		/****** CURLIST END */

	}
	catch (Exception e) {
		System.out.println("e......." + e.getMessage());
		
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
