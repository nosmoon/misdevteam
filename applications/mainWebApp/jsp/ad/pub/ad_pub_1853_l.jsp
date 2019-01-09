<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.pub.rec.*
	,	chosun.ciis.ad.pub.ds.*;
	"
%>

<%
	String hndl_clsf	=	StringUtil.nvl(request.getParameter("hndl_clsf"));
	
    RwXml rx = new RwXml();
	AD_PUB_1853_LDataSet ds = (AD_PUB_1853_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	
	int resData 	= rx.add(root, "resData2", "");
	int gridData 	= rx.add(resData, "gridData2", "");

	try {
		long   tot_advt_fee     = 0;
		long   tot_vat          = 0;
		long   tot_misu_amt     = 0;
		long   tot_fee          = 0;
		double tot_pubc         = 0.00d;
				
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_PUB_1853_LCURLISTRecord rec = (AD_PUB_1853_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record,"sale_issu_yn",rec.sale_issu_yn);	//발행
			rx.add(record,"pubc_ym",rec.pubc_ym);				//게재년월
			rx.addCData(record,"dlco_nm",rec.dlco_nm);				//광고주명
			
			rx.add(record,"sum_advt",rec.sum_advt);					//광고료
			rx.add(record,"sum_vat",rec.sum_vat);							//부가세
			rx.add(record,"tot_advt_fee",StringUtil.toLong(rec.sum_advt) + StringUtil.toLong(rec.sum_vat));
			rx.add(record,"misu_tot_amt",rec.misu_tot_amt);				//미수총액
			
			rx.addCData(record,"agn_nm",rec.agn_nm);							//대행사명
			rx.add(record,"sum_fee",StringUtil.toLong(rec.sum_fee)-StringUtil.toLong(rec.sum_fee_vat));							//대행료
			rx.add(record,"sum_fee_vat",rec.sum_fee_vat);							//대행료 부가세
			rx.add(record,"cnt",rec.cnt);							//게재건수
			rx.add(record,"rslt_dept",rec.rslt_dept);				//실적부서
			rx.add(record,"tot_fee",StringUtil.toLong(rec.sum_fee));

			tot_advt_fee += StringUtil.toLong(rec.sum_advt);  
			tot_vat      += StringUtil.toLong(rec.sum_vat);
			tot_misu_amt += StringUtil.toLong(rec.misu_tot_amt);
			tot_fee      += StringUtil.toNumber(rec.sum_fee);
			tot_pubc     += StringUtil.toNumber(rec.cnt);			
		}
		
		int resForm2 = rx.add(resData, "resForm2", "");
		
		rx.add(resForm2, "tot_pubc_amt", tot_advt_fee ); 
		rx.add(resForm2, "tot_vat_amt", tot_vat ); 
		rx.add(resForm2, "tot_misu_amt", tot_misu_amt ); 
		rx.add(resForm2, "tot_fee_amt", tot_fee ); 
	    rx.add(resForm2, "tot_pubc", tot_pubc); 

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
