<%@ page contentType="text/xml;charset=euc-kr"%>
<%@ page import="somo.framework.expt.*, 
				 chosun.ciis.co.post.ds.*,
				 chosun.ciis.co.post.rec.*,
				 java.util.*,
				 chosun.ciis.co.lib.xi.RwXmlWrapper" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : ss_common_1154_l.jsp
* 기능 		 : 공통 우편번호 검색을 통해 조회된 목록
* 작성일자 	 : 2004-03-05
* 작성자 	 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 	 : TrustForm 대응
* 수정자 	 : 황성진
* 수정일자 	 : 2009-02-10
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
    // getting dataset
    CO_L_ZIP_ALLDataSet ds = (CO_L_ZIP_ALLDataSet)request.getAttribute("ds");

    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	
	rxw.makeHugeStart(root, "gridZip", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		CO_L_ZIP_ALLCURCOMMLISTRecord rec = (CO_L_ZIP_ALLCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
		if(i == 0)
		{
			rxw.add_ColVal("zip1");
			rxw.add_ColVal("zip2");
			rxw.add_ColVal("addrFull");
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(rec);
		}
		
		//데이터 추가.
		String zip1 = "";
		String zip2 = "";
		StringBuffer sb = new StringBuffer(rec.addr);
		if(rec.zip != null & !"".equals(rec.zip) & rec.zip.length() >= 6){
        	zip1 = rec.zip.substring(0, 3);
        	zip2 = rec.zip.substring(3, 6);
        }
		if(!"".equals(rec.bgnn)){
        	sb.append(" "+rec.bgnn);
        }
        if(!"".equals(rec.endn)){
        	sb.append("~"+rec.endn);
        }
		rxw.add_ColVal(zip1);
		rxw.add_ColVal(zip2);
		rxw.add_ColVal(sb);
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(rec, false);
	}
	rxw.makeHugeEnd();

	rxw.flush(out);

%>

