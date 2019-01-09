<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.vaca.rec.*
	,	chosun.ciis.hd.vaca.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_VACA_3110_MDataSet ds = (HD_VACA_3110_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	int record = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	int depth1		= 0;
	recordSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST1 BEGIN */	
		depth1 = rx.add(recordSet, "plan_dt", ""); //���ϰ�ȹ�� �޺�
		record = rx.add(depth1, "item", "");
		
		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_VACA_3110_MCURLIST1Record rec = (HD_VACA_3110_MCURLIST1Record)ds.curlist1.get(i);
			if ("PLAN_DT".equals(rec.getCd_type())){
				record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}
		}
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		depth1 = rx.add(recordSet, "proc_stat", "");  //������� �޺�
		record = rx.add(depth1, "item", "");
		rx.add(record, "value", "all");
		rx.add(record, "label", "��ü");
		record = rx.add(depth1, "item", "");
		rx.add(record, "value", "not");
		rx.add(record, "label", "���Է�");
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_VACA_3110_MCURLISTRecord rec = (HD_VACA_3110_MCURLISTRecord)ds.curlist.get(i);
			if ("PROC_STAT".equals(rec.getCd_type())){
				record = rx.add(depth1, "item", "");
				rx.add(record, "value", rec.cd);
				rx.add(record, "label", rec.cdnm);
			}									
		}
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
TrustForm�� Instance ����ο� �����ؼ� ���
<hd_vaca_3110_m>
	<dataSet>
		<CURLIST1>
			<record>
				<cd_type/>
				<cd/>
				<cdnm/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_vaca_3110_m>
*/
%>

<%
/*
TrustForm�� Instance ����ο� �����ؼ� ���
<hd_vaca_3110_m>
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
</hd_vaca_3110_m>
*/
%>

<% /* �ۼ��ð� : Tue Jun 02 16:18:07 KST 2015 */ %>