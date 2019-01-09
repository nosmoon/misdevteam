<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.co.cocd.rec.*
	,	chosun.ciis.co.cocd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : co_cocd_1110_l.jsp
* 기능 : 
* 작성일자 : 2009-02-09
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
	CO_COCD_1110_LDataSet ds = (CO_COCD_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "resData", "");

	try {
		gridData = rx.add(resData, "gridData", "");
		for(int i = 0; i < ds.commcdcur1.size(); i++) {
			CO_COCD_1110_LCOMMCDCUR1Record rec = (CO_COCD_1110_LCOMMCDCUR1Record)ds.commcdcur1.get(i);
			int record = rx.add(gridData, "record", "");
			rx.add(record, "cd", rec.cd);
			//rx.add(record, "chg_seq", rec.chg_seq);
			rx.add(record, "use_yn", rec.use_yn);
			rx.add(record, "cdnm", StringUtil.replaceToXml(rec.cdnm));
			rx.add(record, "cd_abrv_nm", StringUtil.replaceToXml(rec.cd_abrv_nm));
			rx.add(record, "mang_cd_1", rec.mang_cd_1);
			rx.add(record, "mang_cd_2", rec.mang_cd_2);
			rx.add(record, "mang_cd_3", rec.mang_cd_3);
			rx.add(record, "mang_cd_4", rec.mang_cd_4);
			rx.add(record, "mang_cd_5", rec.mang_cd_5);
			rx.add(record, "mang_cd_6", rec.mang_cd_6);
			rx.add(record, "mang_cd_7", rec.mang_cd_7);
			rx.add(record, "mang_cd_8", rec.mang_cd_8);
			rx.add(record, "mang_cd_9", rec.mang_cd_9);
			rx.add(record, "mang_cd_10", rec.mang_cd_10);
			rx.add(record, "mang_cd_11", rec.mang_cd_11);
			rx.add(record, "mang_cd_12", rec.mang_cd_12);
			//rx.add(record, "tbl_nm", rec.tbl_nm);
			rx.add(record, "remk", StringUtil.replaceToXml(rec.remk));
			//rx.add(record, "upd_yn", rec.upd_yn);
			//rx.add(record, "incmg_pers_ip", rec.incmg_pers_ip);
			//rx.add(record, "incmg_pers", rec.incmg_pers);
			//rx.add(record, "incmg_dt_tm", rec.incmg_dt_tm);
			//rx.add(record, "chg_pers", rec.chg_pers);
			//rx.add(record, "chg_dt_tm", rec.chg_dt_tm);
			rx.add(record, "chg_incmg_pers", rec.chg_incmg_pers);
			rx.add(record, "chg_incmg_dt_tm", rec.chg_incmg_dt_tm);
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
	<COMMCDCUR1>
		<record>
			<cd/>
			<chg_seq/>
			<use_yn/>
			<cdnm/>
			<cd_abrv_nm/>
			<mang_cd_1/>
			<mang_cd_2/>
			<mang_cd_3/>
			<mang_cd_4/>
			<mang_cd_5/>
			<mang_cd_6/>
			<mang_cd_7/>
			<mang_cd_8/>
			<mang_cd_9/>
			<mang_cd_10/>
			<mang_cd_11/>
			<mang_cd_12/>
			<mang_cd_13/>
			<mang_cd_14/>
			<mang_cd_15/>
			<tbl_nm/>
			<remk/>
			<upd_yn/>
			<incmg_pers_ip/>
			<incmg_pers/>
			<incmg_dt_tm/>
			<chg_pers/>
			<chg_dt_tm/>
			<chg_incmg_pers/>
			<chg_incmg_dt_tm/>
		</record>
	</COMMCDCUR1>
</resData>
*/
%>

<%
/*
TrustForm의 Instance 선언부에 복사해서 사용
<resData>
	<resform>
		<commcdcur1/>
	</resform>
</resData>
*/
%>

<% /* 작성시간 : Mon Feb 09 17:07:47 KST 2009 */ %>