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
	TN_DNS_1020_LDataSet ds = (TN_DNS_1020_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
	/****** CURLIST9 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST9", "");

		for(int i = 0; i < ds.curlist9.size(); i++) {
			TN_DNS_1020_LCURLIST9Record rec = (TN_DNS_1020_LCURLIST9Record)ds.curlist9.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "promiseidx", rec.promiseidx);
			rx.add(record, "promisecode", rec.promisecode);
		}
		rx.add(recordSet, "totalcnt", ds.curlist9.size());
		/****** CURLIST8 END */
		/****** CURLIST8 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST8", "");

		for(int i = 0; i < ds.curlist8.size(); i++) {
			TN_DNS_1020_LCURLIST8Record rec = (TN_DNS_1020_LCURLIST8Record)ds.curlist8.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "fundidx", rec.fundidx);
			rx.add(record, "supportidx", rec.supportidx);
			rx.add(record, "reqprice", rec.reqprice);
			rx.add(record, "payprice", rec.payprice);
			rx.add(record, "status", rec.status);
			rx.add(record, "errorcode", rec.errorcode);
			rx.add(record, "isdelete", rec.isdelete);
			rx.add(record, "paydate", rec.paydate);
			rx.add(record, "moblcmpy", rec.moblcmpy);
			rx.add(record, "moblno", rec.moblno);
			rx.add(record, "ownername", rec.ownername);
		}
		rx.add(recordSet, "totalcnt", ds.curlist8.size());
		/****** CURLIST8 END */

		/****** CURLIST7 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST7", "");

		for(int i = 0; i < ds.curlist7.size(); i++) {
			TN_DNS_1020_LCURLIST7Record rec = (TN_DNS_1020_LCURLIST7Record)ds.curlist7.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "fundidx", rec.fundidx);
			rx.add(record, "supportidx", rec.supportidx);
			rx.add(record, "scheduleprice", rec.scheduleprice);
			rx.add(record, "payprice", rec.payprice);
			rx.add(record, "acptprice", rec.acptprice);
			rx.add(record, "status", rec.status);
			rx.add(record, "errorcode", rec.errorcode);
			rx.add(record, "isdelete", rec.isdelete);
			rx.add(record, "paydate", rec.paydate);
			rx.add(record, "cardcmpy", rec.cardcmpy);
			rx.add(record, "cardno", rec.cardno);
			rx.add(record, "cardyymm", rec.cardyymm);
			rx.add(record, "ownername", rec.ownername);
			//rx.add(record, "memberidx", StringUtil.replaceToXml(rec.memberidx));
			//rx.add(record, "fundidx", StringUtil.replaceToXml(rec.fundidx));
			//rx.add(record, "supportidx", StringUtil.replaceToXml(rec.supportidx));
			//rx.add(record, "scheduleprice", StringUtil.replaceToXml(rec.scheduleprice));
			//rx.add(record, "payprice", StringUtil.replaceToXml(rec.payprice));
			//rx.add(record, "status", StringUtil.replaceToXml(rec.status));
			//rx.add(record, "errorcode", StringUtil.replaceToXml(rec.errorcode));
			//rx.add(record, "isdelete", StringUtil.replaceToXml(rec.isdelete));
			//rx.add(record, "paydate", StringUtil.replaceToXml(rec.paydate));
			//rx.add(record, "cardcmpy", StringUtil.replaceToXml(rec.cardcmpy));
			//rx.add(record, "cardyymm", StringUtil.replaceToXml(rec.cardyymm));
			//rx.add(record, "ownername", StringUtil.replaceToXml(rec.ownername));
		}
		rx.add(recordSet, "totalcnt", ds.curlist7.size());
		/****** CURLIST7 END */	
	
		/****** CURLIST6 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST6", "");

		for(int i = 0; i < ds.curlist6.size(); i++) {
			TN_DNS_1020_LCURLIST6Record rec = (TN_DNS_1020_LCURLIST6Record)ds.curlist6.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "receiverinfo", rec.receiverinfo);
			rx.add(record, "status", rec.status);
			rx.add(record, "sendtype", rec.sendtype);
			rx.add(record, "senddate", rec.senddate);
			rx.add(record, "failreason", rec.failreason);
			rx.add(record, "umsidx", rec.umsidx);
		}
		rx.add(recordSet, "totalcnt", ds.curlist6.size());
		/****** CURLIST6 END */
			
			/****** CURLIST5 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST5", "");

		for(int i = 0; i < ds.curlist5.size(); i++) {
			TN_DNS_1020_LCURLIST5Record rec = (TN_DNS_1020_LCURLIST5Record)ds.curlist5.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "receiptidx", rec.receiptidx);
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "deptidx", rec.deptidx);
			rx.add(record, "receiptcode", rec.receiptcode);
			rx.add(record, "name", rec.name);
			rx.add(record, "issuecategory", rec.issuecategory);
			rx.add(record, "issuedate", rec.issuedate);
			rx.add(record, "donatorcategory", rec.donatorcategory);
			rx.add(record, "receiptcategory", rec.receiptcategory);
			rx.add(record, "price", rec.price);
			rx.add(record, "membername", rec.membername);
			rx.add(record, "paymentissue", rec.paymentissue);
			rx.add(record, "issuecount", rec.issuecount);
			rx.add(record, "isdeleted", rec.isdeleted);
			//rx.add(record, "receiptidx", StringUtil.replaceToXml(rec.receiptidx));
			//rx.add(record, "memberidx", StringUtil.replaceToXml(rec.memberidx));
			//rx.add(record, "deptidx", StringUtil.replaceToXml(rec.deptidx));
			//rx.add(record, "receiptcode", StringUtil.replaceToXml(rec.receiptcode));
			//rx.add(record, "name", StringUtil.replaceToXml(rec.name));
			//rx.add(record, "issuecategory", StringUtil.replaceToXml(rec.issuecategory));
			//rx.add(record, "issuedate", StringUtil.replaceToXml(rec.issuedate));
			//rx.add(record, "donatorcategory", StringUtil.replaceToXml(rec.donatorcategory));
			//rx.add(record, "receiptcategory", StringUtil.replaceToXml(rec.receiptcategory));
			//rx.add(record, "price", StringUtil.replaceToXml(rec.price));
			//rx.add(record, "membername", StringUtil.replaceToXml(rec.membername));
			//rx.add(record, "paymentissue", StringUtil.replaceToXml(rec.paymentissue));
			//rx.add(record, "issuecount", StringUtil.replaceToXml(rec.issuecount));
		}
		rx.add(recordSet, "totalcnt", ds.curlist5.size());
		/****** CURLIST5 END */
	
		/****** CURLIST4 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST4", "");

		for(int i = 0; i < ds.curlist4.size(); i++) {
			TN_DNS_1020_LCURLIST4Record rec = (TN_DNS_1020_LCURLIST4Record)ds.curlist4.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "fundidx", rec.fundidx);
			rx.add(record, "supportidx", rec.supportidx);
			rx.add(record, "scheduleprice", rec.scheduleprice);
			rx.add(record, "payprice", rec.payprice);
			rx.add(record, "bankcode", rec.bankcode);
			rx.add(record, "bankaccount", rec.bankaccount);
			rx.add(record, "bankaccountowner", rec.bankaccountowner);
			rx.add(record, "his_type", rec.his_type);
			rx.add(record, "status", rec.status);
			rx.add(record, "errorcode", rec.errorcode);
			rx.add(record, "isdelete", rec.isdelete);
			rx.add(record, "paydate", rec.paydate);
			rx.add(record, "writedate", rec.writedate);
			//rx.add(record, "memberidx", StringUtil.replaceToXml(rec.memberidx));
			//rx.add(record, "fundidx", StringUtil.replaceToXml(rec.fundidx));
			//rx.add(record, "supportidx", StringUtil.replaceToXml(rec.supportidx));
			//rx.add(record, "scheduleprice", StringUtil.replaceToXml(rec.scheduleprice));
			//rx.add(record, "payprice", StringUtil.replaceToXml(rec.payprice));
			//rx.add(record, "bankcode", StringUtil.replaceToXml(rec.bankcode));
			//rx.add(record, "bankaccount", StringUtil.replaceToXml(rec.bankaccount));
			//rx.add(record, "bankaccountowner", StringUtil.replaceToXml(rec.bankaccountowner));
			//rx.add(record, "his_type", StringUtil.replaceToXml(rec.his_type));
			//rx.add(record, "status", StringUtil.replaceToXml(rec.status));
			//rx.add(record, "errorcode", StringUtil.replaceToXml(rec.errorcode));
			//rx.add(record, "isdelete", StringUtil.replaceToXml(rec.isdelete));
			//rx.add(record, "paydate", StringUtil.replaceToXml(rec.paydate));
			//rx.add(record, "writedate", StringUtil.replaceToXml(rec.writedate));
		}
		rx.add(recordSet, "totalcnt", ds.curlist4.size());
		/****** CURLIST4 END */	
			/****** CURLIST3 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST3", "");

		for(int i = 0; i < ds.curlist3.size(); i++) {
			TN_DNS_1020_LCURLIST3Record rec = (TN_DNS_1020_LCURLIST3Record)ds.curlist3.get(i);
			int record = rx.add(recordSet, "record", "");	
			rx.add(record, "chk", rec.chk);
			rx.add(record, "paymentidx", rec.paymentidx);
			rx.add(record, "paymentcode", rec.paymentcode);
			rx.add(record, "paydate", rec.paydate);
			rx.add(record, "promisecode", rec.promisecode);
			rx.add(record, "fundidx", rec.fundidx);
			rx.add(record, "supportidx", rec.supportidx);
			rx.add(record, "paymethodcode", rec.paymethodcode);
			rx.add(record, "promiseprice", rec.promiseprice);
			rx.add(record, "payprice", rec.payprice);
			rx.add(record, "sumpayprice", rec.sumpayprice);
			rx.add(record, "receiptissue", rec.receiptissue);
			rx.add(record, "receiptcount", rec.receiptcount);
			rx.addCData(record, "paymentmemo", rec.paymentmemo);
			rx.add(record, "bank_id", rec.bank_id);
			rx.add(record, "acct_num", rec.acct_num);
			rx.add(record, "tran_date", rec.tran_date);
			rx.add(record, "tran_date_seq", rec.tran_date_seq);
			rx.add(record, "slip_no", rec.slip_no);
		}
		rx.add(recordSet, "totalcnt", ds.curlist3.size());
		/****** CURLIST3 END */
	
		/****** CURLIST2 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST2", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			TN_DNS_1020_LCURLIST2Record rec = (TN_DNS_1020_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "promisecode", rec.promisecode);
			rx.add(record, "promisedate", rec.promisedate);
			rx.add(record, "promise_status", rec.promise_status);
			rx.addCData(record, "fundidx_nm", rec.fundidx_nm);
			rx.addCData(record, "useoriginal_nm", rec.useoriginal_nm);
			rx.addCData(record, "paymethodcode_nm", rec.paymethodcode_nm);
			rx.add(record, "promiseprice", rec.promiseprice);
			rx.add(record, "payprice", rec.payprice);
			rx.add(record, "payrate", rec.payrate);
			rx.add(record, "promiseidx", rec.promiseidx);
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "paystopped", rec.paystopped);
			rx.addCData(record, "contributormemo", rec.contributormemo);
			rx.addCData(record, "promisememo", rec.promisememo);
			rx.add(record, "fundidx", rec.fundidx);
			rx.addCData(record, "supportidx_nm", rec.supportidx_nm);
			rx.add(record, "supportidx", rec.supportidx);
			rx.add(record, "useoriginal", rec.useoriginal);
			rx.addCData(record, "purposememo", rec.purposememo);
			rx.add(record, "paymethod", rec.paymethod);
			rx.add(record, "paymethodcode", rec.paymethodcode);
			rx.add(record, "bankaccountcode", rec.bankaccountcode);
			rx.add(record, "partitiontype", rec.partitiontype);
			rx.add(record, "paystartdate", rec.paystartdate);
			rx.add(record, "payenddate", rec.payenddate);
			rx.add(record, "partitioncount", rec.partitioncount);
			rx.add(record, "monthlypayday", rec.monthlypayday);
			rx.add(record, "monthlypayprice", rec.monthlypayprice);
			rx.add(record, "excludenopay", rec.excludenopay);
			rx.add(record, "ispromiseanonymous", rec.ispromiseanonymous);
			rx.addCData(record, "itemname", rec.itemname);
			rx.addCData(record, "itemqty", rec.itemqty);
			rx.add(record, "itemprice", rec.itemprice);
			rx.addCData(record, "itemremk", rec.itemremk);
			rx.add(record, "bankcode", rec.bankcode);
			rx.add(record, "bankaccount", rec.bankaccount);
			rx.add(record, "bankaccountowner", rec.bankaccountowner);
			rx.add(record, "bankownerclsf", rec.bankownerclsf);
			rx.add(record, "bankowneridentity", rec.bankowneridentity);
			rx.add(record, "cmsstatus", rec.cmsstatus);
			rx.add(record, "proofname", rec.proofname);
			rx.add(record, "prooftype", rec.prooftype);
			rx.add(record, "stopdate", rec.stopdate);
			rx.addCData(record, "stopresn", rec.stopresn);
			rx.addCData(record, "cardcmpy", rec.cardcmpy);
			rx.add(record, "cardnumber", rec.cardnumber);
			rx.add(record, "cardyymm", rec.cardyymm);
			rx.addCData(record, "mobiaprvname", rec.mobiaprvname);
			rx.add(record, "mobiaprvcmpy", rec.mobiaprvcmpy);
			rx.add(record, "mobiaprvnumber", rec.mobiaprvnumber);
			rx.add(record, "mobiaprvprn", rec.mobiaprvprn);
			rx.add(record, "cmsstopped", rec.cmsstopped);
			rx.add(record, "cmsstopdate", rec.cmsstopdate);
			rx.add(record, "cmsupdatedate", rec.cmsupdatedate);
			rx.add(record, "cardidentity", rec.cardidentity);
			rx.add(record, "cardowner", rec.cardowner);
			rx.add(record, "cms_payment_status", rec.cms_payment_status);
			rx.add(record, "cms_status", rec.cms_status);
			rx.add(record, "proofidx", rec.proofidx);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */	
		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "CURLIST1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			TN_DNS_1020_LCURLIST1Record rec = (TN_DNS_1020_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "membertype", rec.membertype);
			rx.add(record, "membercode", rec.membercode);
			rx.addCData(record, "memberidx", rec.memberidx);
			rx.addCData(record, "mbr_name", rec.mbr_name);
			rx.add(record, "isanonymous", rec.isanonymous);
			rx.add(record, "mbr_regno", rec.mbr_regno);
			rx.add(record, "isforeigner", rec.isforeigner);
			rx.add(record, "unknownregno", rec.unknownregno);
			rx.add(record, "president", rec.president);
			rx.add(record, "businessno", rec.businessno);
			rx.add(record, "birthdayorigin", rec.birthdayorigin);
			rx.add(record, "birthday", rec.birthday);
			rx.add(record, "birthdaytype", rec.birthdaytype);
			rx.add(record, "membercategorycode", rec.membercategorycode);
			rx.add(record, "partycode", rec.partycode);
			rx.add(record, "writedate", rec.writedate);
			rx.addCData(record, "memo", rec.memo);
			rx.addCData(record, "adrs_name", rec.adrs_name);
			rx.addCData(record, "dept", rec.dept);
			rx.addCData(record, "title", rec.title);
			rx.add(record, "email", rec.email);
			rx.add(record, "phone1", rec.phone1);
			rx.add(record, "phone2", rec.phone2);		
			rx.add(record, "cellphone", rec.cellphone);	
			rx.add(record, "fax", rec.fax);
			rx.add(record, "zipcode1", rec.zipcode1);
			rx.addCData(record, "address1", rec.address1);
			rx.addCData(record, "addressdetail1", rec.addressdetail1);
			rx.add(record, "zipcode2", rec.zipcode2);
			rx.addCData(record, "address2", rec.address2);
			rx.addCData(record, "addressdetail2", rec.addressdetail2);
			rx.addCData(record, "postaddress", rec.postaddress);
			rx.addCData(record, "useaddress", rec.useaddress);
			rx.add(record, "password", rec.password);
			rx.add(record, "deptidx", rec.deptidx);
			rx.add(record, "donatorcategory", rec.donatorcategory);
			rx.add(record, "receiptcategory", rec.receiptcategory);
			rx.addCData(record, "rcp_name", rec.rcp_name);
			rx.add(record, "rcp_regno", rec.rcp_regno);
			rx.add(record, "relation", rec.relation);
			rx.add(record, "zipcode", rec.zipcode);
			rx.addCData(record, "address", rec.address);
			rx.addCData(record, "addressdetail", rec.addressdetail);
			rx.addCData(record, "receiptconfigmemo", rec.receiptconfigmemo);			
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
<tn_dns_1020_l>
	<dataSet>
		<CURLIST1>
			<record>
				<membercode/>
				<mbr_name/>
				<isanonymous/>
				<mbr_regno/>
				<isforeigner/>
				<unknownregno/>
				<president/>
				<businessno/>
				<birthdayorigin/>
				<birthday/>
				<birthdaytype/>
				<membercategorycode/>
				<partycode/>
				<writedate/>
				<memo/>
				<adrs_name/>
				<dept/>
				<title/>
				<email/>
				<phone1/>
				<phone2/>
				<cellphone/>
				<fax/>
				<zipcode1/>
				<address1/>
				<addressdetail1/>
				<zipcode2/>
				<address2/>
				<addressdetail2/>
				<postaddress/>
				<password/>
				<deptidx/>
				<donatorcategory/>
				<receiptcategory/>
				<rcp_name/>
				<rcp_regno/>
				<relation/>
				<zipcode/>
				<address/>
				<addressdetail/>
			</record>
		</CURLIST1>
	</dataSet>
</tn_dns_1020_l>
*/
%>

<% /* 작성시간 : Fri Jun 17 15:48:52 KST 2016 */ %>