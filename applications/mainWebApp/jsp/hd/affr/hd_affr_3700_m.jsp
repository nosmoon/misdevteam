<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.affr.rec.*
	,	chosun.ciis.hd.affr.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_AFFR_3700_MDataSet ds = (HD_AFFR_3700_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int record = 0;
	int record2 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	int depth1		= 0;
	int depth2		= 0;
	recordSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		depth1 = rx.add(recordSet, "cmpy_insr_cd", "");  //보험사 콤보
		record = rx.add(depth1, "item", "");
		rx.add(record, "value", "all");
		rx.add(record, "label", "전체");						
		
		for(int i = 0; i < ds.curlist.size(); i++) {  //보험사 콤보
			HD_AFFR_3700_MCURLISTRecord rec = (HD_AFFR_3700_MCURLISTRecord)ds.curlist.get(i);
			if ("CMPY_INSR_CD".equals(rec.getCd_type())){
				record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}									
		}			

		depth1 = rx.add(recordSet, "grid_cmpy_insr_cd", "");  //보험사 콤보_그리드용
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_3700_MCURLISTRecord rec = (HD_AFFR_3700_MCURLISTRecord)ds.curlist.get(i);
			if ("CMPY_INSR_CD".equals(rec.getCd_type())){
				record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}									
		}
		
		depth2 = rx.add(recordSet, "pay_clsf_cd", "");  //지급구분 콤보
		record2 = rx.add(depth2, "item", "");
		rx.add(record2, "value", "all");
		rx.add(record2, "label", "전체");
		
		for(int i = 0; i < ds.curlist1.size(); i++) {  //지급구분 콤보
			HD_AFFR_3700_MCURLIST1Record rec = (HD_AFFR_3700_MCURLIST1Record)ds.curlist1.get(i);
			if ("PAY_CLSF_CD".equals(rec.getCd_type())){
				record2 = rx.add(depth2, "item", "");
				rx.add(record2, "value", rec.cd);
				rx.add(record2, "label", rec.cdnm);
			}									
		}			

		depth2 = rx.add(recordSet, "grid_pay_clsf_cd", "");  //지급구분 콤보_그리드용
		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_AFFR_3700_MCURLIST1Record rec = (HD_AFFR_3700_MCURLIST1Record)ds.curlist1.get(i);
			if ("PAY_CLSF_CD".equals(rec.getCd_type())){
				record2 = rx.add(depth2, "item", "");
				rx.add(record2, "value", rec.cd);
				rx.add(record2, "label", rec.cdnm);
			}									
		}			


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
<hd_affr_3700_m>
	<dataSet>
		<CURLIST>
			<record>
				<cd_type/>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
			</record>
		</CURLIST>
	</dataSet>
</hd_affr_3700_m>
*/
%>

<% /* 작성시간 : Tue Jun 30 11:00:10 KST 2015 */ %>