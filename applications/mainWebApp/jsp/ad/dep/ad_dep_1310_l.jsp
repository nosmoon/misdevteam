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
	RwXml rx = new RwXml();
	AD_DEP_1310_LDataSet ds = (AD_DEP_1310_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add( root , "resData" , "");

	try {  

		int tot_advt_fee = 0;
		int tot_vat		 = 0;
		int tot_unpaid_amt = 0;
		
		int gridData = rx.add( resData , "gridData" , "");
		for(int i = 0; i<ds.curlist.size(); i++) {
			AD_DEP_1310_LCURLISTRecord rec = (AD_DEP_1310_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			String checked = "";
			String bddb_proc_clsf_nm = "";
			if("6".equals(rec.bddb_proc_clsf) || "8".equals(rec.bddb_proc_clsf)){
				checked = "Y";
				bddb_proc_clsf_nm = "措颊贸府";
			}else{
				bddb_proc_clsf_nm = "固贸府";
			}
			rx.add(record, "checked", checked); 
			rx.add(record, "pubc_slip_no", rec.pubc_slip_no); 
			rx.add(record, "pubc_dt", rec.pubc_dt); 
			rx.add(record, "medi_nm", rec.medi_nm);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "vat", rec.vat);
			rx.add(record, "unpaid_amt", rec.unpaid_amt);
			rx.add(record, "bddb_proc_clsf_nm", bddb_proc_clsf_nm);
			rx.add(record, "dlco_no", rec.dlco_no);
			rx.add(record, "agn", rec.agn);
			rx.add(record, "hndl_plac_cd", rec.hndl_plac_cd); 
			rx.add(record, "hndl_clsf", rec.hndl_clsf);
			rx.add(record, "bddb_proc_clsf", rec.bddb_proc_clsf);
			
			tot_advt_fee += StringUtil.toNumber(rec.advt_fee);
			tot_vat += StringUtil.toNumber(rec.vat);
			tot_unpaid_amt += StringUtil.toNumber(rec.unpaid_amt);
		}	
		
		 rx.add( resData , "tot_advt_fee" , tot_advt_fee);
		 rx.add( resData , "tot_vat" , tot_vat);
		 rx.add( resData , "tot_unpaid_amt" , tot_unpaid_amt);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
