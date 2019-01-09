<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.ad.dep.rec.*
	,	chosun.ciis.ad.dep.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	AD_DEP_2200_MDataSet ds = (AD_DEP_2200_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int codeData = rx.add(root, "codeData", "");

	try {
	
		/****** 담당자 BEGIN */
		int chrg_pers = rx.add( codeData , "chrg_pers" , "");
		for(int i = 0; i < ds.curlist4.size(); i++) {
			AD_DEP_2200_MCURLIST4Record rec = (AD_DEP_2200_MCURLIST4Record)ds.curlist4.get(i);
			int item = rx.add(chrg_pers, "item", "");
			rx.add(item, "value", rec.acct_id);
			rx.add(item, "label", rec.acct_nm);
		}
		/****** 담당자 END */	
		
		/****** 거래처 구분 BEGIN */
		int dlco_clsf = rx.add( codeData , "dlco_clsf" , "");
		for(int i = 0; i < ds.curlist3.size(); i++) {
			AD_DEP_2200_MCURLIST3Record rec = (AD_DEP_2200_MCURLIST3Record)ds.curlist3.get(i);
			int item  = rx.add( dlco_clsf , "item" , "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cd +" "+ rec.cdnm);
		}
		/****** 거래처 구분 END */

		/****** 은행구분 BEGIN */
		int bank_clsf = rx.add( codeData , "bank_clsf" , "");
		for(int i = 0; i < ds.curlist2.size(); i++) {
			AD_DEP_2200_MCURLIST2Record rec = (AD_DEP_2200_MCURLIST2Record)ds.curlist2.get(i);
			int item = rx.add(bank_clsf, "item", "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", i+1+" "+rec.cdnm);
			rx.add(item, "pcode", "");
		}
		/****** 은행구분 END */
		
		/****** 은행계좌번호 BEGIN */
		int bank_no = rx.add( codeData , "bank_no" , "");
		for(int i = 0; i < ds.curlist22.size(); i++) {
			AD_DEP_2200_MCURLIST22Record rec = (AD_DEP_2200_MCURLIST22Record)ds.curlist22.get(i);
			int item = rx.add(bank_no, "item", "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
			rx.add(item, "pcode", rec.mang_cd_1);
		}
		/****** 은행구분 END */
		
		/****** 폼 결제구분  BEGIN */
		int setl_clsf = rx.add( codeData , "setl_clsf" , "");
		int item = rx.add(setl_clsf, "item", "");
		rx.add(item, "value", "");
		rx.add(item, "label", "전체");				
		for(int i = 0; i < ds.curlist1.size(); i++) {
			AD_DEP_2200_MCURLIST1Record rec = (AD_DEP_2200_MCURLIST1Record)ds.curlist1.get(i);
			item = rx.add(setl_clsf, "item", "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cd +" "+ rec.cdnm);
		}
		/****** 폼 결제구분 END */
		
		/****** (그리드)결제구분  BEGIN */
		int g_setl_clsf = rx.add( codeData , "g_setl_clsf" , "");
		for(int i = 0; i < ds.curlist1.size(); i++) {
			AD_DEP_2200_MCURLIST1Record rec = (AD_DEP_2200_MCURLIST1Record)ds.curlist1.get(i);
			item = rx.add(g_setl_clsf, "item", "");
			rx.add(item, "value", rec.cd);
			rx.add(item, "label", rec.cdnm);
		}
		/****** (그리드)결제구분 END */
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST3>
		<record>
			<cd/>
			<cdnm/>
		</record>
	</CURLIST3>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST2>
		<record>
			<cd/>
			<cdnm/>
		</record>
	</CURLIST2>
</dataSet>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<dataSet>
	<CURLIST1>
		<record>
			<cd/>
			<cdnm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Mon Apr 06 13:49:25 KST 2009 */ %>