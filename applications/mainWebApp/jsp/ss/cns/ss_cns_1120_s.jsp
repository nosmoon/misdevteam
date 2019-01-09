<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_cns_1120_s.jsp
* 기능 : 상담원-이사-상세
* 작성일자 : 2004-07-15
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응.
* 수정자   : 김용욱
* 수정일자 : 2009-04-02
* 백업파일명 : ss_cns_1120_s.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
    SS_S_MOVM_RDRDataSet ds = (SS_S_MOVM_RDRDataSet)request.getAttribute("ds");
    StringBuffer mediqty = new StringBuffer("");
	for(int i=0; i<ds.curmediqty.size(); i++){
		SS_S_MOVM_RDRCURMEDIQTYRecord curmediqtyRec = (SS_S_MOVM_RDRCURMEDIQTYRecord)ds.curmediqty.get(i);
		mediqty.append(curmediqtyRec.medinm);
		mediqty.append("- [ ");
		mediqty.append(curmediqtyRec.qty);
		mediqty.append(" ] ");
	}
	ArrayList botel = getTokens(ds.getTrfsbo_tel(), "-");
	ArrayList bo2tel = getTokens(ds.getAcptbo_tel(), "-");

	String telno1 = "";
	String telno2 = "";
	String telno3 = "";
	String telno12 = "";
	String telno22 = "";
	String telno32 = "";
	try{
		telno1 = (String)botel.get(0);
		telno2 = (String)botel.get(1);
		telno3 = (String)botel.get(2);
		telno12 = (String)bo2tel.get(0);
		telno22 = (String)bo2tel.get(1);
		telno32 = (String)bo2tel.get(2);
	}catch(Exception e){
		telno1 = "";
		telno2 = "";
		telno3 = "";
		telno12 = "";
		telno22 = "";
		telno32 = "";	
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTemp, "path_id",  ds.getAplcpathnm()); //신청경로
	rxw.add(resTemp, "mediqty_id",  mediqty.toString()); //매체/부수
	rxw.add(resTemp, "bocnfm_id",  ds.getTrsfbocnfmyn()); //인계지국 확인여부
	rxw.add(resTemp, "bocmfmtm_id",  Util.Timestamp2Str(ds.getTrsfbocnfmdt_tm(),"yyyy-MM-dd' 'HH:mm:ss")); //인계지국 일시
	rxw.add(resTemp, "bo2cnfm_id",  Util.convertNull(ds.getAcptbocnfmyn(),"N")); //인수지국 확인여부
	rxw.add(resTemp, "bo2cmfmtm_id",  Util.Timestamp2Str(ds.getAcptbocnfmdt_tm(),"yyyy-MM-dd' 'HH:mm:ss")); //인수지국 일시
	rxw.add(resTemp, "cns_empnm_id",  ds.getCns_empnm()); //상담원 이름
	rxw.add(resTemp, "cnscnfmtm_id",  Util.Timestamp2Str(ds.getCns_empcnfmdt(),"yyyy-MM-dd' 'HH:mm:ss")); //상담원 일시
	rxw.add(resTemp, "telno1",  telno1); //지국전화번호1
	rxw.add(resTemp, "telno2",  telno2); //지국전화번호2
	rxw.add(resTemp, "telno3",  telno3); //지국전화번호3
	rxw.add(resTemp, "telno12",  telno12); //이사지 정보 지국전화번호1
	rxw.add(resTemp, "telno22",  telno22); //이사지 정보 지국전화번호2
	rxw.add(resTemp, "telno32",  telno32); //이사지 정보 지국전화번호3	
	rxw.add(resTemp, "cns_empcnfmyn",  ds.getCns_empcnfmyn()); //상담원 확인여부위해서.
	
	rxw.makeDataToBulk(ds, resTemp, "detailData");
	
	rxw.flush(out);
%>