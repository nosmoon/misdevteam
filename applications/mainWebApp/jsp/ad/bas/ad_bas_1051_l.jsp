<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML °´Ã¼ »ý¼º 
	
	AD_BAS_1051_LDataSet ds = (AD_BAS_1051_LDataSet)request.getAttribute("ds");
	
	int root 	  	= RwXml.rootNodeID;
	int resData 	= rx.add(root, "resData", "");
	int gridData 	= rx.add(resData, "gridData", "");

	try{	
out.println("start");		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_BAS_1051_LCURLISTRecord rec = (AD_BAS_1051_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			
			rx.add(record, "checked"		,"N"); 

			rx.add(record, "dlco_no"		,rec.dlco_no);
			rx.addCData(record, "dlco_nm"		,rec.dlco_nm.replaceAll(";amp",""));
			rx.add(record, "ern"			,rec.ern);
			rx.add(record, "grp_cmpy_cd"	,rec.grp_cmpy_cd);
			rx.add(record, "grp_cmpy_nm"	,rec.grp_cmpy_nm);
			rx.add(record, "indt_cd"		,rec.indt_cd);
			rx.add(record, "indt_nm_1"		,rec.indt_nm_1);
			rx.add(record, "indt_nm_2"		,rec.indt_nm_2);
			rx.add(record, "type_cd"		,rec.type_cd);
			rx.add(record, "type_nm"		,rec.type_nm);
			rx.add(record, "slcrg_pers"		,rec.slcrg_pers);
			rx.add(record, "slcrg_pers_nm"	,rec.slcrg_pers_nm);
			rx.add(record, "mchrg_pers"		,rec.mchrg_pers);
			rx.add(record, "mchrg_pers_nm"	,rec.mchrg_pers_nm);

		}	
out.println("end");
	} catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>