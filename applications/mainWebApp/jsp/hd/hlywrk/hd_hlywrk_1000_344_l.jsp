<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.hlywrk.rec.*
	,	chosun.ciis.hd.hlywrk.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_HLYWRK_1000_344_LDataSet ds = (HD_HLYWRK_1000_344_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int depth1 = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");
	System.out.println("ȣ��");
	try {

		/****** CURLIST BEGIN */
				
		depth1 = rx.add(dataSet, "hody_clsf", "");
		System.out.println("1");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_HLYWRK_1000_344_LCURLISTRecord rec = (HD_HLYWRK_1000_344_LCURLISTRecord)ds.curlist.get(i);
			if ("HODY_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(dataSet, "obj_clsf", "");
		System.out.println("2");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_HLYWRK_1000_344_LCURLISTRecord rec = (HD_HLYWRK_1000_344_LCURLISTRecord)ds.curlist.get(i);
			if ("OBJ_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}

		depth1 = rx.add(dataSet, "prsnt_hody_clsf", "");
		System.out.println("3");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_HLYWRK_1000_344_LCURLISTRecord rec = (HD_HLYWRK_1000_344_LCURLISTRecord)ds.curlist.get(i);
			if ("PRSNT_HODY_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}

		depth1 = rx.add(dataSet, "finish_hody_clsf", "");
		System.out.println("4");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_HLYWRK_1000_344_LCURLISTRecord rec = (HD_HLYWRK_1000_344_LCURLISTRecord)ds.curlist.get(i);
			if ("FINISH_HODY_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		
		depth1 = rx.add(dataSet, "finish_dd_clsf", "");
		System.out.println("4");
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_HLYWRK_1000_344_LCURLISTRecord rec = (HD_HLYWRK_1000_344_LCURLISTRecord)ds.curlist.get(i);
			if ("FINISH_DD_CLSF".equals(rec.getCd_type())){
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}

		/****** CURLIST END */

		/****** CURLIST2 BEGIN */
		
		depth1 = rx.add(dataSet, "aply_basi_dt", "");
		
		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_HLYWRK_1000_344_LCURLIST2Record rec = (HD_HLYWRK_1000_344_LCURLIST2Record)ds.curlist2.get(i);
		
				int record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
		}
		
		out.println("ȣ��");
		/****** CURLIST2 END */

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
TrustForm�� Instance ����ο� �����ؼ� ���
<dataSet>
	<CURLIST2>
		<record>
			<cd/>
			<cdnm/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
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
*/
%>

<% /* �ۼ��ð� : Fri Apr 17 10:24:49 KST 2009 */ %>