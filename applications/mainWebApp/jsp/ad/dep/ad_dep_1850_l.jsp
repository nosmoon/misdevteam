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
	AD_DEP_1850_LDataSet ds = (AD_DEP_1850_LDataSet)request.getAttribute("ds"); 
	int root = RwXml.rootNodeID;

	int resData3 = rx.add(root, "resData3", "");
	int gridData3 = rx.add(resData3, "gridData3", "");
	
	try {  
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_1850_LCURLISTRecord rec = (AD_DEP_1850_LCURLISTRecord)ds.curlist.get(i);
			int record3 = rx.add(gridData3, "record3", "");

			rx.add(record3, "medi_nm", rec.medi_nm);
			rx.add(record3, "pubc_slip_no", rec.pubc_slip_no);
			rx.addCData(record3, "dlco_nm", rec.dlco_nm);
			rx.add(record3, "pubc_tot_amt", rec.pubc_tot_amt);
			rx.add(record3, "misu_amt", rec.misu_amt);
			rx.add(record3, "misu_yb", rec.misu_yb);
			rx.add(record3, "gjagferat", rec.gjagferat);
			rx.add(record3, "gjagfee", rec.gjagfee);
		}

	}
	catch (Exception e) {
	
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
