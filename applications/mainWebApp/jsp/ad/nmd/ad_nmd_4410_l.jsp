<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.nmd.rec.*
	,	chosun.ciis.ad.nmd.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_NMD_4410_LDataSet ds = (AD_NMD_4410_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add( root , "resData" , "");
	
	int tot_advt_fee = 0;
	int tot_vat = 0;
	int tot_setoff_advt_fee = 0;
	int tot_setoff_vat = 0;
				
	try {  
		String pre_rcpm_slip_no = "";
		int gridData = rx.add( resData , "gridData" , "");
		for(int i = 0; i<ds.curlist.size(); i++) {
			AD_NMD_4410_LCURLISTRecord rec = (AD_NMD_4410_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
/*			
			if(!pre_rcpm_slip_no.equals(rec.rcpm_slip_no)){
				rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no); 
			}else{
				rx.add(record, "rcpm_slip_no", ""); 
			}
*/
			rx.add(record, "rcpm_slip_no", rec.rcpm_slip_no); 			
			rx.add(record, "medi_nm", rec.medi_nm); 
			rx.add(record, "pubc_dt", rec.pubc_dt); 
			rx.add(record, "pubc_slip_no", rec.pubc_slip_no);
			rx.add(record, "rcpm_shet_no", rec.rcpm_shet_no);
			rx.add(record, "proc_stat", rec.proc_stat);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "advt_fee", rec.advt_fee);
			rx.add(record, "vat", rec.vat);
			rx.add(record, "setoff_advt_fee", rec.setoff_advt_fee);
			rx.add(record, "setoff_vat", rec.setoff_vat);
			
			tot_advt_fee 		+=	StringUtil.toNumber(rec.advt_fee);
			tot_vat 			+=	StringUtil.toNumber(rec.vat);
			tot_setoff_advt_fee +=	StringUtil.toNumber(rec.setoff_advt_fee);
			tot_setoff_vat 		+=	StringUtil.toNumber(rec.setoff_vat);
			
			pre_rcpm_slip_no = rec.rcpm_slip_no;
		}	
		
		rx.add(resData, "tot_advt_fee", tot_advt_fee); 
		rx.add(resData, "tot_vat", tot_vat); 
		rx.add(resData, "tot_setoff_advt_fee", tot_setoff_advt_fee); 
		rx.add(resData, "tot_setoff_vat", tot_setoff_vat); 
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
