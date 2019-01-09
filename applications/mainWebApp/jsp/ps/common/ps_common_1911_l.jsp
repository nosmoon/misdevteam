<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ps/comm_jsp/ps_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ps_common_1911_l.jsp
* 기능 : 지국 검색 목록
* 작성일자 : 2003-12-08
* 작성자 : 전현표
---------------------------------------------------------------------------------------------------%>

<%---------------------------------------------------------------------------------------------------
* 수정내역 : TrustForm 대응
* 수정자 : 황성진
* 수정일자 : 2009-02-10
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>
<%
	PS_L_BO_SRCHDataSet ds = (PS_L_BO_SRCHDataSet)request.getAttribute("ds");

	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	//rxw.makeDataToXml(ds, "curbolist", root, "branchGrid");
	//rxw.makeDataToBulk(ds, "curbolist", root, "branchGrid");
	rxw.makeHugeStart(root, "branchGrid", ds.curbolist.size());
	for(int i=0; i < ds.curbolist.size() ; i++)
	{
		PS_L_BO_SRCHCURBOLISTRecord curbolistRec = (PS_L_BO_SRCHCURBOLISTRecord)ds.curbolist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("tel_no1");
			rxw.add_ColVal("hptph_no");
			rxw.add_ColVal("baddr");
			rxw.add_ColVal("fax");
			rxw.add_ColVal("htel_no");
			rxw.add_ColVal("haddr");
			rxw.add_ColVal("status");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curbolistRec);
			
		}
		
		//데이터 추가.
		rxw.add_ColVal(new StringBuffer().append(curbolistRec.tel_no11).append("-").append(curbolistRec.tel_no12).append("-").append(curbolistRec.tel_no13));
		rxw.add_ColVal(new StringBuffer().append(curbolistRec.hptph_no1).append("-").append(curbolistRec.hptph_no2).append("-").append(curbolistRec.hptph_no3));
		rxw.add_ColVal(new StringBuffer().append(curbolistRec.boaddr).append(" ").append(curbolistRec.bodtlsaddr));
		rxw.add_ColVal(new StringBuffer().append(curbolistRec.fax1).append("-").append(curbolistRec.fax2).append("-").append(curbolistRec.fax3));
		rxw.add_ColVal(new StringBuffer().append(curbolistRec.htel_no1).append("-").append(curbolistRec.htel_no2).append("-").append(curbolistRec.htel_no3));
		rxw.add_ColVal(new StringBuffer().append(curbolistRec.hboaddr).append(" ").append(curbolistRec.hbodtlsaddr));
		rxw.add_ColVal(new StringBuffer().append(curbolistRec.oprenvclsfnm).append("/").append(curbolistRec.cntrstatnm).append("/").append(curbolistRec.bospcfclsfnm));
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curbolistRec, false);
		
	}
	rxw.makeHugeEnd();
	//System.out.println(rxw.getXml());
	rxw.flush(out);
%>
