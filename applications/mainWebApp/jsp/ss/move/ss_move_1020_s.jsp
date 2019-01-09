<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* ���ϸ� : ss_move_1020_s.jsp
* ��� : �̻絶��-��û��Ȳ-��
* �ۼ����� : 2004-01-06
* �ۼ��� : ��뼷
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* �������� :TrustForm ���� ������ ����.
* ������ : ����
* �������� : 2009-03-12
* ������ϸ� : ss_move_1020_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_MOVM_RDRDataSet ds = (SS_S_MOVM_RDRDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	int accTemp = rxw.makeParentNode(root, "dataTemp");
	rxw.makeDataToBulk(ds, accTemp, "detailInfo");
	
	String busu = "";
	String tempBocd = "";
	 
	for(int i=0; i<ds.curmediqty.size(); i++){
		SS_S_MOVM_RDRCURMEDIQTYRecord curmediqtyRec = (SS_S_MOVM_RDRCURMEDIQTYRecord)ds.curmediqty.get(i);
		
		busu = busu + curmediqtyRec.medinm +" - [ "+ curmediqtyRec.qty + " ] ";
	}
	
	if (ds.getAcptbocnfmyn().equals("Y")){
	   tempBocd = ds.getAcptbocd();
	}else{
	   tempBocd = ds.getTrsfbocd();
  	}
	
	rxw.add(accTemp, "busu", busu); //��ü,�μ�
	rxw.add(accTemp, "rdrtel", Util.getChainStr(ds.getRdrtel_no1(),ds.getRdrtel_no2(),ds.getRdrtel_no3(),"-")); //�������� ��ȭ��ȣ
	rxw.add(accTemp, "rdrptph", Util.getChainStr(ds.getRdrptph_no1(),ds.getRdrptph_no2(),ds.getRdrptph_no3(),"-")); //�������� �޴�����ȣ
	//rxw.add(accTemp, "zip", "[" + Util.FormatZip(ds.getZip()) + "]" + ds.getAddr() + ds.getDtlsaddr()); //�������� ���ּ�
	rxw.add(accTemp, "zip", "[" + ds.getZip() + "]" + ds.getAddr() + ds.getDtlsaddr()); //�������� ���ּ�
	rxw.add(accTemp, "movmtel", Util.getChainStr(ds.getMovmtel_no1(),ds.getMovmtel_no2(),ds.getMovmtel_no3(),"-")); //�̻������� ��ȭ��ȣ
	//rxw.add(accTemp, "Movmzip", "[" + Util.FormatZip(ds.getMovmzip()) + "]" + ds.getMovmaddr() + ds.getMovmdtlsaddr()); //�̻������� ����ּ�
	rxw.add(accTemp, "Movmzip", "[" + ds.getMovmzip() + "]" + ds.getMovmaddr() + ds.getMovmdtlsaddr()); //�̻������� ����ּ�
	rxw.add(accTemp, "trsfbocnfmdt_tm", Util.Timestamp2Str(ds.getTrsfbocnfmdt_tm(),"yyyy-MM-dd' 'HH:mm:ss")); //�ΰ������Ͻ�
	rxw.add(accTemp, "acptbocnfmdt_tm", Util.Timestamp2Str(ds.getAcptbocnfmdt_tm(),"yyyy-MM-dd' 'HH:mm:ss")); //�μ������Ͻ�
	rxw.add(accTemp, "cns_empcnfmdt", Util.Timestamp2Str(ds.getCns_empcnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); //�����Ͻ�
	rxw.add(accTemp, "bocd", tempBocd); //bocd���簪 �����´�. 
	rxw.add(accTemp, "cs_cns_empcnfmdt", Util.Timestamp2Str(ds.getCs_cns_empcnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); //�����Ͻ�
	rxw.flush(out);
%>
