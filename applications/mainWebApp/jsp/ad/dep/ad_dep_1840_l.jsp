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
	AD_DEP_1840_LDataSet ds = (AD_DEP_1840_LDataSet)request.getAttribute("ds"); 
	int root = RwXml.rootNodeID;

	int resData2 = rx.add(root, "resData2", "");
	int gridData2 = rx.add(resData2, "gridData2", "");
	
	try {  
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_1840_LCURLISTRecord rec = (AD_DEP_1840_LCURLISTRecord)ds.curlist.get(i);
			int record2 = rx.add(gridData2, "record2", "");

			rx.add(record2, "medi_nm", rec.medi_nm);
			rx.add(record2, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.add(record2, "rcpm_clsf_nm", rec.rcpm_clsf_nm);
			rx.add(record2, "magi_dt", rec.magi_dt);
			rx.add(record2, "issu_pers_nm", rec.issu_pers_nm);
			rx.add(record2, "amt", rec.amt);
		}

	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
