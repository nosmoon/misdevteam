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
	AD_PUB_3210_LDataSet ds = (AD_PUB_3210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_3210_LCURLISTRecord rec = (AD_PUB_3210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "pubc_dt",      rec.pubc_dt); 
			rx.add(record, "yoil", 		   rec.yoil);
			rx.addCData(record, "sect_nm", rec.sect_nm_cd); 
			rx.add(record, "sect_cd", rec.sect_cd);			
			rx.add(record, "sect_seq", rec.sect_seq);			
			String chro_clsf = "";
			if(rec.chro_clsf.equals("1")){
				chro_clsf = "Èæ¹é";	
			}else{
				chro_clsf = "ÄÃ·¯";	
			}
			rx.add(record, "chro_clsf",chro_clsf);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "pubc_cnt", rec.pubc_cnt);
			rx.add(record, "pubc_uprc", rec.pubc_uprc);
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
