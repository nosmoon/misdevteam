<%@	page contentType="text/xml; charset=EUC-KR" %>

<%@	page import="
		java.io.*
	,	java.sql.*
	,	java.util.*
	,	kr.co.comsquare.rwXmlLib.*
	,	kr.co.comsquare.db.*
	,	kr.co.comsquare.util.Tokenizer
	,	somo.framework.util.*
	,	chosun.ciis.is.dep.rec.*
	,	chosun.ciis.is.dep.ds.*;
	"
%>

<%
	String dealmedicd = Util.getSessionParameterValue(request, "dealmedicd", true);
	
	RwXml rx = new RwXml();
	IS_DEP_1000_MDataSet ds = (IS_DEP_1000_MDataSet)request.getAttribute("ds");
	int root = RwXml.rootNodeID;
	int tempData = rx.add(root, "tempData", "");
	
	//환경변수
	rx.add(tempData,"xx_note_clsf_cd_001",ds.xx_note_clsf_cd_001);
	rx.add(tempData,"xx_note_clsf_cd_002",ds.xx_note_clsf_cd_002);	
	rx.add(tempData,"xx_note_clsf_cd_003",ds.xx_note_clsf_cd_003);	
	rx.add(tempData,"xx_note_clsf_cd_004",ds.xx_note_clsf_cd_004);	
	rx.add(tempData,"xx_note_clsf_cd_005",ds.xx_note_clsf_cd_005);
	rx.add(tempData,"xx_job_clsf_02",ds.xx_job_clsf_02);
	rx.add(tempData,"xx_cd_clsf_006",ds.xx_cd_clsf_006);
	rx.add(tempData,"xx_medi_cd_001",ds.xx_medi_cd_001);
	rx.add(tempData,"xx_medi_cd_002",ds.xx_medi_cd_002);	
	rx.add(tempData,"xx_cd_clsf_007",ds.xx_cd_clsf_007);		
	try {
	
		int hndl_clsf = rx.add( tempData , "hndl_clsf" , "");		
		for(int i=0; i<ds.curlist1.size(); i++){ 
			IS_DEP_1000_MCURLIST1Record rec = (IS_DEP_1000_MCURLIST1Record)ds.curlist1.get(i);
			int item  = rx.add( hndl_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
			
		}	
	
		int medi_cd = rx.add( tempData , "medi_cd" , "");		
		for(int i=0; i<ds.curlist2.size(); i++){
			IS_DEP_1000_MCURLIST2Record rec = (IS_DEP_1000_MCURLIST2Record)ds.curlist2.get(i);
			int item  = rx.add( medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		}	
		
		int issu_cmpy_clsf_cd = rx.add( tempData , "issu_cmpy_clsf_cd" , "");		
		for(int i=0; i<ds.curlist3.size(); i++){
			IS_DEP_1000_MCURLIST3Record rec = (IS_DEP_1000_MCURLIST3Record)ds.curlist3.get(i);
			int item  = rx.add( issu_cmpy_clsf_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}	
		
		int depo_job_clsf = rx.add( tempData , "depo_job_clsf" , "");		
		for(int i=0; i<ds.curlist4.size(); i++){
			IS_DEP_1000_MCURLIST4Record rec = (IS_DEP_1000_MCURLIST4Record)ds.curlist4.get(i);
			int item  = rx.add( depo_job_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}	
		
		int note_clsf = rx.add( tempData , "note_clsf" , "");		
		for(int i=0; i<ds.curlist5.size(); i++){
			IS_DEP_1000_MCURLIST5Record rec = (IS_DEP_1000_MCURLIST5Record)ds.curlist5.get(i);
			int item  = rx.add( note_clsf , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd + " " + rec.cdnm);
		}	
		int prercpm_medi_cd = rx.add( tempData , "prercpm_medi_cd" , "");		
		for(int i=0; i<ds.curlist6.size(); i++){
			IS_DEP_1000_MCURLIST6Record rec = (IS_DEP_1000_MCURLIST6Record)ds.curlist6.get(i);
			int item  = rx.add( prercpm_medi_cd , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cdnm);
		}	
		int budg_cd_l_001 = rx.add( tempData , "budg_cd_l_001" , "");		
		for(int i=0; i<ds.curlist7.size(); i++){
			IS_DEP_1000_MCURLIST7Record rec = (IS_DEP_1000_MCURLIST7Record)ds.curlist7.get(i);
			int item  = rx.add( budg_cd_l_001 , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}	
		int budg_cd_l_002 = rx.add( tempData , "budg_cd_l_002" , "");		
		for(int i=0; i<ds.curlist8.size(); i++){
			IS_DEP_1000_MCURLIST8Record rec = (IS_DEP_1000_MCURLIST8Record)ds.curlist8.get(i);
			int item  = rx.add( budg_cd_l_002 , "item" , "");
			rx.add ( item, "value", rec.cd );
			rx.add ( item, "label", rec.cd+" "+rec.cdnm);
		}		
		
		int acct_mang_cd = rx.add( tempData , "acct_mang_cd" , "");	
		for(int i = 0; i < ds.curlist9.size(); i++) {
			IS_DEP_1000_MCURLIST9Record rec = (IS_DEP_1000_MCURLIST9Record)ds.curlist9.get(i);
			int item = rx.add(acct_mang_cd, "item", "");
			rx.add(item, "cd", rec.cd);
			rx.add(item, "cdnm", rec.cdnm);
			rx.add(item, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(item, "cdnm_cd", rec.cdnm_cd);
			rx.add(item, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		
		/**카드사 추가 20120716**/
		int card_mang_no = rx.add( tempData , "card_mang_no" , "");	
		for(int i = 0; i < ds.curlist10.size(); i++) {
			IS_DEP_1000_MCURLIST10Record rec = (IS_DEP_1000_MCURLIST10Record)ds.curlist10.get(i);
			int item = rx.add(card_mang_no, "item", "");
			rx.add(item, "cd", rec.cd);
			rx.add(item, "cdnm", rec.cdnm);
			rx.add(item, "cd_abrv_nm", rec.cd_abrv_nm);
			rx.add(item, "cdnm_cd", rec.cdnm_cd);
			rx.add(item, "cdabrvnm_cd", rec.cdabrvnm_cd);
		}
		
		int team = rx.add( tempData , "team" , "");
		for(int i = 0; i < ds.teamlist.size(); i++) {
			IS_DEP_1000_MTEAMLISTRecord rec = (IS_DEP_1000_MTEAMLISTRecord)ds.teamlist.get(i);
			int item = rx.add(team, "item", "");
			rx.add(item, "dept_cd", rec.dept_cd);
			rx.add(item, "dept_nm", rec.dept_nm);
		}
		int part = rx.add( tempData , "part" , "");
		for(int i = 0; i < ds.partlist.size(); i++) {
			IS_DEP_1000_MPARTLISTRecord rec = (IS_DEP_1000_MPARTLISTRecord)ds.partlist.get(i);
			int item = rx.add(part, "item", "");
			rx.add(item, "dept_cd", rec.dept_cd);
			rx.add(item, "dept_nm", rec.dept_nm);
			rx.add(item, "supr_dept_cd", rec.supr_dept_cd);
		}
					
		if("1".equals(dealmedicd)){
			rx.add(tempData, "slip_clsf", "17");
		}else if("2".equals(dealmedicd)){
			rx.add(tempData, "slip_clsf", "27");
		}else{
			rx.add(tempData, "slip_clsf", "17");
		}
	}
	catch (Exception e) {
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>

<% /* 작성시간 : Wed Jan 21 21:10:45 KST 2009 */ %>