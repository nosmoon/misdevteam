<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ�   : ps_code_1131_s.jsp
* ���     : ��ü �󼼳���
* �ۼ����� : 2004-09-21
* �ۼ���   : ����
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* �������� : TrustForm ���� ������ ����.
* ������ : ������
* �������� : 2009-02-12
* ������ϸ� : ps_code_1106_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
    // dataset �ν��Ͻ� ����κ�
    PS_S_SEPBK_INFODataSet ds = (PS_S_SEPBK_INFODataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	
	int root = RwXmlWrapper.rootNodeID;
	int acctTemp = rxw.makeParentNode(root, "dataTemp");
	
	// ��ȸ ���.
	rxw.makeDataToBulk(ds, "sepbkinfo", acctTemp, "detailData");
	
	rxw.flush(out);
	
	// data�� ���� ��� ó��. �߰� �ʿ�.
	    
	// page ó��. �߰� �ʿ�.

/*
    // ���������� dataset
    PS_S_SEPBK_INFOSEPBKINFORecord sepbkinfoRec = null;
    boolean  sepbkChk = false;            //��ü ���� ����üũ

    if (ds.sepbkinfo.size() > 0) {
        sepbkinfoRec = (PS_S_SEPBK_INFOSEPBKINFORecord)ds.sepbkinfo.get(0);
        sepbkChk  =  true;
    }
*/    
/*    
    System.out.println("=================== sepbkinfoRec.sep_bookcdnm =========: " + sepbkinfoRec.sep_bookcdnm );
    System.out.println("=================== sepbkinfoRec.medicd =========: " + sepbkinfoRec.medicd );
    System.out.println("=================== sepbkinfoRec.mediser_no =========: " + sepbkinfoRec.mediser_no );
    System.out.println("=================== sepbkinfoRec.medi_clsf =========: " + sepbkinfoRec.medi_clsf );
    System.out.println("=================== sepbkinfoRec.issuclsf =========: " + sepbkinfoRec.issuclsf );
    System.out.println("=================== sepbkinfoRec.basiyymm =========: " + sepbkinfoRec.basiyymm );
    System.out.println("=================== sepbkinfoRec.uprc =========: " + sepbkinfoRec.uprc );
    System.out.println("=================== sepbkinfoRec.subsuprc =========: " + sepbkinfoRec.subsuprc );
    System.out.println("=================== sepbkinfoRec.dcrate =========: " + sepbkinfoRec.dcrate );
    System.out.println("=================== sepbkinfoRec.contclascd =========: " + sepbkinfoRec.contclascd );
    System.out.println("=================== sepbkinfoRec.author =========: " + sepbkinfoRec.author );
    System.out.println("=================== sepbkinfoRec.type =========: " + sepbkinfoRec.type );
    System.out.println("=================== sepbkinfoRec.std =========: " + sepbkinfoRec.std );
    System.out.println("=================== sepbkinfoRec.page =========: " + sepbkinfoRec.page );
    System.out.println("=================== sepbkinfoRec.covermodl =========: " + sepbkinfoRec.covermodl );
    System.out.println("=================== sepbkinfoRec.reg_dt =========: " + sepbkinfoRec.reg_dt );
    System.out.println("=================== sepbkinfoRec.extdtms =========: " + sepbkinfoRec.extdtms );
    System.out.println("=================== sepbkinfoRec.absenceyn =========: " + sepbkinfoRec.absenceyn );
    System.out.println("=================== sepbkinfoRec.absencedt =========: " + sepbkinfoRec.absencedt );
    System.out.println("=================== sepbkinfoRec.absenceprocdt =========: " + sepbkinfoRec.absenceprocdt );
    System.out.println("=================== sepbkinfoRec.bundunit =========: " + sepbkinfoRec.bundunit );
    System.out.println("=================== sepbkinfoRec.unitmidlqunt =========: " + sepbkinfoRec.unitmidlqunt );
    System.out.println("=================== sepbkinfoRec.pjbasimidlqunt =========: " + sepbkinfoRec.pjbasimidlqunt );
    System.out.println("=================== sepbkinfoRec.sericd =========: " + sepbkinfoRec.sericd );
    System.out.println("=================== sepbkinfoRec.endbasiyymm =========: " + sepbkinfoRec.endbasiyymm );
    System.out.println("=================== sepbkinfoRec.memo =========: " + sepbkinfoRec.memo );
    System.out.println("=================== sepbkinfoRec.sep_bookcd =========: " + sepbkinfoRec.sep_bookcd );
    System.out.println("=================== sepbkinfoRec.cmpycd =========: " + sepbkinfoRec.cmpycd );
    System.out.println("=================== sepbkinfoRec.medicd =========: " + sepbkinfoRec.medicd );
*/    
%>

