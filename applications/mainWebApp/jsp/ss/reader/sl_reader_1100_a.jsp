<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>

<%---------------------------------------------------------------------------------------------------
* ���ϸ�     : sl_reader_1100_a.jsp
* ���       : ������������(�������� �ʱ�ȭ)
* �ۼ�����   : 2003-11-09
* �ۼ���     : �迵��
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* ��������	: TrustForm ����
* ������	: Ȳ����
* ��������	: 2009-03-11
* ������ϸ�: 
---------------------------------------------------------------------------------------------------%>
<%
	//  ���ڰ˻� �������κ��� �б��ϹǷ�, request�κ��� rdr_no ���� ��´�.
	String rdr_no = request.getParameter("rdr_no");
    String find_type = "";

    if( request.getParameter("find_type") != null ) {
      find_type = request.getParameter("find_type");
    }
    SL_E_READERINIDataSet ds = (SL_E_READERINIDataSet)request.getAttribute("ds");
    
  	//TrustForm ó��.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int useData = rxw.add(root, "useData", "");
	
	//1. ������.
	rxw.add(useData, "bocd", Util.getSessionParameterValue(request, "bocd", true));			//���� ���� script���� ���.
	rxw.add(useData, "find_type", find_type);												//onload�� ��ȸ���� �Ǵ�.
	rxw.add(useData, "rdr_no", rdr_no);														//onload�� ��ȸ�� ���.
	rxw.add(useData, "firstDlvdstccd", ds.dstcinfocur.size()>0 ? ((SL_E_READERINIDSTCINFOCURRecord)ds.dstcinfocur.get(0)).dstccd : "");
	rxw.add(useData, "firstMediUprc", ds.bomedicdcur.size()>0 ? ((SL_E_READERINIBOMEDICDCURRecord)ds.bomedicdcur.get(0)).subsuprc : 0);
	rxw.add(useData, "today", Util.getDate());
	rxw.add(useData, "rptvvalmm", Util.addMonth(ds.curryymm + "01", 1).substring(0, 6));
	
	//2. ds ��ü ������. bo_tel1
	rxw.makeDataToBulk(ds, useData, "dsData");
	
	//3. ���ڻ� ������ combo
	int detailArea = rxw.add(useData, "detailArea", "");
	
	//����. dstccd�ʵ带 label, value�� ��� ���. attribute: cdnm=dstcnm, teamcd=teamcd �� ������ �ִ� ����. �ϴ� xpath�� �����ϴ� ����� ����ϱ� ���� nodeset���� return.
	//"--" ���� ������ ��쿡�� "--"�� selected. �׷��� ������ ù��° selected.
	//rxw.makeDataToBulk(ds, "dstcinfocurRec", detailArea, "dlvdstccdHiddenCombo");
	int dlvdstccdHidden = rxw.add(detailArea, "dlvdstccdHiddenCombo", "");
	SL_E_READERINIDSTCINFOCURRecord dstcinfocurRec  = null;
	for(int i=0; i<ds.dstcinfocur.size(); i++){
		dstcinfocurRec = (SL_E_READERINIDSTCINFOCURRecord)ds.dstcinfocur.get(i);
		String code = dstcinfocurRec.dstccd;
        String name = dstcinfocurRec.dstccd;
        
        int item = rxw.add(dlvdstccdHidden, "item", "");
        rxw.add(item, "label", "<![CDATA[" +  name  + "]]>");
    	rxw.add(item, "value", "<![CDATA[" +  code  + "]]>");
    	rxw.add(item, "cdnm", "<![CDATA[" +  dstcinfocurRec.dstcnm  + "]]>");
    	rxw.add(item, "teamcd", "<![CDATA[" +  dstcinfocurRec.teamcd  + "]]>");
    }
	
	//�ּ��ڵ�(������ڵ�). label=addrnm, value=addrcd. attribute: cdnm=addrnm. �����׸� ������ ��ü ����.
	//"--" ���� ������ ��쿡�� "--"�� selected. �׷��� ������ ù��° selected.
	//rxw.makeDataToBulk(ds, "addrcdcur", detailArea, "dlvcdCombo");
	int searchDstc = rxw.add(detailArea, "dlvcdCombo", "");
	int item = rxw.add(searchDstc, "item", "");
	rxw.add(item, "label", "");
	rxw.add(item, "value", "");
	rxw.add(item, "cdnm", "");
	SL_E_READERINIADDRCDCURRecord addrcdcurRec = null;
    for(int i=0; i<ds.addrcdcur.size(); i++){
        addrcdcurRec = (SL_E_READERINIADDRCDCURRecord)ds.addrcdcur.get(i);
        String code = addrcdcurRec.addrcd;
        String name = addrcdcurRec.addrnm;
        
        item = rxw.add(searchDstc, "item", "");
        rxw.add(item, "label", "<![CDATA[" +  code+":"+name  + "]]>");
    	rxw.add(item, "value", "<![CDATA[" +  code  + "]]>");
    	rxw.add(item, "cdnm", "<![CDATA[" +  addrcdcurRec.addrnm  + "]]>");
    }
	
	//��ü���� (radio). default : "10". ������ ���þ���.
	//rxw.makeDataToList(ds, "paty_clsfcdcur", "cicdnm", "cicodeval", detailArea, "patyClsfcdRadio");
	rxw.makeDataToBulkList(ds, "paty_clsfcdcur", "cicdnm", "cicodeval", detailArea, "patyClsfcdRadio");
	
	//�ְ�����.
	//"--" ���� ������ ��쿡�� "--"�� selected. �׷��� ������ ù��° selected.
	//rxw.makeDataToList(ds, "resitypecdcur", "cicdnm", "cicodeval", "", "", detailArea, "resitypecdCombo");
	rxw.makeDataToBulkList(ds, "resitypecdcur", "cicdnm", "cicodeval", "", "", detailArea, "resitypecdCombo");
	
	//�ְű���.
	//"--" ���� ������ ��쿡�� "--"�� selected. �׷��� ������ ù��° selected.
	rxw.makeDataToBulkList(ds, "resiclsfcdcur", "cicdnm", "cicodeval", "", "", detailArea, "resiclsfcdCombo");
	
	//��޹�� (radio). default : "10" ������ ���þ���.
	rxw.makeDataToBulkList(ds, "dlvmthdcdcur", "cicdnm", "cicodeval", detailArea, "dlvmthdcdRadio");
	
	//�������
	//"--" ���� ������ ��쿡�� "--"�� selected. �׷��� ������ ù��° selected.
	rxw.makeDataToBulkList(ds, "thrwplaccdcur", "cicdnm", "cicodeval", "", "", detailArea, "thrwPlacCombo");
	
	//����������޸�ü 
	//"--" ���� ������ ��쿡�� "--"�� selected. �׷��� ������ ù��° selected.
	int medicd = rxw.add(detailArea, "medicdCombo", "");
	SL_E_READERINIBOMEDICDCURRecord bomedicdcurRec = null;
	for(int i=0; i<ds.bomedicdcur.size(); i++){
		bomedicdcurRec = (SL_E_READERINIBOMEDICDCURRecord)ds.bomedicdcur.get(i);
		String code = bomedicdcurRec.medicd;
        String name = bomedicdcurRec.cicdnm;
        int subsuprc = bomedicdcurRec.subsuprc;
        
        item = rxw.add(medicd, "item", "");
        rxw.add(item, "label", "<![CDATA[" +  name  + "]]>");
    	rxw.add(item, "value", "<![CDATA[" +  code  + "]]>");
    	rxw.add(item, "subsuprc", "<![CDATA[" +  subsuprc  + "]]>");
    	rxw.add(item, "medinm", "<![CDATA[" +  name  + "]]>");
    }
	
	//����μ�.
	//"--" ���� ������ ��쿡�� "--"�� selected. �׷��� ������ ù��° selected.
	rxw.makeDataToBulkList(ds, "freeclsfcdcur", "cicdnm", "cicodeval", "", "", detailArea, "rptvfreeclsfCombo");
	
	//���ݹ��.
	//"--" ���� ������ ��쿡�� "--"�� selected. �׷��� ������ ù��° selected.
	rxw.makeDataToBulkList(ds, "clamtmthdcdcur", "cicdnm", "cicodeval", detailArea, "clamtmthdcdCombo");
	
	//Ȯ������. default : "30" ������ ù��°
	rxw.makeDataToBulkList(ds, "rdr_extntypecdcur", "cicdnm", "cicodeval", detailArea, "rdrExtntypecdCombo");
	
	//��������
	//"--" ���� ������ ��쿡�� "--"�� selected. �׷��� ������ ù��° selected.
	rxw.makeDataToBulkList(ds, "suspresncdcur", "cicdnm", "cicodeval", "", "", detailArea, "rptvSuspresncdCombo");
	
	//4. ������ȸ������ combo
	int searchArea = rxw.add(useData, "searchArea", "");
	
	//�����˻��� ����. ���� ���� ������ ���. �ʵ���� �޶� ��ü����.
	//"--" ���� ������ ��쿡�� "--"�� selected. �׷��� ������ ù��° selected.
	//rxw.makeDataToBulk(ds, "dstcinfocurRec", searchArea, "searchDstcCombo");
	int dlvcd = rxw.add(searchArea, "dstcCombo", "");
	dstcinfocurRec  = null;
	for(int i=0; i<ds.dstcinfocur.size(); i++){
		dstcinfocurRec = (SL_E_READERINIDSTCINFOCURRecord)ds.dstcinfocur.get(i);
		String code = dstcinfocurRec.dstccd;
        String name = dstcinfocurRec.dstccd;
        
        item = rxw.add(dlvcd, "item", "");
        rxw.add(item, "label", "<![CDATA[" +  name+":"+dstcinfocurRec.dstcnm  + "]]>");
    	rxw.add(item, "value", "<![CDATA[" +  code  + "]]>");
    	rxw.add(item, "cdnm", "<![CDATA[" +  dstcinfocurRec.dstcnm  + "]]>");
    	rxw.add(item, "teamcd", "<![CDATA[" +  dstcinfocurRec.teamcd  + "]]>");
    }
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>

