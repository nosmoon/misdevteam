<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
    ,   chosun.ciis.co.base.util.*	
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_2480_MDataSet ds = (FC_ACCT_2480_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	rx.add(dataSet, "xx_dlco_clsf_cd", ds.xx_dlco_clsf_cd);
	rx.add(dataSet, "xx_g_tag", ds.xx_g_tag);
	rx.add(dataSet, "xx_g_tag2", ds.xx_g_tag2);
	
	try {
		/****** SLIPCLSFCDLIST BEGIN */
		recordSet = rx.add(dataSet, "SLIPCLSFCDLIST", "");

		for(int i = 0; i < ds.slipclsfcdlist.size(); i++) {
			FC_ACCT_2480_MSLIPCLSFCDLISTRecord rec = (FC_ACCT_2480_MSLIPCLSFCDLISTRecord)ds.slipclsfcdlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cccodeval", StringUtil.replaceToXml(rec.cccodeval));
			rx.add(record, "cccdnm", StringUtil.replaceToXml(rec.cccdnm));
			rx.add(record, "cccdynm", StringUtil.replaceToXml(rec.cccdynm));
		}
		rx.add(recordSet, "totalcnt", ds.slipclsfcdlist.size());
		/****** SLIPCLSFCDLIST END */

		/****** MEDICDLIST BEGIN */
		recordSet = rx.add(dataSet, "MEDICDLIST", "");

		for(int i = 0; i < ds.medicdlist.size(); i++) {
			FC_ACCT_2480_MMEDICDLISTRecord rec = (FC_ACCT_2480_MMEDICDLISTRecord)ds.medicdlist.get(i);
			int record = rx.add(recordSet, "record", "");
            rx.add(record, "cccodeval", StringUtil.replaceToXml(rec.cccodeval));
            rx.add(record, "cccdnm", StringUtil.replaceToXml(rec.cccdnm));
            rx.add(record, "cccdynm", StringUtil.replaceToXml(rec.cccdynm));
		}
		rx.add(recordSet, "totalcnt", ds.medicdlist.size());
		/****** MEDICDLIST END */

		/****** MANGCLSFCDLIST BEGIN */
		recordSet = rx.add(dataSet, "MANGCLSFCDLIST", "");

		for(int i = 0; i < ds.mangclsfcdlist.size(); i++) {
			FC_ACCT_2480_MMANGCLSFCDLISTRecord rec = (FC_ACCT_2480_MMANGCLSFCDLISTRecord)ds.mangclsfcdlist.get(i);
			int record = rx.add(recordSet, "record", "");
            rx.add(record, "cccodeval", StringUtil.replaceToXml(rec.cccodeval));
            rx.add(record, "cccdnm", StringUtil.replaceToXml(rec.cccdnm));
            rx.add(record, "cccdynm", StringUtil.replaceToXml(rec.cccdynm));
		}
		rx.add(recordSet, "totalcnt", ds.mangclsfcdlist.size());
		/****** MANGCLSFCDLIST END */

		/****** MANGCLSFCDLIST BEGIN */
		recordSet = rx.add(dataSet, "INCMCLSFCDLIST", "");

		for(int i = 0; i < ds.incmclsfcdlist.size(); i++) {
			FC_ACCT_2480_MINCMCLSFCDLISTRecord rec = (FC_ACCT_2480_MINCMCLSFCDLISTRecord)ds.incmclsfcdlist.get(i);
			int record = rx.add(recordSet, "record", "");
            rx.add(record, "cccodeval", StringUtil.replaceToXml(rec.cccodeval));
            rx.add(record, "cccdnm", StringUtil.replaceToXml(rec.cccdnm));
            rx.add(record, "cccdynm", StringUtil.replaceToXml(rec.cccdynm));
		}
		rx.add(recordSet, "totalcnt", ds.incmclsfcdlist.size());
		/****** MANGCLSFCDLIST END */
		
		/****** CHNL_CLSF_CD_CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CHNL_CLSF_CD_CURLIST", "");

		for(int i = 0; i < ds.chnl_clsf_cd_curlist.size(); i++) {
			FC_ACCT_2480_MCHNL_CLSF_CD_CURLISTRecord rec = (FC_ACCT_2480_MCHNL_CLSF_CD_CURLISTRecord)ds.chnl_clsf_cd_curlist.get(i);
			int record = rx.add(recordSet, "record", "");
            rx.add(record, "cccodeval", StringUtil.replaceToXml(rec.cccodeval));
            rx.add(record, "cccdnm", StringUtil.replaceToXml(rec.cccdnm));
            rx.add(record, "cccdynm", StringUtil.replaceToXml(rec.cccdynm));
		}
		rx.add(recordSet, "totalcnt", ds.chnl_clsf_cd_curlist.size());
		/****** CHNL_CLSF_CD_CURLIST END */		

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
	<SLIPCLSFCDLIST>
		<record>
			<cccodeval/>
			<cccdnm/>
			<cccdynm/>
		</record>
	</SLIPCLSFCDLIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<MEDICDLIST>
		<record>
			<cccodeval/>
			<cccdnm/>
			<cccdynm/>
		</record>
	</MEDICDLIST>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<MANGCLSFCDLIST>
		<record>
			<cccodeval/>
			<cccdnm/>
			<cccdynm/>
		</record>
	</MANGCLSFCDLIST>
</dataSet>
*/
%>

<% /* 작성시간 : Tue Mar 03 19:51:13 KST 2009 */ %>