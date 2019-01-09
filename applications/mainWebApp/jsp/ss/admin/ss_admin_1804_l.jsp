<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%@ page import = "java.lang.reflect.Field" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 : 
* 수정자 : 
* 수정일자 : 
* 백업파일명 : 
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_SQL_EXECUTE_SAMPLEDataSet ds = (SS_L_SQL_EXECUTE_SAMPLEDataSet)request.getAttribute("ds");
    
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "resTemp");

	String t_caption = "";

	SS_L_SQL_EXECUTE_SAMPLECURCOMMLIST2Record rec2 = (SS_L_SQL_EXECUTE_SAMPLECURCOMMLIST2Record)ds.curcommlist2.get(0);

	if(rec2.a1 != null){
	
		Field[] flds = rec2.getClass().getFields();
		try{
			if(flds!=null)
			{
				for(int i=0; i<flds.length; i++)
				{
					//System.out.println("flds : "+String.valueOf(flds[i].get(rec2)));
					t_caption = t_caption + "^" + String.valueOf(flds[i].get(rec2));
				}
			}
		}catch(Exception e){
			e.printStackTrace();
			throw e;
		}
		t_caption = t_caption.substring(1);
		System.out.println("caption: "+t_caption);

		rxw.add(acctTemp, "t_caption", t_caption);

	}
	
	// 조회 결과.
    
  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "sampleGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_SQL_EXECUTE_SAMPLECURCOMMLISTRecord rec = (SS_L_SQL_EXECUTE_SAMPLECURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{	
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rec);
		}
		
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data가 없을 경우 처리. 추가 필요.
        
    // page 처리. 추가 필요.
%>
