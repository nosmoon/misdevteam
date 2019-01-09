<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	
	String hndl_clsf = StringUtil.nvl(request.getParameter("hndl_clsf"));
	
	RwXml rx = new RwXml();
	AD_DEP_3810_LDataSet ds = (AD_DEP_3810_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	try {  
	
		int gridData = rx.add(root, "gridData", ""); 
		for(int i = 0; i<ds.curlist.size(); i++) {
			AD_DEP_3810_LCURLISTRecord rec = (AD_DEP_3810_LCURLISTRecord)ds.curlist.get(i);

			int record = rx.add(gridData, "record", "");
			
			String hndl_plac_nm = "";
			if("1".equals(hndl_clsf) || "3".equals(hndl_clsf)){
				hndl_plac_nm	= "";
			}else if("2".equals(hndl_clsf)){
				hndl_plac_nm	= rec.agn_nm;
			}else{
				hndl_plac_nm	= rec.hndl_plac_nm;
			}
					
			rx.add(record, "checked", "7".equals(rec.bddb_proc_clsf) ? "Y": "N");
			rx.add(record, "pubc_slip_no", rec.pubc_slip_no); 
			rx.add(record, "pubc_dt", rec.pubc_dt);
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "dlco_nm", rec.dlco_nm); 
			rx.add(record, "hndl_plac_nm", hndl_plac_nm); 
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "vat", rec.vat);
			rx.add(record, "unrcp_amt", rec.unrcp_amt);
			rx.add(record, "unrcp_vat", rec.unrcp_vat);

/* hidden data */			
			rx.add(record, "bddb_proc_clsf", "");
		}
	}
	catch (Exception e) {
		
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
