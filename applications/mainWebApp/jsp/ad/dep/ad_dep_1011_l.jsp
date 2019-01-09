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
	AD_DEP_1011_LDataSet ds = (AD_DEP_1011_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
//	int resData = rx.add(root, "resData", "");

	try {  
//차변:선수금대체		
		int gridData3 = rx.add( root , "gridData3" , "");
		for(int i = 0; i<ds.curlist.size(); i++) {
			AD_DEP_1011_LCURLISTRecord rec = (AD_DEP_1011_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData3, "record", "");
			rx.add(record, "checked", ""); 
			rx.add(record, "medi_nm", rec.medi_nm);   
			rx.add(record, "medi_cd", rec.medi_cd); 
			rx.add(record, "amt", "");
			rx.add(record, "occr_amt", rec.occr_amt);
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.add(record, "occr_dt", rec.occr_dt);
			rx.add(record, "slip_clsf", rec.slip_clsf);
			rx.add(record, "seq", rec.seq);			
			rx.add(record, "subseq", rec.subseq);	
		}	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
