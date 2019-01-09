<%@page contentType="text/xml; charset=EUC-KR" %>
<%@ page import="kr.co.comsquare.rwXmlLib.*" %>
<%@ page import="chosun.ciis.co.job.rec.*
                ,chosun.ciis.co.job.ds.*
                ,chosun.ciis.co.base.util.*
                ,java.util.*
                ,somo.framework.util.* " %>

<%
	RwXml rx = new RwXml();         // XML 객체 생성 
	
	CO_JOB_2000_MDataSet ds = (CO_JOB_2000_MDataSet)request.getAttribute("ds");
	
	int root 	 	= RwXml.rootNodeID;
	
	int tempData 	= rx.add( root , "tempData" , "");
// 전체메뉴	
	int menu 		= rx.add( tempData , "menu" , "");		
	for(int i=0; i<ds.curlist.size(); i++){
		
		CO_JOB_2000_MCURLISTRecord rec = (CO_JOB_2000_MCURLISTRecord)ds.curlist.get(i);
		
		int menu_level       = StringUtil.toNumber(rec.menu_level) + menu;	
		int itemset1  = rx.add( menu_level - 1 , "itemset" , "");
		
		String img 		= "".equals(StringUtil.nvl(rec.exec_url)) ? "/images/folderClosed.gif" : "/images/leaf.gif";
		String sel_img 	= "";
		String exp_img 	= "".equals(StringUtil.nvl(rec.exec_url)) ? "/images/folderOpen.gif" : "";
		
		rx.addCData ( itemset1, "label", rec.menu_nm);
		rx.add ( itemset1, "value", rec.menu_id );
		rx.add ( itemset1, "img", img);
		rx.add ( itemset1, "sel_img", sel_img);
		rx.add ( itemset1, "exp_img", exp_img);

	}

// favorite	

	int favorite 		= rx.add( tempData , "favorite" , "");	
			
	for(int i=0; i<ds.curlist2.size(); i++){
		
		CO_JOB_2000_MCURLIST2Record rec = (CO_JOB_2000_MCURLIST2Record)ds.curlist2.get(i);
		
		int menu_level   	= 	StringUtil.toNumber(rec.menu_level) + favorite;	
		String exec_url		=	StringUtil.nvl(rec.exec_url);
		
		String img 		= "".equals(StringUtil.nvl(rec.exec_url)) ? "/images/folderClosed.gif" : "/images/leaf.gif";
		String sel_img 	= "";
		String exp_img 	= "".equals(StringUtil.nvl(rec.exec_url)) ? "/images/folderOpen.gif" : "";

		int itemset2  = rx.add( menu_level, "itemset" , "");
		rx.addCData ( itemset2, "label", rec.menu_nm);
		rx.add ( itemset2, "value", rec.menu_id);
		rx.add ( itemset2, "img", img);
		rx.add ( itemset2, "sel_img", sel_img);
		rx.add ( itemset2, "exp_img", exp_img);
		
	}
	
    out.println(rx.xmlFlush());			        //현재까지 작성된 xml 출력(열린 태그)
   	out.println(rx.xmlEndFlush());
%>