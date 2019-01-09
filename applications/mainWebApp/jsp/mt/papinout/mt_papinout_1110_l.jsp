<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.mt.papinout.rec.*
	,	chosun.ciis.mt.papinout.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : mt_papinout_1110_l.jsp
* 기능 : 
* 작성일자 : 2011-03-09
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
	MT_PAPINOUT_1110_LDataSet ds = (MT_PAPINOUT_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0; 
	int gridData = 0;
	int ewhData = 0;
	int issu_remk = 0;
	resData = rx.add(root, "resData", "");
	resform = rx.add(resData,"resform","");
	//issu_remk = rx.add(resform,"issu_remk","");
	rx.add(resform,"issu_remk", ds.issu_remk);	
	
	gridData = rx.add(resData,"gridData","");
	ewhData  = rx.add(gridData,"ewhData","");
	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			MT_PAPINOUT_1110_LCURLISTRecord rec = (MT_PAPINOUT_1110_LCURLISTRecord)ds.curlist.get(i);
			int record = rx.add(ewhData, "record", "");
			
			rx.add(record, "ewh_dt", rec.ewh_dt);
			rx.add(record, "fac_clsf", rec.fac_clsf);
			rx.add(record, "matr_cd", rec.matr_cd);
			rx.add(record, "ewh_roll_cnt", rec.ewh_roll_cnt);
			rx.add(record, "ewh_wgt", rec.ewh_wgt);
			rx.add(record, "roll_wgt", rec.roll_wgt);
			rx.add(record, "incmg_pers", rec.incmg_pers);
			rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			rx.add(record, "chg_pers", rec.chg_pers);
			rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
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
			<medi_cd/>
			<sell_net_clsf/>
			<aply_yymm/>
			<uprc_amt/>
			<remk/>
			<incmg_pers/>
			<incmg_dt_tm/>
			<chg_pers/>
			<chg_dt_tm/>
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
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Mon Feb 09 15:29:10 KST 2009 */ %>