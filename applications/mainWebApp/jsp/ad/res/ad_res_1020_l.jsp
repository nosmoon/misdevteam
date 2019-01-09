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
	AD_RES_1020_LDataSet ds = (AD_RES_1020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
//	int resData = rx.add(root, "resData", "");

	try {
		int gridData3 = rx.add(root, "gridData3", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_RES_1020_LCURLISTRecord rec = (AD_RES_1020_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(gridData3, "record", "");
			int issu_size = 0;
			String wkdy_nm	  = "";
			if("1".equals(rec.wkdy))      wkdy_nm = "��";
			else if("2".equals(rec.wkdy)) wkdy_nm = "��";
			else if("3".equals(rec.wkdy)) wkdy_nm = "ȭ";
			else if("4".equals(rec.wkdy)) wkdy_nm = "��";
			else if("5".equals(rec.wkdy)) wkdy_nm = "��";
			else if("6".equals(rec.wkdy)) wkdy_nm = "��";
			else if("7".equals(rec.wkdy)) wkdy_nm = "��";
			
			issu_size += StringUtil.toNumber(rec.end_side1);
			issu_size += StringUtil.toNumber(rec.end_side2);
			issu_size += StringUtil.toNumber(rec.end_side3);
			issu_size += StringUtil.toNumber(rec.end_side4);
			issu_size += StringUtil.toNumber(rec.end_side5);
			 
			rx.add(record, "wkdy", rec.wkdy);
			rx.add(record, "wkdy_nm", wkdy_nm);
			rx.add(record, "issu_size", String.valueOf(issu_size));
			rx.add(record, "sect_clas_cd1", rec.sect_clas_cd1);
			rx.add(record, "sect_nm_cd1", rec.sect_nm_cd1); 
			rx.add(record, "sect_cd1", rec.sect_cd1);
			rx.add(record, "bgn_side1", rec.bgn_side1);
			rx.add(record, "end_side1", rec.end_side1);
			rx.add(record, "sect_clas_cd2", rec.sect_clas_cd2);
			rx.add(record, "sect_nm_cd2", rec.sect_nm_cd2); 
			rx.add(record, "sect_cd2", rec.sect_cd2);
			rx.add(record, "bgn_side2", rec.bgn_side2);
			rx.add(record, "end_side2", rec.end_side2);
			rx.add(record, "sect_clas_cd3", rec.sect_clas_cd3);
			rx.add(record, "sect_nm_cd3", rec.sect_nm_cd3); 
			rx.add(record, "sect_cd3", rec.sect_cd3);
			rx.add(record, "bgn_side3", rec.bgn_side3);
			rx.add(record, "end_side3", rec.end_side3);
			rx.add(record, "sect_clas_cd4", rec.sect_clas_cd4);
			rx.add(record, "sect_nm_cd4", rec.sect_nm_cd4); 
			rx.add(record, "sect_cd4", rec.sect_cd4);
			rx.add(record, "bgn_side4", rec.bgn_side4);
			rx.add(record, "end_side4", rec.end_side4);
			rx.add(record, "sect_clas_cd5", rec.sect_clas_cd5);
			rx.add(record, "sect_nm_cd5", rec.sect_nm_cd5); 
			rx.add(record, "sect_cd5", rec.sect_cd5);
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
TrustForm�� Instance ����ο� �����ؼ� ���
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

<% /* �ۼ��ð� : Thu Jan 22 11:03:29 KST 2009 */ %>