<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : sl_reader_1180_p.jsp
* ���       : ������������(�����߰������˾�-�ʱ�ȭ��)
* �ۼ�����   : 2003-12-12
* �ۼ���     : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-06
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%  // getting dataset
    SL_L_NWSPSUBSCNTR_INITDataSet ds = (SL_L_NWSPSUBSCNTR_INITDataSet)request.getAttribute("ds");  // request dataset

    final int TAB_SIZE = 5; // �� row �� �� ���� ����
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	/* ���� ó�� - ������޸�ü �ڵ尡 ��Ͽ���*/
	rxw.add(resTemp, "bomedicdReg", String.valueOf(ds.bomedicdcur.size() != 0));
	
	//��Ÿ �⺻ ������.
	int defaultData = rxw.add(resTemp, "defaultData", "");
	rxw.add(defaultData, "bocd", Util.getSessionParameterValue(request, "bocd", true));
	rxw.add(defaultData, "today", Util.getDate());
	rxw.add(defaultData, "valmm", Util.addMonth(ds.curryymm + "01", 1).substring(0, 6));
	rxw.add(defaultData, "subsuprc", ((SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord)ds.bomedicdcur.get(0)).subsuprc);
	
	//�޺�������
	//��ü�ڵ�. ù��°
	int medicd = rxw.add(defaultData, "medicdCombo", "");
	SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord bomedicdcurRec = null;
	for(int i=0; i<ds.bomedicdcur.size(); i++){
		bomedicdcurRec = (SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord)ds.bomedicdcur.get(i);
		String code = bomedicdcurRec.medicd;
        String name = bomedicdcurRec.cicdnm;
        int subsuprc = bomedicdcurRec.subsuprc;
        
        int item = rxw.add(medicd, "item", "");
        rxw.add(item, "label", name);
    	rxw.add(item, "value", code);
    	rxw.add(item, "subsuprc", subsuprc);
    	//rxw.add(item, "medinm", name);
    }
	//���ᱸ��. ""
	rxw.makeDataToBulkList(ds, "freeclsfcdcur", "cicdnm", "cicodeval", defaultData, "freeclsfCombo");
	//Ȯ������. "30"
	rxw.makeDataToBulkList(ds, "rdr_extntypecdcur", "cicdnm", "cicodeval", defaultData, "rdrExtntypecdCombo");
	
	rxw.flush(out);

%>
