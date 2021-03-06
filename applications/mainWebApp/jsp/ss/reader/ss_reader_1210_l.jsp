<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_reader_1210_l.jsp
* 기능 : 독자현황-VacationStop 신청-조회목록
* 작성일자 : 2004-01-16
* 작성자 : 고윤홍
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :TrustForm 대응 구조로 변경.
* 수정자 : 김용욱
* 수정일자 : 2009-03-04
* 백업파일명 : ss_reader_1210_l.jsp_org
---------------------------------------------------------------------------------------------------%>
<%
	SS_L_VSDataSet ds = (SS_L_VSDataSet)request.getAttribute("ds");
    //int moveListCount = 5;	// 한 화면당 리스트 항목 수
    int moveListCount = 5000;
	RwXmlWrapper rxw = new RwXmlWrapper();
    
    int root = RwXmlWrapper.rootNodeID;
    int acctTemp = rxw.makeParentNode(root, "dataTemp");
    // 조회 결과.
    rxw.add(acctTemp, "totalCount", Util.comma(ds.getTotalcnt()));
    
  	//record 개체를 그대로 사용할 수 없고 가공이 필요하므로 makeDataToBulk를 사용하지 않고 아래와 같이 처리.
	rxw.makeHugeStart(acctTemp, "listGrid", ds.curcommlist.size());
	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_VSCURCOMMLISTRecord curcommlistRec = (SS_L_VSCURCOMMLISTRecord)ds.curcommlist.get(i);
		
		//title 추가.
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
			
			//나머지 필드는 자동 생성.
			rxw.makeRecordToBulkTitle(curcommlistRec);
		}

		//데이터 추가.
		rxw.add_ColVal(curcommlistRec.dlvaddr + curcommlistRec.dlvdtlsaddr);
		rxw.add_ColVal("현재");
		rxw.add_ColVal("배달지");
		
		if("Y".equals(curcommlistRec.bocnfmyn)){
			rxw.add_ColVal("확인");
		}else if("N".equals(curcommlistRec.bocnfmyn)){
			rxw.add_ColVal("미확인");
		}
		
		//Vacation Stop 일 경우
		if("".equals(Integer.toString(curcommlistRec.clsfcd)) || "10".equals(Integer.toString(curcommlistRec.clsfcd))){
			rxw.add_ColVal(curcommlistRec.dlvaddr + curcommlistRec.dlvdtlsaddr);
			rxw.add_ColVal(curcommlistRec.areanm);
			rxw.add_ColVal(curcommlistRec.bonm);
			if("Y".equals(curcommlistRec.bocnfmyn)){
				rxw.add_ColVal("확인");
			}else if("N".equals(curcommlistRec.bocnfmyn)){
				rxw.add_ColVal("미확인");
			}
			//rxw.add_ColVal(curcommlistRec.bocnfmyn);
		}//V-Stop + 휴가지배달일 경우
		else if("20".equals(Integer.toString(curcommlistRec.clsfcd))){
			rxw.add_ColVal(curcommlistRec.vaca_areaaddr + curcommlistRec.vaca_areadtlsaddr);
			rxw.add_ColVal(curcommlistRec.vaca_areaareanm);
			rxw.add_ColVal(curcommlistRec.vaca_areabonm);
			if("Y".equals(curcommlistRec.vaca_areadlvofficnfmyn)){
				rxw.add_ColVal("확인");
			}else if("N".equals(curcommlistRec.vaca_areadlvofficnfmyn)){
				rxw.add_ColVal("미확인");
			}
			//rxw.add_ColVal(curcommlistRec.vaca_areadlvofficnfmyn);
		}//V-Stop + 특정일 배달일 경우
		else if("30".equals(Integer.toString(curcommlistRec.clsfcd))){
			rxw.add_ColVal(Util.convertS(curcommlistRec.spcfdlvdt));
			rxw.add_ColVal("");
			rxw.add_ColVal("");
			rxw.add_ColVal("");
		}
		
		//나머지 필드 자동생성.
		rxw.makeRecordToBulk(curcommlistRec, false);
		
	}
	rxw.makeHugeEnd();
    
	rxw.flush(out);
%>