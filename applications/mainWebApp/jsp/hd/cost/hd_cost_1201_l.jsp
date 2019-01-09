<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.hd.cost.rec.*
	,	chosun.ciis.hd.cost.ds.*;
	"
%>

<%
	RwXml rx = new RwXml();
	HD_COST_1201_LDataSet ds = (HD_COST_1201_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	dataSet = rx.add(root, "dataSet", "");

	try {
		rx.add(dataSet, "xx_xx_cd_050", ds.getXx_xx_cd_050());
		rx.add(dataSet, "xx_xx_cd_060", ds.getXx_xx_cd_060());
		
		for(int i = 0; i < ds.xx_hd_card_type_list.size(); i++) {
			HD_COST_1201_LXX_HD_CARD_TYPE_LISTRecord rec = (HD_COST_1201_LXX_HD_CARD_TYPE_LISTRecord)ds.xx_hd_card_type_list.get(i);
			
			if(rec.getCd_type().equals("hd_card_type_a")){ //관리자카드
				recordSet = rx.add(dataSet, "XX_HD_CARD_TYPE_A_LIST", "");
			} else if (rec.getCd_type().equals("hd_card_type_b")) { //취재카드
				recordSet = rx.add(dataSet, "XX_HD_CARD_TYPE_B_LIST", "");
			} else if (rec.getCd_type().equals("hd_card_type_c")) { //주유카드
				recordSet = rx.add(dataSet, "XX_HD_CARD_TYPE_C_LIST", "");
			} else if (rec.getCd_type().equals("hd_card_type_d")) { //기타카드
				recordSet = rx.add(dataSet, "XX_HD_CARD_TYPE_D_LIST", "");
			}
			
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd_type", rec.cd_type);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(recordSet, "totalcnt", 1);
		}
		
		
		
		/****** ov_xx_hd_card_tupe_list END */
		
		/****** CURLIST2 BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST2", "");
		recordSet = rx.add(dataSet, "hd_mang_clsf", "");

		for(int i = 0; i < ds.curlist2.size(); i++) {
			HD_COST_1201_LCURLIST2Record rec = (HD_COST_1201_LCURLIST2Record)ds.curlist2.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd_type", rec.cd_type);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd + " " + rec.cdnm);
		}
		rx.add(recordSet, "totalcnt", ds.curlist2.size());
		/****** CURLIST2 END */

		/****** CURLIST1 BEGIN */
		//recordSet = rx.add(dataSet, "CURLIST1", "");
		recordSet = rx.add(dataSet, "corp_card_clsf", "");

		for(int i = 0; i < ds.curlist1.size(); i++) {
			HD_COST_1201_LCURLIST1Record rec = (HD_COST_1201_LCURLIST1Record)ds.curlist1.get(i);
			int record = rx.add(recordSet, "item", "");
			rx.add(record, "cd_type", rec.cd_type);
			rx.add(record, "cd", rec.cd);
			rx.add(record, "cdnm", rec.cdnm);
			rx.add(record, "cd_abrv_nm", rec.cd_abrv_nm);
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
<dataSet>
	<CURLIST2>
		<record>
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
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
			<cd_type/>
			<cd/>
			<cdnm/>
			<cd_abrv_nm/>
		</record>
	</CURLIST1>
</dataSet>
*/
%>

<% /* 작성시간 : Fri Apr 17 18:20:27 KST 2009 */ %>