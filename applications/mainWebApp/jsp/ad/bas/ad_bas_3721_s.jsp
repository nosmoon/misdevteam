<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML °´Ã¼ »ý¼º 
	
	AD_BAS_3721_SDataSet ds = (AD_BAS_3721_SDataSet)request.getAttribute("ds");
	
	int root 	  = RwXml.rootNodeID;
	int resData  = rx.add(root, 	"tempFormData" 		, "");
	
	try
	{
		rx.add(resData, "asum_pubc_amt", ds.asum_pubc_amt);
		rx.add(resData, "advt_ocpy_rate", ds.advt_ocpy_rate);
		
		int gridData = rx.add(resData,	"gridData"	, "");
		for(int i=0; i<ds.curlist.size(); i++)
		{
			AD_BAS_3721_SCURLISTRecord rec = (AD_BAS_3721_SCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sect_nm_cd", rec.sect_nm_cd); 
			rx.add(record, "sect_nm_detail", rec.sect_nm_detail);
			rx.add(record, "sect_cd", rec.sect_cd); 
			rx.add(record, "tot_pcnt", rec.tot_pcnt); 	
			rx.add(record, "tot_dn", rec.tot_dn);
			rx.add(record, "tot_clr_dn", rec.tot_clr_dn);
			rx.add(record, "tot_pubc_amt", rec.tot_pubc_amt);
			rx.add(record, "advt_ocpy_rate", rec.advt_ocpy_rate);
		}
	}
	catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
		
%>