<%@	page contentType="text/xml; charset=EUC-KR" %>


<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.res.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_RES_2210_LDataSet ds = (AD_RES_2210_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
	
	try {
	
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_RES_2210_LCURLISTRecord rec = (AD_RES_2210_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "chrg_aprv", rec.chrg_aprv);
			rx.add(record, "team_chf_aprv", rec.team_chf_aprv);
			rx.add(record, "preng_occr_dt", rec.preng_occr_dt);
			rx.add(record, "preng_occr_seq", rec.preng_occr_seq);  //예약발생순번 
			rx.add(record, "pubc_slip_no", rec.pubc_slip_no);  	//거재전표번호 
			rx.add(record, "pubc_side", rec.pubc_side);
			rx.add(record, "issu_ser_no", rec.issu_ser_no);
			rx.add(record, "publ_std", rec.publ_std); //규격
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "hndl_plac_nm", rec.hndl_plac_nm);
			rx.add(record, "slcrg_nm", rec.slcrg_nm);
			rx.add(record, "medi_cd", rec.medi_cd);						
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
