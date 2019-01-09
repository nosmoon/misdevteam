<%@	page contentType="text/xml; charset=EUC-KR" %>
<%@	page import="java.io.*,	java.sql.*,	java.util.*, kr.co.comsquare.rwXmlLib.*, kr.co.comsquare.db.*, kr.co.comsquare.util.Tokenizer" %>
<%@ page import="chosun.ciis.ad.com.rec.*
			    ,chosun.ciis.ad.com.ds.*
			    ,chosun.ciis.co.base.util.*
			    ,somo.framework.util.* " %>
			    
<%!
	void deleteList(ArrayList list, String rmsg_pers){
		for(int i=0; i<list.size(); i++){
			AD_COM_1080_LCURLISTRecord rec = (AD_COM_1080_LCURLISTRecord)list.get(i);
			if(rec.rmsg_pers.endsWith(rmsg_pers)){
				list.remove(i);
				break;
			}
		}
	}

    public Hashtable getHashMultiUpdateData(String multiUpdateData) {
    	Hashtable 	hash	= new Hashtable();
    	
    	try{
	    	String[][] temp_arr = null;
	    	
	    	StringTokenizer st = new StringTokenizer(multiUpdateData, "|");
	    	
	    	int rowCount  = 0;
	    	int colCount  = st.countTokens();
	    	int col = 0;
	    	int row = 0;
	    	while(st.hasMoreTokens()){
	    		row = 0;
	    		String token 	 	= st.nextToken();
	    		String[] token_arr 	= token.split("#");
	    		if(temp_arr == null){
	    			rowCount = token_arr.length;
	    			temp_arr = new String[rowCount][colCount];
	    		}
	    		for(int i=0; i<token_arr.length; i++){
	    			temp_arr[row++][col] = token_arr[i];
	    		}
	    		col++;
	    	}
	    	for(int i=0; i<temp_arr.length; i++){
	    		StringBuffer sb = new StringBuffer();
	    		String header   = temp_arr[i][0];
	    		for(int j=1; j<temp_arr[i].length; j++){
	    			sb.append(StringUtil.nvl(temp_arr[i][j]));
	    			if(j<temp_arr[i].length-1){
	    				sb.append("#");
	    			}
	    		}
	    		
	    		hash.put(header, sb.toString());
	    	}
	    	
	    	
    	}catch(Exception e){
    		System.out.println(e.getLocalizedMessage());
    	}
    	return hash;
    }     
    	
%>			    

<%
	String selected = Util.checkString(request.getParameter("selected"));
	
	ArrayList list = (ArrayList)request.getSession().getAttribute("LIST");
	
	if(list != null){
		RwXml rx = new RwXml();         // XML °´Ã¼ »ý¼º 
		int root     = RwXml.rootNodeID;
		int gridData = rx.add(root, "gridData", "");
		try {
		
			Hashtable hash = getHashMultiUpdateData(selected);
			String[] tmp_arr = StringUtil.toArray((String)hash.get("rmsg_pers"), "#");
			for(int i=0; i<tmp_arr.length; i++){
				deleteList(list, tmp_arr[i]);
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
				rx.add(record, "team_cd", team_cd);
				rx.add(record, "part_cd", part_cd);			
				rx.add(record, "rmsg_pers", rmsg_pers);
				rx.add(record, "ptph_no", rec.ptph_no);
			}
		}
		catch (Exception e) {
			System.out.println("ad_com_1081_l.e = " + e.getLocalizedMessage());
		}
		finally {
			out.println(rx.xmlFlush());
			out.println(rx.xmlEndFlush());
		}
	}
%>
