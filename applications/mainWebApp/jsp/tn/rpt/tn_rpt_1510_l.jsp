<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.tn.rpt.rec.*
	,	chosun.ciis.tn.rpt.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	TN_RPT_1510_LDataSet ds = (TN_RPT_1510_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "tempData", "");

	try {
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "gridData2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {

			TN_RPT_1510_LCURLIST2Record rec = (TN_RPT_1510_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "membertype", rec.membertype);
			rx.add(record, "membercategorycode", rec.membercategorycode);
			rx.add(record, "name", rec.name);
			rx.add(record, "isanonymous", rec.isanonymous);
			rx.add(record, "memo", rec.memo);
			rx.add(record, "promiseconfirmno", rec.promiseconfirmno);
			rx.add(record, "chgdt", rec.chgdt);
			rx.add(record, "memberidxinfo", rec.memberidxinfo);
			rx.add(record, "isforeigner", rec.isforeigner);
			rx.add(record, "regno", rec.regno);
			rx.add(record, "unknownregno", rec.unknownregno);
			rx.add(record, "birthdayorigin", rec.birthdayorigin);
			rx.add(record, "birthdaytype", rec.birthdaytype);
			rx.add(record, "birthday", rec.birthday);
			rx.add(record, "businessno", rec.businessno);
			rx.add(record, "president", rec.president);
			rx.add(record, "partycode", rec.partycode);
			rx.add(record, "memberidxaddr", rec.memberidxaddr);
			rx.add(record, "useaddress", rec.useaddress);
			rx.add(record, "addressname", rec.addressname);
			rx.add(record, "dept", rec.dept);
			rx.add(record, "title", rec.title);
			rx.add(record, "phone1", rec.phone1);
			rx.add(record, "cellphone", rec.cellphone);
			rx.add(record, "fax", rec.fax);
			rx.add(record, "email", rec.email);
			rx.add(record, "zipcode1", rec.zipcode1);
			rx.add(record, "address1", rec.address1);
			rx.add(record, "addressdetail1", rec.addressdetail1);
			rx.add(record, "zipcode2", rec.zipcode2);
			rx.add(record, "address2", rec.address2);
			rx.add(record, "addressdetail2", rec.addressdetail2);
			rx.add(record, "postaddress", rec.postaddress);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			TN_RPT_1510_LCURLIST1Record rec = (TN_RPT_1510_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "his_memberidx", rec.his_memberidx);
			rx.add(record, "his_membertype", rec.his_membertype);
			rx.add(record, "his_membercategorycode", rec.his_membercategorycode);
			rx.add(record, "his_name", rec.his_name);
			rx.add(record, "his_isanonymous", rec.his_isanonymous);
			rx.add(record, "his_memo", rec.his_memo);
			rx.add(record, "his_promiseconfirmno", rec.his_promiseconfirmno);
			rx.add(record, "his_chgdt", rec.his_chgdt);
			rx.add(record, "his_memberidxinfo", rec.his_memberidxinfo);
			rx.add(record, "his_isforeigner", rec.his_isforeigner);
			rx.add(record, "his_regno", rec.his_regno);
			rx.add(record, "his_unknownregno", rec.his_unknownregno);
			rx.add(record, "his_birthdayorigin", rec.his_birthdayorigin);
			rx.add(record, "his_birthdaytype", rec.his_birthdaytype);
			rx.add(record, "his_birthday", rec.his_birthday);
			rx.add(record, "his_businessno", rec.his_businessno);
			rx.add(record, "his_president", rec.his_president);
			rx.add(record, "his_partycode", rec.his_partycode);
			rx.add(record, "his_memberidxaddr", rec.his_memberidxaddr);
			rx.add(record, "his_useaddress", rec.his_useaddress);
			rx.add(record, "his_addressname", rec.his_addressname);
			rx.add(record, "his_dept", rec.his_dept);
			rx.add(record, "his_title", rec.his_title);
			rx.add(record, "his_phone1", rec.his_phone1);
			rx.add(record, "his_cellphone", rec.his_cellphone);
			rx.add(record, "his_fax", rec.his_fax);
			rx.add(record, "his_email", rec.his_email);
			rx.add(record, "his_zipcode1", rec.his_zipcode1);
			rx.add(record, "his_address1", rec.his_address1);
			rx.add(record, "his_addressdetail1", rec.his_addressdetail1);
			rx.add(record, "his_zipcode2", rec.his_zipcode2);
			rx.add(record, "his_address2", rec.his_address2);
			rx.add(record, "his_addressdetail2", rec.his_addressdetail2);
			rx.add(record, "his_postaddress", rec.his_postaddress);
		}
		//
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
<tn_rpt_1510_l>
	<dataSet>
		<CURLIST2>
			<record>
				<memberidx/>
				<membertype/>
				<membercategorycode/>
				<name/>
				<isanonymous/>
				<memo/>
				<promiseconfirmno/>
				<chgdt/>
				<memberidxinfo/>
				<isforeigner/>
				<regno/>
				<unknownregno/>
				<birthdayorigin/>
				<birthdaytype/>
				<birthday/>
				<businessno/>
				<president/>
				<partycode/>
				<memberidxaddr/>
				<useaddress/>
				<addressname/>
				<dept/>
				<title/>
				<phone1/>
				<cellphone/>
				<fax/>
				<email/>
				<zipcode1/>
				<address1/>
				<addressdetail1/>
				<zipcode2/>
				<address2/>
				<addressdetail2/>
				<postaddress/>
			</record>
		</CURLIST2>
	</dataSet>
</tn_rpt_1510_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_rpt_1510_l>
	<dataSet>
		<CURLIST1>
			<record>
				<his_memberidx/>
				<his_membertype/>
				<his_membercategorycode/>
				<his_name/>
				<his_isanonymous/>
				<his_memo/>
				<his_promiseconfirmno/>
				<his_chgdt/>
				<his_memberidxinfo/>
				<his_isforeigner/>
				<his_regno/>
				<his_unknownregno/>
				<his_birthdayorigin/>
				<his_birthdaytype/>
				<his_birthday/>
				<his_businessno/>
				<his_president/>
				<his_partycode/>
				<his_memberidxaddr/>
				<his_useaddress/>
				<his_addressname/>
				<his_dept/>
				<his_title/>
				<his_phone1/>
				<his_cellphone/>
				<his_fax/>
				<his_email/>
				<his_zipcode1/>
				<his_address1/>
				<his_addressdetail1/>
				<his_zipcode2/>
				<his_address2/>
				<his_addressdetail2/>
				<his_postaddress/>
			</record>
		</CURLIST1>
	</dataSet>
</tn_rpt_1510_l>
*/
%>

<% /* 작성시간 : Thu Nov 03 17:06:47 KST 2016 */ %>