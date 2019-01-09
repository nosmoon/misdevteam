<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BAS_2700_MDataSet ds = (AD_BAS_2700_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int comboSet = rx.add(root, "comboSet", "");
	
	try {
		int chrg_medi = rx.add( comboSet , "chrg_medi" , "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			AD_BAS_2700_MCURLIST4Record rec = (AD_BAS_2700_MCURLIST4Record)ds.curlist4.get(i);
			
			int item  = rx.add( chrg_medi , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}
		/****** CURLIST4 END */
			
		/****** CURLIST3 BEGIN */
		int chrg_clsf = rx.add( comboSet , "chrg_clsf" , "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			AD_BAS_2700_MCURLIST3Record rec = (AD_BAS_2700_MCURLIST3Record)ds.curlist3.get(i);
			
			int item  = rx.add( chrg_clsf , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		int part_posi = rx.add( comboSet , "part_posi" , "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_BAS_2700_MCURLIST2Record rec = (AD_BAS_2700_MCURLIST2Record)ds.curlist2.get(i);
			
			int item  = rx.add( part_posi , "item" , "");
			
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}
		/****** CURLIST2 END */		
	
		/****** CURLIST1 BEGIN */
		int dept_nm = rx.add( comboSet , "dept_nm" , "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			AD_BAS_2700_MCURLIST1Record rec = (AD_BAS_2700_MCURLIST1Record)ds.curlist1.get(i);
			
			int item  = rx.add( dept_nm , "item" , "");
			
			rx.add ( item, "value", rec.dept_cd );
			rx.add ( item, "label", rec.dept_nm);
		}
		/****** CURLIST1 END */	
	}
	catch (Exception e) {
	}
	finally {
//		rx.add(dataSet, "errcode", errcode);
//		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
