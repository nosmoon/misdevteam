<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.rcp.ds.*
	,	chosun.ciis.se.rcp.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_rcp_4630_l.jsp
* 기능 : 스포츠입금등록(신) - 대상내역조회
* 작성일자 : 2010-05-28
* 작성자 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml(); 
	SE_RCP_4630_LDataSet ds = (SE_RCP_4630_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	//resData = rx.add(root, "rcpmlist", "");
	resData = rx.add(root, "grid3", "");

	Calendar cal 	= Calendar.getInstance();
	String year 	= String.valueOf(cal.get(cal.YEAR));
	String month 	= String.valueOf(cal.get(cal.MONTH) + 1);
	month			= month.length() == 1 ? "0" + month : month;
	String day		= String.valueOf(cal.get(cal.DATE));
	day				= day.length() == 1 ? "0" + day : day;
	String today = year + month + day;
	
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_4630_LCURLISTRecord rec = (SE_RCP_4630_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(resData, "record", "");

			rx.add(record, "area_cd", rec.area_cd);
			rx.add(record, "area_nm", rec.area_nm);
			rx.add(record, "bo_cd", rec.bo_cd);
			rx.add(record, "bo_seq", rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.addCData(record, "bo_head_nm", rec.bo_head_nm);
			rx.add(record, "net_sale_amt", rec.net_sale_amt);
			rx.add(record, "amt1", rec.amt1);
			rx.add(record, "amt2", rec.amt2);
			rx.add(record, "sub_tot_amt", rec.sub_tot_amt);
			rx.add(record, "amt3", rec.amt3);
			rx.add(record, "tot_amt", rec.tot_amt);
			rx.add(record, "amt_rate", rec.amt_rate);
			rx.add(record, "amt4", rec.amt4);

			/*--------------------------------
			rx.add(record, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "net_sale_amt", rec.net_sale_amt);
			rx.add(record, "sp_amt", rec.sp_amt);
			rx.add(record, "amt1", "0");
			rx.add(record, "amt2", "0");
			rx.add(record, "amt3", "0");
			rx.add(record, "amt_tot", "0");
			rx.add(record, "bank_cd", "01"); //신한4 기본세팅
			rx.add(record, "rmtt_dt", today); //오늘 기본세팅
			rx.add(record, "rmtt_plac", rec.rmtt_plac); //송금처 기본세팅
			--------------------------------*/
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<CURLIST>
		<record>
			<bo_cd/>
			<bo_seq/>
			<bo_nm/>
			<chrg_pers/>
			<net_sale_amt/>
			<sp_amt/>
		</record>
	</CURLIST>
</resData>
*/
%> 

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<curlist/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Fri May 08 15:32:46 KST 2009 */ %>
