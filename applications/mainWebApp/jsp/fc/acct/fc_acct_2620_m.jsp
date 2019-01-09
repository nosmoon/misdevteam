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
	FC_ACCT_2620_MDataSet ds = (FC_ACCT_2620_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int initData = 0;
	int comboSet = 0;
	int item = 0;

	initData = rx.add(root, "initData", "");
	comboSet = rx.add(initData, "comboSet", "");

	try {

		int slip_clsf_cd = rx.add(comboSet, "slip_clsf_cd", "");
		for(int i = 0; i < ds.cur_slip_clsf_list.size(); i++) {
			FC_ACCT_2620_MCUR_SLIP_CLSF_LISTRecord rec = (FC_ACCT_2620_MCUR_SLIP_CLSF_LISTRecord)ds.cur_slip_clsf_list.get(i);
			
			item  = rx.add( slip_clsf_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + "  " + rec.cd_abrv_nm );
			
		}
		
		int dlco_cd = rx.add(comboSet, "dlco_cd", "");
		for(int i = 0; i < ds.cur_dlco_list.size(); i++) {
			FC_ACCT_2620_MCUR_DLCO_LISTRecord rec = (FC_ACCT_2620_MCUR_DLCO_LISTRecord)ds.cur_dlco_list.get(i);
			
			item  = rx.add( dlco_cd , "item" , "");
			rx.add ( item, "value", rec.dlco_cmpy_cd );
			rx.add ( item, "label", rec.dlco_nm );
			
		}

		int dlco_clsf_cd = rx.add(comboSet, "dlco_clsf_cd", "");
		for(int i = 0; i < ds.cur_clsf_list.size(); i++) {
			FC_ACCT_2620_MCUR_CLSF_LISTRecord rec = (FC_ACCT_2620_MCUR_CLSF_LISTRecord)ds.cur_clsf_list.get(i);
			
			item  = rx.add( dlco_clsf_cd , "item" , "");
			rx.add ( item, "value", rec.dlco_clsf_cd );
			rx.add ( item, "label", rec.dlco_clsf_nm );
			
		}

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
<fc_acct_2620_m>
	<dataSet>
		<CUR_SLIP_CLSF_LIST>
			<record>
				<cd/>
				<cdnm/>
				<cd_abrv_nm/>
				<cdnm_cd/>
				<cdabrvnm_cd/>
			</record>
		</CUR_SLIP_CLSF_LIST>
	</dataSet>
</fc_acct_2620_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2620_m>
	<dataSet>
		<CUR_DLCO_LIST>
			<record>
				<dlco_cmpy_cd/>
				<dlco_nm/>
			</record>
		</CUR_DLCO_LIST>
	</dataSet>
</fc_acct_2620_m>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<fc_acct_2620_m>
	<dataSet>
		<CUR_CLSF_LIST>
			<record>
				<dlco_clsf_cd/>
				<dlco_clsf_nm/>
			</record>
		</CUR_CLSF_LIST>
	</dataSet>
</fc_acct_2620_m>
*/
%>

<% /* 작성시간 : Tue Dec 16 11:50:31 KST 2014 */ %>