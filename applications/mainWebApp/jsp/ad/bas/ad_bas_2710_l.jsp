<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();
	AD_BAS_2710_LDataSet ds = (AD_BAS_2710_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData1 =  rx.add(root, "resData1", "");
	int gridData1 = rx.add(resData1, "gridData1", "");
	
	resData1 = rx.add(root, "resData1", "");
	gridData1 = rx.add(resData1, "gridData1", "");
	
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_2710_LCURLISTRecord rec = (AD_BAS_2710_LCURLISTRecord)ds.curlist.get(i);
			int curlist1 = rx.add(gridData1, "curlist1", "");
			rx.add(curlist1, "team_cd", rec.team_cd);
			rx.add(curlist1, "part_cd", rec.part_cd);
			rx.add(curlist1, "part_nm", rec.part_nm);
			rx.add(curlist1, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(curlist1, "incmg_pers", rec.incmg_pers);
			rx.add(curlist1, "del_yn", rec.del_yn);
		}   
	}   
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
