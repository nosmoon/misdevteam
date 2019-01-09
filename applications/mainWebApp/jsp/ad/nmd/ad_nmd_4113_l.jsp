<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.nmd.rec.*
	,	chosun.ciis.ad.nmd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_NMD_4113_LDataSet ds = (AD_NMD_4113_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
//	int resData = rx.add(root, "resData", "");

	try {  
	

//차변:기타입금대체		
		int gridData5 = rx.add( root , "gridData5" , "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_NMD_4113_LCURLISTRecord rec = (AD_NMD_4113_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData5, "record", "");
			rx.add(record, "checked", "");
			rx.add(record, "budg_cd", rec.budg_cd);
			rx.add(record, "amt", rec.amt);
			rx.add(record, "occr_amt", rec.occr_amt);
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
			rx.add(record, "occr_dt", "");
			rx.add(record, "slip_clsf", "");
			rx.add(record, "seq", "");
			rx.add(record, "subseq", "");
//			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no);
//			rx.add(record, "occr_dt", rec.occr_dt);
//			rx.add(record, "slip_clsf", rec.slip_clsf);
//			rx.add(record, "seq", rec.seq);			
//			rx.add(record, "subseq", rec.subseq);	
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>