<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%@ page import = "java.lang.reflect.Field" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : 
* ��� : 
* �ۼ����� : 
* �ۼ��� : 
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : 
* ������ : 
* �������� : 
* ������ϸ� : 
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
	
	// ��ȸ ���.
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "sampleGrid", ds.curcommlist.size());
	
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_SQL_EXECUTE_SAMPLECURCOMMLISTRecord rec = (SS_L_SQL_EXECUTE_SAMPLECURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{	
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rec);
		}
		
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rec, false);
	}
	
	rxw.makeHugeEnd();
    
	rxw.flush(out);

    // data�� ���� ��� ó��. �߰� �ʿ�.
        
    // page ó��. �߰� �ʿ�.
%>
