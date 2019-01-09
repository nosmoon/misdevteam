<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_commun_2660_a.jsp
* ��� 	 	 : �Ǹű�-�����濵-����Ʈ���� ��Ȳ���� �������
* �ۼ����� 	 : 2004-03-08
* �ۼ��� 	 : ��â��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-02-19
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    //����ȯ�汸�� ���� ����
    Vector jobcdSet = new Vector();
    String jobcd_param = "";
	String jobcd = Util.getSessionParameterValue(request, "jobcd", false);	// ���������ڵ�(�Ǹű���,��������,���������� ��� ��ȸ �ɼ��� �����ش�.)    
//	String jobcd = (String)request.getHeader("JOBCD");

    if( jobcd == null ) {
      jobcd = "^";
//      jobcd = "100^280^710^920^950^T15";
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
    
    //TrustForm ó�� ����
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "bocd", request.getParameter("bocd"));
	rxw.add(resTemp, "jobcdset", jobcd_param);
	rxw.add(resTemp, "invsgdt1", Util.getMonth2( -1 ));
	rxw.add(resTemp, "invsgdt2", Util.getDate());
	
	//��ϱ���1
	rxw.makeEmpytList(resTemp, "regtype1list", "��ü", "");
	
	//��ϱ���2
	rxw.makeEmpytList(resTemp, "regtype2list", "��ü", "");
	
	rxw.flush(out);
%>