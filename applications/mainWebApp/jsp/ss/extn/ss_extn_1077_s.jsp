<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_extn_1030_s.jsp
* ��� : Ȯ����Ȳ-��û��Ȳ-��
* �ۼ����� : 2003-11-21
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-03-16
* ������ϸ� : ss_extn_1077_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_ON_RDR_EXTNDataSet ds = (SS_S_ON_RDR_EXTNDataSet)request.getAttribute("ds");
    int extnType = 0;       // 10:���Ȯ��, 20:ǰ����Ȯ�� , 30:������üȮ��, 40:������û, 50:���ڱ���
    if(ds.getRdr_extntypecd().equals("10")){
        extnType = 10;	    // ���Ȯ��
    }else if(ds.getRdr_extntypecd().equals("20")){
        extnType = 20;	    // ǰ����Ȯ��
    }else if(ds.getRdr_extntypecd().equals("30")){
        extnType = 30;	    // ������üȮ��
    }else if(ds.getRdr_extntypecd().equals("40")){
        extnType = 40;	    // ������û
    }else if(ds.getRdr_extntypecd().equals("50")){
        extnType = 50;	    // ���̹�
    }else if(ds.getRdr_extntypecd().equals("70")){
        extnType = 70;	    // ���̹�������
    }

    int extnBlngType = 0;   // 10:����IS���, 20:�缳���, 30:����
    if(ds.getExtnblngcd().equals("10")){
        extnBlngType = 10;	    // ����IS���
    }else if(ds.getExtnblngcd().equals("20")){
        extnBlngType = 20;	    // �缳���
    }else if(ds.getExtnblngcd().equals("30")){
        extnBlngType = 30;	    // ����
    }
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	/*rxw.add(resTemp, "totalcnt", ds.getTotalcnt());
	rxw.add(resTemp, "pageno", request.getParameter("pageno"));
	rxw.add(resTemp, "js_fn_nm", request.getParameter("js_fn_nm"));
	rxw.add(resTemp, "pagesize", vscdListCount);
	rxw.add(resTemp, "page_set_gubun", 0);*/
	
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>

