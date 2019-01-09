<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_common_1100_l.jsp
* ��� : ���� �����ڵ�,�ڵ�� ��� ��������
* �ۼ����� : 2003-11-20
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������ : Ȳ����
* �������� : 2009-01-23
* ������ϸ� : ss_common_1100_l.jsp_org
* �������� : TrustForm ����.
---------------------------------------------------------------------------------------------------%>
<%
    SS_L_JIYEOGCDDataSet ds = (SS_L_JIYEOGCDDataSet)request.getAttribute("ds");
    String applySessionStr = (String)request.getParameter("applySession");
    
    RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.
    int root = RwXmlWrapper.rootNodeID;
    int itemDepth  = 0;

    if("true".equals(applySessionStr)){

		// session�� �����ڵ�, ������ ������� <option>�� �����Ѵ�.
		int comboArea  = rxw.add(root, "arealist_temp" , "");
    
		String areanm = (String)session.getAttribute("areanm");
		ArrayList areanmList = getTokens(areanm, "^");		// ������ "^"

		if(areanmList.size() == 0){	// �����ڵ�,������ ������ ����.
			// �����ڵ�,�������� �������� ����. ����ó��
		}else if(areanmList.size() == 1){	// �����ڵ�,������ ������ �ϳ�.
	
			String areacdnm = (String)areanmList.get(0);
			ArrayList areacdnmList = getTokens(areacdnm, "|");	// ������ "|"
			if(areacdnmList.size() == 2){
				//rxw.addSelectItem(comboArea, (String)areacdnmList.get(1), (String)areacdnmList.get(0));
				rxw.addSelectItem(comboArea, "record", "area_nm", "area_cd", (String)areacdnmList.get(1), (String)areacdnmList.get(0));
			}else{
				// �����ڵ�, ������ ���� ���� ����. ����ó��.
			}
		}else{	// �����ڵ�,������ ������ ������.
	
			//rxw.addSelectItem(comboArea, "��ü", "");
			rxw.addSelectItem(comboArea, "record", "area_nm", "area_cd", "��ü", "");
			for(int i=0; i<areanmList.size(); i++){
				String areacdnm = (String)areanmList.get(i);
				ArrayList areacdnmList = getTokens(areacdnm, "|");	// ������ "|"
	
				if(areacdnmList.size() == 2){
	
					// SS_L_JIYEOGCDDataSet ��ü�� curcommlist�� ���Ե� SS_L_JIYEOGCDCURCOMMLISTRecord ��ü�� areacd�� ���Ͽ� ������ �����ڵ� ��Ͽ� �����ϴ� �׸� ����Ѵ�.
					for(int j=0; j<ds.curcommlist.size(); j++){
						SS_L_JIYEOGCDCURCOMMLISTRecord record = (SS_L_JIYEOGCDCURCOMMLISTRecord)ds.curcommlist.get(j);
	
						if(areacdnmList.get(0).equals(record.areacd)){
							//rxw.addSelectItem(comboArea, (String)areacdnmList.get(1), (String)areacdnmList.get(0));
							rxw.addSelectItem(comboArea, "record", "area_nm", "area_cd", (String)areacdnmList.get(1), (String)areacdnmList.get(0));
						}
					}
	
				}else{
					// �����ڵ�, ������ ���� ���� ����. ����ó��
				}
			}
		}

	}
    else
    {
    	rxw.makeDataToList(ds, "curcommlist", "areanm", "areacd", "��ü", "", root, "arealist_temp", "record", "area_nm", "area_cd");
    }
	//System.out.println(rx.getXml());    
	rxw.flush(out);
%>
