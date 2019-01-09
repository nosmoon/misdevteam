<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.ad.bas.rec.*,chosun.ciis.ad.bas.ds.*, somo.framework.util.* " %>

<%

	RwXml rx = new RwXml();         // XML 객체 생성 
	
	AD_BAS_1100_MDataSet ds = (AD_BAS_1100_MDataSet)request.getAttribute("ds");
	
	int root 	 = RwXml.rootNodeID;
	int resData  = rx.add( root , "resData" , "");
	//int codeData = rx.add(root, "codeData", "");
	
	//환경변수
	rx.add(resData, "xx_emp_no_001", ds.xx_emp_no_001);
	rx.add(resData, "xx_emp_no_002", ds.xx_emp_no_002);
	rx.add(resData, "xx_dept_cd_001", ds.xx_dept_cd_001);

	int mang_clsf = rx.add( resData , "mang_clsf" , "");

	for(int i=0; i<ds.curlist1.size(); i++){
		AD_BAS_1100_MCURLIST1Record rec = (AD_BAS_1100_MCURLIST1Record)ds.curlist1.get(i);
		
		int item  = rx.add( mang_clsf , "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		
	}
	
	int cntr_type = rx.add( resData , "cntr_type" , "");
	
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BAS_1100_MCURLIST2Record rec = (AD_BAS_1100_MCURLIST2Record)ds.curlist2.get(i);
		
		int item  = rx.add( cntr_type , "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cd +" "+ rec.cdnm);
		
	}	
	
	
	int grp_cmpy_cd = rx.add( resData , "grp_cmpy_cd" , "");
	
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_BAS_1100_MCURLIST3Record rec = (AD_BAS_1100_MCURLIST3Record)ds.curlist3.get(i);
		
		int item  = rx.add( grp_cmpy_cd , "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cdnm);
		
	}	
	
	int mortg_clsf = rx.add( resData , "mortg_clsf" , "");
	
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_BAS_1100_MCURLIST4Record rec = (AD_BAS_1100_MCURLIST4Record)ds.curlist4.get(i);
		
		int item  = rx.add( mortg_clsf , "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cd_abrv_nm);
		
	}	
	
	
	
	int job_clsf = rx.add( resData , "job_clsf" , "");
	
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_BAS_1100_MCURLIST4Record rec = (AD_BAS_1100_MCURLIST4Record)ds.curlist4.get(i);
		
		int item  = rx.add( job_clsf , "item" , "");
		
		rx.add ( item, "value", rec.cd );
		rx.add ( item, "label", rec.cdnm);
		
	}	
		
    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>