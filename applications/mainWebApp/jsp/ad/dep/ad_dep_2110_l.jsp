<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	chosun.ciis.co.base.util.*	
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_DEP_2110_LDataSet ds = (AD_DEP_2110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = rx.add(root, "resData", "");
	int gridData = rx.add(resData, "gridData", "");
	
	String prv_nm 	= "";
	String cur_nm 	= "";
	long  af_plus 	= 0;
	long  ra_plus 	= 0;
	long  prv_bal	= 0;
	
	try {
		/****** CURLIST BEGIN */
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_DEP_2110_LCURLISTRecord rec = (AD_DEP_2110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData, "record", "");
			cur_nm = rec.dlco_nm;
			if(!prv_nm.equals(cur_nm)){
				if(i != 0){
					rx.add(record, "dlco_nm", "");
					rx.add(record, "pubc_yymm", "합계");
					rx.add(record, "advt_fee",af_plus);
					rx.add(record, "rcpm_yymm","");
					rx.add(record, "rcpm_amt",ra_plus);
					rx.add(record, "altn_amt", "");	
					double rap = (double)ra_plus;
					double afp = (double)af_plus;
					if(afp == 0){
						afp = 1;
					}
					if("1.00".equals(DigitUtil.cutUnderPoint((rap/afp)*100,2))){
						rx.add(record, "rate", "1.00");
					}
					else{
						rx.add(record, "rate", DigitUtil.cutUnderPoint((rap/afp)*100,2));
					}
					rx.add(record, "bal", prv_bal);
					rx.add(gridData, "record", "");				
				}
				rx.add(record, "dlco_nm", cur_nm);
				af_plus 	= 0;
				ra_plus 	= 0;
				prv_bal 	= 0;
			}
			else{
				rx.add(record, "dlco_nm", "");
			}
			prv_nm = cur_nm;
			String pubc_yyyy = rec.pubc_yymm.substring(0,4);
			String pubc_mm	 = rec.pubc_yymm.substring(4);
			rx.add(record, "pubc_yymm", pubc_yyyy+"년 "+pubc_mm+"월");
			rx.add(record, "advt_fee", rec.advt_fee);
			af_plus += Integer.parseInt(rec.advt_fee);
			String rcpm_yyyy = rec.rcpm_yymm.substring(0,4);
			String rcpm_mm	 = rec.rcpm_yymm.substring(4);
			rx.add(record, "rcpm_yymm", rcpm_yyyy+"년 "+rcpm_mm+"월");
			rx.add(record, "rcpm_amt", rec.rcpm_amt);
			ra_plus += Integer.parseInt(rec.rcpm_amt);
			rx.add(record, "altn_amt", rec.altn_amt);
			rx.add(record, "rate", DigitUtil.cutUnderPoint(rec.rate, 2));
			rx.add(record, "bal", rec.bal);
			prv_bal = Integer.parseInt(rec.bal);
		}
		if(!"".equals(prv_nm)){
			int record = rx.add(gridData, "record", "");
			rx.add(record, "dlco_nm", "");
			rx.add(record, "pubc_yymm", "합계");
			rx.add(record, "advt_fee",af_plus);
			rx.add(record, "rcpm_yymm","");
			rx.add(record, "rcpm_amt",ra_plus);
			rx.add(record, "altn_amt", "");
			double rap = (double)ra_plus;
			double afp = (double)af_plus;
			if(afp == 0){
				afp = 1;
			}
			if("1.00".equals(DigitUtil.cutUnderPoint((rap/afp)*100,2))){
				rx.add(record, "rate", "1.00");
			}
			else{
				rx.add(record, "rate", DigitUtil.cutUnderPoint((rap/afp)*100,2));
			}
			rx.add(record, "bal", prv_bal);
		}
					
		/****** CURLIST END */

	}
	catch (Exception e) {
		System.out.println(e.getLocalizedMessage());
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
			<dlco_nm/>
			<pubc_yymm/>
			<advt_fee/>
			<rcpm_yymm/>
			<rcpm_amt/>
			<altn_amt/>
			<rate/>
			<bal/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Apr 02 21:03:58 KST 2009 */ %>