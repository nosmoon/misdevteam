<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : sl_common_1100_p.jsp
* ���       : ���� �� ��ȸ �˾�
* �ۼ�����   : 2003-12-09
* �ۼ���     : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-06
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    String code = "";
    String name = "";
    String firstDlvdstccd = ""; //���ʱ����ڵ�
    StringBuffer sb_dstc = new StringBuffer("");

    SL_L_DSTCINFOCDDataSet ds = (SL_L_DSTCINFOCDDataSet)request.getAttribute("ds");

  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");

	int searchDstcCombo = rxw.add(resTemp, "searchDstcCombo", "");
	SL_L_DSTCINFOCDDSTCINFOCURRecord dstcinfocurRec  = null;
    for(int i=0; i<ds.dstcinfocur.size(); i++){
        dstcinfocurRec = (SL_L_DSTCINFOCDDSTCINFOCURRecord)ds.dstcinfocur.get(i);
        code = dstcinfocurRec.dstccd;
        name = dstcinfocurRec.dstccd;

        if(i==0) firstDlvdstccd = code;
        
        int item = rxw.add(searchDstcCombo, "item", "");
        rxw.add(item, "label", name+":"+dstcinfocurRec.dstcnm);
    	rxw.add(item, "value", code);
    	rxw.add(item, "cdnm", dstcinfocurRec.dstcnm);
    	rxw.add(item, "teamcd", dstcinfocurRec.teamcd);
    }
    
	rxw.add(resTemp, "bocd", Util.getSessionParameterValue(request, "bocd", true));
	rxw.add(resTemp, "firstDlvdstccd", firstDlvdstccd);
	
	rxw.flush(out);
	
%>

