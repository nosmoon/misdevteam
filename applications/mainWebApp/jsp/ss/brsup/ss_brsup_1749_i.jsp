<%@ page contentType="text/xml; charset=KSC5601" %>
<%@ include file="/jsp/ss/comm_jsp/ss_common_x.jsp" %>
<%@ page import="java.security.MessageDigest, java.util.*, java.sql.*, javax.naming.*, java.net.*, java.io.*" %>

<%---------------------------------------------------------------------------------------------------
* 파일명 : ss_cns_1749_i.jsp
* 기능 : 센터지원-빌링-자동이체-신청-등록
* 작성일자 : 2016-09-30
* 작성자 : 심정보
---------------------------------------------------------------------------------------------------%>

<%
	SS_I_SHFTAPLCDataSet ds = (SS_I_SHFTAPLCDataSet)request.getAttribute("ds");

	String resMsg = "";

	if(!ds.getRec_aplcno().equals("")){

		System.out.println("DB Connect");
		Connection conn = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		String oc_sql = null;
		String canc_sql = null;
		String canc_sql2 = null;
		String rec_aplcno = null;
		String hpNo = null;
		String realNo = "15778585";
		String cpTelegramKey = null;
		String memName = null;
		String corpName = "chosun";
		String bankCd = null;
		String acctNo = null;
		String randNo = null;
		//String retUrl = "http://203.255.110.213:8080/callResult.jsp"; //개인개발서버	
		String retUrl = "http://testagency.chosun.com:8082/callResult.jsp"; //개발서버
		//String retUrl = "http://members.chosun.com/agency/callResult.jsp"; //운영서버
		
		rec_aplcno = ds.getRec_aplcno();
		
		//DB 접속정보
		String userId    = "crmsal_com";
			String userPwd   = "dev_crmsal_com";
			//String userPwd   = "xsl_#82dudtksghd"; //운영서버
			String className = "oracle.jdbc.driver.OracleDriver";
			String jdbcURL   = "jdbc:oracle:thin:@//192.168.1.101:1521/devcrmsl";
			//String jdbcURL   = "jdbc:oracle:thin:@//192.168.2.240:1525/XCRMSL"; //운영서버
			
			URL url = null;
			HttpURLConnection urlConn = null;
			    
		String result = "";
		
		try {		
			//자동이체 신청 정보를 불러온다.
			oc_sql = 
				"SELECT PYMTTEL1||PYMTTEL2||PYMTTEL3 HPNO, REC_APLCNO CPTELEGRAMKEY "
				+",PYMTNM MEMNAME, SUBSTR(RECPINSTT,0,3) BANKCD, SUBSTR(ACCTNO,-4) ACCTNO "
				+",LPAD(ROUND(DBMS_RANDOM.VALUE(0, 99)),2,'0') RANDNO	"
				+"FROM TACOM_SHFTAPLC	"
				+"WHERE REC_APLCNO = ? AND ROWNUM = 1";
		
			//Context initContext = new InitialContext();
			//Context envContext  = (Context)initContext.lookup("java:/comp/env");
			//DataSource ds = (DataSource)envContext.lookup("CRMBO_SLS_DS");
		  	
			conn = DriverManager.getConnection(jdbcURL, userId, userPwd);
			
			pstmt = conn.prepareStatement(oc_sql);
			pstmt.setString(1, rec_aplcno);
					
			rs = pstmt.executeQuery();
			
			if ( rs.next() ){
				hpNo = rs.getString("hpno");
				cpTelegramKey = rs.getString("cptelegramkey");
				memName = rs.getString("memname");
				bankCd = rs.getString("bankcd");
				acctNo = rs.getString("acctno");
				randNo = rs.getString("randno");
		    }
			//인포필러 접속
		
			url = new URL("http://211.175.205.116:8090/clicktocall.php?"
						//+"hpNo="+"0103446"
						+"hpNo="+hpNo
						+"&realNo="+realNo
						+"&cpTelegramKey="+cpTelegramKey
						+"&memName="+memName
						+"&corpName="+corpName
						+"&bankCd="+bankCd
						+"&acctNo="+acctNo
						+"&randNo="+randNo
						+"&retUrl="+retUrl);
		
			System.out.println("url:"+url);
			
			urlConn = (HttpURLConnection)url.openConnection();
		    urlConn.setDoInput(true);
		    urlConn.setDoOutput(true);
		    urlConn.setRequestMethod("GET");
		    
		    urlConn.setUseCaches(false);
		    urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		
		    PrintWriter pout = new PrintWriter(urlConn.getOutputStream());
		    pout.flush();
		    pout.close();
		
		    InputStream in = urlConn.getInputStream() ;
		    BufferedReader br = new BufferedReader(new InputStreamReader(in));
		    String line = "";
		    while((line = br.readLine()) != null) {
		       result += line;
		    }
		
		    br.close();
		    in.close();
		
		    //out.println(result);
		    //out.println(result.indexOf("resultYn"));
		    //out.println(result.indexOf("resultMsg"));
		    //out.println(result.indexOf("resultCode"));
		    //out.println("["+result.substring(result.indexOf("resultYn")+11,result.indexOf("resultYn")+12)+"]");
		    //out.println("["+result.substring(result.indexOf("resultCode")+13,result.indexOf("resultCode")+15)+"]");
		    
		    //신청결과 체크   
		    System.out.println("[result]:"+result);
		    System.out.println("[resultYn]:"+result.substring(result.indexOf("resultYn")+11,result.indexOf("resultYn")+12));
		    System.out.println("[resultCode]:"+result.substring(result.indexOf("resultCode")+13,result.indexOf("resultCode")+15));
		    
		    if(result.substring(result.indexOf("resultYn")+11,result.indexOf("resultYn")+12).equals("Y")){
		    	resMsg="자동이체 신청이 완료됐습니다.";
		    }else{
		    	//System.out.println("[length]:"+result.substring(result.indexOf("resultCode")+13,result.indexOf("resultCode")+15).length());
		    	if(result.substring(result.indexOf("resultCode")+13,result.indexOf("resultCode")+15).equals("01")){
		    		resMsg="신청에 실패했습니다. 전화번호 오류[Code:01]";
		    	}else if(result.substring(result.indexOf("resultCode")+13,result.indexOf("resultCode")+15).equals("02")){
		    		resMsg="신청에 실패했습니다. 거래번호 오류[Code:02]";
		    	}else if(result.substring(result.indexOf("resultCode")+13,result.indexOf("resultCode")+15).equals("03")){
		    		resMsg="신청에 실패했습니다. 납부자이름 오류[Code:03]";
		    	}else if(result.substring(result.indexOf("resultCode")+13,result.indexOf("resultCode")+15).equals("04")){
		    		resMsg="신청에 실패했습니다. 계좌정보 오류[Code:04]";
		    	}else{
		    		resMsg="신청에 실패했습니다. 기타 오류";
		    	}
		    	
		    	//실패시 현재의 신청목록(TACOM_SHFTAPLC)을 업데이트한다. 승인오류(30)처리
		    	//canc_sql = "DELETE FROM TACOM_SHFTAPLC WHERE REC_APLCNO = ? ";
				canc_sql = "UPDATE TACOM_SHFTAPLC SET APLCPROCSTAT = '30', REMK = '녹취통화실패:Code:'||?, LASTYN = 'N' WHERE REC_APLCNO = ? ";
				pstmt = conn.prepareStatement(canc_sql);
				pstmt.setString(1, result.substring(result.indexOf("resultCode")+13,result.indexOf("resultCode")+15));
				pstmt.setString(2, rec_aplcno);
				pstmt.executeUpdate();
		
				//canc_sql2 = "DELETE FROM TASLM_SHFTAPLC_REC_INFO WHERE REC_APLCNO = ? ";
				//pstmt = conn.prepareStatement(canc_sql2);
				//pstmt.setString(1, rec_aplcno);
				//pstmt.executeUpdate();
		    }
		    
		}catch (Exception e){
			if(rs != null)                       rs.close();        
		    if(pstmt != null)                    pstmt.close();
		    if(stmt != null)                     stmt.close();                             
		    if(conn != null && !conn.isClosed()) conn.close();
		}finally{
			if(rs != null)                       rs.close();        
		    if(pstmt != null)                    pstmt.close();
		    if(stmt != null)                     stmt.close();                             
		    if(conn != null && !conn.isClosed()) conn.close();
		}
	}else{
		resMsg="신청하였습니다.";		
	}
	
	RwXmlWrapper rxw = new RwXmlWrapper();
	int root = RwXmlWrapper.rootNodeID;
	int resTEmp = rxw.add(root, "resTemp", "");
	
	rxw.add(resTEmp, "msg", resMsg);
	//이체구분 temp는 첫번째 걸로 셋팅.
	rxw.add(resTEmp, "bocd", request.getParameter("bocd"));
	rxw.add(resTEmp, "rdr_no", request.getParameter("rdr_no"));
	rxw.add(resTEmp, "accflag", request.getParameter("accflag"));	//처리구분.
	
	rxw.flush(out);
%>