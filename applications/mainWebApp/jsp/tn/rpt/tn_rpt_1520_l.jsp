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
	TN_RPT_1520_LDataSet ds = (TN_RPT_1520_LDataSet)request.getAttribute("ds");
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
			TN_RPT_1520_LCURLIST2Record rec = (TN_RPT_1520_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "memberidx", rec.memberidx);
			rx.add(record, "promiseprice", rec.promiseprice);
			rx.add(record, "useoriginal", rec.useoriginal);
			rx.add(record, "paymethodcode", rec.paymethodcode);
			rx.add(record, "bankaccountcode", rec.bankaccountcode);
			rx.add(record, "partitiontype", rec.partitiontype);
			rx.add(record, "paystartdate", rec.paystartdate);
			rx.add(record, "payenddate", rec.payenddate);
			rx.add(record, "partitioncount", rec.partitioncount);
			rx.add(record, "monthlypayday", rec.monthlypayday);
			rx.add(record, "monthlypayprice", rec.monthlypayprice);
			rx.add(record, "excludenopay", rec.excludenopay);
			rx.add(record, "paystopped", rec.paystopped);
			rx.add(record, "contributormemo", rec.contributormemo);
			rx.add(record, "promisememo", rec.promisememo);
			rx.add(record, "fundtype", rec.fundtype);
			rx.add(record, "fundidx", rec.fundidx);
			rx.add(record, "supporttype", rec.supporttype);
			rx.add(record, "supportidx", rec.supportidx);
			rx.add(record, "purposememo", rec.purposememo);
			rx.add(record, "itemname", rec.itemname);
			rx.add(record, "itemqty", rec.itemqty);
			rx.add(record, "itemprice", rec.itemprice);
			rx.add(record, "itemremk", rec.itemremk);
			rx.add(record, "stopdate", rec.stopdate);
			rx.add(record, "stopresn", rec.stopresn);
			rx.add(record, "paymethodcode", rec.paymethodcode);
			rx.add(record, "bankcode", rec.bankcode);
			rx.add(record, "bankaccount", rec.bankaccount);
			rx.add(record, "bankaccountowner", rec.bankaccountowner);
			rx.add(record, "bankowneridentity", rec.bankowneridentity);
			rx.add(record, "bankownerclsf", rec.bankownerclsf);
			rx.add(record, "cardcmpy", rec.cardcmpy);
			rx.add(record, "cardnumber", rec.cardnumber);
			rx.add(record, "cardyymm", rec.cardyymm);
			rx.add(record, "mobiaprvname", rec.mobiaprvname);
			rx.add(record, "mobiaprvcmpy", rec.mobiaprvcmpy);
			rx.add(record, "mobiaprvnumber", rec.mobiaprvnumber);
			rx.add(record, "mobiaprvprn", rec.mobiaprvprn);
			rx.add(record, "cmsstopped", rec.cmsstopped);
			rx.add(record, "cmsstopdate", rec.cmsstopdate);
			rx.add(record, "cmsstatus", rec.cmsstatus);
			rx.add(record, "cmsupdatedate", rec.cmsupdatedate);
			rx.add(record, "cardidentity", rec.cardidentity);
			rx.add(record, "cardowner", rec.cardowner);
			//rx.add(record, "memberidx", StringUtil.replaceToXml(rec.memberidx));
			//rx.add(record, "promiseprice", StringUtil.replaceToXml(rec.promiseprice));
			//rx.add(record, "useoriginal", StringUtil.replaceToXml(rec.useoriginal));
			//rx.add(record, "paymethodcode", StringUtil.replaceToXml(rec.paymethodcode));
			//rx.add(record, "bankaccountcode", StringUtil.replaceToXml(rec.bankaccountcode));
			//rx.add(record, "partitiontype", StringUtil.replaceToXml(rec.partitiontype));
			//rx.add(record, "paystartdate", StringUtil.replaceToXml(rec.paystartdate));
			//rx.add(record, "payenddate", StringUtil.replaceToXml(rec.payenddate));
			//rx.add(record, "partitioncount", StringUtil.replaceToXml(rec.partitioncount));
			//rx.add(record, "monthlypayday", StringUtil.replaceToXml(rec.monthlypayday));
			//rx.add(record, "monthlypayprice", StringUtil.replaceToXml(rec.monthlypayprice));
			//rx.add(record, "excludenopay", StringUtil.replaceToXml(rec.excludenopay));
			//rx.add(record, "paystopped", StringUtil.replaceToXml(rec.paystopped));
			//rx.add(record, "contributormemo", StringUtil.replaceToXml(rec.contributormemo));
			//rx.add(record, "promisememo", StringUtil.replaceToXml(rec.promisememo));
			//rx.add(record, "fundtype", StringUtil.replaceToXml(rec.fundtype));
			//rx.add(record, "fundidx", StringUtil.replaceToXml(rec.fundidx));
			//rx.add(record, "supporttype", StringUtil.replaceToXml(rec.supporttype));
			//rx.add(record, "supportidx", StringUtil.replaceToXml(rec.supportidx));
			//rx.add(record, "purposememo", StringUtil.replaceToXml(rec.purposememo));
			//rx.add(record, "itemname", StringUtil.replaceToXml(rec.itemname));
			//rx.add(record, "itemqty", StringUtil.replaceToXml(rec.itemqty));
			//rx.add(record, "itemprice", StringUtil.replaceToXml(rec.itemprice));
			//rx.add(record, "itemremk", StringUtil.replaceToXml(rec.itemremk));
			//rx.add(record, "stopdate", StringUtil.replaceToXml(rec.stopdate));
			//rx.add(record, "stopresn", StringUtil.replaceToXml(rec.stopresn));
			//rx.add(record, "paymethodcode", StringUtil.replaceToXml(rec.paymethodcode));
			//rx.add(record, "bankcode", StringUtil.replaceToXml(rec.bankcode));
			//rx.add(record, "bankaccount", StringUtil.replaceToXml(rec.bankaccount));
			//rx.add(record, "bankaccountowner", StringUtil.replaceToXml(rec.bankaccountowner));
			//rx.add(record, "bankowneridentity", StringUtil.replaceToXml(rec.bankowneridentity));
			//rx.add(record, "bankownerclsf", StringUtil.replaceToXml(rec.bankownerclsf));
			//rx.add(record, "cardcmpy", StringUtil.replaceToXml(rec.cardcmpy));
			//rx.add(record, "cardnumber", StringUtil.replaceToXml(rec.cardnumber));
			//rx.add(record, "cardyymm", StringUtil.replaceToXml(rec.cardyymm));
			//rx.add(record, "mobiaprvname", StringUtil.replaceToXml(rec.mobiaprvname));
			//rx.add(record, "mobiaprvcmpy", StringUtil.replaceToXml(rec.mobiaprvcmpy));
			//rx.add(record, "mobiaprvnumber", StringUtil.replaceToXml(rec.mobiaprvnumber));
			//rx.add(record, "mobiaprvprn", StringUtil.replaceToXml(rec.mobiaprvprn));
			//rx.add(record, "cmsstopped", StringUtil.replaceToXml(rec.cmsstopped));
			//rx.add(record, "cmsstopdate", StringUtil.replaceToXml(rec.cmsstopdate));
			//rx.add(record, "cmsstatus", StringUtil.replaceToXml(rec.cmsstatus));
			//rx.add(record, "cmsupdatedate", StringUtil.replaceToXml(rec.cmsupdatedate));
			//rx.add(record, "cardidentity", StringUtil.replaceToXml(rec.cardidentity));
			//rx.add(record, "cardowner", StringUtil.replaceToXml(rec.cardowner));
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		recordSet = rx.add(dataSet, "gridData1", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			TN_RPT_1520_LCURLIST1Record rec = (TN_RPT_1520_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "his_memberidx", rec.his_memberidx);
			rx.add(record, "his_promiseprice", rec.his_promiseprice);
			rx.add(record, "his_useoriginal", rec.his_useoriginal);
			rx.add(record, "his_paymethodcode", rec.his_paymethodcode);
			rx.add(record, "his_bankaccountcode", rec.his_bankaccountcode);
			rx.add(record, "his_partitiontype", rec.his_partitiontype);
			rx.add(record, "his_paystartdate", rec.his_paystartdate);
			rx.add(record, "his_payenddate", rec.his_payenddate);
			rx.add(record, "his_partitioncount", rec.his_partitioncount);
			rx.add(record, "his_monthlypayday", rec.his_monthlypayday);
			rx.add(record, "his_monthlypayprice", rec.his_monthlypayprice);
			rx.add(record, "his_excludenopay", rec.his_excludenopay);
			rx.add(record, "his_paystopped", rec.his_paystopped);
			rx.add(record, "his_contributormemo", rec.his_contributormemo);
			rx.add(record, "his_promisememo", rec.his_promisememo);
			rx.add(record, "his_fundtype", rec.his_fundtype);
			rx.add(record, "his_fundidx", rec.his_fundidx);
			rx.add(record, "his_supporttype", rec.his_supporttype);
			rx.add(record, "his_supportidx", rec.his_supportidx);
			rx.add(record, "his_purposememo", rec.his_purposememo);
			rx.add(record, "his_itemname", rec.his_itemname);
			rx.add(record, "his_itemqty", rec.his_itemqty);
			rx.add(record, "his_itemprice", rec.his_itemprice);
			rx.add(record, "his_itemremk", rec.his_itemremk);
			rx.add(record, "his_stopdate", rec.his_stopdate);
			rx.add(record, "his_stopresn", rec.his_stopresn);
			rx.add(record, "his_paymethodcode", rec.his_paymethodcode);
			rx.add(record, "his_bankcode", rec.his_bankcode);
			rx.add(record, "his_bankaccount", rec.his_bankaccount);
			rx.add(record, "his_bankaccountowner", rec.his_bankaccountowner);
			rx.add(record, "his_bankowneridentity", rec.his_bankowneridentity);
			rx.add(record, "his_bankownerclsf", rec.his_bankownerclsf);
			rx.add(record, "his_cardcmpy", rec.his_cardcmpy);
			rx.add(record, "his_cardnumber", rec.his_cardnumber);
			rx.add(record, "his_cardyymm", rec.his_cardyymm);
			rx.add(record, "his_mobiaprvname", rec.his_mobiaprvname);
			rx.add(record, "his_mobiaprvcmpy", rec.his_mobiaprvcmpy);
			rx.add(record, "his_mobiaprvnumber", rec.his_mobiaprvnumber);
			rx.add(record, "his_mobiaprvprn", rec.his_mobiaprvprn);
			rx.add(record, "his_cmsstopped", rec.his_cmsstopped);
			rx.add(record, "his_cmsstopdate", rec.his_cmsstopdate);
			rx.add(record, "his_cmsstatus", rec.his_cmsstatus);
			rx.add(record, "his_cmsupdatedate", rec.his_cmsupdatedate);
			rx.add(record, "his_cardidentity", rec.his_cardidentity);
			rx.add(record, "his_cardowner", rec.his_cardowner);
			//rx.add(record, "his_memberidx", StringUtil.replaceToXml(rec.his_memberidx));
			//rx.add(record, "his_promiseprice", StringUtil.replaceToXml(rec.his_promiseprice));
			//rx.add(record, "his_useoriginal", StringUtil.replaceToXml(rec.his_useoriginal));
			//rx.add(record, "his_paymethodcode", StringUtil.replaceToXml(rec.his_paymethodcode));
			//rx.add(record, "his_bankaccountcode", StringUtil.replaceToXml(rec.his_bankaccountcode));
			//rx.add(record, "his_partitiontype", StringUtil.replaceToXml(rec.his_partitiontype));
			//rx.add(record, "his_paystartdate", StringUtil.replaceToXml(rec.his_paystartdate));
			//rx.add(record, "his_payenddate", StringUtil.replaceToXml(rec.his_payenddate));
			//rx.add(record, "his_partitioncount", StringUtil.replaceToXml(rec.his_partitioncount));
			//rx.add(record, "his_monthlypayday", StringUtil.replaceToXml(rec.his_monthlypayday));
			//rx.add(record, "his_monthlypayprice", StringUtil.replaceToXml(rec.his_monthlypayprice));
			//rx.add(record, "his_excludenopay", StringUtil.replaceToXml(rec.his_excludenopay));
			//rx.add(record, "his_paystopped", StringUtil.replaceToXml(rec.his_paystopped));
			//rx.add(record, "his_contributormemo", StringUtil.replaceToXml(rec.his_contributormemo));
			//rx.add(record, "his_promisememo", StringUtil.replaceToXml(rec.his_promisememo));
			//rx.add(record, "his_fundtype", StringUtil.replaceToXml(rec.his_fundtype));
			//rx.add(record, "his_fundidx", StringUtil.replaceToXml(rec.his_fundidx));
			//rx.add(record, "his_supporttype", StringUtil.replaceToXml(rec.his_supporttype));
			//rx.add(record, "his_supportidx", StringUtil.replaceToXml(rec.his_supportidx));
			//rx.add(record, "his_purposememo", StringUtil.replaceToXml(rec.his_purposememo));
			//rx.add(record, "his_itemname", StringUtil.replaceToXml(rec.his_itemname));
			//rx.add(record, "his_itemqty", StringUtil.replaceToXml(rec.his_itemqty));
			//rx.add(record, "his_itemprice", StringUtil.replaceToXml(rec.his_itemprice));
			//rx.add(record, "his_itemremk", StringUtil.replaceToXml(rec.his_itemremk));
			//rx.add(record, "his_stopdate", StringUtil.replaceToXml(rec.his_stopdate));
			//rx.add(record, "his_stopresn", StringUtil.replaceToXml(rec.his_stopresn));
			//rx.add(record, "his_paymethodcode", StringUtil.replaceToXml(rec.his_paymethodcode));
			//rx.add(record, "his_bankcode", StringUtil.replaceToXml(rec.his_bankcode));
			//rx.add(record, "his_bankaccount", StringUtil.replaceToXml(rec.his_bankaccount));
			//rx.add(record, "his_bankaccountowner", StringUtil.replaceToXml(rec.his_bankaccountowner));
			//rx.add(record, "his_bankowneridentity", StringUtil.replaceToXml(rec.his_bankowneridentity));
			//rx.add(record, "his_bankownerclsf", StringUtil.replaceToXml(rec.his_bankownerclsf));
			//rx.add(record, "his_cardcmpy", StringUtil.replaceToXml(rec.his_cardcmpy));
			//rx.add(record, "his_cardnumber", StringUtil.replaceToXml(rec.his_cardnumber));
			//rx.add(record, "his_cardyymm", StringUtil.replaceToXml(rec.his_cardyymm));
			//rx.add(record, "his_mobiaprvname", StringUtil.replaceToXml(rec.his_mobiaprvname));
			//rx.add(record, "his_mobiaprvcmpy", StringUtil.replaceToXml(rec.his_mobiaprvcmpy));
			//rx.add(record, "his_mobiaprvnumber", StringUtil.replaceToXml(rec.his_mobiaprvnumber));
			//rx.add(record, "his_mobiaprvprn", StringUtil.replaceToXml(rec.his_mobiaprvprn));
			//rx.add(record, "his_cmsstopped", StringUtil.replaceToXml(rec.his_cmsstopped));
			//rx.add(record, "his_cmsstopdate", StringUtil.replaceToXml(rec.his_cmsstopdate));
			//rx.add(record, "his_cmsstatus", StringUtil.replaceToXml(rec.his_cmsstatus));
			//rx.add(record, "his_cmsupdatedate", StringUtil.replaceToXml(rec.his_cmsupdatedate));
			//rx.add(record, "his_cardidentity", StringUtil.replaceToXml(rec.his_cardidentity));
			//rx.add(record, "his_cardowner", StringUtil.replaceToXml(rec.his_cardowner));
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
<tn_rpt_1520_l>
	<dataSet>
		<CURLIST2>
			<record>
				<memberidx/>
				<promiseprice/>
				<useoriginal/>
				<paymethodcode/>
				<bankaccountcode/>
				<partitiontype/>
				<paystartdate/>
				<payenddate/>
				<partitioncount/>
				<monthlypayday/>
				<monthlypayprice/>
				<excludenopay/>
				<paystopped/>
				<contributormemo/>
				<promisememo/>
				<fundtype/>
				<fundidx/>
				<supporttype/>
				<supportidx/>
				<purposememo/>
				<itemname/>
				<itemqty/>
				<itemprice/>
				<itemremk/>
				<stopdate/>
				<stopresn/>
				<paymethodcode/>
				<bankcode/>
				<bankaccount/>
				<bankaccountowner/>
				<bankowneridentity/>
				<bankownerclsf/>
				<cardcmpy/>
				<cardnumber/>
				<cardyymm/>
				<mobiaprvname/>
				<mobiaprvcmpy/>
				<mobiaprvnumber/>
				<mobiaprvprn/>
				<cmsstopped/>
				<cmsstopdate/>
				<cmsstatus/>
				<cmsupdatedate/>
				<cardidentity/>
				<cardowner/>
			</record>
		</CURLIST2>
	</dataSet>
</tn_rpt_1520_l>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<tn_rpt_1520_l>
	<dataSet>
		<CURLIST1>
			<record>
				<his_memberidx/>
				<his_promiseprice/>
				<his_useoriginal/>
				<his_paymethodcode/>
				<his_bankaccountcode/>
				<his_partitiontype/>
				<his_paystartdate/>
				<his_payenddate/>
				<his_partitioncount/>
				<his_monthlypayday/>
				<his_monthlypayprice/>
				<his_excludenopay/>
				<his_paystopped/>
				<his_contributormemo/>
				<his_promisememo/>
				<his_fundtype/>
				<his_fundidx/>
				<his_supporttype/>
				<his_supportidx/>
				<his_purposememo/>
				<his_itemname/>
				<his_itemqty/>
				<his_itemprice/>
				<his_itemremk/>
				<his_stopdate/>
				<his_stopresn/>
				<his_paymethodcode/>
				<his_bankcode/>
				<his_bankaccount/>
				<his_bankaccountowner/>
				<his_bankowneridentity/>
				<his_bankownerclsf/>
				<his_cardcmpy/>
				<his_cardnumber/>
				<his_cardyymm/>
				<his_mobiaprvname/>
				<his_mobiaprvcmpy/>
				<his_mobiaprvnumber/>
				<his_mobiaprvprn/>
				<his_cmsstopped/>
				<his_cmsstopdate/>
				<his_cmsstatus/>
				<his_cmsupdatedate/>
				<his_cardidentity/>
				<his_cardowner/>
			</record>
		</CURLIST1>
	</dataSet>
</tn_rpt_1520_l>
*/
%>

<% /* 작성시간 : Thu Nov 03 19:37:53 KST 2016 */ %>