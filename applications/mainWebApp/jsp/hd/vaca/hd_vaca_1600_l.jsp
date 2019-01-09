<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_1600_LDataSet ds = (HD_VACA_1600_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	int totalcnt01 = 0;
	int totalcnt02 = 0;
	int totalcnt03 = 0;
	dataSet = rx.add(root, "tempData", "");

	try {
		
		depth1 = rx.add(dataSet, "rhdrk_clsf", "");		//공가  구분 
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1600_LCURLISTRecord rec = (HD_VACA_1600_LCURLISTRecord)ds.curlist.get(i);
			if ("RHDRK_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_4", rec.mang_cd_4);
				totalcnt01++;
			}
		}

		
		depth1 = rx.add(dataSet, "rudwh_clsf", "");	//경조 구분 
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1600_LCURLISTRecord rec = (HD_VACA_1600_LCURLISTRecord)ds.curlist.get(i);
			if ("RUDWH_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_4", rec.mang_cd_4);
				totalcnt01++;
			}
		}
		
		depth1 = rx.add(dataSet, "dusck_clsf", "");	//연차 구분
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1600_LCURLISTRecord rec = (HD_VACA_1600_LCURLISTRecord)ds.curlist.get(i);
			if ("DUSCK_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_4", rec.mang_cd_4);
				totalcnt02++;
			}
		}
		
		depth1 = rx.add(dataSet, "alvc_clsf", "");	//대휴구분
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1600_LCURLISTRecord rec = (HD_VACA_1600_LCURLISTRecord)ds.curlist.get(i);
			if ("ALVC_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_4", rec.mang_cd_4);
				totalcnt02++;
			}
		}
		
		depth1 = rx.add(dataSet, "retvc_clsf", "");	//안식구분
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1600_LCURLISTRecord rec = (HD_VACA_1600_LCURLISTRecord)ds.curlist.get(i);
			if ("RETVC_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_4", rec.mang_cd_4);
				totalcnt02++;
			}
		}
		
		depth1 = rx.add(dataSet, "vaca_clsf", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1600_LCURLISTRecord rec = (HD_VACA_1600_LCURLISTRecord)ds.curlist.get(i);
			if ("VACA_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cd_abrv_nm);
				rx.add(record, "remk", rec.remk);
				rx.add(record, "mang_cd_4", rec.mang_cd_4);
				totalcnt03++;
			}
		}

		/****** CURLIST BEGIN */
		/*
		
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_1600_LCURLISTRecord rec = (HD_VACA_1600_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd_type", rec.cd_type);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "remk", rec.remk);
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		*/
		/****** CURLIST END */

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
	<CURLIST>
		<record>
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
			<remk/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 27 12:57:51 KST 2009 */ %>