<%@ page contentType="text/xml; charset=KSC5601"%>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ps_rdr_1321_p.jsp
* ��� : ����ó�� �񱳴�󳻿� ����ȸ
* �ۼ����� : 2004-02-21
* �ۼ��� : ���ȣ
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ����
* ������ : ������
* �������� : 2009-05-04
* ������ϸ� : ps_rdr_1321_p.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    // dataset �ν��Ͻ� ����κ�
    PS_S_RDR_CMPROBJDataSet ds = (PS_S_RDR_CMPROBJDataSet)request.getAttribute("ds");  // request dataset
    
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
		
	for(int i=0; i<ds.publrdrcur.size(); i++)   {
		PS_S_RDR_CMPROBJPUBLRDRCURRecord publrdrcurRec = (PS_S_RDR_CMPROBJPUBLRDRCURRecord)ds.publrdrcur.get(i);
			
		rxw.add(resTemp, "rdr_no", publrdrcurRec.rdr_no); // ���ڹ�ȣ
		rxw.add(resTemp, "bonm", publrdrcurRec.bonm); // �����
		rxw.add(resTemp, "medinm", publrdrcurRec.medinm); // ��û��ü
		rxw.add(resTemp, "subsfrser_no", publrdrcurRec.subsfrser_no); // ����ȣ��
		rxw.add(resTemp, "rdr_nm", publrdrcurRec.rdr_nm); // ����
		rxw.add(resTemp, "paty_clsfcd", publrdrcurRec.paty_clsfcd); // ��ü����
		rxw.add(resTemp, "rdrtel_no", publrdrcurRec.rdrtel_no); // ��ȭ��ȣ
		rxw.add(resTemp, "rdrptph_no", publrdrcurRec.rdrptph_no); // �޴���
		rxw.add(resTemp, "dlvaddr", publrdrcurRec.dlvaddr + " " + publrdrcurRec.dlvdtlsaddr); // �ּ�
		rxw.add(resTemp, "sendmthd", publrdrcurRec.sendmthd); // �߼۹��
		rxw.add(resTemp, "recpclsf", publrdrcurRec.recpclsf); // ���뱸��
		rxw.add(resTemp, "rdroffinm", publrdrcurRec.rdroffinm); // �����
		rxw.add(resTemp, "rdrposi", publrdrcurRec.rdrposi); // ��å
		rxw.add(resTemp, "rdroffitel_no", publrdrcurRec.rdroffitel_no); // ������ȭ
		rxw.add(resTemp, "email", publrdrcurRec.email); // �̸���
		rxw.add(resTemp, "prn", publrdrcurRec.prn); // �ֹι�ȣ
		rxw.add(resTemp, "bidt", Util.convertS(publrdrcurRec.bidt + " "+ publrdrcurRec.lusoclsfcd)); // �������
	
        // ���ɺо�
        if (ds.intercur.size() > 0 ) {
            for(int j=0; j<ds.intercur.size(); j++) {
                PS_S_RDR_CMPROBJINTERCURRecord intercurRec = (PS_S_RDR_CMPROBJINTERCURRecord)ds.intercur.get(j);
                rxw.add(resTemp, "conccd", intercurRec.conccd);
            }
        } else {

        }

        // ������� ���
        if (ds.hobbycur.size() > 0 ) {
            for(int h=0; h<ds.hobbycur.size(); h++){
                PS_S_RDR_CMPROBJHOBBYCURRecord hobbycurRec = (PS_S_RDR_CMPROBJHOBBYCURRecord)ds.hobbycur.get(h);
                rxw.add(resTemp, "conccd", hobbycurRec.hbycd);
            }
        }else{

        }

        // ��û�� ����
		rxw.add(resTemp, "aplc_persflnm", publrdrcurRec.aplc_persflnm); // ����
		rxw.add(resTemp, "aplc_persoffinm", publrdrcurRec.aplc_persoffinm); // �����
		rxw.add(resTemp, "aplc_persposi", publrdrcurRec.aplc_persposi); // ��å
		rxw.add(resTemp, "aplc_perstel_no", publrdrcurRec.aplc_perstel_no); // ��ȭ��ȣ
        rxw.add(resTemp, "aplc_persptph_no", publrdrcurRec.aplc_persptph_no); // �޴���

        // û���� ����
		rxw.add(resTemp, "clamplflnm", publrdrcurRec.clamplflnm); // ����
		rxw.add(resTemp, "clamploffinm", publrdrcurRec.clamploffinm); // �����
		rxw.add(resTemp, "clamplposi", publrdrcurRec.clamplposi); // ��å
		rxw.add(resTemp, "clampltel_no", publrdrcurRec.clampltel_no); // ��ȭ��ȣ
		rxw.add(resTemp, "clamplptph_no", publrdrcurRec.clamplptph_no); // �޴���
		rxw.add(resTemp, "Clampladdr", publrdrcurRec.clampladdr+ " " +publrdrcurRec.clampldtlsaddr); // �ּ�

        // �������� ����
		rxw.add(resTemp, "acpntypecd", publrdrcurRec.acpntypecd+ "-" +publrdrcurRec.acpntypeclsf); // ��������
		rxw.add(resTemp, "linkyear", publrdrcurRec.linkyear); // ���Ῥ��
		rxw.add(resTemp, "sendyncd", publrdrcurRec.sendyncd); // �߼ۿ���
		rxw.add(resTemp, "alonpaycd", publrdrcurRec.alonpaycd); // ����ó��
		rxw.add(resTemp, "taxstmtexne", publrdrcurRec.taxstmtexne); // ��꼭
		rxw.add(resTemp, "amno", publrdrcurRec.amno); // �������
		rxw.add(resTemp, "mang_empno", publrdrcurRec.mang_empno); // �������
		rxw.add(resTemp, "taxstmtissudt", Util.convertS(publrdrcurRec.taxstmtissudt)); // �߱�����
		rxw.add(resTemp, "hdqtemp_no", publrdrcurRec.hdqtemp_no); // ������
		rxw.add(resTemp, "rdr_extnno", publrdrcurRec.rdr_extnno); // Ȯ���ȣ
		rxw.add(resTemp, "memo", publrdrcurRec.memo); // �޸�

        // �������� �׸��� ó��
        rxw.makeHugeStart(resTemp, "detailGrid");

        for(int k=0; k<ds.agreecur.size(); k++){
            PS_S_RDR_CMPROBJAGREECURRecord agreecurRec = (PS_S_RDR_CMPROBJAGREECURRecord)ds.agreecur.get(k);
            if(k == 0)
            {         
                //rxw.add_ColVal("isReadOnly");
                //Util.convertS(agreecurRec.getAgrmntdt());
                //������ �ʵ�� �ڵ� ����.
                rxw.makeRecordToBulkTitle(agreecurRec);
            }

            //������ �߰�.
            //rxw.add_ColVal(new StringBuffer().append(extnasincurRec.dlvaddr).append(" ").append(extnasincurRec.dlvdtlsaddr));
            //������ �ʵ� �ڵ�����.
            rxw.makeRecordToBulk(agreecurRec, false);
        }
        rxw.makeHugeEnd();

        // ���ʽ���
        String recppersnm = "";  // �����θ�
        String recpperszip= "";  // �����ο����ȣ
        String recppersaddr= ""; // ������ �ּ�+������ ���ּ�
        String senddt= "";       // �߼�����
        String sendclsf= "";     // �߼۱���
        String sendmthd= "";     // �߼۹��
        String memo= "";         // �޸�
        for(int m=0; m<ds.bonuscur.size(); m++){
            PS_S_RDR_CMPROBJBONUSCURRecord bonuscurRec = (PS_S_RDR_CMPROBJBONUSCURRecord)ds.bonuscur.get(m);
            recppersnm = bonuscurRec.recppersnm;// ����
            recpperszip = bonuscurRec.recpperszip; // �����ȣ
            recppersaddr = bonuscurRec.recppersaddr;// �ּ�+���ּ�
            senddt = bonuscurRec.senddt;// �߼�����
            sendclsf = bonuscurRec.sendclsf;//�߼۱���
            sendmthd = bonuscurRec.sendmthd;// �߼۹��
            memo = bonuscurRec.memo;
        }

        rxw.add(resTemp, "senddt", Util.convertS(senddt)); // �߼�����
        rxw.add(resTemp, "sendclsf", sendclsf); // �߼�����
        rxw.add(resTemp, "sendmthd1", sendmthd); // �߼۹��
        rxw.add(resTemp, "recppersnm", recppersnm); // ����
        rxw.add(resTemp, "recppersaddr", recppersaddr); // �ּ�
        rxw.add(resTemp, "memo1", memo); // �޸�

        // ���ʽ��� ��û���� ���
        if (ds.bonlistcur.size() > 0 ) {
            for(int q=0; q<ds.bonlistcur.size(); q++) {
               PS_S_RDR_CMPROBJBONLISTCURRecord bonlistcurRec = (PS_S_RDR_CMPROBJBONLISTCURRecord)ds.bonlistcur.get(q);
               rxw.add(resTemp, "bns_bookcd", bonlistcurRec.bns_bookcd); // �޸�
            }
        } else {
            
        }
    }
	rxw.flush(out);
%>
