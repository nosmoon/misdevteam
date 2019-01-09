<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.sp.sal.rec.*
	,	chosun.ciis.sp.sal.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	SP_SAL_1310_LDataSet ds = (SP_SAL_1310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int gridData1 = rx.add(root, "", "");

	try {
		/****** CURLIST1 BEGIN */
		for(int i = 0; i < ds.curlist1.size(); i++) {
			SP_SAL_1310_LCURLIST1Record rec = (SP_SAL_1310_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(gridData1, "record", "");
			rx.add(record, "sell_dept_nm", rec.sell_dept_nm);
			rx.add(record, "sell_area_cd", rec.sell_area_cd);
			rx.add(record, "sell_area_nm", rec.sell_area_nm);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "acol_no", rec.acol_no);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "clam_apt", rec.clam_apt);
			rx.add(record, "clam_hous", rec.clam_hous);
			rx.add(record, "clam_shop_etc", rec.clam_shop_etc);
			rx.add(record, "clam_tot", rec.clam_tot);
			rx.add(record, "ufth_apt", rec.ufth_apt);
			rx.add(record, "ufth_hous", rec.ufth_hous);
			rx.add(record, "ufth_shop_etc", rec.ufth_shop_etc);
			rx.add(record, "ufth_tot", rec.ufth_tot);
			rx.add(record, "cnfm_apt", rec.cnfm_apt);
			rx.add(record, "cnfm_hous", rec.cnfm_hous);
			rx.add(record, "cnfm_shop_etc", rec.cnfm_shop_etc);
			rx.add(record, "cnfm_tot", rec.cnfm_tot);
			rx.add(record, "alon_clam_qty", rec.alon_clam_qty);
			rx.add(record, "rdr_extn_alon", rec.rdr_extn_alon);
			rx.add(record, "pay_amt", rec.pay_amt);
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
