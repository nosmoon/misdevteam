<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_admin_1000_a.jsp
* 기능 : 관리자-공통코드-초기화면
* 작성일자 : 2004-03-09
* 작성자 : 김대섭
---------------------------------------------------------------------------------------------------%>
<%---------------------------------------------------------------------------------------------------
* 수정내역	: TrustForm 대응
* 수정자	: 권정윤
* 수정일자	: 2009-04-01
* 백업파일명: ss_admin_1000_a.jsp.bak
---------------------------------------------------------------------------------------------------%>
<%
	CO_L_CDV_INITDataSet ds = (CO_L_CDV_INITDataSet)request.getAttribute("ds");

	String time1 = (String)request.getAttribute("SVR Entry");
	String time11 = (String)request.getAttribute("SVR Done");	

	String time2 = "\nJSP Entry \t : "+ getTime();
	
	System.out.println("=====JSP ENTRY TIME======: " + time1);
		
    int cdvListCount = 13;	// 한 화면당 리스트 항목 수
    applySession = true;	// 세션 적용 여부
    
  	//TrustForm 처리 시작
    RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int initData = rxw.add(root, "initTemp", "");
	
	//rxw.add(initData, "defaultDate", Util.getDate()); // 오늘날짜
	
	rxw.makeDataToList(ds, "curcommlist", "cicdnm", "ciymgbcd", "전체", "", initData, "gubunCombo"); // 업무구분
    String Temp_1 = "\nMEM(Free/TOT/MAX) : " + (Runtime.getRuntime().freeMemory()/(1024*1024))
    		      + " / " + (Runtime.getRuntime().totalMemory()/(1024*1024))
    		      + " / " + (Runtime.getRuntime().maxMemory()/(1024*1024));
    
	time2 += "\nXRW OUT \t : "+ getTime();
	rxw.add(initData, "defaultDate", time1 + ds.timeCheck + time11 + time2 + Temp_1); // 시간체크
	System.out.println("=====XRW OUT TIME======: " + time2);
	
	rxw.flush(out);	
%>

<%! 
private String getTime() {

java.util.Calendar systime = java.util.Calendar.getInstance();
                StringBuffer sb = new StringBuffer();
                sb.append(systime.get(java.util.Calendar.YEAR));
                sb.append("-");
                sb.append(systime.get(java.util.Calendar.MONTH));
                sb.append("-");
                sb.append(systime.get(java.util.Calendar.DAY_OF_MONTH));
                sb.append(" ");
                sb.append(systime.get(java.util.Calendar.HOUR_OF_DAY));
                sb.append(":");
                sb.append(systime.get(java.util.Calendar.MINUTE));
                sb.append(":");
                sb.append(systime.get(java.util.Calendar.SECOND));
                sb.append(".");
                sb.append(systime.get(java.util.Calendar.MILLISECOND));
                
                return sb.toString();
                }
%>               