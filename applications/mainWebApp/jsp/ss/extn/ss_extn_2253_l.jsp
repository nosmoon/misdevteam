<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_extn_2280_l.jsp
* 기능 : 확장현황-일괄확장-리스트
* 작성일자 : 2011-04-04
* 작성자 : 김태희
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역 :
* 수정자   : 
* 수정일자 :
* 백업파일명 :
---------------------------------------------------------------------------------------------------%>

<%
SS_L_BOCLOS_2DataSet ds = (SS_L_BOCLOS_2DataSet)request.getAttribute("ds");
  int extnListCount = 5;	// 한 화면당 리스트 항목 수
    
	RwXmlWrapper rxw = new RwXmlWrapper();
   
  int root = RwXmlWrapper.rootNodeID;
  int acctTemp = rxw.makeParentNode(root, "gridData");
  int dataSet = 0;
	
	dataSet = rxw.add(acctTemp, "listGrid", "");

	for(int i=0; i < ds.curcommlist.size() ; i++)
	{
		SS_L_BOCLOS_2CURCOMMLISTRecord curcommlistRec = (SS_L_BOCLOS_2CURCOMMLISTRecord)ds.curcommlist.get(i);
		//title 추가.
		//if(i == 0) {	
			int record = rxw.add(dataSet, "record", "");						
			rxw.add(record,"deptnm",                curcommlistRec.deptnm);
			rxw.add(record,"deptcd",                curcommlistRec.deptcd);
			rxw.add(record,"partnm",                curcommlistRec.partnm);
			rxw.add(record,"partcd",                curcommlistRec.partcd);
			rxw.add(record,"areanm",                curcommlistRec.areanm);
			rxw.add(record,"areacd",                curcommlistRec.areacd);
			rxw.add(record,"bonm",                  curcommlistRec.bonm);
			rxw.add(record,"bocd",                  curcommlistRec.bocd);
			rxw.add(record,"oprenvclsfcd",          curcommlistRec.oprenvclsfcd);
			rxw.add(record,"sellnetclsf",           curcommlistRec.sellnetclsf);
			rxw.add(record,"dstccd",                curcommlistRec.dstccd);
			rxw.add(record,"rdr_extnaplc",          curcommlistRec.rdr_extnaplc);
			rxw.add(record,"rdr_extnemp",           curcommlistRec.rdr_extnemp);
			rxw.add(record,"rdr_extnstaf",          curcommlistRec.rdr_extnstaf);
			rxw.add(record,"rdr_extnrdr_movm",      curcommlistRec.rdr_extnrdr_movm);
			rxw.add(record,"rdr_extnhdqt",          curcommlistRec.rdr_extnhdqt);
			rxw.add(record,"rdr_extnexg",           curcommlistRec.rdr_extnexg);
			rxw.add(record,"rdr_extncnvs",          curcommlistRec.rdr_extncnvs);
			rxw.add(record,"rdr_extnetc",           curcommlistRec.rdr_extnetc);
			rxw.add(record,"rdr_extnrate",          curcommlistRec.rdr_extnrate);
			rxw.add(record,"suspmovm",              curcommlistRec.suspmovm);
			rxw.add(record,"susprefu",              curcommlistRec.susprefu);
			rxw.add(record,"suspothnwsp",           curcommlistRec.suspothnwsp);
			rxw.add(record,"suspetc",               curcommlistRec.suspetc);
			rxw.add(record,"suspetc1",              curcommlistRec.suspetc1);
			rxw.add(record,"suspetc2",              curcommlistRec.suspetc2);
			rxw.add(record,"suspetc3",              curcommlistRec.suspetc3);
			rxw.add(record,"suspetc4",              curcommlistRec.suspetc4);
			rxw.add(record,"susprate",              curcommlistRec.susprate);
			rxw.add(record,"suspaplc",              curcommlistRec.suspaplc);
			rxw.add(record,"suspemp",               curcommlistRec.suspemp);
			rxw.add(record,"suspstaf",              curcommlistRec.suspstaf);
			rxw.add(record,"susprdr_movm",          curcommlistRec.susprdr_movm);
			rxw.add(record,"susphdqt",              curcommlistRec.susphdqt);
			rxw.add(record,"suspexg",               curcommlistRec.suspexg);
			rxw.add(record,"suspcnvsrdr_extn",      curcommlistRec.suspcnvsrdr_extn);
			rxw.add(record,"suspetcrdr_extn",       curcommlistRec.suspetcrdr_extn);
			rxw.add(record,"thmmsendqty",           curcommlistRec.thmmsendqty);
			rxw.add(record,"thmmvalqty",            curcommlistRec.thmmvalqty);
			rxw.add(record,"aftcnt1",               curcommlistRec.aftcnt1);
			rxw.add(record,"aftcnt2",               curcommlistRec.aftcnt2);
			rxw.add(record,"aftcnt3",               curcommlistRec.aftcnt3);
			rxw.add(record,"aftcnt4",               curcommlistRec.aftcnt4);
			rxw.add(record,"aftcnt5",               curcommlistRec.aftcnt5);
			rxw.add(record,"aftcnt6",               curcommlistRec.aftcnt6);
			rxw.add(record,"excsaftcnt6",           curcommlistRec.excsaftcnt6);
			rxw.add(record,"aptqty",                curcommlistRec.aptqty);
			rxw.add(record,"villaqty",              curcommlistRec.villaqty);
			rxw.add(record,"housqty",               curcommlistRec.housqty);
			rxw.add(record,"offi_roomqty",          curcommlistRec.offi_roomqty);
			rxw.add(record,"shopqty",               curcommlistRec.shopqty);
			rxw.add(record,"etcqty",                curcommlistRec.etcqty);
			rxw.add(record,"pub_infonwsp",          curcommlistRec.pub_infonwsp);
			rxw.add(record,"hdqt_dntnwsp",          curcommlistRec.hdqt_dntnwsp);
			rxw.add(record,"bodntnwsp",             curcommlistRec.bodntnwsp);
			rxw.add(record,"frc_thrwnwsp",          curcommlistRec.frc_thrwnwsp);
			rxw.add(record,"etcfreenwsp",           curcommlistRec.etcfreenwsp);
			rxw.add(record,"resvnwsp",              curcommlistRec.resvnwsp);
			rxw.add(record,"cupn",                  curcommlistRec.cupn);
			rxw.add(record,"thmmno_valqty",         curcommlistRec.thmmno_valqty);
			rxw.add(record,"thmmqty",               curcommlistRec.thmmqty);
			rxw.add(record,"nowun_recpqty",         curcommlistRec.nowun_recpqty);
			rxw.add(record,"medaqty",               curcommlistRec.medaqty);
			rxw.add(record,"re_freeqty",            curcommlistRec.re_freeqty);
			rxw.add(record,"lossqty",               curcommlistRec.lossqty);
			rxw.add(record,"ppymqty",               curcommlistRec.ppymqty);
			rxw.add(record,"temp_stopqty",          curcommlistRec.temp_stopqty);
			rxw.add(record,"misu",                  curcommlistRec.misu);
			//나머지 필드는 자동 생성.
			//rxw.makeRecordToBulkTitle(curcommlistRec);
		//} 
		
		//나머지 필드 자동생성.
		//rxw.makeRecordToBulk(curcommlistRec, false);
	}
	
	//rxw.makeHugeEnd();
    
	rxw.flush(out);

  // data가 없을 경우 처리. 추가 필요.
        
  // page 처리. 추가 필요.
%>



