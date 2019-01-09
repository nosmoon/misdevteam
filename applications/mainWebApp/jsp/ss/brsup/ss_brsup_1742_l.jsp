<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_brsup_1742_l.jsp
* ��� : ������������-Billing�ڵ���ü-��û����-��û���
* �ۼ����� : 2004-03-26
* �ۼ��� : ���
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-16
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>

<%
    SS_L_APLCDataSet ds = (SS_L_APLCDataSet)request.getAttribute("ds");
    int moveListCount = 5000;	// �� ȭ��� ����Ʈ �׸� ��	8 -> 5000
    
 	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	int aplcListForm = rxw.add(resTemp, "aplcListForm", "");
	rxw.add(aplcListForm, "bocd", Util.checkString(request.getParameter("bocd")));
	
	int summary = rxw.add(resTemp, "summary", "");
	rxw.add(summary, "bonm", Util.Uni2Ksc(Util.checkString(request.getParameter("bonm"))));
	rxw.add(summary, "botel", request.getParameter("botel"));
	rxw.add(summary, "uncnfmcnt", ds.getUncnfmcnt());
	rxw.add(summary, "cnfmcnt", ds.getCnfmcnt());
	rxw.add(summary, "canccnt", ds.getCanccnt());
	rxw.add(summary, "aprverrcnt", ds.getAprverrcnt());
	
	int naviInfo = rxw.add(resTemp, "naviInfo2", "");
	rxw.add(naviInfo, "pageno", Util.Uni2Ksc(Util.checkString(request.getParameter("bonm"))));
	rxw.add(naviInfo, "totalcnt", ds.getTotalcnt());
	rxw.add(naviInfo, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(naviInfo, "pagesize", moveListCount);
	
	rxw.makeHugeStart(resTemp, "aplcGrid", ds.rsltcur.size());
	String tempStr = null;
    String pymttel = null;
    boolean closYn = false;
    String closYnStr = null;
    String shifclsf_t = "";
	for(int i=0; i < ds.rsltcur.size(); i++)
	{
		SS_L_APLCRSLTCURRecord rsltcurRec = (SS_L_APLCRSLTCURRecord)ds.rsltcur.get(i);
		
		if(rsltcurRec.getPymttel1()!=null && !rsltcurRec.getPymttel1().equals("")) {	// ��������ȭ��ȣ
            pymttel = rsltcurRec.getPymttel1() + "-" + rsltcurRec.getPymttel2() + "-" + rsltcurRec.getPymttel3();
        } else {
            pymttel = rsltcurRec.getPymttel2() + "-" + rsltcurRec.getPymttel3();
        }
        // �������� => ���ۿ��ΰ� 'Y'�̰ų�, �Ա������ݿ����ΰ� 'Y'�̸� �������δ� true. ���º��� �� ���������� �� �� ����.
        if("Y".equals(rsltcurRec.getTrsmyn()) || "Y".equals(rsltcurRec.getPymtinforflyn())) {
			closYn = true;
		} else {
			closYn = false;
		}
        if(closYn) {
            closYnStr = "Y";
        } else {
            closYnStr = "N";
        }
        if(rsltcurRec.getShftclsf().equals("110")) {
        	shifclsf_t = "�ڵ�";
        } else if(rsltcurRec.getShftclsf().equals("120")) {
        	shifclsf_t = "D.O";
        } else if(rsltcurRec.getShftclsf().equals("130")) {
        	shifclsf_t = "ī��";
        } else {
        	shifclsf_t = "";
        }
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("idx");
			rxw.add_ColVal("pymttel");
			rxw.add_ColVal("closyn");
			rxw.add_ColVal("pymtnmtel");
			rxw.add_ColVal("shiftclsf_t");
			rxw.add_ColVal("addr_t");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(rsltcurRec);
		}
		
		//������ �߰�.
		rxw.add_ColVal("");
		rxw.add_ColVal(pymttel);
		rxw.add_ColVal(closYnStr);
		rxw.add_ColVal(new StringBuffer().append(rsltcurRec.getPymtnm()).append("(").append(pymttel).append(")"));
		rxw.add_ColVal(shifclsf_t);
		rxw.add_ColVal(new StringBuffer().append(rsltcurRec.getDlvaddr()).append(" ").append(rsltcurRec.getDlvaddrdtls()).append(" ").append(rsltcurRec.getShftaplcclsfnm()));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(rsltcurRec, false);
	}
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
