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
* 파일명 : se_boi_1055_l.jsp
* 기능 : 지국정보관리 - 지국수지탭- 지국수지 리스트 조회
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
	SE_BOI_1055_LDataSet ds = (SE_BOI_1055_LDataSet)request.getAttribute("ds");
    
	int root = RwXml.rootNodeID;
	int formData = 0;
	int dtlform = 0;
	int dtlgrid1 = 0;
	int dtlgrid2 = 0;
	int dtlgrid3 = 0;
	int inexform = 0;
	int record = 0;
	int record2 = 0;

	inexform  = rx.add(root , "inexform" , "");
	dtlform  = rx.add(inexform , "dtlform" , "");
				
	try {

		if(ds != null){
			rx.add(dtlform, "inn_amt", ds.getInn_amt() 	); 
			rx.add(dtlform, "exp_amt", ds.getExp_amt() 	); 
			rx.add(dtlform, "tot_amt", ds.getTot_amt() 	); 
		}
		
		dtlgrid2  = rx.add(inexform , "dtlgrid2" , "");
		for(int i = 0; i < ds.boinnexpcur.size(); i++) {
			SE_BOI_1055_LBOINNEXPCURRecord rec = (SE_BOI_1055_LBOINNEXPCURRecord)ds.boinnexpcur.get(i);
			if("10".equals(rec.innexp_clsf)){
				record = rx.add(dtlgrid2, "record", "");
				rx.add(record, "innexp_clsf", rec.innexp_clsf);
				rx.add(record, "innexp_ptcr_clsf", rec.innexp_ptcr_clsf);
				rx.add(record, "innexp_amt", rec.innexp_amt);
			}
		}
		
		dtlgrid3  = rx.add(inexform , "dtlgrid3" , "");
		for(int i = 0; i < ds.boinnexpcur.size(); i++) {
			SE_BOI_1055_LBOINNEXPCURRecord rec = (SE_BOI_1055_LBOINNEXPCURRecord)ds.boinnexpcur.get(i);
			if("20".equals(rec.innexp_clsf)){
				record2 = rx.add(dtlgrid3, "record", "");
				rx.add(record2, "innexp_clsf2", rec.innexp_clsf);
				rx.add(record2, "innexp_ptcr_clsf2", rec.innexp_ptcr_clsf);
				rx.add(record2, "innexp_amt2", rec.innexp_amt);
			}
		}
		
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
	
%>
