<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_reader_1210_s.jsp
* ��� 		 : ������������(�����󼼺���)
* �ۼ����� 	 : 2003-12-12
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-07
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    // getting dataset
    SL_S_NWSPSUBSCNTRDataSet ds = (SL_S_NWSPSUBSCNTRDataSet)request.getAttribute("ds");  // request dataset

    //application exception ó��
    if(ds.nwspsubscntrcur.size() < 1){
        request.setAttribute("appException", new AppException("sl_reader_1210_s.jsp(1)","�߸��� ����������� �Դϴ�. ���ڹ�ȣ�� ��ü���� Ȯ���Ͻ� �� �����ڿ��� �����ϼ���."));
        pageContext.forward("/jsp/ss/slcomm_jsp/app_error.jsp");
    }

    SL_S_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord  nwspsubscntrcurRec = (SL_S_NWSPSUBSCNTRNWSPSUBSCNTRCURRecord)ds.nwspsubscntrcur.get(0);
    
  	//TrustForm ó��.
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//������.
	rxw.makeDataToBulk(nwspsubscntrcurRec, resTemp, "detailInfo");
	//�߰�������
	int detailInfoEx = rxw.add(resTemp, "detailInfoEx", "");
	rxw.add(detailInfoEx, "accflag", "");
	rxw.add(detailInfoEx, "bocd", "");
	rxw.add(detailInfoEx, "new_medicd", nwspsubscntrcurRec.medicd);
	rxw.add(detailInfoEx, "rdr_extntypecd_2", nwspsubscntrcurRec.rdr_extntypecd);
	rxw.add(detailInfoEx, "bodutynm", "");
	rxw.add(detailInfoEx, "extnflnm", nwspsubscntrcurRec.extnnm);
	
	//�޺�������
	//��ü�ڵ�.
	int medicd = rxw.add(resTemp, "medicdCombo", "");
	SL_S_NWSPSUBSCNTRBOMEDICDCURRecord bomedicdcurRec = null;
	for(int i=0; i<ds.bomedicdcur.size(); i++){
		bomedicdcurRec = (SL_S_NWSPSUBSCNTRBOMEDICDCURRecord)ds.bomedicdcur.get(i);
		String code = bomedicdcurRec.medicd;
        String name = bomedicdcurRec.cicdnm;
        int subsuprc = bomedicdcurRec.subsuprc;
        
        int item = rxw.add(medicd, "item", "");
        rxw.add(item, "label", name);
    	rxw.add(item, "value", code);
    	rxw.add(item, "subsuprc", subsuprc);
    	//rxw.add(item, "medinm", name);
    }
	//���ᱸ��.
	rxw.makeDataToBulkList(ds, "freeclsfcdcur", "cicdnm", "cicodeval", resTemp, "freeclsfCombo");
	//Ȯ������. "30"
	rxw.makeDataToBulkList(ds, "rdr_extntypecdcur", "cicdnm", "cicodeval", resTemp, "rdrExtntypecdCombo");
	
	rxw.flush(out);
%>

