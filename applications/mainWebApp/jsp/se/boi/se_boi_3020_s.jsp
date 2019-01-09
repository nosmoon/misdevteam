<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.co.base.util.*
	,	chosun.ciis.se.boi.ds.*
	,	chosun.ciis.se.boi.rec.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_3020_l.jsp
* 기능 : 모바일 개선사항 - 상세 조회
* 작성일자 : 2016-06-30
* 작성자 : 민기홍
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	RwXml rx = new RwXml();
	SE_BOI_3020_SDataSet ds = (SE_BOI_3020_SDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int resData = 0;
	int resform = 0;
	int gridData = 0;
	resData = rx.add(root, "dtlsData", "");
	
	try {
		if(ds != null){
			rx.add(resData, "regdt", ds.getRegdt());
			rx.add(resData, "seq", ds.getSeq());
			rx.add(resData, "boemp_id", ds.getBoemp_id());
			rx.add(resData, "flnm", ds.getFlnm());
			rx.add(resData, "tel", ds.getTel());
			rx.add(resData, "bocd", ds.getBocd());
			rx.add(resData, "bonm", ds.getBonm());
			rx.add(resData, "botel", ds.getBotel());
			rx.add(resData, "boaddr", ds.getBoaddr());
			rx.add(resData, "cont", ds.getCont());
			rx.add(resData, "chkyn", ds.getChkyn());
			rx.add(resData, "rmk", ds.getRmk());
			rx.add(resData, "chkdate", ds.getChkdate());
			if(ds.getChkyn().equals("Y")){
				rx.add(resData, "chkpers", ds.getNm()+"("+ds.getChkpers()+")");
			}else{
				rx.add(resData, "chkpers", "");
			}
		}
	} catch (Exception e) {
	} finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>