<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML 객체 생성 
	
	AD_BAS_1120_LDataSet ds = (AD_BAS_1120_LDataSet)request.getAttribute("ds");
	
	int root 	  = RwXml.rootNodeID;
	
	int gridData1  = rx.add( root , "gridData" , "");
	rx.add(gridData1, "pubc_amt", ds.pubc_amt);
	rx.add(gridData1, "rcpm_amt", ds.rcpm_amt);  
	rx.add(gridData1, "rcpm_rate", ds.rcpm_rate);
	rx.add(gridData1, "vexc_fee", ds.vexc_fee);
	
	
	for(int i = 0; i < ds.curlist.size(); i++) {
		AD_BAS_1120_LCURLISTRecord rec = (AD_BAS_1120_LCURLISTRecord)ds.curlist.get(i);
		int record = rx.add(gridData1, "record", "");
		rx.add(record, "advcs_nm", rec.advcs_nm);
		rx.add(record, "pubc_amt", rec.pubc_amt);
		rx.add(record, "rcpm_amt", rec.rcpm_amt);
		rx.add(record, "rcpm_rate", rec.rcpm_rate); 
		rx.add(record, "vexc_fee", rec.vexc_fee);
	}	

    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>