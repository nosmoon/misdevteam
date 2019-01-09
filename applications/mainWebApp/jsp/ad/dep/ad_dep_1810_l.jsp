<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_DEP_1810_LDataSet ds = (AD_DEP_1810_LDataSet)request.getAttribute("ds"); 
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
	
	try {  
	
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_1810_LCURLISTRecord rec = (AD_DEP_1810_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");

			String sum_kiil = StringUtil.nvl(rec.sum_kiil, "0.0");
			
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "evlu_dt", rec.evlu_frdt.substring(0,4)+"-"+rec.evlu_frdt.substring(4,6)+"  ~  "
			                         +rec.evlu_todt.substring(0,4)+"-"+rec.evlu_todt.substring(4,6));
			rx.add(record, "unrcp_amt", rec.unrcp_amt);
			rx.add(record, "cntr_frdt", rec.cntr_frdt+"¿ù");
			rx.add(record, "mchrg_pers", rec.mchrg_pers);
			rx.add(record, "slcrg_pers", rec.slcrg_pers);
			rx.add(record, "sum_kiil", 	DigitUtil.cutUnderPoint(sum_kiil,1));
			rx.add(record, "pyong_point", rec.pyong_point);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "evlu_frdt", rec.evlu_frdt);
			rx.add(record, "evlu_todt", rec.evlu_todt);
			
		}
	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
