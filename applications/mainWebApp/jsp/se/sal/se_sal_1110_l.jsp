<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.sal.rec.*
	,	chosun.ciis.se.sal.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_sal_1110_l.jsp
* 기능 :  판매-매출관리-월완납장려금 관리
* 작성일자 : 2009-03-26
* 작성자 : 김진경
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
	RwXml rx = new RwXml();
	SE_SAL_1110_LDataSet ds = (SE_SAL_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
   	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "gridData", "");
	
	int iWkdy = 0;
	String sWkdy = "";

	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SAL_1110_LCURLISTRecord rec = (SE_SAL_1110_LCURLISTRecord)ds.curlist.get(i);
						
	    	int record = rx.add(dataSet, "record", "");
			rx.add(record, "basi_yymm", rec.basi_yymm);
			rx.add(record, "rcpm_yymm", rec.rcpm_yymm);
			rx.add(record, "thmm_1tms_rcpm_dt", rec.thmm_1tms_rcpm_dt);
			iWkdy = Integer.parseInt(rec.thmm_1tms_rcpm_wkdy);
			if(iWkdy == 1) sWkdy = "일";
			if(iWkdy == 2) sWkdy = "월";
			if(iWkdy == 3) sWkdy = "화";
			if(iWkdy == 4) sWkdy = "수";
			if(iWkdy == 5) sWkdy = "목";
			if(iWkdy == 6) sWkdy = "금";
			if(iWkdy == 7) sWkdy = "토";
			rx.add(record, "thmm_1tms_rcpm_wkdy", iWkdy);
			rx.add(record, "thmm_1tms_rcpm_wkdynm", sWkdy);
			rx.add(record, "thmm_2tms_rcpm_dt", rec.thmm_2tms_rcpm_dt);
			iWkdy = Integer.parseInt(rec.thmm_2tms_rcpm_wkdy);
			if(iWkdy == 1) sWkdy = "일";
			if(iWkdy == 2) sWkdy = "월";
			if(iWkdy == 3) sWkdy = "화";
			if(iWkdy == 4) sWkdy = "수";
			if(iWkdy == 5) sWkdy = "목";
			if(iWkdy == 6) sWkdy = "금";
			if(iWkdy == 7) sWkdy = "토";
			rx.add(record, "thmm_2tms_rcpm_wkdy", iWkdy);
			rx.add(record, "thmm_2tms_rcpm_wkdynm", sWkdy);
			rx.add(record, "thmm_1tms_encur_amt", rec.thmm_1tms_encur_amt);
			rx.add(record, "thmm_2tms_encur_amt", rec.thmm_2tms_encur_amt);
			rx.add(record, "thmm_un_pymt_encur_amt", rec.thmm_un_pymt_encur_amt);
			rx.add(record, "thmm_db_encur_amt", rec.thmm_db_encur_amt);
			rx.add(record, "prvmm_1tms_encur_amt", rec.prvmm_1tms_encur_amt);
			rx.add(record, "prvmm_2tms_encur_amt", rec.prvmm_2tms_encur_amt);
			rx.add(record, "prvmm_un_pymt_encur_amt", rec.prvmm_un_pymt_encur_amt);
			rx.add(record, "boy_fpymt_encur_amt", rec.boy_fpymt_encur_amt);
			rx.add(record, "boy_un_pymt_encur_amt", rec.boy_un_pymt_encur_amt);
			rx.add(record, "stetsell_fpymt_encur_amt", rec.stetsell_fpymt_encur_amt);
			rx.add(record, "stetsell_un_pymt_encur_amt", rec.stetsell_un_pymt_encur_amt);
			rx.add(record, "edus_fpymt_encur_amt", rec.edus_fpymt_encur_amt);
			rx.add(record, "edus_un_pymt_encur_amt", rec.edus_un_pymt_encur_amt);
		}
	} catch (Exception e) {
	} finally {
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
			<basi_yymm/>
			<rcpm_yymm/>
			<thmm_1tms_rcpm_dt/>
			<thmm_1tms_rcpm_wkdy/>
			<thmm_2tms_rcpm_dt/>
			<thmm_2tms_rcpm_wkdy/>
			<thmm_1tms_encur_amt/>
			<thmm_2tms_encur_amt/>
			<thmm_un_pymt_encur_amt/>
			<thmm_db_encur_amt/>
			<prvmm_1tms_encur_amt/>
			<prvmm_2tms_encur_amt/>
			<prvmm_un_pymt_encur_amt/>
			<boy_fpymt_encur_amt/>
			<boy_un_pymt_encur_amt/>
			<stetsell_fpymt_encur_amt/>
			<stetsell_un_pymt_encur_amt/>
			<edus_fpymt_encur_amt/>
			<edus_un_pymt_encur_amt/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Mar 20 14:09:40 KST 2009 */ %>