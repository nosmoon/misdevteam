<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.com.rec.*
			    ,chosun.ciis.ad.com.ds.*
			    ,chosun.ciis.co.base.util.*
			    ,somo.framework.util.* " %>
			    
<%!
	void addList(ArrayList list, AD_COM_1080_LCURLISTRecord new_rec){
		boolean founded = false;
		for(int i=0; i<list.size(); i++){
			AD_COM_1080_LCURLISTRecord rec = (AD_COM_1080_LCURLISTRecord)list.get(i);
			if(new_rec.rmsg_pers.equals(rec.rmsg_pers)){
				founded = true;
				break;
			}
		}
		
		if(!founded){
			list.add(new_rec);
		}
	}
%>			    

<%

	ArrayList list = (ArrayList)request.getSession().getAttribute("LIST");
	if(list == null){
		list = new ArrayList();
		request.getSession().setAttribute("LIST", list);
	}
	
	AD_COM_1080_LDataSet ds = (AD_COM_1080_LDataSet)request.getAttribute("ds");	
	
	RwXml rx = new RwXml();         // XML °´Ã¼ »ý¼º 
	
	int root     = RwXml.rootNodeID;
	int gridData = rx.add(root, "gridData", "");

	try {
		
		for(int i = 0; i < ds.curlist.size(); i++) {
			AD_COM_1080_LCURLISTRecord rec = (AD_COM_1080_LCURLISTRecord)ds.curlist.get(i);
			addList(list, rec);
		}
					
		for(int i = 0; i < list.size(); i++) {

			AD_COM_1080_LCURLISTRecord rec = (AD_COM_1080_LCURLISTRecord)list.get(i);
			
			String[] nm_tmp_arr 	= StringUtil.toArray(rec.nm_list, "#");
			String   team   		= "";
			String   part   		= "";
			String   rmsg_pers_nm  	= "";
			String[] cd_tmp_arr 	= StringUtil.toArray(rec.cd_list, "#");
			String   team_cd   		= "";
			String   part_cd   		= "";
			String   rmsg_pers	 	= "";						
			
			try{
				rmsg_pers_nm 	= nm_tmp_arr[nm_tmp_arr.length-1];
				rmsg_pers 		= cd_tmp_arr[cd_tmp_arr.length-1];	
				part 			= nm_tmp_arr[nm_tmp_arr.length-2];
				part_cd 		= cd_tmp_arr[cd_tmp_arr.length-2];
				team 			= nm_tmp_arr[nm_tmp_arr.length-3];
				team_cd 		= cd_tmp_arr[cd_tmp_arr.length-3];				
			}catch(Exception ignore){  
				team = part;
				team_cd = part_cd;
				part = "";
				part_cd = "";
			}
			
			int record = rx.add(gridData, "record", "");
	
			rx.add(record, "team", team);
			rx.add(record, "part", part);			
			rx.add(record, "rmsg_pers_nm", rmsg_pers_nm);
			rx.add(record, "ptph_no", rec.ptph_no);
			rx.add(record, "team_cd", team_cd);
			rx.add(record, "part_cd", part_cd);			
			rx.add(record, "rmsg_pers", rmsg_pers);
		}
	}
	catch (Exception e) {
		System.out.println("ad_com_1080_l.e = " + e.getLocalizedMessage());
	}
	finally {
		out.println(rx.xmlFlush());
		out.println(rx.xmlEndFlush());
	}
%>
