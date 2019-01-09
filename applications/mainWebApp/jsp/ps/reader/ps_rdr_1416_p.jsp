<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_rdr_1416_p.jsp
* ���     : �����ڰ��� ���ڰ˻� ������ �� Link
* �ۼ����� : 2003-12-12
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����.
* ������   : ������	
* �������� : 2009-02-17
* ������ϸ� :
---------------------------------------------------------------------------------------------------%>
<%
    // dataset �ν��Ͻ� ����κ�
    PS_S_READERINFODataSet ds = (PS_S_READERINFODataSet)request.getAttribute("ds");         //request dataset

    PS_S_READERINFOREADINFOCURRecord readinfocurRec = null;         //���������� dataset
    PS_S_READERINFOBNS_BOOKAPLCCURRecord bns_bookaplccurRec = null; //���ʽ������� dataset

    boolean  rdrChk = false;            //������ ����Ÿ ����üũ

    if (ds.readinfocur.size() > 0) {
        readinfocurRec = (PS_S_READERINFOREADINFOCURRecord)ds.readinfocur.get(0);
        rdrChk  =  true;
    }
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "rdr_no", "  <![CDATA[" + readinfocurRec.rdr_no + "]]>"); // ���ڹ�ȣ
	rxw.add(resTemp, "rdrnm", "  <![CDATA[" + readinfocurRec.rdrnm + "]]>"); // ���ڸ�
	rxw.add(resTemp, "aplcdt", "  <![CDATA[" + readinfocurRec.aplcdt + "]]>"); // ��û����
	rxw.add(resTemp, "delidt", "  <![CDATA[" + readinfocurRec.delidt + "]]>"); // �躻����
	rxw.add(resTemp, "bonm", "  <![CDATA[" + readinfocurRec.bonm + "]]>"); // ����
	rxw.add(resTemp, "medicd", "  <![CDATA[" + readinfocurRec.medicd + "]]>"); // ��û��ü
	rxw.add(resTemp, "subsyys", "  <![CDATA[" + readinfocurRec.subsyys + "]]>"); // �����
	rxw.add(resTemp, "subs_serno", "  <![CDATA[" + readinfocurRec.subs_serno + "]]>"); // ����ȣ��
	
	rxw.add(resTemp, "acq_bonm", "  <![CDATA[" + readinfocurRec.acq_bonm + "]]>"); // ���������� ��Ÿ
	rxw.add(resTemp, "boprocdt", "  <![CDATA[ ����ó������ " + Util.Timestamp2Str(readinfocurRec.boprocdt) + "]]>"); // ����ó������
	rxw.add(resTemp, "acqnm", "  <![CDATA[" + readinfocurRec.acqnm + "]]>"); // ����
	rxw.add(resTemp, "paty_clsfcd", "  <![CDATA[" + readinfocurRec.paty_clsfcd + "]]>"); // ��ü���� 
	rxw.add(resTemp, "rdrtel_no", "  <![CDATA[" + readinfocurRec.rdrtel_no + "]]>"); // ��ȭ��ȣ
	rxw.add(resTemp, "rdrptph_no", "  <![CDATA[" + readinfocurRec.rdrptph_no + "]]>"); // �޴���
	rxw.add(resTemp, "dlvaddr", "  <![CDATA[" + readinfocurRec.dlvaddr + "]]>"); // �ּ�
	rxw.add(resTemp, "sendmthd", "  <![CDATA[" + readinfocurRec.sendmthd + "]]>"); // �߼۹��
	rxw.add(resTemp, "recpclsf", "  <![CDATA[" + readinfocurRec.recpclsf + "]]>"); // ���뱸��
	rxw.add(resTemp, "rdroffinm", "  <![CDATA[" + readinfocurRec.rdroffinm + "]]>"); // �����
	rxw.add(resTemp, "rdrposi", "  <![CDATA[" + readinfocurRec.rdrposi + "]]>"); // ��å
	rxw.add(resTemp, "rdroffitel_no", "  <![CDATA[" + readinfocurRec.rdroffitel_no + "]]>"); // ������ȭ
	rxw.add(resTemp, "email", "  <![CDATA[" + readinfocurRec.email + "]]>"); // �̸���
	rxw.add(resTemp, "prn", "  <![CDATA[" + readinfocurRec.prn + "]]>"); // �ֹι�ȣ
	rxw.add(resTemp, "bidt", "  <![CDATA[" + readinfocurRec.bidt + "]]>"); // �������
	
	rxw.add(resTemp, "aplc_persflnm", "  <![CDATA[" + readinfocurRec.aplc_persflnm + "]]>"); // ����
	rxw.add(resTemp, "aplc_persoffinm", "  <![CDATA[" + readinfocurRec.aplc_persoffinm + "]]>"); // �����
	rxw.add(resTemp, "aplc_persposi", "  <![CDATA[" + readinfocurRec.aplc_persposi + "]]>"); // ��å
	rxw.add(resTemp, "aplc_perstel_no", "  <![CDATA[" + readinfocurRec.aplc_perstel_no + "]]>"); // ��ȭ��ȣ
	rxw.add(resTemp, "aplc_persptph_no", "  <![CDATA[" + readinfocurRec.aplc_persptph_no + "]]>"); // �޴���
	
	rxw.add(resTemp, "clamplflnm", "  <![CDATA[" + readinfocurRec.clamplflnm+ "]]>"); // ����
	rxw.add(resTemp, "clamploffinm", "  <![CDATA[" + readinfocurRec.clamploffinm + "]]>"); // �����
	rxw.add(resTemp, "clamplposi", "  <![CDATA[" + readinfocurRec.clamplposi + "]]>"); // ��å
	rxw.add(resTemp, "clampltel_no", "  <![CDATA[" + readinfocurRec.clampltel_no + "]]>"); // ��ȭ��ȣ
	rxw.add(resTemp, "clamplptph_no", "  <![CDATA[" + readinfocurRec.clamplptph_no + "]]>"); // �޴���
	rxw.add(resTemp, "clampladdr", "  <![CDATA[" + readinfocurRec.clampladdr+ "]]>"); // �ּ�
	
	rxw.add(resTemp, "acpntypeclsf", "  <![CDATA[" + readinfocurRec.acpntypeclsf + "]]>"); // ��������
	rxw.add(resTemp, "sendyncd", "  <![CDATA[" + readinfocurRec.sendyncd + "]]>"); // �߼ۿ���
	rxw.add(resTemp, "alonpaycd", "  <![CDATA[" + readinfocurRec.alonpaycd + "]]>"); // ����ó��
	rxw.add(resTemp, "aplcpathnm", "  <![CDATA[" + readinfocurRec.aplcpathnm + "]]>"); // Ȯ����
	rxw.add(resTemp, "rdr_extntypenm", "  <![CDATA[" + readinfocurRec.rdr_extntypenm + "]]>"); // Ȯ������
	rxw.add(resTemp, "suspresnnm", "  <![CDATA[" + readinfocurRec.suspresnnm + "]]>"); // ��������
	rxw.add(resTemp, "rcpmmthd", "  <![CDATA[" + readinfocurRec.rcpmmthd + "]]>"); // �Աݹ��
	rxw.add(resTemp, "realsellamt", "  <![CDATA[" + readinfocurRec.realsellamt + "]]>"); // �����ݾ�
	rxw.add(resTemp, "un_clamtamt", "  <![CDATA[" + readinfocurRec.un_clamtamt + "]]>"); // �̼��ݾ�
	rxw.add(resTemp, "ttl_rcpmamt", "  <![CDATA[" + readinfocurRec.ttl_rcpmamt + "]]>"); // �Ա��Ѿ�
	rxw.add(resTemp, "rcpm_list", "  <![CDATA[" + readinfocurRec.rcpm_list + "]]>"); // 
	rxw.add(resTemp, "amno", "  <![CDATA[" + readinfocurRec.amno + "]]>"); // �������
	rxw.add(resTemp, "mang_empno", "  <![CDATA[" + readinfocurRec.mang_empno + "]]>"); // �������
	rxw.add(resTemp, "deli_empno", "  <![CDATA[" + readinfocurRec.deli_empno + "]]>"); // �躻���
	rxw.add(resTemp, "hdqtemp_no", "  <![CDATA[" + readinfocurRec.hdqtemp_no + "]]>"); // ������
	rxw.add(resTemp, "rdr_extnno", "  <![CDATA[" + readinfocurRec.rdr_extnno + "]]>"); // Ȯ���ȣ
	rxw.add(resTemp, "arbtno", "  <![CDATA[" + readinfocurRec.arbtno + "]]>"); // �����ȣ
	rxw.add(resTemp, "taxstmtexne", "  <![CDATA[" + readinfocurRec.taxstmtexne + "]]>"); // ��꼭
	rxw.add(resTemp, "taxstmtissudt", "  <![CDATA[" + readinfocurRec.taxstmtissudt + "]]>"); // �߱�����
	rxw.add(resTemp, "memo", "  <![CDATA[" + readinfocurRec.memo + "]]>"); // �޸�
		
	//rxw.add(resTemp, "pageno", pageno);
	//rxw.add(resTemp, "total_records", total_records);
		
	//record ��ü�� �״�� ����� �� ���� ������ �ʿ��ϹǷ� makeDataToBulk�� ������� �ʰ� �Ʒ��� ���� ó��.
	rxw.makeHugeStart(resTemp, "detailGrid");
	
	for(int i=0; i<ds.bns_bookaplccur.size(); i++)
	{
        bns_bookaplccurRec = (PS_S_READERINFOBNS_BOOKAPLCCURRecord)ds.bns_bookaplccur.get(i);
		//title �߰�.
		if(i == 0)
		{
			//rxw.add_ColVal("isReadOnly");
			//������ �ʵ�� �ڵ� ����.
			rxw.makeRecordToBulkTitle(bns_bookaplccurRec);
		}
		
		//������ �߰�.
		//rxw.add_ColVal(new StringBuffer().append(extnasincurRec.dlvaddr).append(" ").append(extnasincurRec.dlvdtlsaddr));
		//������ �ʵ� �ڵ�����.
		rxw.makeRecordToBulk(bns_bookaplccurRec, false);
	}
	
	rxw.makeHugeEnd();
	
	rxw.flush(out);
%>
