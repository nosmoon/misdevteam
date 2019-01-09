<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_reader_1210_l.jsp
* ��� : ������Ȳ-VacationStop ��û-��ȸ���
* �ۼ����� : 2004-01-16
* �ۼ��� : ����ȫ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ���� ������ ����.
* ������ : ����
* �������� : 2009-03-04
* ������ϸ� : ss_reader_1210_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_VSDataSet ds = (SS_L_VSDataSet)request.getAttribute("ds");
    //int moveListCount = 5;	// �� ȭ��� ����Ʈ �׸� ��
    int moveListCount = 5000;
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
    // ��ȸ ���.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
    
  	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_VSCURCOMMLISTRecord curcommlistRec = (SS_L_VSCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title �߰�.
		if(i == 0)
		{
			rxw.add_ColVal("addrDetail");
			rxw.add_ColVal("today");
			rxw.add_ColVal("sendplace");
			rxw.add_ColVal("bocnfmyn_f");
			rxw.add_ColVal("addrSend");
			rxw.add_ColVal("areaAddr");
			rxw.add_ColVal("bonmAddr");
			rxw.add_ColVal("fmynAddr");
			
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//������ �߰�.
		rxw.add_ColVal(curcommlistRec.dlvaddr + curcommlistRec.dlvdtlsaddr);
		rxw.add_ColVal("����");
		rxw.add_ColVal("�����");
		
		if("Y".equals(curcommlistRec.bocnfmyn)){
			rxw.add_ColVal("Ȯ��");
		}else if("N".equals(curcommlistRec.bocnfmyn)){
			rxw.add_ColVal("��Ȯ��");
		}
		
		//Vacation Stop �� ���
		if("".equals(Integer.toString(curcommlistRec.clsfcd)) || "10".equals(Integer.toString(curcommlistRec.clsfcd))){
			rxw.add_ColVal(curcommlistRec.dlvaddr + curcommlistRec.dlvdtlsaddr);
			rxw.add_ColVal(curcommlistRec.areanm);
			rxw.add_ColVal(curcommlistRec.bonm);
			if("Y".equals(curcommlistRec.bocnfmyn)){
				rxw.add_ColVal("Ȯ��");
			}else if("N".equals(curcommlistRec.bocnfmyn)){
				rxw.add_ColVal("��Ȯ��");
			}
			//rxw.add_ColVal(curcommlistRec.bocnfmyn);
		}//V-Stop + �ް�������� ���
		else if("20".equals(Integer.toString(curcommlistRec.clsfcd))){
			rxw.add_ColVal(curcommlistRec.vaca_areaaddr + curcommlistRec.vaca_areadtlsaddr);
			rxw.add_ColVal(curcommlistRec.vaca_areaareanm);
			rxw.add_ColVal(curcommlistRec.vaca_areabonm);
			if("Y".equals(curcommlistRec.vaca_areadlvofficnfmyn)){
				rxw.add_ColVal("Ȯ��");
			}else if("N".equals(curcommlistRec.vaca_areadlvofficnfmyn)){
				rxw.add_ColVal("��Ȯ��");
			}
			//rxw.add_ColVal(curcommlistRec.vaca_areadlvofficnfmyn);
		}//V-Stop + Ư���� ����� ���
		else if("30".equals(Integer.toString(curcommlistRec.clsfcd))){
			rxw.add_ColVal(Util.convertS(curcommlistRec.spcfdlvdt));
			rxw.add_ColVal("");
			rxw.add_ColVal("");
			rxw.add_ColVal("");
		}
		
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(curcommlistRec, false);
		
	}
	rxw.makeHugeEnd();
    
	rxw.flush(out);
%>