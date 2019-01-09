<?xml version="1.0" encoding="EUC-KR"?>
<%@page contentType=" text/xml; charset=EUC-KR "%>
<%@page import="java.sql.*"%><%@page import="java.util.*"%>
<%@page import="java.text.*"%><%@page import="javax.naming.* "%>
<%@page import="javax.sql.* "%><%@page import="sun.misc.BASE64Decoder"%>
<%@page import="sun.misc.BASE64Encoder,KISA.SHA256"%>
<%!
	 public static final String sha256(String strInput) {
		  String strOut = "";

		  String sPlainText = strInput;
		  SHA256 s = new SHA256( sPlainText.getBytes() );
		  BASE64Encoder Base64Encoder = new BASE64Encoder(); 
		  strOut= Base64Encoder.encode(s.GetHashCode()) ;

		  return strOut;
		 }
%><%
	
	byte[] enbyte = null; 
	byte[] debyte = null; 
    
    BASE64Encoder encoder = new BASE64Encoder();
    BASE64Decoder decoder = new BASE64Decoder();
 
	String id = "";
	String amho = "" , amho_sha256="";
	String gcmid = "";	//모바일 gcmid 추가 2017-02-06

	if (request.getParameter("id") != null)	id = request.getParameter("id").trim();
	if (request.getParameter("amho") != null)	amho = request.getParameter("amho").trim();
	if (request.getParameter("gcmid") != null)	gcmid = request.getParameter("gcmid").trim();


//	amho = encoder.encode(amho.getBytes());
//	amho = utils.checkString(amho);
//	System.out.println("base64암호화==>>"+amho);  
// 실제로는 암호화된 amho가 오는데


	// 암호화 된 비밀번호 입력 받아서 복호화(base64) 한다.    
	/*
	debyte = decoder.decodeBuffer(amho);  //바이트배열로 받음
	amho = new String(debyte);
	amho = amho;
  */    
	System.out.println("base64복호화==>>"+amho);
          
	// 복호화된 비밀번호를 다시 암호화(MD5Crypt2) 한다.      
	amho_sha256 = sha256(amho);
//	amho = utils.checkString(MD5Crypt2.hash(amho));
//	System.out.println("MD5Crypt2암호화==>>"+amho);
   

	String db_acct_cd ="", db_nm ="", db_part_cd = "", db_role ="" , db_acct_passwd_hash = "" ,db_bocdlist ="" ,db_bocdnmlist ="";
	String db_crm_mang_area_cd = "", db_crm_mang_area_nm ="";

	String sql = "";		
	sql =  " SELECT ACCT_CD , NM , ACCT_PASSWD_HASH , PART_CD ,SF_CO_FIND_ROLE2('1',ACCT_CD) ROLE,SF_CO_FIND_BOCDLIST2('1',ACCT_CD) BOCDLIST,SF_CO_FIND_BOCDLIST2('2',ACCT_CD) BOCDNMLIST, ";
	sql +="  CRM_MANG_AREA_CD, SF_CO_FIND_CRM_MANG_LIST('1',ACCT_CD) CRM_MANG_AREA_NM ";
	sql +=" FROM AM_COMN_ACCT_INFO";
	sql +=" WHERE ACCT_CD = '"+id+"' ";

//	System.out.println(sql);

	String sp_Qurery = "";		
	sp_Qurery = "{ call SP_SS_MO_U_LOGIN( ?, ?, ?, ?, ?, ? ) }" ;


	Connection conn  = null;
	Statement stmt   = null;
	ResultSet rs   = null;
	DataSource ds = null; 
	String result = "4";
	CallableStatement cstmt = null;

	/* result
	*     0 : 아이디 존재하지 않음
	*     1 : 일치
	*     2 : 패스워드 불일치
	*    -1 : 오류
	*/
	
	/**
	 * 데이타베이스에 연결합니다.
	 * 준비된 쿼리문으로 정보를 조회합니다.
	 * 먼저 사용자 테이블에 정보가 있으면 그걸로 비교한다.
	 * 사용자 테이블에 정보가 없으면 이벤트 테이블에서 정보를 가져와서 비교한다.
	*/
	try
	{
		//DB 연결	
		conn = DriverManager.getConnection("jdbc:oracle:thin:@//192.168.2.240:1525/XCRMSL", "miscom", "xsl_#58qjfshfkddl"); //운영
//		conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.101:1521:DEVCRMSL", "miscom", "dev_miscom");   //개발

		stmt   = conn.createStatement();		
		rs   = stmt.executeQuery(sql);
		
		if ( rs.next() )
		{
			db_acct_cd 			= rs.getString("ACCT_CD");
			db_nm 			= rs.getString("NM");
			db_acct_passwd_hash = rs.getString("ACCT_PASSWD_HASH");
			db_part_cd = rs.getString("PART_CD");
			db_role =rs.getString("ROLE");
			db_bocdlist = rs.getString("BOCDLIST");
			db_bocdnmlist = rs.getString("BOCDNMLIST");
			db_crm_mang_area_cd = rs.getString("CRM_MANG_AREA_CD");
			db_crm_mang_area_nm = rs.getString("CRM_MANG_AREA_NM");
			
			
			System.out.println(db_acct_passwd_hash);
			
			if(amho_sha256.equals(db_acct_passwd_hash)){
				result = "0";

				// 다운로드 로그저장
				cstmt = conn.prepareCall(sp_Qurery);
				cstmt.registerOutParameter(1, Types.VARCHAR);
				cstmt.registerOutParameter(2, Types.VARCHAR);
				cstmt.setString(3, db_acct_cd);
				cstmt.setString(4, db_nm);
				cstmt.setString(5, (String)request.getRemoteAddr());
				cstmt.setString(6, gcmid);
				cstmt.execute();

				String errcode = cstmt.getString(1);
				String errmsg = cstmt.getString(2);

				if("".equals(errcode) || errcode == null){
					conn.commit();
				}else{
					conn.rollback();
				}


			} else {
				result = "1";
				if( "".equals(db_acct_passwd_hash) ){
					result = "4";				
				}
			}
		} else {
			result = "2";
		}
		
		if (id == null || amho_sha256 == null || id.equals("") || amho_sha256.equals("")) {
			result = "3";
		}
		
	}
	catch(SQLException e) {
		System.out.println("SQLException"+e.toString());
	}
	catch(Exception e) {
		System.out.println("Exception"+e.toString());
	}
	finally {
		try { if(cstmt  != null) cstmt.close();}  catch(Exception e){}
		try { if(stmt  != null) stmt.close();}  catch(Exception e){}
		try { if(rs  != null) rs.close();}  catch(Exception e){}
		try { if(conn  != null && !conn.isClosed()) conn.close();}  catch(Exception e){}
	}
%>
<%
        out.println("<resultlist>");
	if( result.equals("0") ){
        out.println("<errinfo>");
			out.println("<errcode></errcode>");
			out.println("<errmsg></errmsg>");
        out.println("</errinfo>");
        out.println("<resultinfo>");
			out.println("<acct_cd><![CDATA["+db_acct_cd+"]]></acct_cd>");
			out.println("<name><![CDATA["+db_nm+"]]></name>");
			out.println("<role>"+db_role+"</role>");
			out.println("<part_cd>"+db_part_cd+"</part_cd>");
			out.println("<bocdlist>"+db_bocdlist+"</bocdlist>");
			out.println("<bocdnmlist><![CDATA["+db_bocdnmlist+"]]></bocdnmlist>");
			out.println("<crm_mang_area_cd>"+db_crm_mang_area_cd+"</crm_mang_area_cd>");
			out.println("<crm_mang_area_nm><![CDATA["+db_crm_mang_area_nm+"]]></crm_mang_area_nm>");
        out.println("</resultinfo>");
    }else{ 
        out.println("<errinfo>");
			out.println("<errcode>"+result+"</errcode>");
			if( result.equals("1") ){
		        out.println("<errmsg><![CDATA[비밀번호가 일치하지 않습니다.]]></errmsg>");
			}else if( result.equals("2") ){
				out.println("<errmsg><![CDATA[존재하지 않는 ID 입니다.]]></errmsg>");
			}else if( result.equals("3") ){
				out.println("<errmsg><![CDATA[데이터 오류입니다.]]></errmsg>");
			}else if( result.equals("4") ){
		        out.println("<errmsg><![CDATA[회원님의 소중한 개인정보 보호를 위해 pw찾기에서 비밀번호를 재설정해 주세요!]]></errmsg>");
			}
        out.println("</errinfo>");
        out.println("<resultinfo>");
			out.println("<acct_cd></acct_cd>");
			out.println("<name></name>");
			out.println("<role></role>");
			out.println("<part_cd></part_cd>");
			out.println("<bocdlist></bocdlist>");
			out.println("<bocdnmlist></bocdnmlist>");
			out.println("<crm_mang_area_cd></crm_mang_area_cd>");
			out.println("<crm_mang_area_nm></crm_mang_area_nm>");
        out.println("</resultinfo>");
            
    }
        out.println("</resultlist>");
%>