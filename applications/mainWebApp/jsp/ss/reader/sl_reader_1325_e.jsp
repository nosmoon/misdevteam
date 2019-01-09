<%@ page contentType="text/xml;charset=KSC5601"%>
<%@ include file="/jsp/ss/slcomm_jsp/sl_common_x.jsp"%>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� 	 : sl_reader_1325_e.jsp
* ��� 		 : ������������(�����˾�)(�ʱ�ȭ)
* �ۼ����� 	 : 2003-12-12
* �ۼ��� 	 : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-04-02
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
    // getting dataset
    SL_E_SUBS_CNTR_STOP_INIDataSet ds = (SL_E_SUBS_CNTR_STOP_INIDataSet)request.getAttribute("ds");  // request dataset
    	
   	//TrustForm ó��.
   	RwXmlWrapper rxw = new RwXmlWrapper();
   	int root = RwXmlWrapper.rootNodeID;
   	int resTemp = rxw.add(root, "resTemp", "");
   	
   	rxw.add(resTemp, "suspFlag", String.valueOf(!(ds.readercur.size() > 0)));

   	if(ds.readercur.size() > 0){ //�������ڰ� �ƴ϶��
    	 
   		//1. ��������
   		int readerInfo = rxw.add(resTemp, "readerInfo", "");
   	
   		SL_E_SUBS_CNTR_STOP_INIREADERCURRecord readercurRec = (SL_E_SUBS_CNTR_STOP_INIREADERCURRecord)ds.readercur.get(0);
   		rxw.add(readerInfo, "rdr_no", readercurRec.rdr_no);
   		rxw.add(readerInfo, "rdrnm", readercurRec.rdrnm);
   		rxw.add(readerInfo, "rdrtel_no", Util.getChainStr(readercurRec.rdrtel_no1, readercurRec.rdrtel_no2, readercurRec.rdrtel_no3, "-"));
   		StringBuffer sb  = new StringBuffer("");
        if( !"".equals(readercurRec.dlvzip) && readercurRec.dlvzip.trim().length() == 6){
            sb.append(readercurRec.dlvzip.substring(0, 3));
            sb.append("-");
            sb.append(readercurRec.dlvzip.substring(3, 6));
        }
        sb.append(" " + readercurRec.dlvaddr );
        sb.append(" " + readercurRec.dlvdtlsaddr );
        sb.append(" " + readercurRec.dlvdong );
        sb.append(" " + readercurRec.dlvser_no);
        sb.append(" " + readercurRec.dlvbnji );
   		rxw.add(readerInfo, "addr", sb);
   		
   		//��������
   		rxw.makeDataToBulkList(ds, "susptypecdcur", "cicdnm", "cicodeval", readerInfo, "susptypeCombo");
   		
   		//��������
   		rxw.add(readerInfo, "suspdt", Util.getDate());
   		
   		//��������
   		rxw.makeDataToBulkList(ds, "suspresncdcur", "cicdnm", "cicodeval", "", "", readerInfo, "suspresncdCombo");
   		//�������� Ÿ�Ź�����.
   		rxw.makeHugeListStart(readerInfo, "remkCombo");
   		rxw.addHugeListItem("", "");
   		rxw.addHugeListItem("�߾��Ϻ�", "�߾��Ϻ�");
   		rxw.addHugeListItem("�����Ϻ�", "�����Ϻ�");
   		rxw.addHugeListItem("�Ѱܷ�", "�Ѱܷ�");
   		rxw.addHugeListItem("��Ÿ", "��Ÿ");
   		rxw.makeHugeEnd();
   		
   		//2. ��ü�����
   		int stopObj = rxw.add(resTemp, "stopObj", "");
   		
   		//ó���÷���
   		rxw.add(stopObj, "susptype", "20");
   		
   		//��� freeyn�� ���� freeclsf�� ������ �� �ִ� ����� Ʋ����. trustform UI������ �̸� �������� �����Ƿ� �ƿ� freeclsf���� ������.
   		//rxw.makeDataToBulk(ds, "objcur", stopObj, "stopObjGrid");
   		rxw.makeHugeStart(stopObj, "stopObjGrid", ds.objcur.size());
   		SL_E_SUBS_CNTR_STOP_INIOBJCURRecord objcurRec = null;
   		for(int i=0; i<ds.objcur.size(); i++){
   			objcurRec = (SL_E_SUBS_CNTR_STOP_INIOBJCURRecord)ds.objcur.get(i);
   	        
   			//title �߰�.
   			if(i == 0)
   			{
   				rxw.add_ColVal("idx");
   				rxw.add_ColVal("freeclsf");
   				rxw.add_ColVal("orgqty");
   				//������ �ʵ�� �ڵ� ����.
   				rxw.makeRecordToBulkTitle(objcurRec);
   			}
   			
   			//������ �߰�.
   			rxw.add_ColVal("Y");	//��� üũ�ڽ��� default�� üũ.
   			rxw.add_ColVal("Y".equals(objcurRec.freeyn) ? objcurRec.freeclsf : "");
   			rxw.add_ColVal(objcurRec.qty);
   			//������ �ʵ� �ڵ�����.
   			rxw.makeRecordToBulk(objcurRec, false);
   		}
   		rxw.makeHugeEnd();
   		
   		//���ᱸ��
   		rxw.makeDataToBulkList(ds, "freeclsfcdcur", "cicdnm", "cicodeval", stopObj, "freeclsfCombo");
   	}
   	
   	rxw.flush(out);
%>

