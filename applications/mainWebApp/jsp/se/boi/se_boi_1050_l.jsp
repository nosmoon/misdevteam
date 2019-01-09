<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.boi.rec.*
	,	chosun.ciis.se.boi.ds.*
    ,   somo.framework.util.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_boi_1050_l.jsp
* 기능 : 지국정보관리 - 지국수지현황탭 조회
* 작성일자 : 2009-02-06
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
	SE_BOI_1050_LDataSet ds = (SE_BOI_1050_LDataSet)request.getAttribute("ds");

	int root = RwXml.rootNodeID;
	int formData = 0;
	int dtlform = 0;
	int dtlgrid1 = 0;
	int dtlgrid2 = 0;
	int dtlgrid3 = 0;
	int record = 0;

	formData  = rx.add(root , "empform" , "");

	try {

		dtlgrid1  = rx.add(formData , "dtlgrid1" , "");
		for(int i = 0; i < ds.boempcur.size(); i++) {
			SE_BOI_1050_LBOEMPCURRecord rec = (SE_BOI_1050_LBOEMPCURRecord)ds.boempcur.get(i);

			record = rx.add(dtlgrid1, "record", "");
			rx.add(record, "boemp_no", rec.boemp_no);
			rx.addCData(record, "flnm", rec.flnm);
			rx.add(record, "prn", rec.prn);
			rx.add(record, "dutynm", rec.dutynm);
			rx.add(record, "tel_no", rec.tel_no);
			rx.add(record, "ptph_no", rec.ptph_no);
			rx.add(record, "in_cmpy_dt", rec.in_cmpy_dt);
			rx.add(record, "lv_cmpy_dt", rec.lv_cmpy_dt);
			rx.add(record, "delyn", rec.delyn);
		}

	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}

%>
