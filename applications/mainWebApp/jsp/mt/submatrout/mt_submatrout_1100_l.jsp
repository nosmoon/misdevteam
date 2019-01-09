<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.mt.submatrout.rec.*
	,	chosun.ciis.mt.submatrout.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	MT_SUBMATROUT_1100_LDataSet ds = (MT_SUBMATROUT_1100_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "sect_cd_1", "");
		for(int i = 0; i < ds.curlist4.size(); i++) {
			MT_SUBMATROUT_1100_LCURLIST4Record rec = (MT_SUBMATROUT_1100_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "label", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */

		/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "medi_cd", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			MT_SUBMATROUT_1100_LCURLIST3Record rec = (MT_SUBMATROUT_1100_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "label", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "matr_ps", "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			MT_SUBMATROUT_1100_LCURLIST2Record rec = (MT_SUBMATROUT_1100_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.matr_cd);
			rx.add(record, "label", rec.matr_nm);
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "all", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			MT_SUBMATROUT_1100_LCURLIST1Record rec = (MT_SUBMATROUT_1100_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.medi_cd);
			//rx.add(record, "sect_cd", rec.sect_cd);
			rx.add(record, "label", rec.medi_nm);
			//rx.add(record, "sect_nm", rec.sect_nm);
			//rx.add(record, "medi_cd", StringUtil.replaceToXml(rec.medi_cd));
			//rx.add(record, "sect_cd", StringUtil.replaceToXml(rec.sect_cd));
			//rx.add(record, "medi_nm", StringUtil.replaceToXml(rec.medi_nm));
			//rx.add(record, "sect_nm", StringUtil.replaceToXml(rec.sect_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "matr_film", "");
		for(int i = 0; i < ds.curlist6.size(); i++) {
			MT_SUBMATROUT_1100_LCURLIST6Record rec = (MT_SUBMATROUT_1100_LCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.matr_cd);
			rx.add(record, "label", rec.matr_nm);
			//rx.add(record, "matr_cd", StringUtil.replaceToXml(rec.matr_cd));
			//rx.add(record, "matr_nm", StringUtil.replaceToXml(rec.matr_nm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */

		/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "sect_cd_2", "");
		for(int i = 0; i < ds.curlist5.size(); i++) {
			MT_SUBMATROUT_1100_LCURLIST5Record rec = (MT_SUBMATROUT_1100_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(record, "label", rec.cdnm_cd);
			//rx.add(record, "cdabrvnm_cd", rec.cdabrvnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */

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
<mt_submatrout_1100_l>
	<dataSet>
		<CURLIST4>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST4>
	</dataSet>
</mt_submatrout_1100_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_submatrout_1100_l>
	<dataSet>
		<CURLIST3>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST3>
	</dataSet>
</mt_submatrout_1100_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_submatrout_1100_l>
	<dataSet>
		<CURLIST2>
			<record>
				<matr_cd/>
				<matr_nm/>
			</record>
		</CURLIST2>
	</dataSet>
</mt_submatrout_1100_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_submatrout_1100_l>
	<dataSet>
		<CURLIST1>
			<record>
				<medi_cd/>
				<sect_cd/>
				<medi_nm/>
				<sect_nm/>
			</record>
		</CURLIST1>
	</dataSet>
</mt_submatrout_1100_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_submatrout_1100_l>
	<dataSet>
		<CURLIST6>
			<record>
				<matr_cd/>
				<matr_nm/>
			</record>
		</CURLIST6>
	</dataSet>
</mt_submatrout_1100_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<mt_submatrout_1100_l>
	<dataSet>
		<CURLIST5>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST5>
	</dataSet>
</mt_submatrout_1100_l>
*/
%>

<% /* 작성시간 : Thu Aug 20 21:18:50 KST 2009 */ %>