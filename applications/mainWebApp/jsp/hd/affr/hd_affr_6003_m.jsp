<%@page import="java.text.DecimalFormat"%>
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
	HD_AFFR_6003_MDataSet ds = (HD_AFFR_6003_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		DecimalFormat format = new DecimalFormat("000");
		String[] xxCd010 = ds.getXx_cd_010().split(",");
		for(int i=0; i<xxCd010.length; i++) {
			String number = format.format((i+1)*10);
			rx.add(dataSet, "xx_cd_"+number, xxCd010[i]);
		}
		
		/****** CURLIST BEGIN */
		depth1 = rx.add(dataSet, "issu_clsf_cd", "");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_6003_MCURLISTRecord rec = (HD_AFFR_6003_MCURLISTRecord)ds.curlist.get(i);
			if ("ISSU_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", StringUtil.replaceToXml(rec.cd));
				rx.add(record, "label", StringUtil.replaceToXml(rec.cdnm));
			}
		}
		
		depth1 = rx.add(dataSet, "certi_clsf_cd", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_AFFR_6003_MCURLISTRecord rec = (HD_AFFR_6003_MCURLISTRecord)ds.curlist.get(i);
			if ("CERTI_CLSF_CD".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", StringUtil.replaceToXml(rec.cd));
				rx.add(record, "label", StringUtil.replaceToXml(rec.cdnm));
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
<hd_affr_6003_m>
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
</hd_affr_6003_m>
*/
%>

<% /* 작성시간 : Mon Dec 07 12:58:41 KST 2009 */ %>