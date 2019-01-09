<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.fc.acct.rec.*
	,	chosun.ciis.fc.acct.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	FC_ACCT_1201_LDataSet ds = (FC_ACCT_1201_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");

		for(int i = 0; i < ds.curlist.size(); i++) {
			FC_ACCT_1201_LCURLISTRecord rec = (FC_ACCT_1201_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "dept_cd", rec.dept_cd);
			rx.add(record, "abrv_nm", rec.abrv_nm);
			rx.add(record, "slip_clsf01", rec.slip_clsf01);
			rx.add(record, "slip01", rec.slip01);
			rx.add(record, "slip_clsf02", rec.slip_clsf02);
			rx.add(record, "slip02", rec.slip02);
			rx.add(record, "slip_clsf03", rec.slip_clsf03);
			rx.add(record, "slip03", rec.slip03);
			rx.add(record, "slip_clsf10", rec.slip_clsf10);
			rx.add(record, "slip10", rec.slip10);
			rx.add(record, "slip_clsf11", rec.slip_clsf11);
			rx.add(record, "slip11", rec.slip11);
			rx.add(record, "slip_clsf12", rec.slip_clsf12);
			rx.add(record, "slip12", rec.slip12);
			rx.add(record, "slip_clsf13", rec.slip_clsf13);
			rx.add(record, "slip13", rec.slip13);
			rx.add(record, "slip_clsf16", rec.slip_clsf16);
			rx.add(record, "slip16", rec.slip16);
			rx.add(record, "slip_clsf17", rec.slip_clsf17);
			rx.add(record, "slip17", rec.slip17);
			rx.add(record, "slip_clsf20", rec.slip_clsf20);
			rx.add(record, "slip20", rec.slip20);
			rx.add(record, "slip_clsf21", rec.slip_clsf21);
			rx.add(record, "slip21", rec.slip21);
			rx.add(record, "slip_clsf22", rec.slip_clsf22);
			rx.add(record, "slip22", rec.slip22);
			rx.add(record, "slip_clsf26", rec.slip_clsf26);
			rx.add(record, "slip26", rec.slip26);
			rx.add(record, "slip_clsf27", rec.slip_clsf27);
			rx.add(record, "slip27", rec.slip27);
			rx.add(record, "slip_clsf30", rec.slip_clsf30);
			rx.add(record, "slip30", rec.slip30);
			rx.add(record, "slip_clsf32", rec.slip_clsf32);
			rx.add(record, "slip32", rec.slip32);
			rx.add(record, "slip_clsf33", rec.slip_clsf33);
			rx.add(record, "slip33", rec.slip33);
			rx.add(record, "slip_clsf34", rec.slip_clsf34);
			rx.add(record, "slip34", rec.slip34);
			rx.add(record, "slip_clsf35", rec.slip_clsf35);
			rx.add(record, "slip35", rec.slip35);
			rx.add(record, "slip_clsf36", rec.slip_clsf36);
			rx.add(record, "slip36", rec.slip36);
			rx.add(record, "slip_clsf40", rec.slip_clsf40);
			rx.add(record, "slip40", rec.slip40);
			rx.add(record, "slip_clsf41", rec.slip_clsf41);
			rx.add(record, "slip41", rec.slip41);
			rx.add(record, "slip_clsf42", rec.slip_clsf42);
			rx.add(record, "slip42", rec.slip42);
			rx.add(record, "slip_clsf50", rec.slip_clsf50);
			rx.add(record, "slip50", rec.slip50);
			rx.add(record, "slip_clsf51", rec.slip_clsf51);
			rx.add(record, "slip51", rec.slip51);
			rx.add(record, "slip_clsf52", rec.slip_clsf52);
			rx.add(record, "slip52", rec.slip52);
			rx.add(record, "slip_clsf53", rec.slip_clsf53);
			rx.add(record, "slip53", rec.slip53);
			rx.add(record, "slip_clsf54", rec.slip_clsf54);
			rx.add(record, "slip54", rec.slip54);
			rx.add(record, "slip_clsf55", rec.slip_clsf55);
			rx.add(record, "slip55", rec.slip55);
			rx.add(record, "slip_clsf60", rec.slip_clsf60);
			rx.add(record, "slip60", rec.slip60);
			rx.add(record, "slip_clsf61", rec.slip_clsf61);
			rx.add(record, "slip61", rec.slip61);
			rx.add(record, "slip_clsf62", rec.slip_clsf62);
			rx.add(record, "slip62", rec.slip62);
			rx.add(record, "slip_clsf63", rec.slip_clsf63);
			rx.add(record, "slip63", rec.slip63);
			rx.add(record, "slip_clsf64", rec.slip_clsf64);
			rx.add(record, "slip64", rec.slip64);
			rx.add(record, "slip_clsf90", rec.slip_clsf90);
			rx.add(record, "slip90", rec.slip90);
			rx.add(record, "slip_clsf91", rec.slip_clsf91);
			rx.add(record, "slip91", rec.slip91);
			rx.add(record, "slip_clsf92", rec.slip_clsf92);
			rx.add(record, "slip92", rec.slip92);
			rx.add(record, "slip_clsf93", rec.slip_clsf93);
			rx.add(record, "slip93", rec.slip93);
			rx.add(record, "slip_clsf94", rec.slip_clsf94);
			rx.add(record, "slip94", rec.slip94);
			rx.add(record, "slip_clsf95", rec.slip_clsf95);
			rx.add(record, "slip95", rec.slip95);
			rx.add(record, "slip_clsf96", rec.slip_clsf96);
			rx.add(record, "slip96", rec.slip96);
			rx.add(record, "slip_clsf97", rec.slip_clsf97);
			rx.add(record, "slip97", rec.slip97);
			//rx.add(record, "dept_cd", StringUtil.replaceToXml(rec.dept_cd));
			//rx.add(record, "abrv_nm", StringUtil.replaceToXml(rec.abrv_nm));
			//rx.add(record, "slip_clsf01", StringUtil.replaceToXml(rec.slip_clsf01));
			//rx.add(record, "slip01", StringUtil.replaceToXml(rec.slip01));
			//rx.add(record, "slip_clsf02", StringUtil.replaceToXml(rec.slip_clsf02));
			//rx.add(record, "slip02", StringUtil.replaceToXml(rec.slip02));
			//rx.add(record, "slip_clsf03", StringUtil.replaceToXml(rec.slip_clsf03));
			//rx.add(record, "slip03", StringUtil.replaceToXml(rec.slip03));
			//rx.add(record, "slip_clsf10", StringUtil.replaceToXml(rec.slip_clsf10));
			//rx.add(record, "slip10", StringUtil.replaceToXml(rec.slip10));
			//rx.add(record, "slip_clsf11", StringUtil.replaceToXml(rec.slip_clsf11));
			//rx.add(record, "slip11", StringUtil.replaceToXml(rec.slip11));
			//rx.add(record, "slip_clsf12", StringUtil.replaceToXml(rec.slip_clsf12));
			//rx.add(record, "slip12", StringUtil.replaceToXml(rec.slip12));
			//rx.add(record, "slip_clsf13", StringUtil.replaceToXml(rec.slip_clsf13));
			//rx.add(record, "slip13", StringUtil.replaceToXml(rec.slip13));
			//rx.add(record, "slip_clsf16", StringUtil.replaceToXml(rec.slip_clsf16));
			//rx.add(record, "slip16", StringUtil.replaceToXml(rec.slip16));
			//rx.add(record, "slip_clsf17", StringUtil.replaceToXml(rec.slip_clsf17));
			//rx.add(record, "slip17", StringUtil.replaceToXml(rec.slip17));
			//rx.add(record, "slip_clsf20", StringUtil.replaceToXml(rec.slip_clsf20));
			//rx.add(record, "slip20", StringUtil.replaceToXml(rec.slip20));
			//rx.add(record, "slip_clsf21", StringUtil.replaceToXml(rec.slip_clsf21));
			//rx.add(record, "slip21", StringUtil.replaceToXml(rec.slip21));
			//rx.add(record, "slip_clsf22", StringUtil.replaceToXml(rec.slip_clsf22));
			//rx.add(record, "slip22", StringUtil.replaceToXml(rec.slip22));
			//rx.add(record, "slip_clsf26", StringUtil.replaceToXml(rec.slip_clsf26));
			//rx.add(record, "slip26", StringUtil.replaceToXml(rec.slip26));
			//rx.add(record, "slip_clsf27", StringUtil.replaceToXml(rec.slip_clsf27));
			//rx.add(record, "slip27", StringUtil.replaceToXml(rec.slip27));
			//rx.add(record, "slip_clsf30", StringUtil.replaceToXml(rec.slip_clsf30));
			//rx.add(record, "slip30", StringUtil.replaceToXml(rec.slip30));
			//rx.add(record, "slip_clsf32", StringUtil.replaceToXml(rec.slip_clsf32));
			//rx.add(record, "slip32", StringUtil.replaceToXml(rec.slip32));
			//rx.add(record, "slip_clsf33", StringUtil.replaceToXml(rec.slip_clsf33));
			//rx.add(record, "slip33", StringUtil.replaceToXml(rec.slip33));
			//rx.add(record, "slip_clsf34", StringUtil.replaceToXml(rec.slip_clsf34));
			//rx.add(record, "slip34", StringUtil.replaceToXml(rec.slip34));
			//rx.add(record, "slip_clsf35", StringUtil.replaceToXml(rec.slip_clsf35));
			//rx.add(record, "slip35", StringUtil.replaceToXml(rec.slip35));
			//rx.add(record, "slip_clsf36", StringUtil.replaceToXml(rec.slip_clsf36));
			//rx.add(record, "slip36", StringUtil.replaceToXml(rec.slip36));
			//rx.add(record, "slip_clsf40", StringUtil.replaceToXml(rec.slip_clsf40));
			//rx.add(record, "slip40", StringUtil.replaceToXml(rec.slip40));
			//rx.add(record, "slip_clsf41", StringUtil.replaceToXml(rec.slip_clsf41));
			//rx.add(record, "slip41", StringUtil.replaceToXml(rec.slip41));
			//rx.add(record, "slip_clsf42", StringUtil.replaceToXml(rec.slip_clsf42));
			//rx.add(record, "slip42", StringUtil.replaceToXml(rec.slip42));
			//rx.add(record, "slip_clsf50", StringUtil.replaceToXml(rec.slip_clsf50));
			//rx.add(record, "slip50", StringUtil.replaceToXml(rec.slip50));
			//rx.add(record, "slip_clsf51", StringUtil.replaceToXml(rec.slip_clsf51));
			//rx.add(record, "slip51", StringUtil.replaceToXml(rec.slip51));
			//rx.add(record, "slip_clsf52", StringUtil.replaceToXml(rec.slip_clsf52));
			//rx.add(record, "slip52", StringUtil.replaceToXml(rec.slip52));
			//rx.add(record, "slip_clsf53", StringUtil.replaceToXml(rec.slip_clsf53));
			//rx.add(record, "slip53", StringUtil.replaceToXml(rec.slip53));
			//rx.add(record, "slip_clsf54", StringUtil.replaceToXml(rec.slip_clsf54));
			//rx.add(record, "slip54", StringUtil.replaceToXml(rec.slip54));
			//rx.add(record, "slip_clsf55", StringUtil.replaceToXml(rec.slip_clsf55));
			//rx.add(record, "slip55", StringUtil.replaceToXml(rec.slip55));
			//rx.add(record, "slip_clsf60", StringUtil.replaceToXml(rec.slip_clsf60));
			//rx.add(record, "slip60", StringUtil.replaceToXml(rec.slip60));
			//rx.add(record, "slip_clsf61", StringUtil.replaceToXml(rec.slip_clsf61));
			//rx.add(record, "slip61", StringUtil.replaceToXml(rec.slip61));
			//rx.add(record, "slip_clsf62", StringUtil.replaceToXml(rec.slip_clsf62));
			//rx.add(record, "slip62", StringUtil.replaceToXml(rec.slip62));
			//rx.add(record, "slip_clsf63", StringUtil.replaceToXml(rec.slip_clsf63));
			//rx.add(record, "slip63", StringUtil.replaceToXml(rec.slip63));
			//rx.add(record, "slip_clsf64", StringUtil.replaceToXml(rec.slip_clsf64));
			//rx.add(record, "slip64", StringUtil.replaceToXml(rec.slip64));
			//rx.add(record, "slip_clsf90", StringUtil.replaceToXml(rec.slip_clsf90));
			//rx.add(record, "slip90", StringUtil.replaceToXml(rec.slip90));
			//rx.add(record, "slip_clsf91", StringUtil.replaceToXml(rec.slip_clsf91));
			//rx.add(record, "slip91", StringUtil.replaceToXml(rec.slip91));
			//rx.add(record, "slip_clsf92", StringUtil.replaceToXml(rec.slip_clsf92));
			//rx.add(record, "slip92", StringUtil.replaceToXml(rec.slip92));
			//rx.add(record, "slip_clsf93", StringUtil.replaceToXml(rec.slip_clsf93));
			//rx.add(record, "slip93", StringUtil.replaceToXml(rec.slip93));
			//rx.add(record, "slip_clsf94", StringUtil.replaceToXml(rec.slip_clsf94));
			//rx.add(record, "slip94", StringUtil.replaceToXml(rec.slip94));
			//rx.add(record, "slip_clsf95", StringUtil.replaceToXml(rec.slip_clsf95));
			//rx.add(record, "slip95", StringUtil.replaceToXml(rec.slip95));
			//rx.add(record, "slip_clsf96", StringUtil.replaceToXml(rec.slip_clsf96));
			//rx.add(record, "slip96", StringUtil.replaceToXml(rec.slip96));
			//rx.add(record, "slip_clsf97", StringUtil.replaceToXml(rec.slip_clsf97));
			//rx.add(record, "slip97", StringUtil.replaceToXml(rec.slip97));
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
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
<fc_acct_1201_l>
	<dataSet>
		<CURLIST>
			<record>
				<dept_cd/>
				<abrv_nm/>
				<slip_clsf01/>
				<slip01/>
				<slip_clsf02/>
				<slip02/>
				<slip_clsf03/>
				<slip03/>
				<slip_clsf10/>
				<slip10/>
				<slip_clsf11/>
				<slip11/>
				<slip_clsf12/>
				<slip12/>
				<slip_clsf13/>
				<slip13/>
				<slip_clsf16/>
				<slip16/>
				<slip_clsf17/>
				<slip17/>
				<slip_clsf20/>
				<slip20/>
				<slip_clsf21/>
				<slip21/>
				<slip_clsf22/>
				<slip22/>
				<slip_clsf26/>
				<slip26/>
				<slip_clsf27/>
				<slip27/>
				<slip_clsf30/>
				<slip30/>
				<slip_clsf32/>
				<slip32/>
				<slip_clsf33/>
				<slip33/>
				<slip_clsf34/>
				<slip34/>
				<slip_clsf35/>
				<slip35/>
				<slip_clsf36/>
				<slip36/>
				<slip_clsf40/>
				<slip40/>
				<slip_clsf41/>
				<slip41/>
				<slip_clsf42/>
				<slip42/>
				<slip_clsf50/>
				<slip50/>
				<slip_clsf51/>
				<slip51/>
				<slip_clsf52/>
				<slip52/>
				<slip_clsf53/>
				<slip53/>
				<slip_clsf54/>
				<slip54/>
				<slip_clsf55/>
				<slip55/>
				<slip_clsf60/>
				<slip60/>
				<slip_clsf61/>
				<slip61/>
				<slip_clsf62/>
				<slip62/>
				<slip_clsf63/>
				<slip63/>
				<slip_clsf64/>
				<slip64/>
				<slip_clsf90/>
				<slip90/>
				<slip_clsf91/>
				<slip91/>
				<slip_clsf92/>
				<slip92/>
				<slip_clsf93/>
				<slip93/>
				<slip_clsf94/>
				<slip94/>
				<slip_clsf95/>
				<slip95/>
				<slip_clsf96/>
				<slip96/>
				<slip_clsf97/>
				<slip97/>
			</record>
		</CURLIST>
	</dataSet>
</fc_acct_1201_l>
*/
%>

<% /* 작성시간 : Mon Apr 20 18:11:10 KST 2009 */ %>