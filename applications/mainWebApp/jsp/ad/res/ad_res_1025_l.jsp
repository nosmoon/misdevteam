<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,   chosun.ciis.co.base.util.*
	,	chosun.ciis.ad.res.rec.*
	,	chosun.ciis.ad.res.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_RES_1025_LDataSet ds = (AD_RES_1025_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
//	int resData = rx.add(root, "resData", "");

	try {
		int gridData4 = rx.add(root, "gridData4", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_RES_1025_LCURLISTRecord rec = (AD_RES_1025_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData4, "record", "");
			
			int issu_size = 0;
			String wkdy_nm	  = "";
			
			if("1".equals(rec.wkdy))      wkdy_nm = "일";
			else if("2".equals(rec.wkdy)) wkdy_nm = "월";
			else if("3".equals(rec.wkdy)) wkdy_nm = "화";
			else if("4".equals(rec.wkdy)) wkdy_nm = "수";
			else if("5".equals(rec.wkdy)) wkdy_nm = "목";
			else if("6".equals(rec.wkdy)) wkdy_nm = "금";
			else if("7".equals(rec.wkdy)) wkdy_nm = "토";
			
			issu_size += StringUtil.toNumber(rec.end_side1);
			issu_size += StringUtil.toNumber(rec.end_side2);
			issu_size += StringUtil.toNumber(rec.end_side3);
			issu_size += StringUtil.toNumber(rec.end_side4);
			issu_size += StringUtil.toNumber(rec.end_side5);
			
			rx.add(record, "wkdy", rec.wkdy);
			rx.add(record, "wkdy_nm", wkdy_nm);
			rx.add(record, "issu_size", String.valueOf(issu_size));//rec.issu_size);
			rx.add(record, "bgn_side1", rec.bgn_side1);
			rx.add(record, "end_side1", rec.end_side1);
			rx.add(record, "bgn_side2", rec.bgn_side2);
			rx.add(record, "end_side2", rec.end_side2);
			rx.add(record, "bgn_side3", rec.bgn_side3);
			rx.add(record, "end_side3", rec.end_side3);
			rx.add(record, "bgn_side4", rec.bgn_side4);
			rx.add(record, "end_side4", rec.end_side4);
			rx.add(record, "bgn_side5", rec.bgn_side5);
			rx.add(record, "end_side5", rec.end_side5);
  
		}	
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
			<wkdy/>
			<sect_clas_cd/>
			<sect_nm_cd/>
			<sect_cd/>
			<bgn_side/>
			<end_side/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Thu Jan 22 11:03:29 KST 2009 */ %>