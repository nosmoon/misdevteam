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
	FC_ACCT_6283_SDataSet ds = (FC_ACCT_6283_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = ds.errcode;
	String errmsg = ds.errmsg;
	String tmpPad = "";
	dataSet = rx.add(root, "output_Data", "");

	try {
		/****** CUR_VATDECLSTMT_LIST_1 BEGIN */
		recordSet = rx.add(dataSet, "makefile_data", "");

		for(int i = 0; i < ds.cur_vatdeclstmt_list_1.size(); i++) {
			FC_ACCT_6283_SCUR_VATDECLSTMT_LIST_1Record rec = (FC_ACCT_6283_SCUR_VATDECLSTMT_LIST_1Record)ds.cur_vatdeclstmt_list_1.get(i);
			int record = rx.add(recordSet, "record", "");
			rx.addCData(record, "form_nm", rec.form_nm);
			rx.add(record, "from_seq", rec.from_seq);

			//rx.addCData(record, "file_data", rec.file_data);

			int n = 0;
			if(rec.file_data.substring(0,9).equals("11I103200")) {
				n = 600 - rec.file_data.getBytes().length;
				tmpPad = String.format( "%" + n + "s", "") + "]";
				
			} else if(rec.file_data.substring(0,9).equals("17I103200")) {
				n = 1100 - rec.file_data.getBytes().length;
				tmpPad = String.format( "%" + n + "s", "") + "]";

			} else if(rec.file_data.substring(0,9).equals("15I103200")) {
				n = 150 - rec.file_data.getBytes().length;
				tmpPad = String.format( "%" + n + "s", "") + "]";
				
			} else if(rec.file_data.substring(0,9).equals("14I103200")) {	//부가가치세 공제감면 신고서 레코드(신규)
				n = 100 - rec.file_data.getBytes().length;
				tmpPad = String.format( "%" + n + "s", "") + "]";
				
			} else if(rec.file_data.substring(0,9).equals("13I103200")) {	//부가가치세 가산세 신고서 레코드(신규)
				n = 100 - rec.file_data.getBytes().length;
				tmpPad = String.format( "%" + n + "s", "") + "]";

			} else if(rec.file_data.substring(0,9).equals("17I103600")) {	//부동산임대공급가액명세서
				n = 250 - rec.file_data.getBytes().length;
				tmpPad = String.format( "%" + n + "s", "") + "]";

			} else if(rec.file_data.substring(0,9).equals("18I103600")) {	//부동산임대공급가액명세서 세부내용
				n = 250 - rec.file_data.getBytes().length;
				tmpPad = String.format( "%" + n + "s", "") + "]";

			} else if(rec.file_data.substring(0,9).equals("17I104500")) {	//사업장별부가가치세과세표준 및 납부세액(환급세액)신고명세서
				n = 300 - rec.file_data.getBytes().length;
				tmpPad = String.format( "%" + n + "s", "") + "]";

			} else if(rec.file_data.substring(0,9).equals("18I104500")) {	//사업장별부가가치세과세표준 및 납부세액(환급세액)신고명세서 세부내용
				n = 300 - rec.file_data.getBytes().length;
				tmpPad = String.format( "%" + n + "s", "") + "]";

			} else if(rec.file_data.substring(0,9).equals("17I103800") || rec.file_data.substring(0,9).equals("17I103300")) {
				//건물등 감가상각자산 취득명세서, 공제받지못할매입세액명세서
				n = 200 - rec.file_data.getBytes().length;
				tmpPad = String.format( "%" + n + "s", "") + "]";

			} else if(rec.file_data.substring(0,9).equals("18I103300") || rec.file_data.substring(0,9).equals("19I103300") || rec.file_data.substring(0,9).equals("20I103300") || rec.file_data.substring(0,9).equals("21I103300") ) {
				//공제받지못할매입세액명세서 명세, 공제받지못할매입세액명세서_공통매입세액안분계산내역, 공제받지못할매입세액명세서_공통매입세액정산내역 
				n = 100 - rec.file_data.getBytes().length;
				tmpPad = String.format( "%" + n + "s", "") + "]";

			} else if(rec.file_data.substring(0,9).equals("17I104000")) {
				//영세율매출명세서 
				n = 400 - rec.file_data.getBytes().length;
				tmpPad = String.format( "%" + n + "s", "") + "]";

			} else if(rec.file_data.substring(0,2).equals("A2") || rec.file_data.substring(0,2).equals("B2") || rec.file_data.substring(0,2).equals("C2")) {
				//수출실적명세서
				n = 180 - rec.file_data.getBytes().length;
				tmpPad = String.format( "%" + n + "s", "") + "]";				

			} else if(rec.file_data.substring(0,2).equals("HL") || rec.file_data.substring(0,2).equals("DL") || rec.file_data.substring(0,2).equals("TL")) {
				//신용카드매출전표등수령명세서
				n = 140 - rec.file_data.getBytes().length;
				tmpPad = String.format( "%" + n + "s", "") + "]";				
				
			} else if(rec.file_data.substring(0,2).equals("A1") || rec.file_data.substring(0,2).equals("B1") || rec.file_data.substring(0,2).equals("C1") || rec.file_data.substring(0,2).equals("D1") || rec.file_data.substring(0,2).equals("E1")) {
				//제출자(대리인)레코드 
				n = 230 - rec.file_data.getBytes().length;
				tmpPad = String.format( "%" + n + "s", "") + "]";

			} else if(rec.file_data.substring(0,2).equals("71") || rec.file_data.substring(0,2).equals("31") || rec.file_data.substring(0,2).equals("21") || rec.file_data.substring(0,2).equals("51") || rec.file_data.substring(0,2).equals("41") || rec.file_data.substring(0,2).equals("61")) {
				//신용카드매출전표등수령명세서
				n = 170 - rec.file_data.getBytes().length;
				tmpPad = String.format( "%" + n + "s", "") + "]";				

			} else if(rec.file_data.substring(0,1).equals("1")) {
				n = 170 - rec.file_data.getBytes().length;
				tmpPad = String.format( "%" + n + "s", "") + "]";
								
			} else {
				tmpPad = "";
			}

			rx.addCData(record, "file_data", rec.file_data + tmpPad);
			
			//rx.add(record, "form_nm", StringUtil.replaceToXml(rec.form_nm));
			//rx.add(record, "from_seq", StringUtil.replaceToXml(rec.from_seq));
			//rx.add(record, "file_data", StringUtil.replaceToXml(rec.file_data));
		}
		rx.add(recordSet, "totalcnt", ds.cur_vatdeclstmt_list_1.size());
		/****** CUR_VATDECLSTMT_LIST_1 END */
		System.out.println("최호정 fc_acct_6283_s.jsp 정상 success");

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
<fc_acct_6283_s>
	<dataSet>
		<CUR_VATDECLSTMT_LIST_1>
			<record>
				<form_nm/>
				<from_seq/>
				<file_data/>
			</record>
		</CUR_VATDECLSTMT_LIST_1>
	</dataSet>
</fc_acct_6283_s>
*/
%>

<% /* 작성시간 : Tue Jun 24 10:37:44 KST 2014 */ %>