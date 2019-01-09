<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.lvcmpy.rec.*
	,	chosun.ciis.hd.lvcmpy.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_LVCMPY_3502_LDataSet ds = (HD_LVCMPY_3502_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_LVCMPY_3502_LCURLISTRecord rec = (HD_LVCMPY_3502_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(dataSet, "record", "");

			long a01 = 0;
			long a02 = 0;
			long a03 = 0;
			long a04 = 0;
			long a05 = 0;
			long a06 = 0;
			long a07 = 0;
			long a08 = 0;
			long a09 = 0;
			long a10 = 0;
			long a11 = 0;
			long a12 = 0;
			
			if(rec.acml_amt01 == ""){
				a01 = 0;
			}else{
				a01 = Long.parseLong(rec.acml_amt01);
			}
			if(rec.acml_amt02 == ""){
				a02 = 0;
			}else{
				a02 = Long.parseLong(rec.acml_amt02);
			}
			if(rec.acml_amt03 == ""){
				a03 = 0;
			}else{
				a03 = Long.parseLong(rec.acml_amt03);
			}
			if(rec.acml_amt04 == ""){
				a04 = 0;
			}else{
				a04 = Long.parseLong(rec.acml_amt04);
			}
			if(rec.acml_amt05 == ""){
				a05 = 0;
			}else{
				a05 = Long.parseLong(rec.acml_amt05);
			}
			if(rec.acml_amt06 == ""){
				a06 = 0;
			}else{
				a06 = Long.parseLong(rec.acml_amt06);
			}
			if(rec.acml_amt07 == ""){
				a07 = 0;
			}else{
				a07 = Long.parseLong(rec.acml_amt07);
			}
			if(rec.acml_amt08 == ""){
				a08 = 0;
			}else{
				a08 = Long.parseLong(rec.acml_amt08);
			}
			if(rec.acml_amt09 == ""){
				a09 = 0;
			}else{
				a09 = Long.parseLong(rec.acml_amt09);
			}
			if(rec.acml_amt10 == ""){
				a10 = 0;
			}else{
				a10 = Long.parseLong(rec.acml_amt10);
			}
			if(rec.acml_amt11 == ""){
				a11 = 0;
			}else{
				a11 = Long.parseLong(rec.acml_amt11);
			}
			if(rec.acml_amt12 == ""){
				a12 = 0;
			}else{
				a12 =   Long.parseLong(rec.acml_amt12 );
			}
			
			long acml_amt_tot = a01 + a02 + a03 + a04 + a05 + a06 + a07 + a08 + a09 + a10 + a11 + a12;
			//int acml_amt_tot = Long.parseLong(rec.acml_amt01) + Long.parseLong(rec.acml_amt02) + Long.parseLong(rec.acml_amt03)
			//+ Long.parseLong(rec.acml_amt04) + Long.parseLong(rec.acml_amt05) + Long.parseLong(rec.acml_amt06)
			//+ Long.parseLong(rec.acml_amt07) + Long.parseLong(rec.acml_amt08) + Long.parseLong(rec.acml_amt09)
			//+ Long.parseLong(rec.acml_amt10) + Long.parseLong(rec.acml_amt11) + Long.parseLong(rec.acml_amt12);
			
			rx.add(record, "dept_name", rec.dept_name);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "dty_name", rec.dty_name);
			rx.add(record, "posi_name", rec.posi_name);
			rx.add(record, "acml_amt01", a01);
			rx.add(record, "acml_amt02", a02);
			rx.add(record, "acml_amt03", a03);
			rx.add(record, "acml_amt04", a04);
			rx.add(record, "acml_amt05", a05);
			rx.add(record, "acml_amt06", a06);
			rx.add(record, "acml_amt07", a07);
			rx.add(record, "acml_amt08", a08);
			rx.add(record, "acml_amt09", a09);
			rx.add(record, "acml_amt10", a10);
			rx.add(record, "acml_amt11", a11);
			rx.add(record, "acml_amt12", a12);
			rx.add(record, "acml_amt_tot", acml_amt_tot + "");
			rx.add(record, "lvcmpy_saly_estm_amt", rec.lvcmpy_saly_estm_amt);
			
			
		}
		rx.add(dataSet, "totalcnt", ds.curlist.size());
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
			<dept_name/>
			<emp_no/>
			<nm_korn/>
			<dty_name/>
			<posi_name/>
			<acml_amt01/>
			<acml_amt02/>
			<acml_amt03/>
			<acml_amt04/>
			<acml_amt05/>
			<acml_amt06/>
			<acml_amt07/>
			<acml_amt08/>
			<acml_amt09/>
			<acml_amt10/>
			<acml_amt11/>
			<acml_amt12/>
		</record>
	</CURLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Sat Jun 13 16:13:58 KST 2009 */ %>