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
* 파일명 : se_rcp_4620_l.jsp
* 기능 : 스포츠입금등록(신) - 입금내역조회
* 작성일자 : 2010-05-28
* 작성자 : 이민효
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>

<%
	RwXml rx = new RwXml();
	SE_RCP_4620_LDataSet ds = (SE_RCP_4620_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "grid3", "");
	
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_RCP_4620_LCURLISTRecord rec = (SE_RCP_4620_LCURLISTRecord)ds.curlist.get(i);
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
			
			
/*-------------------------------------------------------------------
			rx.add(record, "bo_cdseq", rec.bo_cd+rec.bo_seq);
			rx.add(record, "bo_nm", rec.bo_nm);
			rx.add(record, "chrg_pers", rec.chrg_pers);
			rx.add(record, "net_sale_amt", rec.net_sale_amt);
			rx.add(record, "sp_amt", rec.sp_amt);
			rx.add(record, "amt1", rec.amt1);
			rx.add(record, "amt2", rec.amt2);
			rx.add(record, "amt3", rec.amt3);
			sAmt_tmp = rec.amt_tot;
			if("".equals(sAmt_tmp)) sAmt_tmp = "0";
			lAmt_tot = lAmt_tot + Long.parseLong(sAmt_tmp);
			 
			rx.add(record, "amt_tot", sAmt_tmp);			
			rx.add(record, "bank_cd", rec.bank_cd);
			rx.add(record, "rmtt_dt", rec.rmtt_dt);
			rx.add(record, "rmtt_plac", rec.rmtt_plac);
-------------------------------------------------------------------*/			
/*-------------------------------------------------------------------
			if(Long.parseLong(sAmt_tmp) > 0){
				sBank_cd = rec.bank_cd;
				sRmtt_dt = rec.rmtt_dt;
				sRmtt_plac = rec.rmtt_plac;
			}
-------------------------------------------------------------------*/
		}

/*-------------------------------------------------------------------
		rx.add(resData, "bank_cd", sBank_cd);
		rx.add(resData, "rmtt_dt", sRmtt_dt);
		rx.add(resData, "rmtt_plac", sRmtt_plac);
		rx.add(resData, "tot_amt", lAmt_tot);
-------------------------------------------------------------------*/
		
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
			<amt1/>
			<amt2/>
			<amt3/>
			<amt_tot/>
			<bank_cd/>
			<rmtt_dt/>
			<rmtt_plac/>
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

<% /* 작성시간 : Fri May 08 15:32:02 KST 2009 */ %>
