<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brinfo_1050_a.jsp
* ��� :
* �ۼ����� :
* �ۼ��� :
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : Ȳ����
* �������� : 20090122
* ������ϸ� : ss_brinfo_1050_a.jsp_org
---------------------------------------------------------------------------------------------------%>
<%-- dataset �ν��Ͻ� ����κ�--%>
<%
	//SS_L_READER_BOINFO_INITDataSet ds = (SS_L_READER_BOINFO_INITDataSet)request.getAttribute("ds");

	SS_L_BOACCT_INITDataSet ds = (SS_L_BOACCT_INITDataSet)request.getAttribute("ds");
    //int listCount = 20;	// �� ȭ��� ����Ʈ �׸� ��
    int listCount = 5000;
    
    RwXmlWrapper rxw = new RwXmlWrapper();			//TrustForm ����ó�� ��ü.

    boolean applySession = true;	// ���� ���� ����
	String jobcd = Util.getSessionParameterValue(request, "jobcd", false);	// ���������ڵ�(�Ǹű���,��������,���������� ��� ��ȸ �ɼ��� �����ش�.)

    //����ȯ�汸�� ���� ����
    Vector jobcdSet = new Vector();
    String jobcd_param = "";
	//String jobcd = (String)request.getHeader("JOBCD");
    if( jobcd == null ) {
      jobcd = "^";
    //jobcd = "100^280^710^920^950^T15";
    }

	StringTokenizer st = new StringTokenizer(jobcd, "^");
	while(st.hasMoreTokens()){
		jobcdSet.add(st.nextToken());
	}

    for(int i=0; i<jobcdSet.size(); i++){
      jobcd_param = (String)jobcdSet.elementAt(i);
      if( jobcd_param.equals("100") || jobcd_param.equals("302") || jobcd_param.equals("570") ) {
        //������(100), ��������(302), ���˴��(570)
        break;
      } else {
        jobcd_param = "";
      }
    }
    //����ȯ�汸�� ���� ��

    int root = RwXmlWrapper.rootNodeID;
    int comboSet  = 0;
    int comboTeam = 0;
    int comboPart = 0;
    int comboArea = 0;
    int comboBranch = 0;
    
    //applySession
    rxw.add(root, "applySession", String.valueOf(applySession));
    rxw.add(root, "pagesize", listCount);
    rxw.add(root, "jobcdset", jobcd_param);
    
    //�μ�-���� ������ init.
    comboSet = rxw.add(root, "codeData" , "");
    if(applySession)
    {
        //�μ�(��)��� ǥ��
	    /*comboTeam  = rxw.add(comboSet, "teamlist" , "");
		writeDeptOpt(session, rxw, comboTeam, true);*/
		//rxw.makeDataToList(ds, "teamlist", "dept_nm", "dept_cd", comboSet, "teamlist", "record", "dept_nm", "dept_cd");
		rxw.makeDataToBulk(ds, "teamlist", comboSet, "teamlist");
		
		//��Ʈ ��� ǥ��
		/*comboPart = rxw.add(comboSet, "partlist_temp" , "");
		rxw.addSelectItem(comboPart, "record", "dept_nm", "dept_cd", "��ü", "");*/
		rxw.makeDataToBulk(ds, "partlist", comboSet, "partlist_temp");
	
	    //���� ��� ǥ��
	    /*comboArea = rxw.add(comboSet, "arealist_temp" , "");
		writeAreaOpt(session, rxw, comboArea, true);*/
		rxw.makeDataToBulk(ds, "arealist", comboSet, "arealist_temp");
		
		//���� ��� ǥ��
		comboBranch = rxw.add(comboSet, "codelist" , "");
		rxw.addSelectItem(comboBranch, "record", "cdnm", "cd", "��ü", "");
    }
    else
    {
    	//dataset�� ���� ���� ����. ���� �߰�.
    }
    
    rxw.flush(out);

%>