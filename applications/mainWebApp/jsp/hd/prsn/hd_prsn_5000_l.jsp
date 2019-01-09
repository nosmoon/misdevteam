<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.hd.prsn.rec.*
	,	chosun.ciis.hd.prsn.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_PRSN_5000_LDataSet ds = (HD_PRSN_5000_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			HD_PRSN_5000_LCURLIST5Record rec = (HD_PRSN_5000_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "eip_cnt", rec.eip_cnt);
			rx.add(record, "erp_cnt", rec.erp_cnt);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "eip_cnt", StringUtil.replaceToXml(rec.eip_cnt));
			//rx.add(record, "erp_cnt", StringUtil.replaceToXml(rec.erp_cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */

		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			HD_PRSN_5000_LCURLIST4Record rec = (HD_PRSN_5000_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "eip_cnt", rec.eip_cnt);
			rx.add(record, "erp_cnt", rec.erp_cnt);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "eip_cnt", StringUtil.replaceToXml(rec.eip_cnt));
			//rx.add(record, "erp_cnt", StringUtil.replaceToXml(rec.erp_cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			HD_PRSN_5000_LCURLIST3Record rec = (HD_PRSN_5000_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "eip_cnt", rec.eip_cnt);
			rx.add(record, "erp_cnt", rec.erp_cnt);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "eip_cnt", StringUtil.replaceToXml(rec.eip_cnt));
			//rx.add(record, "erp_cnt", StringUtil.replaceToXml(rec.erp_cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_PRSN_5000_LCURLIST2Record rec = (HD_PRSN_5000_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "eip_cnt", rec.eip_cnt);
			rx.add(record, "erp_cnt", rec.erp_cnt);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "eip_cnt", StringUtil.replaceToXml(rec.eip_cnt));
			//rx.add(record, "erp_cnt", StringUtil.replaceToXml(rec.erp_cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_PRSN_5000_LCURLIST1Record rec = (HD_PRSN_5000_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "eip_cnt", rec.eip_cnt);
			rx.add(record, "erp_cnt", rec.erp_cnt);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "eip_cnt", StringUtil.replaceToXml(rec.eip_cnt));
			//rx.add(record, "erp_cnt", StringUtil.replaceToXml(rec.erp_cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			HD_PRSN_5000_LCURLISTRecord rec = (HD_PRSN_5000_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "flnm", rec.flnm);
			rx.add(record, "pgm_id", rec.pgm_id);
			rx.add(record, "pgm_nm", rec.pgm_nm);
			rx.add(record, "annc_frdt", rec.annc_frdt);
			rx.add(record, "annc_todt", rec.annc_todt);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "flnm", StringUtil.replaceToXml(rec.flnm));
			//rx.add(record, "pgm_id", StringUtil.replaceToXml(rec.pgm_id));
			//rx.add(record, "pgm_nm", StringUtil.replaceToXml(rec.pgm_nm));
			//rx.add(record, "annc_frdt", StringUtil.replaceToXml(rec.annc_frdt));
			//rx.add(record, "annc_todt", StringUtil.replaceToXml(rec.annc_todt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

		/****** CURLIST9 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST9", "");

		for(int i = 0; i < ds.curlist9.size(); i++) {
			HD_PRSN_5000_LCURLIST9Record rec = (HD_PRSN_5000_LCURLIST9Record)ds.curlist9.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "eip_cnt", rec.eip_cnt);
			rx.add(record, "erp_cnt", rec.erp_cnt);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "eip_cnt", StringUtil.replaceToXml(rec.eip_cnt));
			//rx.add(record, "erp_cnt", StringUtil.replaceToXml(rec.erp_cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist9.size());
		/****** CURLIST9 END */

		/****** CURLIST8 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST8", "");

		for(int i = 0; i < ds.curlist8.size(); i++) {
			HD_PRSN_5000_LCURLIST8Record rec = (HD_PRSN_5000_LCURLIST8Record)ds.curlist8.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "eip_cnt", rec.eip_cnt);
			rx.add(record, "erp_cnt", rec.erp_cnt);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "eip_cnt", StringUtil.replaceToXml(rec.eip_cnt));
			//rx.add(record, "erp_cnt", StringUtil.replaceToXml(rec.erp_cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist8.size());
		/****** CURLIST8 END */

		/****** CURLIST7 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST7", "");

		for(int i = 0; i < ds.curlist7.size(); i++) {
			HD_PRSN_5000_LCURLIST7Record rec = (HD_PRSN_5000_LCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "eip_cnt", rec.eip_cnt);
			rx.add(record, "erp_cnt", rec.erp_cnt);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "eip_cnt", StringUtil.replaceToXml(rec.eip_cnt));
			//rx.add(record, "erp_cnt", StringUtil.replaceToXml(rec.erp_cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist7.size());
		/****** CURLIST7 END */

		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST6", "");

		for(int i = 0; i < ds.curlist6.size(); i++) {
			HD_PRSN_5000_LCURLIST6Record rec = (HD_PRSN_5000_LCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "dept_nm", rec.dept_nm);
			rx.add(record, "emp_no", rec.emp_no);
			rx.add(record, "nm_korn", rec.nm_korn);
			rx.add(record, "eip_cnt", rec.eip_cnt);
			rx.add(record, "erp_cnt", rec.erp_cnt);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "dept_nm", StringUtil.replaceToXml(rec.dept_nm));
			//rx.add(record, "emp_no", StringUtil.replaceToXml(rec.emp_no));
			//rx.add(record, "nm_korn", StringUtil.replaceToXml(rec.nm_korn));
			//rx.add(record, "eip_cnt", StringUtil.replaceToXml(rec.eip_cnt));
			//rx.add(record, "erp_cnt", StringUtil.replaceToXml(rec.erp_cnt));
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */

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
<hd_prsn_5000_l>
	<dataSet>
		<CURLIST5>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<eip_cnt/>
				<erp_cnt/>
			</record>
		</CURLIST5>
	</dataSet>
</hd_prsn_5000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_prsn_5000_l>
	<dataSet>
		<CURLIST4>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<eip_cnt/>
				<erp_cnt/>
			</record>
		</CURLIST4>
	</dataSet>
</hd_prsn_5000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_prsn_5000_l>
	<dataSet>
		<CURLIST3>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<eip_cnt/>
				<erp_cnt/>
			</record>
		</CURLIST3>
	</dataSet>
</hd_prsn_5000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_prsn_5000_l>
	<dataSet>
		<CURLIST2>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<eip_cnt/>
				<erp_cnt/>
			</record>
		</CURLIST2>
	</dataSet>
</hd_prsn_5000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_prsn_5000_l>
	<dataSet>
		<CURLIST1>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<eip_cnt/>
				<erp_cnt/>
			</record>
		</CURLIST1>
	</dataSet>
</hd_prsn_5000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_prsn_5000_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<flnm/>
				<pgm_id/>
				<pgm_nm/>
				<annc_frdt/>
				<annc_todt/>
			</record>
		</CURLIST>
	</dataSet>
</hd_prsn_5000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_prsn_5000_l>
	<dataSet>
		<CURLIST9>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<eip_cnt/>
				<erp_cnt/>
			</record>
		</CURLIST9>
	</dataSet>
</hd_prsn_5000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_prsn_5000_l>
	<dataSet>
		<CURLIST8>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<eip_cnt/>
				<erp_cnt/>
			</record>
		</CURLIST8>
	</dataSet>
</hd_prsn_5000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_prsn_5000_l>
	<dataSet>
		<CURLIST7>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<eip_cnt/>
				<erp_cnt/>
			</record>
		</CURLIST7>
	</dataSet>
</hd_prsn_5000_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<hd_prsn_5000_l>
	<dataSet>
		<CURLIST6>
			<record>
				<dept_cd/>
				<dept_nm/>
				<emp_no/>
				<nm_korn/>
				<eip_cnt/>
				<erp_cnt/>
			</record>
		</CURLIST6>
	</dataSet>
</hd_prsn_5000_l>
*/
%>

<% /* 작성시간 : Tue May 31 16:44:37 KST 2011 */ %>