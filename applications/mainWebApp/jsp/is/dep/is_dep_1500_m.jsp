<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.is.dep.rec.*
	,	chosun.ciis.is.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	IS_DEP_1500_MDataSet ds = (IS_DEP_1500_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");

	try {
		/****** CURLIST1 BEGIN */
		int drbk_clsf = rx.add( tempData , "drbk_clsf" , "");		
		int item  = rx.add( drbk_clsf , "item" , "");
		for(int i=0; i<ds.curlist1.size(); i++){ 
			IS_DEP_1500_MCURLIST1Record rec = (IS_DEP_1500_MCURLIST1Record)ds.curlist1.get(i);
			item  = rx.add( drbk_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdabrvnm_cd);
			
		}
		/****** CURLIST1 END */
		
		/****** CURLIST2 BEGIN */
		int payo_slip_clsf = rx.add( tempData , "payo_slip_clsf" , "");		
		for(int i=0; i<ds.curlist2.size(); i++){ 
			IS_DEP_1500_MCURLIST2Record rec = (IS_DEP_1500_MCURLIST2Record)ds.curlist2.get(i);
			item  = rx.add( payo_slip_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd_abrv_nm );
			
		}
		/****** CURLIST2 END */

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
