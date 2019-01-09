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
	AD_PUB_2910_LDataSet ds = (AD_PUB_2910_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int gridData = rx.add(root, "gridData", "");

	try {
		
		for(int i=0 ;i<ds.curlist.size(); i++){
			AD_PUB_2910_LCURLISTRecord rec = (AD_PUB_2910_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
		
			rx.add(record, "medi_nm"	, rec.medi_nm);
			rx.add(record, "pubc_dt"	, rec.pubc_dt);
			rx.add(record, "advt_clas"	, rec.advt_clas);
			rx.add(record, "pubc_side"	, rec.sect_cd+""+rec.sect_seq);
			rx.add(record, "pubc_dn"	, StringUtil.toDouble(rec.pubc_dn));
			rx.add(record, "pubc_cm"	, StringUtil.toDouble(rec.pubc_cm));
			rx.add(record, "dlco_nm1"	, rec.dlco_nm1);
			rx.add(record, "make_dn"	, rec.make_dn);
			rx.add(record, "make_cm"	, rec.make_cm);
			rx.add(record, "dlco_nm2"	, rec.dlco_nm2);	  	
		}
	    
	}
	catch (Exception e) {
	   
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
