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
	AD_PUB_1510_LDataSet ds = (AD_PUB_1510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_1510_LCURLISTRecord rec = (AD_PUB_1510_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "chrg_aprv"		, rec.chrg_aprv);
			rx.add(record, "medi_cd"		, rec.medi_cd);
			rx.add(record, "seq"			, rec.seq);
			rx.add(record, "medi_nm"		, rec.medi_nm);
			rx.add(record, "frdt"		    , rec.frdt);	
			rx.add(record, "todt"		    , rec.todt);					
			rx.add(record, "dlco_nm"	 	, rec.dlco_nm); 
			rx.add(record, "upd_prv_amt"	, rec.upd_prv_amt);
			rx.add(record, "upd_aft_amt"	, rec.upd_aft_amt);
			rx.add(record, "icdc_amt"		, rec.icdc_amt);
			rx.add(record, "chrg_pers"		, rec.chrg_pers);
			rx.add(record, "agn"		    , rec.agn);
			rx.add(record, "hndl_clsf_nm"	, rec.hndl_clsf_nm);
			rx.add(record, "make_dt"		, rec.make_dt);

			
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
