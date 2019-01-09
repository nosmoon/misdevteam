<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 	 : sl_commun_2630_s.jsp
* 기능 	 	 : 판매지국-통신실 아파트투입 현황조사 및 등록 아파트구조보기
* 작성일자 	 : 2004-03-02
* 작성자 	 : 배창희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 황성진
* 수정일자	: 2009-04-14
* 백업파일명: 
---------------------------------------------------------------------------------------------------%>
<%

    // dataset 인스턴스 선언부분
    SL_S_COMM_APT_STRUCTDataSet ds = (SL_S_COMM_APT_STRUCTDataSet)request.getAttribute("ds");  // request dataset

	int col = Integer.parseInt(ds.getFlorcnt());
	int row = Integer.parseInt(ds.getFlor_houscnt());
	int li_col = row;
	int li_widthVaule = (li_col*35)+35; // (컬럼겟수*컬럼사이즈)+층을 나타내는 열사이즈

	//건물형태 구성을 위해 비어있는 호수를 가져온다
	String KubunVaue = "";
	for(int kk=0 ; kk < ds.apttypecur.size() ; kk++) {
		SL_S_COMM_APT_STRUCTAPTTYPECURRecord rec = (SL_S_COMM_APT_STRUCTAPTTYPECURRecord)ds.apttypecur.get(kk);
		KubunVaue = KubunVaue+"*"+rec.getTotalrowcol();
	}
	
	//TrustForm 처리.
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTemp = rxw.add(root, "resTemp", "");
	
	//form 정보
	int housThrwForm = rxw.add(resTemp, "housThrwForm", "");
	rxw.add(housThrwForm, "bocd", request.getParameter("bocd"));
	
	int thrwHeadForm = rxw.add(resTemp, "thrwHeadForm", "");
	rxw.add(thrwHeadForm, "pyong", ds.getPyong());		//평형
	rxw.add(thrwHeadForm, "hoscnt", ds.getHoscnt());	//세대수
	rxw.add(thrwHeadForm, "mvindt", ds.getMvindt());	//입주일자
	/*StringBuffer sb = new StringBuffer("");				//입주일자
	String mvindt = ds.getMvindt();
	if(mvindt!=null && !mvindt.equals(""))
		//sb.append(mvindt.substring(0,4)).append("/").append(mvindt.substring(4,6)).append("/").append(mvindt.substring(6));
	rxw.add(thrwHeadForm, "mvindt", sb);*/
	
	//grid 정보
	int housThrwGrid = rxw.add(resTemp, "housThrwGrid", "");
	for(int i=1; i<=col; i++)
	{
		int record = rxw.add(housThrwGrid, "record", "", "floor=\""+(col-i+1)+"\"");
		for(int j=0; j<=row; j++)
		{
			if(j==0)
				rxw.add(record, "floor", (col-i+1) + "층");
			else
			{
				DecimalFormat dFormat = new DecimalFormat("0000");
				String ii = dFormat.format(col-i+1);
				String jj = dFormat.format(j);
				String hh = ii+","+jj;
				int checkInt = KubunVaue.lastIndexOf(hh);
				//String val = (String)ht.get(Util.lpad(col-i+1)+Util.lpad(j));	//조사결과값은 설정하지 않는다.
				
				rxw.add(record, "h_" + Util.lpad(j), "", new StringBuffer().append("hid=\"h_").append(Util.lpad(col-i+1)).append(Util.lpad(j)).append("\" exist=").append(checkInt>0 ? "\"false\"" : "\"true\"").toString());
			}
		}
	}
	
	rxw.flush(out);
%>
