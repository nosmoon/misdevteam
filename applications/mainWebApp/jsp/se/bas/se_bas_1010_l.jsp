<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	chosun.ciis.se.bas.rec.*
	,	chosun.ciis.se.bas.ds.*;
	"
%>
<%---------------------------------------------------------------------------------------------------
* 파일명 : se_bas_1010_l.jsp
* 기능 : 부서관리-부서트리 조회
* 작성일자 : 2009-01-20
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
	SE_BAS_1010_LDataSet ds = (SE_BAS_1010_LDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int dataSet = 0;
	int formData = 0;
	int gridData = 0;
	int recordSet = 0;
	int levelSet1 = 0;
	int levelSet2 = 0;
	int levelSet3 = 0;

	String errcode = "";
	String errmsg = "";


	int deptlist02  =0;
	dataSet = rx.add(root, "dataSet", "");		
	deptlist02 = rx.add(dataSet, "deptlist02", "");
	
	
	try {
		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BAS_1010_LCURLISTRecord rec = (SE_BAS_1010_LCURLISTRecord)ds.curlist.get(i);
			
			if(rec.lvl == 2){		
					int  item  = rx.add( deptlist02 , "item" , "");
					rx.add(item, "value", rec.dept_cd);  				
					rx.add(item, "label", rec.dept_cd + " : "+rec.dept_nm);	
					rx.add(item, "label01", rec.dept_nm);	
				
			}
		}	
		
	}catch (Exception e) {
		errcode += " JSP Error";
		errmsg += " JSP Error Message = " + e.getMessage();
	}		
	
	
	
	errcode = ds.errcode;
	errmsg = ds.errmsg;
	
	try {
		
	
		/****** CURLIST BEGIN */
		recordSet = rx.add(dataSet, "CURLIST", "");
	

		for(int i = 0; i < ds.curlist.size(); i++) {
			SE_BAS_1010_LCURLISTRecord rec = (SE_BAS_1010_LCURLISTRecord)ds.curlist.get(i);
			if(rec.lvl == 1){
			
				levelSet1 = rx.add(recordSet, "tree_itemset", "");
				rx.add(levelSet1, "label", rec.dept_nm);
				rx.add(levelSet1, "value", rec.dept_cd);
				rx.add(levelSet1, "img", "");
				rx.add(levelSet1, "sel_img", "");
			}else if(rec.lvl == 2){
			
				levelSet2 = rx.add(levelSet1, "tree_itemset", "");
				rx.add(levelSet2, "label", rec.dept_nm);
				rx.add(levelSet2, "value", rec.dept_cd);
				rx.add(levelSet2, "img", "");
				rx.add(levelSet2, "sel_img", "");				
				
			}else if(rec.lvl == 3){
			
				levelSet3 = rx.add(levelSet2, "tree_itemset", "");
				rx.add(levelSet3, "label", rec.dept_nm);
				rx.add(levelSet3, "value", rec.dept_cd);
				rx.add(levelSet3, "img", "");
				rx.add(levelSet3, "sel_img", "");
			
			}
		}
		
		//rx.add(recordSet, "totalcnt", ds.curlist.size());
		/****** CURLIST END */

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
//트리 동적으로 DEPT 구성하기 (광고샘플)
	/*
	RwXml rx = new RwXml();         // XML 객체 생성 
	 
	AD_COM_1001_MDataSet ds = (AD_COM_1001_MDataSet)request.getAttribute("ds");
	
	int root    = RwXml.rootNodeID;
	int comboSet  = rx.add( root , "comboSet" , "");
	
	int orga   = rx.add( comboSet , "orga" , "");  
	
	for(int i=0; i<ds.curlist.size(); i++){
	
		AD_COM_1001_MCURLISTRecord rec = (AD_COM_1001_MCURLISTRecord)ds.curlist.get(i);
		
		int depth       = StringUtil.toNumber(rec.depth) + orga;  
		
		int item  = rx.add( depth - 1 , "item" , "");
		rx.add ( item, "label", rec.orga_nm);
		rx.add ( item, "value", rec.orga_cd );
		rx.add ( item, "value", rec.supr_orga_cd );
		rx.add ( item, "img", "");
		rx.add ( item, "sel_img", "");
		 
	}

    out.println(rx.xmlFlush());           //현재까지 작성된 xml 출력(열린 태그)
    out.println(rx.xmlEndFlush());

*/
%>
