<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_PUB_1310_LDataSet ds = (AD_PUB_1310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_1310_LCURLISTRecord rec = (AD_PUB_1310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "pubc_dt", rec.pubc_dt); 
			rx.add(record, "guid_aprv_yn", rec.guid_aprv_yn);
			rx.add(record, "seq", rec.seq);				
			rx.add(record, "advt_cont", rec.advt_cont);
			rx.add(record, "advcs_cd", rec.advcs_cd);
			rx.add(record, "advcs_nm", rec.advcs_nm);
			rx.add(record, "eps_clsf_cd", rec.eps_clsf_cd); 
			rx.add(record, "pubc_side", rec.pubc_side);
			rx.add(record, "arow", rec.arow);
			rx.add(record, "uprc", rec.uprc);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "vat", rec.vat);
			rx.add(record, "guid_sec_kind_cd", rec.guid_sec_kind_cd); 

		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
