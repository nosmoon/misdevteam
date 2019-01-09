<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bas.rec.*
	,	chosun.ciis.se.bas.ds.*
    ,   somo.framework.util.*;
	"
%>

<%
	
	RwXml rx = new RwXml();
	SE_BAS_1020_SDataSet ds = (SE_BAS_1020_SDataSet)request.getAttribute("ds");
    String dept_cd = Util.checkString(request.getParameter("dept_cd"));          	
    
	int root = RwXml.rootNodeID;
	int formData = 0;
	int dtlData = 0;
	int gridData = 0;
	int gridSub = 0;
	int mainData = 0;
	int recordSet = 0;
	int item = 0;

	formData  = rx.add(root , "formData" , "");
	dtlData  = rx.add(formData , "detail" , "");
	String sUse_yn = "";
							
	if(ds != null){
		rx.add(dtlData, "supr_dept_cd", ds.supr_dept_cd);
		rx.add(dtlData, "supr_dept_nm", ds.supr_dept_nm);
		rx.add(dtlData, "dept_cd", dept_cd);
		rx.add(dtlData, "dept_nm", ds.dept_nm);
		rx.add(dtlData, "hdpt_cd", ds.hdpt_cd);
		rx.add(dtlData, "chrg_pers", ds.chrg_pers);
		rx.add(dtlData, "flnm", ds.chrg_flnm);
		rx.add(dtlData, "step", ds.step);
		rx.add(dtlData, "supr_dept_cd_temp", ds.supr_dept_cd);
		sUse_yn = ds.use_yn;
		if(!"Y".equals(sUse_yn)) sUse_yn = "";
		rx.add(dtlData, "use_yn", sUse_yn);
		rx.add(dtlData, "feat_clsf", ds.feat_clsf);
		rx.add(dtlData, "incmg_dt", ds.incmg_dt);
		rx.add(dtlData, "chg_dt", ds.chg_dt);		
	}
	
	
	gridData = rx.add(formData, "gridData", "");
	mainData = rx.add(gridData, "main", "");
	
	try {

		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BAS_1020_SCURLISTRecord rec = (SE_BAS_1020_SCURLISTRecord)ds.curlist.get(i);
			int record1 = rx.add(mainData, "record", "");			
			rx.add(record1, "supr_dept_cd", rec.supr_dept_cd);
			rx.add(record1, "dept_cd", rec.dept_cd);
			rx.add(record1, "area_cd", rec.area_cd);
			rx.add(record1, "area_nm", rec.area_nm);
			rx.add(record1, "sido_cd", rec.sido_cd);
			rx.add(record1, "chrg_pers", rec.chrg_pers);
			rx.add(record1, "flnm", rec.flnm);
			rx.add(record1, "acct_sido_cd", rec.acct_sido_cd);
			rx.add(record1, "sell_sido_cd", rec.sell_sido_cd);
			rx.add(record1, "sell_srt_col", rec.sell_srt_col);
			rx.add(record1, "use_yn", rec.use_yn);
		}
	
		int sido_clsf = rx.add(gridData, "sido_clsf", "");
		for(int i=0; i<ds.commcdcur1.size(); i++){
			SE_BAS_1020_SCOMMCDCUR1Record rec = (SE_BAS_1020_SCOMMCDCUR1Record)ds.commcdcur1.get(i);	
			item  = rx.add( sido_clsf , "item" , "");
			rx.add(item, "value", rec.cd);  				
			rx.add(item, "label", rec.cd+" "+rec.cdnm);			
		}
	
		int feat_clsf = rx.add(gridData, "feat_clsf", "");
		for(int i=0; i<ds.commcdcur2.size(); i++){
			SE_BAS_1020_SCOMMCDCUR2Record rec = (SE_BAS_1020_SCOMMCDCUR2Record)ds.commcdcur2.get(i);	
			item  = rx.add( feat_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+"  "+rec.cdnm);		
		}
	
		int sido_clsf2 = rx.add(gridData, "sido_clsf2", "");
		for(int i=0; i<ds.commcdcur3.size(); i++){
			SE_BAS_1020_SCOMMCDCUR3Record rec = (SE_BAS_1020_SCOMMCDCUR3Record)ds.commcdcur3.get(i);	
			item  = rx.add( sido_clsf2 , "item" , "");
			rx.add(item, "value", rec.cd);  				
			rx.add(item, "label", rec.cd+" "+rec.cdnm);			
		}
	
		int sido_clsf3 = rx.add(gridData, "sido_clsf3", "");
		for(int i=0; i<ds.commcdcur4.size(); i++){
			SE_BAS_1020_SCOMMCDCUR4Record rec = (SE_BAS_1020_SCOMMCDCUR4Record)ds.commcdcur4.get(i);	
			item  = rx.add( sido_clsf3 , "item" , "");
			rx.add(item, "value", rec.cd);  				
			rx.add(item, "label", rec.cd+" "+rec.cdnm);			
		}
	
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
