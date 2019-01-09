<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.cost.rec.*
	,	chosun.ciis.hd.cost.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_COST_1009_MDataSet ds = (HD_COST_1009_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
	
	/****** CURLIST10 BEGIN */
		rx.add(dataSet, "pay_cost", ds.getPay_cost());
		recordSet = rx.add(dataSet, "dtl_medi_cd10", "");

		for(int i = 0; i < ds.curlist10.size(); i++) {
			HD_COST_1009_MCURLIST10Record rec = (HD_COST_1009_MCURLIST10Record)ds.curlist10.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cd + " " + rec.cdnm);
			rx.add(record, "mang_cd_1", rec.mang_cd_1);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_1", StringUtil.replaceToXml(rec.mang_cd_1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist10.size());
		/****** CURLIST10 END */

		/****** CURLIST9 BEGIN */
		recordSet = rx.add(dataSet, "dtl_medi_cd9", "");

		for(int i = 0; i < ds.curlist9.size(); i++) {
			HD_COST_1009_MCURLIST9Record rec = (HD_COST_1009_MCURLIST9Record)ds.curlist9.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cd + " " + rec.cdnm);
			rx.add(record, "mang_cd_1", rec.mang_cd_1);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_1", StringUtil.replaceToXml(rec.mang_cd_1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist9.size());
		/****** CURLIST9 END */

		/****** CURLIST8 BEGIN */
		recordSet = rx.add(dataSet, "dtl_medi_cd8", "");

		for(int i = 0; i < ds.curlist8.size(); i++) {
			HD_COST_1009_MCURLIST8Record rec = (HD_COST_1009_MCURLIST8Record)ds.curlist8.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cd + " " + rec.cdnm);
			rx.add(record, "mang_cd_1", rec.mang_cd_1);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_1", StringUtil.replaceToXml(rec.mang_cd_1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist8.size());
		/****** CURLIST8 END */

		/****** CURLIST7 BEGIN */
		recordSet = rx.add(dataSet, "dtl_medi_cd7", "");

		for(int i = 0; i < ds.curlist7.size(); i++) {
			HD_COST_1009_MCURLIST7Record rec = (HD_COST_1009_MCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cd + " " + rec.cdnm);
			rx.add(record, "mang_cd_1", rec.mang_cd_1);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_1", StringUtil.replaceToXml(rec.mang_cd_1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist7.size());
		/****** CURLIST7 END */

		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "dtl_medi_cd6", "");

		for(int i = 0; i < ds.curlist6.size(); i++) {
			HD_COST_1009_MCURLIST6Record rec = (HD_COST_1009_MCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cd + " " + rec.cdnm);
			rx.add(record, "mang_cd_1", rec.mang_cd_1);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_1", StringUtil.replaceToXml(rec.mang_cd_1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */
		
		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "dtl_medi_cd5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			HD_COST_1009_MCURLIST5Record rec = (HD_COST_1009_MCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cd + " " + rec.cdnm);
			rx.add(record, "mang_cd_1", rec.mang_cd_1);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_1", StringUtil.replaceToXml(rec.mang_cd_1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */

		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "dtl_medi_cd4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			HD_COST_1009_MCURLIST4Record rec = (HD_COST_1009_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cd + " " + rec.cdnm);
			rx.add(record, "mang_cd_1", rec.mang_cd_1);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_1", StringUtil.replaceToXml(rec.mang_cd_1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "dtl_medi_cd3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_COST_1009_MCURLIST3Record rec = (HD_COST_1009_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cd + " " + rec.cdnm);
			rx.add(record, "mang_cd_1", rec.mang_cd_1);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_1", StringUtil.replaceToXml(rec.mang_cd_1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "dtl_medi_cd2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_COST_1009_MCURLIST2Record rec = (HD_COST_1009_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cd + " " + rec.cdnm);
			rx.add(record, "mang_cd_1", rec.mang_cd_1);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_1", StringUtil.replaceToXml(rec.mang_cd_1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "dtl_medi_cd1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_COST_1009_MCURLIST1Record rec = (HD_COST_1009_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cd + " " + rec.cdnm);
			rx.add(record, "mang_cd_1", rec.mang_cd_1);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_1", StringUtil.replaceToXml(rec.mang_cd_1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */
		
		/****** CURLIST0 BEGIN */
		recordSet = rx.add(dataSet, "medi_cd", "");

		for(int i = 0; i < ds.curlist0.size(); i++) {
			HD_COST_1009_MCURLIST0Record rec = (HD_COST_1009_MCURLIST0Record)ds.curlist0.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd", rec.cd);
			rx.addCData(record, "cdnm", rec.cd + " " + rec.cdnm);
			rx.add(record, "mang_cd_1", rec.mang_cd_1);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "mang_cd_1", StringUtil.replaceToXml(rec.mang_cd_1));
		}
		rx.add(recordSet, "totalcnt", ds.curlist0.size());
		/****** CURLIST0 END */
		

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
<hd_cost_1009_m>
	<dataSet>
		<CURLIST5>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_1/>
			</record>
		</CURLIST5>
	</dataSet>
</hd_cost_1009_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_cost_1009_m>
	<dataSet>
		<CURLIST4>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_1/>
			</record>
		</CURLIST4>
	</dataSet>
</hd_cost_1009_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_cost_1009_m>
	<dataSet>
		<CURLIST3>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_1/>
			</record>
		</CURLIST3>
	</dataSet>
</hd_cost_1009_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_cost_1009_m>
	<dataSet>
		<CURLIST2>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_1/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_cost_1009_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_cost_1009_m>
	<dataSet>
		<CURLIST1>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_1/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_cost_1009_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_cost_1009_m>
	<dataSet>
		<CURLIST10>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_1/>
			</record>
		</CURLIST10>
	</dataSet>
</hd_cost_1009_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_cost_1009_m>
	<dataSet>
		<CURLIST9>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_1/>
			</record>
		</CURLIST9>
	</dataSet>
</hd_cost_1009_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_cost_1009_m>
	<dataSet>
		<CURLIST8>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_1/>
			</record>
		</CURLIST8>
	</dataSet>
</hd_cost_1009_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_cost_1009_m>
	<dataSet>
		<CURLIST7>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_1/>
			</record>
		</CURLIST7>
	</dataSet>
</hd_cost_1009_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_cost_1009_m>
	<dataSet>
		<CURLIST6>
			<record>
				<cd/>
				<cdnm/>
				<mang_cd_1/>
			</record>
		</CURLIST6>
	</dataSet>
</hd_cost_1009_m>
*/
%>

<% /* 작성시간 : Wed Jul 04 11:08:48 KST 2012 */ %>