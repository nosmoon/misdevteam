<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.pr.prtcnsg.rec.*
	,	chosun.ciis.pr.prtcnsg.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	PR_PRTCNSG_1000_MDataSet ds = (PR_PRTCNSG_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST4 BEGIN PS판구분 */
		recordSet = rx.add(dataSet, "ps_clsf", "");
		for(int i = 0; i < ds.curlist5.size(); i++) {
			PR_PRTCNSG_1000_MCURLIST5Record rec = (PR_PRTCNSG_1000_MCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "psplat_clsf", rec.cd);
			rx.add(record, "psplat_fee", "");
			rx.add(record, "gnaw_fee", "");
			rx.add(record, "fac_clsf", "");
			rx.add(record, "aply_dt", "");
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */
		
		/****** CURLIST4 BEGIN 인쇄구분 */
		recordSet = rx.add(dataSet, "prt_clsf", "");
		for(int i = 0; i < ds.curlist4.size(); i++) {
			PR_PRTCNSG_1000_MCURLIST4Record rec = (PR_PRTCNSG_1000_MCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd+" "+rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */
		
		/****** CURLIST3 BEGIN 제지사 */
		recordSet = rx.add(dataSet, "papcmpy_cd", "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			PR_PRTCNSG_1000_MCURLIST3Record rec = (PR_PRTCNSG_1000_MCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cd+" "+rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */

		/****** CURLIST2 BEGIN 매체 */
		recordSet = rx.add(dataSet, "medt_cd", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			PR_PRTCNSG_1000_MCURLIST2Record rec = (PR_PRTCNSG_1000_MCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			rx.add(record, "label", rec.cdabrvnm_cd);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cdnm_cd", rec.cdnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN 위탁처 */
		recordSet = rx.add(dataSet, "cnsg", "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			PR_PRTCNSG_1000_MCURLIST1Record rec = (PR_PRTCNSG_1000_MCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "value", rec.cd);
			//rx.add(record, "label", rec.cdabrvnm_cd);
			//rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			//rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "label", rec.cdnm_cd);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			//rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			//rx.add(record, "cdnm_cd", StringUtil.replaceToXml(rec.cdnm_cd));
			//rx.add(record, "cdabrvnm_cd", StringUtil.replaceToXml(rec.cdabrvnm_cd));
		}
		rx.add(recordSet, "totalcnt", ds.curlist1.size());
		/****** CURLIST1 END */

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
<pr_prtcnsg_1000_m>
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
</pr_prtcnsg_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_prtcnsg_1000_m>
	<dataSet>
		<CURLIST2>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST2>
	</dataSet>
</pr_prtcnsg_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<pr_prtcnsg_1000_m>
	<dataSet>
		<CURLIST1>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CURLIST1>
	</dataSet>
</pr_prtcnsg_1000_m>
*/
%>

<% /* 작성시간 : Mon May 18 10:19:30 KST 2009 */ %>