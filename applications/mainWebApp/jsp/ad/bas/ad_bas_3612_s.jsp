<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML °´Ã¼ »ý¼º 
	
	AD_BAS_3612_SDataSet ds = (AD_BAS_3612_SDataSet)request.getAttribute("ds");
	
	int root 	  = RwXml.rootNodeID;
	int dlcoData = rx.add(root, 	"dlcoData"		, "");
	
	try
	{
		rx.add(dlcoData, "zip1", ds.zip1);
		rx.add(dlcoData, "zip2", ds.zip2);
		rx.add(dlcoData, "addr", ds.addr);
		rx.add(dlcoData, "dtls_addr", ds.dtls_addr);
		rx.add(dlcoData, "slcrg_pers", ds.slcrg_pers);
		rx.add(dlcoData, "slcrg_pers_nm", ds.slcrg_pers_nm);
		rx.add(dlcoData, "mchrg_pers", ds.mchrg_pers);
		rx.add(dlcoData, "mchrg_pers_nm", ds.mchrg_pers_nm);
	}
	catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
		
%>