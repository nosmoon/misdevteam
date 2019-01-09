<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*	
	,	chosun.ciis.ad.common.rec.*
	,	chosun.ciis.ad.common.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_CO_1700_LDataSet ds = (AD_CO_1700_LDataSet)request.getAttribute("ds");
	int root 		= RwXml.rootNodeID;

	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");	
	try {
		/****** CURLIST BEGIN */
		long   tot_dffn_fee          = 0;
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_CO_1700_LCURLISTRecord rec = (AD_CO_1700_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			if(rec.gb.equals("1")){
				rx.add(record, "gb", "증감");
			}else if(rec.gb.equals("2")){
				rx.add(record, "gb","추가");
			}else if(rec.gb.equals("3")){
				rx.add(record, "gb","삭제");
			}else{
				rx.add(record, "gb","");
			}
			rx.add(record, "seq", rec.seq);
			rx.add(record, "sect", rec.sect);
			rx.add(record, "dn", rec.dn);
			rx.add(record, "cm", rec.cm);
			rx.add(record, "advt_cont", rec.advt_cont);
			rx.add(record, "dlco_nm", rec.dlco_nm);
			rx.add(record, "preng_uprc", rec.preng_uprc);
			rx.add(record, "preng_fee", rec.preng_fee);
			rx.add(record, "asum_uprc", rec.asum_uprc);
			rx.add(record, "asum_fee", rec.asum_fee);
			rx.add(record, "dffn_fee", rec.dffn_fee);
			rx.add(record, "slcrg_pers", rec.slcrg_pers);
			
			tot_dffn_fee += StringUtil.toLong(rec.dffn_fee);
		}
		/****** CURLIST END */
		int tempData  = rx.add(resData,"tempData","");
		rx.add(tempData, "preng_fee", ds.preng_fee ); 
		rx.add(tempData, "asum_fee", ds.asum_fee ); 
		rx.add(tempData, "pa_fee", StringUtil.toLong(ds.preng_fee) - StringUtil.toLong(ds.asum_fee)); 
		rx.add(tempData, "tot_dffn_fee", tot_dffn_fee ); 
		System.out.println("tot_dffn_fee::"+tot_dffn_fee);
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<dlco_no/>
			<dlco_nm/>
			<ern/>
			<presi_nm/>
			<eps_clsf_cd/>
			<addr/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Wed Jan 14 16:24:43 KST 2009 */ %>