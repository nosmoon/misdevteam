<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.dns.rec.*
	,	chosun.ciis.tn.dns.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_DNS_1000_MDataSet ds = (TN_DNS_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** SUPPORT_LIST BEGIN */
		recordSet = rx.add(dataSet, "SUPPORT_LIST", "");

		for(int i = 0; i < ds.support_list.size(); i++) {
			TN_DNS_1000_MSUPPORT_LISTRecord rec = (TN_DNS_1000_MSUPPORT_LISTRecord)ds.support_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.support_list.size());
		/****** SUPPORT_LIST END */

		/****** PROOFTYPE_LIST BEGIN */
		recordSet = rx.add(dataSet, "PROOFTYPE_LIST", "");

		for(int i = 0; i < ds.prooftype_list.size(); i++) {
			TN_DNS_1000_MPROOFTYPE_LISTRecord rec = (TN_DNS_1000_MPROOFTYPE_LISTRecord)ds.prooftype_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.prooftype_list.size());
		/****** PROOFTYPE_LIST END */

		/****** PAYMETHOD_G_LIST BEGIN */
		recordSet = rx.add(dataSet, "PAYMETHOD_G_LIST", "");

		for(int i = 0; i < ds.paymethod_g_list.size(); i++) {
			TN_DNS_1000_MPAYMETHOD_G_LISTRecord rec = (TN_DNS_1000_MPAYMETHOD_G_LISTRecord)ds.paymethod_g_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.paymethod_g_list.size());
		/****** PAYMETHOD_G_LIST END */

		/****** USEORIGINAL_LIST BEGIN */
		recordSet = rx.add(dataSet, "USEORIGINAL_LIST", "");

		for(int i = 0; i < ds.useoriginal_list.size(); i++) {
			TN_DNS_1000_MUSEORIGINAL_LISTRecord rec = (TN_DNS_1000_MUSEORIGINAL_LISTRecord)ds.useoriginal_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.useoriginal_list.size());
		/****** USEORIGINAL_LIST END */

		/****** PARTITIONTYPE_LIST BEGIN */
		recordSet = rx.add(dataSet, "PARTITIONTYPE_LIST", "");

		for(int i = 0; i < ds.partitiontype_list.size(); i++) {
			TN_DNS_1000_MPARTITIONTYPE_LISTRecord rec = (TN_DNS_1000_MPARTITIONTYPE_LISTRecord)ds.partitiontype_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.partitiontype_list.size());
		/****** PARTITIONTYPE_LIST END */

		/****** BANK_LIST BEGIN */
		recordSet = rx.add(dataSet, "BANK_LIST", "");

		for(int i = 0; i < ds.bank_list.size(); i++) {
			TN_DNS_1000_MBANK_LISTRecord rec = (TN_DNS_1000_MBANK_LISTRecord)ds.bank_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.bank_list.size());
		/****** BANK_LIST END */

		/****** FUND_LIST BEGIN */
		recordSet = rx.add(dataSet, "FUND_LIST", "");

		for(int i = 0; i < ds.fund_list.size(); i++) {
			TN_DNS_1000_MFUND_LISTRecord rec = (TN_DNS_1000_MFUND_LISTRecord)ds.fund_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.fund_list.size());
		/****** FUND_LIST END */

		/****** RECEIPTCATEGORY_LIST BEGIN */
		recordSet = rx.add(dataSet, "RECEIPTCATEGORY_LIST", "");

		for(int i = 0; i < ds.receiptcategory_list.size(); i++) {
			TN_DNS_1000_MRECEIPTCATEGORY_LISTRecord rec = (TN_DNS_1000_MRECEIPTCATEGORY_LISTRecord)ds.receiptcategory_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.receiptcategory_list.size());
		/****** RECEIPTCATEGORY_LIST END */

		/****** DONATORCATEGORY_LIST BEGIN */
		recordSet = rx.add(dataSet, "DONATORCATEGORY_LIST", "");

		for(int i = 0; i < ds.donatorcategory_list.size(); i++) {
			TN_DNS_1000_MDONATORCATEGORY_LISTRecord rec = (TN_DNS_1000_MDONATORCATEGORY_LISTRecord)ds.donatorcategory_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.donatorcategory_list.size());
		/****** DONATORCATEGORY_LIST END */

		/****** ACCOUNT_LIST BEGIN */
		recordSet = rx.add(dataSet, "ACCOUNT_LIST", "");

		for(int i = 0; i < ds.account_list.size(); i++) {
			TN_DNS_1000_MACCOUNT_LISTRecord rec = (TN_DNS_1000_MACCOUNT_LISTRecord)ds.account_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.account_list.size());
		/****** ACCOUNT_LIST END */

		/****** MEMBERCATEGORYCODE_LIST BEGIN */
		recordSet = rx.add(dataSet, "MEMBERCATEGORYCODE_LIST", "");

		for(int i = 0; i < ds.membercategorycode_list.size(); i++) {
			TN_DNS_1000_MMEMBERCATEGORYCODE_LISTRecord rec = (TN_DNS_1000_MMEMBERCATEGORYCODE_LISTRecord)ds.membercategorycode_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.membercategorycode_list.size());
		/****** MEMBERCATEGORYCODE_LIST END */

		/****** CMS_STATUS_LIST BEGIN */
		recordSet = rx.add(dataSet, "CMS_STATUS_LIST", "");

		for(int i = 0; i < ds.cms_status_list.size(); i++) {
			TN_DNS_1000_MCMS_STATUS_LISTRecord rec = (TN_DNS_1000_MCMS_STATUS_LISTRecord)ds.cms_status_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.cms_status_list.size());
		/****** CMS_STATUS_LIST END */

		/****** PAYMETHOD_LIST BEGIN */
		recordSet = rx.add(dataSet, "PAYMETHOD_LIST", "");

		for(int i = 0; i < ds.paymethod_list.size(); i++) {
			TN_DNS_1000_MPAYMETHOD_LISTRecord rec = (TN_DNS_1000_MPAYMETHOD_LISTRecord)ds.paymethod_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.paymethod_list.size());
		/****** PAYMETHOD_LIST END */

		/****** PAYMETHOD_M_LIST BEGIN */
		recordSet = rx.add(dataSet, "PAYMETHOD_M_LIST", "");

		for(int i = 0; i < ds.paymethod_m_list.size(); i++) {
			TN_DNS_1000_MPAYMETHOD_M_LISTRecord rec = (TN_DNS_1000_MPAYMETHOD_M_LISTRecord)ds.paymethod_m_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.paymethod_m_list.size());
		/****** PAYMETHOD_M_LIST END */
		
		/****** MOBLCMPY_LIST BEGIN */
		recordSet = rx.add(dataSet, "MOBLCMPY_LIST", "");

		for(int i = 0; i < ds.moblcmpy_list.size(); i++) {
			TN_DNS_1000_MMOBLCMPY_LISTRecord rec = (TN_DNS_1000_MMOBLCMPY_LISTRecord)ds.moblcmpy_list.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			//rx.add(record, "cd", StringUtil.replaceToXml(rec.cd));
			//rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
		}
		rx.add(recordSet, "totalcnt", ds.moblcmpy_list.size());
		/****** MOBLCMPY_LIST END */

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
<tn_dns_1000_m>
	<dataSet>
		<SUPPORT_LIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</SUPPORT_LIST>
	</dataSet>
</tn_dns_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_1000_m>
	<dataSet>
		<PROOFTYPE_LIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</PROOFTYPE_LIST>
	</dataSet>
</tn_dns_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_1000_m>
	<dataSet>
		<PAYMETHOD_G_LIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</PAYMETHOD_G_LIST>
	</dataSet>
</tn_dns_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_1000_m>
	<dataSet>
		<USEORIGINAL_LIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</USEORIGINAL_LIST>
	</dataSet>
</tn_dns_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_1000_m>
	<dataSet>
		<PARTITIONTYPE_LIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</PARTITIONTYPE_LIST>
	</dataSet>
</tn_dns_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_1000_m>
	<dataSet>
		<BANK_LIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</BANK_LIST>
	</dataSet>
</tn_dns_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_1000_m>
	<dataSet>
		<FUND_LIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</FUND_LIST>
	</dataSet>
</tn_dns_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_1000_m>
	<dataSet>
		<RECEIPTCATEGORY_LIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</RECEIPTCATEGORY_LIST>
	</dataSet>
</tn_dns_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_1000_m>
	<dataSet>
		<DONATORCATEGORY_LIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</DONATORCATEGORY_LIST>
	</dataSet>
</tn_dns_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_1000_m>
	<dataSet>
		<ACCOUNT_LIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</ACCOUNT_LIST>
	</dataSet>
</tn_dns_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_1000_m>
	<dataSet>
		<MEMBERCATEGORYCODE_LIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</MEMBERCATEGORYCODE_LIST>
	</dataSet>
</tn_dns_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_1000_m>
	<dataSet>
		<CARDCMPY_LIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</CARDCMPY_LIST>
	</dataSet>
</tn_dns_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_1000_m>
	<dataSet>
		<CMS_STATUS_LIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</CMS_STATUS_LIST>
	</dataSet>
</tn_dns_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_1000_m>
	<dataSet>
		<PAYMETHOD_LIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</PAYMETHOD_LIST>
	</dataSet>
</tn_dns_1000_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_dns_1000_m>
	<dataSet>
		<PAYMETHOD_M_LIST>
			<record>
				<cd/>
				<cdnm/>
			</record>
		</PAYMETHOD_M_LIST>
	</dataSet>
</tn_dns_1000_m>
*/
%>

<% /* 작성시간 : Fri Oct 21 20:32:30 KST 2016 */ %>