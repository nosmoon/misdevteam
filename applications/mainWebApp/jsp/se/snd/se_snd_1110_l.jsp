<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.snd.rec.*
	,	chosun.ciis.se.snd.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_snd_1110_l.jsp
* 기능 : 판매 - 발송관리 - 노선등록 - 노선별 인쇄처, 지방판, 판수 조회
* 작성일자 : 2009.02.03
* 작성자 : 김대준
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	RwXml rx = new RwXml();
	SE_SND_1110_LDataSet ds = (SE_SND_1110_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int recordSet = 0;
	String errcode = "";
	String errmsg = "";

	dataSet = rx.add(root, "gridData", "");
	rx.add(dataSet, "rownum", ds.rownum);
	errcode = ds.errcode;
	errmsg = ds.errmsg;

	try {
		/****** CURLIST BEGIN */
		dataSet = rx.add(dataSet, "list", "");
		recordSet = rx.add(dataSet, "main", "");
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_SND_1110_LCURLISTRecord rec = (SE_SND_1110_LCURLISTRecord)ds.curlist.get(i);
			
			if ( "".equals(rec.num) || rec.num == "0" ){
				break;
			}
			int record = rx.add(recordSet, "record", "");
			rx.add(record, "cmpy_cd"		, rec.cmpy_cd		);		//회사구분코드
			rx.add(record, "medi_cd"		, rec.medi_cd		);		//매체코드
			rx.add(record, "medi_nm"		, rec.medi_nm		);		//매체명
			rx.add(record, "route_cd"		, rec.route_cd		);		//노선코드
			rx.add(record, "route_nm"		, rec.route_nm		);		//노선명
			rx.add(record, "route_clsf"		, rec.route_clsf	);		//노선구분
			rx.add(record, "prt_plac_cd"	, rec.prt_plac_cd	);		//인쇄처코드
			rx.add(record, "ecnt_cd"		, rec.ecnt_cd		);		//판수코드
			rx.add(record, "ledt_cd"		, rec.ledt_cd		);		//지방판코드
			rx.add(record, "inwsp_send_yn"  , rec.inwsp_send_yn );		//속지발송여부
			rx.add(record, "route_rank"  	, rec.route_rank    );		//노선순위
		}
		rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURTLIST END */
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

<% /* 작성시간 : Tue Jan 20 15:56:25 KST 2009 */ %>