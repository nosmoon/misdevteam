<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.info.rec.*
	,	chosun.ciis.hd.info.ds.*
	,   somo.framework.util.Util;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_INFO_2500_LDataSet ds = (HD_INFO_2500_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_INFO_2500_LCURLIST3Record rec = (HD_INFO_2500_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "group_month", rec.group_month);
			rx.add(record, "faml_emp_cnt", rec.faml_emp_cnt);
			rx.add(record, "fmal_duty_dds", rec.fmal_duty_dds);
			rx.add(record, "fmal_duty_tm", rec.fmal_duty_tm);
			
			if(rec.fmal_pay_amt.length()>3){
				rx.add(record, "fmal_pay_amt", rec.fmal_pay_amt.substring(0,(rec.fmal_pay_amt.length()-3)));
			}else {
				rx.add(record, "fmal_pay_amt", "0");
			}
			
			HD_INFO_2500_LCURLIST2Record rec1 = (HD_INFO_2500_LCURLIST2Record)ds.curlist2.get(i);
		//	rx.add(record, "group_month", rec1.group_month);
			rx.add(record, "imsi_emp_cnt", rec1.imsi_emp_cnt);
			rx.add(record, "imsi_duty_dt", rec1.imsi_duty_dt);
			rx.add(record, "imsi_duty_tm", rec1.imsi_duty_tm);
			
			if(rec1.imsi_pay_amt.length()>3){
				rx.add(record, "imsi_pay_amt", rec1.imsi_pay_amt.substring(0,(rec1.imsi_pay_amt.length()-3)));
			}else {
				rx.add(record, "imsi_pay_amt","0");
			}
			
			
			HD_INFO_2500_LCURLISTRecord rec2 = (HD_INFO_2500_LCURLISTRecord)ds.curlist.get(i);
		//	rx.add(record, "group_month", rec2.group_month);
			rx.add(record, "emp_cnt", rec2.emp_cnt);
			rx.add(record, "fix_labr_dds", rec2.fix_labr_dds);
			rx.add(record, "no_duty_dds", rec2.no_duty_dds);
			rx.add(record, "paid_duty_dds", rec2.paid_duty_dds);
			rx.add(record, "fix_labr_tm", rec2.fix_labr_tm);
			rx.add(record, "paid_duty_tm", rec2.paid_duty_tm);

			if(rec2.tot_pay_saly_sum.length()>3){
				rx.add(record, "tot_pay_saly_sum", rec2.tot_pay_saly_sum.substring(0,(rec2.tot_pay_saly_sum.length()-3)));
			}else {
				rx.add(record, "tot_pay_saly_sum", "0");
			}

			if(rec2.rgla_saly_sum.length() > 3)
			{
				rx.add(record, "rgla_saly_sum", rec2.rgla_saly_sum.substring(0,(rec2.rgla_saly_sum.length()-3)));
			} else {
				rx.add(record, "rgla_saly_sum","0");
			}

			if(rec2.rgla_saly_sum.length() > 3)
			{	
				rx.add(record, "add_saly_sum", rec2.add_saly_sum.substring(0,(rec2.add_saly_sum.length()-3)));
			} else {
				rx.add(record, "add_saly_sum", "0");
							
			}
//			rx.add(record, "add_saly_sum_tmp", rec2.add_saly_sum.substring(0,(rec2.add_saly_sum.length()-3)));
			if(rec2.etc_saly_amt_sum.length() > 3) 
			{
				rx.add(record, "etc_saly_amt_sum", rec2.etc_saly_amt_sum.substring(0,(rec2.etc_saly_amt_sum.length()-3)));
			} else {
				rx.add(record, "etc_saly_amt_sum", "0");
			}
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */
		
		
		
		
		
		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");
		
		for(int i = 0; i < ds.curlist4.size(); i++) {
		
			HD_INFO_2500_LCURLIST6Record rec6 = (HD_INFO_2500_LCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "group_month", rec6.group_month);
			rx.add(record, "faml_emp_cnt", rec6.faml_emp_cnt);
			rx.add(record, "fmal_duty_dds", rec6.fmal_duty_dds);
			rx.add(record, "fmal_duty_tm", rec6.fmal_duty_tm);
			
			if(rec6.fmal_pay_amt.length()>3){
				rx.add(record, "fmal_pay_amt", rec6.fmal_pay_amt.substring(0,(rec6.fmal_pay_amt.length()-3)));
			}else {
				rx.add(record, "fmal_pay_amt", "0");
			}
			
			HD_INFO_2500_LCURLIST5Record rec5 = (HD_INFO_2500_LCURLIST5Record)ds.curlist5.get(i);
		//	rx.add(record, "group_month", rec1.group_month);
			rx.add(record, "imsi_emp_cnt", rec5.imsi_emp_cnt);
			rx.add(record, "imsi_duty_dt", rec5.imsi_duty_dt);
			rx.add(record, "imsi_duty_tm", rec5.imsi_duty_tm);
			
			if(rec5.imsi_pay_amt.length()>3){
				rx.add(record, "imsi_pay_amt", rec5.imsi_pay_amt.substring(0,(rec5.imsi_pay_amt.length()-3)));
			}else {
				rx.add(record, "imsi_pay_amt","0");
			}
			
			
			HD_INFO_2500_LCURLIST4Record rec4 = (HD_INFO_2500_LCURLIST4Record)ds.curlist4.get(i);
		//	rx.add(record, "group_month", rec2.group_month);
			rx.add(record, "emp_cnt", rec4.emp_cnt);
			rx.add(record, "fix_labr_dds", rec4.fix_labr_dds);
			rx.add(record, "no_duty_dds", rec4.no_duty_dds);
			rx.add(record, "paid_duty_dds", rec4.paid_duty_dds);
			rx.add(record, "fix_labr_tm", rec4.fix_labr_tm);
			rx.add(record, "paid_duty_tm", rec4.paid_duty_tm);

			if(rec4.tot_pay_saly_sum.length()>3){
				rx.add(record, "tot_pay_saly_sum", rec4.tot_pay_saly_sum.substring(0,(rec4.tot_pay_saly_sum.length()-3)));
			}else {
				rx.add(record, "tot_pay_saly_sum", "0");
			}

			if(rec4.rgla_saly_sum.length() > 3)
			{
				rx.add(record, "rgla_saly_sum", rec4.rgla_saly_sum.substring(0,(rec4.rgla_saly_sum.length()-3)));
			} else {
				rx.add(record, "rgla_saly_sum","0");
			}

			if(rec4.rgla_saly_sum.length() > 3)
			{	
				rx.add(record, "add_saly_sum", rec4.add_saly_sum.substring(0,(rec4.add_saly_sum.length()-3)));
			} else {
				rx.add(record, "add_saly_sum", "0");
							
			}
//			rx.add(record, "add_saly_sum_tmp", rec2.add_saly_sum.substring(0,(rec2.add_saly_sum.length()-3)));
			if(rec4.etc_saly_amt_sum.length() > 3) 
			{
				rx.add(record, "etc_saly_amt_sum", rec4.etc_saly_amt_sum.substring(0,(rec4.etc_saly_amt_sum.length()-3)));
			} else {
				rx.add(record, "etc_saly_amt_sum", "0");
			}
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST3 END */

	}
	catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}
	finally {
		rx.add(dataSet, "errcode", errcode);
		rx.add(dataSet, "errmsg", errmsg);
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST3>
		<record>
			<group_month/>
			<faml_emp_cnt/>
			<fmal_duty_dds/>
			<fmal_duty_tm/>
			<fmal_pay_amt/>
		</record>
	</CURLIST3>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<group_month/>
			<imsi_emp_cnt/>
			<imsi_duty_dt/>
			<imsi_duty_tm/>
			<imsi_pay_amt/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST>
		<record>
			<group_month/>
			<emp_cnt/>
			<fix_labr_dds/>
			<no_duty_dds/>
			<paid_duty_dds/>
			<fix_labr_tm/>
			<paid_duty_tm/>
			<tot_pay_saly_sum/>
			<rgla_saly_sum/>
			<add_saly_sum/>
			<etc_saly_amt_sum/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Jun 05 14:27:10 KST 2009 */ %>