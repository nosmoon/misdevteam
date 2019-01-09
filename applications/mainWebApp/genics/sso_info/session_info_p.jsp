<%@ page pageEncoding="euc-kr"%>
<%@ page import="java.sql.*, javax.naming.*, javax.sql.*" %>
<%
		out.println(session.getAttribute("uid"       	 ));
		out.println(session.getAttribute("acct_cd"	 ));
		out.println(session.getAttribute("emp_no"	 ));
		out.println(session.getAttribute("emp_nm"	 ));
		out.println(session.getAttribute("cmpycd"	 ));
		out.println(session.getAttribute("cmpynm"	 ));
		out.println(session.getAttribute("deptcd"	 ));
		out.println(session.getAttribute("deptnm"	 ));
		out.println(session.getAttribute("selldeptcd"	 ));
		out.println(session.getAttribute("selldeptnm"	 ));
		out.println(session.getAttribute("areacd"	 ));
		out.println(session.getAttribute("areanm"	 ));
		out.println(session.getAttribute("jobcd"	 ));
		out.println(session.getAttribute("jobnm"	 ));
		out.println(session.getAttribute("posicd"	 ));
		out.println(session.getAttribute("posinm"	 ));
		out.println(session.getAttribute("usertypecd"	 ));
		out.println(session.getAttribute("usertypenm"	 ));
		out.println(session.getAttribute("email"	 ));
		out.println(session.getAttribute("dealdeptcd"	 ));
		out.println(session.getAttribute("dealdeptnm"	 ));
		out.println(session.getAttribute("ptph"	 	 ));
		out.println(session.getAttribute("dealmedicd"	 ));
			
		out.println(session.getAttribute("UID"       	 ));
		out.println(session.getAttribute("ACCT_CD"	 ));
		out.println(session.getAttribute("EMP_NO"	 ));
		out.println(session.getAttribute("EMP_NM"	 ));
		out.println(session.getAttribute("CMPYCD"	 ));
		out.println(session.getAttribute("CMPYNM"	 ));
		out.println(session.getAttribute("DEPTCD"	 ));
		out.println(session.getAttribute("DEPTNM"	 ));
		out.println(session.getAttribute("SELLDEPTCD"	 ));
		out.println(session.getAttribute("SELLDEPTNM"	 ));
		out.println(session.getAttribute("AREACD"	 ));
		out.println(session.getAttribute("AREANM"	 ));
		out.println(session.getAttribute("JOBCD"	 ));
		out.println(session.getAttribute("JOBNM"	 ));
		out.println(session.getAttribute("POSICD"	 ));
		out.println(session.getAttribute("POSINM"	 ));
		out.println(session.getAttribute("USERTYPECD"	 ));
		out.println(session.getAttribute("USERTYPENM"	 ));
		out.println(session.getAttribute("EMAIL"	 ));
		out.println(session.getAttribute("DEALDEPTCD"	 ));
		out.println(session.getAttribute("DEALDEPTNM"	 ));
		out.println(session.getAttribute("PTPH"	 	 ));
		out.println(session.getAttribute("DEALMEDICD"	 ));			
%>
<%
	String poolimp = "Y";	//커넥션풀 사용유무 Y일경우 사용	
	
	String poolName = "";
	String className = "";
	String jdbcURL   = "";
	String userId        = "";
	String userPwd      = "";

	String selected_db = "oracle";

	/*
	 //개발기
	if(selected_db.equals("oracle")){
		poolName = "jdbc/sso";
		userId        = "miscom";
		userPwd      = "cs_miscom";
		className = "oracle.jdbc.driver.OracleDriver";
		jdbcURL   = "jdbc:oracle:thin:@220.73.135.221:1537:CRMSAL";
	}
	*/
	
	//운영기
	if(selected_db.equals("oracle")){
		poolName = "MISCOM";
		userId        = "miscom";
		userPwd      = "cs_miscom";
		className = "oracle.jdbc.driver.OracleDriver";
		//jdbcURL   = "jdbc:oracle:thin:@220.73.135.221:1537:CRMSSO";
		jdbcURL   = "jdbc:oracle:thin:@192.168.2.240:1525:XCRMSL";

	}

	//String sqls      = "select aes_key,aes_lv from bsso_aes_key";
	String acct_cd = request.getParameter("acct_cd");
	
	StringBuffer sb = new StringBuffer();
	sb.append("\n SELECT ACCT_CD ,PART_CD ,PRN ,EMPNO ,NM													");
	sb.append("\n   ,ACCT_PASSWD ,EMP_CLSF_CD ,EMP_CLSF_NM ,INPRE_NO ,PTPH									");
	sb.append("\n   ,EMAIL_ID ,BLNG_CMPY_CD ,BLNG_CMPY_NM ,DUTY_CMPY_CD ,DUTY_CMPY_NM 						");
	sb.append("\n   ,OFFI_REAL_HDQTBOKS_CD ,OFFI_REAL_HDQTBOKS_NM ,BOKS_TEAM_CD ,BOKS_TEAM_NM ,PART_NM		"); 
	sb.append("\n   ,CLASS_CD ,CLASS_NM ,POSI_CD ,POSI_NM ,DTY_CD											");
  sb.append("\n   ,DTY_NM ,JOB_CLSF_USE_VDTY_DD ");
	sb.append("\n   ,DECODE(JOB_CLSF_CD,null,SF_CO_FIND_ROLE('1',UPPER(ACCT_CD)),JOB_CLSF_CD) JOB_CLSF_CD ");
	sb.append("\n   ,DECODE(JOB_CLSF_NM,null,SF_CO_FIND_ROLE('2',UPPER(ACCT_CD)),JOB_CLSF_NM) JOB_CLSF_NM ,CRM_USEPERS_TYPE				");
	sb.append("\n   ,LVCMPY_DT ,CRM_DEAL_BANK_CD ,CRM_DEAL_BANK_NM ,CRM_ACCT_NO ,CRM_MANG_AREA_CD			");
	sb.append("\n   ,CRM_MANG_AREA_NM ,CRM_SELL_DEPT_CD ,CRM_SELL_DEPT_NM ,CRM_BOF_CD ,CRM_SELL_PART_NM		");
	sb.append("\n   ,CRM_BOF_NM ,CRM_AREA_CD ,CRM_AREA_NM ,CRM_HD_DEPT_CD ,CRM_HD_DEPT_NM					");
	sb.append("\n   ,CRM_BOF_CLSF ,CRM_BOF_CLSF_NM ,CRM_BILL_GRP_ID ,CRM_BILL_GRP_TYPE ,CRM_BILL_BLNG_CD	");	
	sb.append("\n   ,CRM_SELL_PART_CD ,CRM_MANG_DEPT_CD ,CRM_MANG_DEPT_NM ,CRM_CUST_SRC_CD ,CRM_CUST_SRC_NM	");
	sb.append("\n   ,CRM_PUBL_BO_CD ,CRM_PUBL_BO_NM ");
	sb.append("\n   ,DECODE(CRM_JOB_CLSF_CD,null,SF_CO_FIND_ROLE('1',UPPER(ACCT_CD)),CRM_JOB_CLSF_CD) CRM_JOB_CLSF_CD ");
	sb.append("\n   ,DECODE(CRM_JOB_CLSF_NM,null,SF_CO_FIND_ROLE('2',UPPER(ACCT_CD)),CRM_JOB_CLSF_NM) CRM_JOB_CLSF_NM ");
	sb.append("\n   ,USB_KEY,PRE_DEPT_CD ,DEPT_CHG_DT ,REP_POSI_TYPE_CD ,USB_KEY_REG_DT ,VPN_USER_YN				");
	sb.append("\n   ,XCOOP_USE ,ELEC_TAX_BILL_USE ,EIS_USER_LEVEL ,TEAM_BB_USE ,CUST71 ,CUST76 				");	
	sb.append("\n 	,CUST77 ,CUST78 ,CUST79 ,CUST80 ,CUST81			");
	sb.append("\n 	,CUST82 ,CUST83 ,CUST84 ,CUST85 ,OLAP_YN		");
	sb.append("\n 	,PWD_CHG_DT ,CHIEF_YN							");
	sb.append("\n FROM AM_COMN_ACCT_INFO  							");
//	sb.append("\n WHERE UPPER(ACCT_CD) ='CIT0020'				");
	sb.append("\n WHERE UPPER(ACCT_CD) = UPPER('"+acct_cd+"')					");

	String result    = "";
	out.println("<BR>was1<BR>" + sb.toString());

	try{

		Class.forName(className); // oracle.jdbc.driver.OracleDriver

	}catch(Exception e){

		result = "DB 드라이버 로딩 실패 \n" + e.getMessage();
		out.print("<pre>" + result + "</pre>");
		e.printStackTrace();
		out.close();
		return;
	}
	
	//DataSource sso_ds = null;
	Connection conn   = null;
	Statement  stmt   = null;
	ResultSet  rs   = null;
	
	String ACCT_CD="", EMPNO="", NM="", BLNG_CMPY_CD="", BLNG_CMPY_NM="", PART_CD="", PART_NM="", CRM_SELL_DEPT_CD="", CRM_SELL_DEPT_NM="", CRM_MANG_AREA_CD="", CRM_MANG_AREA_NM="", JOB_CLSF_CD="", JOB_CLSF_NM="", DTY_CD="", DTY_NM="", EMP_CLSF_CD="", EMP_CLSF_NM="", EMAIL_ID="", CRM_MANG_DEPT_CD="", CRM_MANG_DEPT_NM="", PTPH="", dealmedicd="";

	try{
		if(poolimp.equals("Y")){
			Context initContext = new InitialContext();
	   		Context envContext  = (Context)initContext.lookup("java:/comp/env");
	   		DataSource ds = (DataSource)envContext.lookup("CIIS_COM_DS");
			//initCtx = new InitialContext();
			//sso_ds = (DataSource) initCtx.lookup(poolName);
			conn = ds.getConnection();
		}else{
			conn = DriverManager.getConnection(jdbcURL, userId, userPwd);
		}
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sb.toString());

		while(rs.next()){
			ACCT_CD = rs.getString("ACCT_CD");
			EMPNO   = rs.getString("EMPNO");
			NM   = rs.getString("NM");
			BLNG_CMPY_CD   = rs.getString("BLNG_CMPY_CD");
			BLNG_CMPY_NM   = rs.getString("BLNG_CMPY_NM");
			PART_CD   = rs.getString("PART_CD");
			PART_NM   = rs.getString("PART_NM");
			CRM_SELL_DEPT_CD   = rs.getString("CRM_SELL_DEPT_CD");
			CRM_SELL_DEPT_NM   = rs.getString("CRM_SELL_DEPT_NM");
			CRM_MANG_AREA_CD   = rs.getString("CRM_MANG_AREA_CD");
			CRM_MANG_AREA_NM   = rs.getString("CRM_MANG_AREA_NM");
			JOB_CLSF_CD   = rs.getString("JOB_CLSF_CD");
			JOB_CLSF_NM   = rs.getString("JOB_CLSF_NM");
			DTY_CD   = rs.getString("DTY_CD");
			DTY_NM   = rs.getString("DTY_NM");
			EMP_CLSF_CD   = rs.getString("EMP_CLSF_CD");
			EMP_CLSF_NM   = rs.getString("EMP_CLSF_NM");
			EMAIL_ID   = rs.getString("EMAIL_ID");
			CRM_MANG_DEPT_CD   = rs.getString("CRM_MANG_DEPT_CD");
			CRM_MANG_DEPT_NM   = rs.getString("CRM_MANG_DEPT_NM");
			PTPH   = rs.getString("PTPH");
			dealmedicd   = rs.getString("cust71");
		}

	}catch(SQLException e){
		result = "SQL Exception 발생 \n" + e.getMessage() +e.toString();	
		out.print("<pre>" + result + "</pre>");
		e.printStackTrace();
		out.close();
		return;

	}finally{
		if(rs != null)
			rs.close();
		if(stmt != null)
			stmt.close();
		if(conn != null)
			conn.close();
	}

		session.setAttribute("UID"	 , ACCT_CD);	
		session.setAttribute("ACCT_CD"	 , ACCT_CD);
		session.setAttribute("EMP_NO"	 , EMPNO);
		session.setAttribute("EMP_NM"	 , NM);
		session.setAttribute("CMPYCD"	 , BLNG_CMPY_CD);
		session.setAttribute("CMPYNM"	 , BLNG_CMPY_NM);
		session.setAttribute("DEPTCD"	 , PART_CD);
		session.setAttribute("DEPTNM"	 , PART_NM);
		session.setAttribute("SELLDEPTCD", CRM_SELL_DEPT_CD);
		session.setAttribute("SELLDEPTNM", CRM_SELL_DEPT_NM);
		session.setAttribute("AREACD"	 , CRM_MANG_AREA_CD);
		session.setAttribute("AREANM"	 , CRM_MANG_AREA_NM);
		session.setAttribute("JOBCD"	 , JOB_CLSF_CD);
		session.setAttribute("JOBNM"	 , JOB_CLSF_NM);
		session.setAttribute("POSICD"	 , DTY_CD);
		session.setAttribute("POSINM"	 , DTY_NM);
		session.setAttribute("USERTYPECD", EMP_CLSF_CD);
		session.setAttribute("USERTYPENM", EMP_CLSF_NM);
		session.setAttribute("EMAIL"	 , EMAIL_ID);
		session.setAttribute("DEALDEPTCD", CRM_MANG_DEPT_CD);
		session.setAttribute("DEALDEPTNM", CRM_MANG_DEPT_NM);
		session.setAttribute("PTPH"	 , PTPH);
		session.setAttribute("dealmedicd", dealmedicd);
		
		session.setAttribute("uid"       , ACCT_CD);			
		session.setAttribute("acct_cd"	 , ACCT_CD);
		session.setAttribute("emp_no"	 , EMPNO);
		session.setAttribute("emp_nm"	 , NM);
		session.setAttribute("cmpycd"	 , BLNG_CMPY_CD);
		session.setAttribute("cmpynm"	 , BLNG_CMPY_NM);
		session.setAttribute("deptcd"	 , PART_CD);
		session.setAttribute("deptnm"	 , PART_NM);
		session.setAttribute("selldeptcd", CRM_SELL_DEPT_CD);
		session.setAttribute("selldeptnm", CRM_SELL_DEPT_NM);
		session.setAttribute("areacd"	 , CRM_MANG_AREA_CD);
		session.setAttribute("areanm"	 , CRM_MANG_AREA_NM);
		session.setAttribute("jobcd"	 , JOB_CLSF_CD);
		session.setAttribute("jobnm"	 , JOB_CLSF_NM);
		session.setAttribute("posicd"	 , DTY_CD);
		session.setAttribute("posinm"	 , DTY_NM);
		session.setAttribute("usertypecd", EMP_CLSF_CD);
		session.setAttribute("usertypenm", EMP_CLSF_NM);
		session.setAttribute("email"	 , EMAIL_ID);
		session.setAttribute("dealdeptcd", CRM_MANG_DEPT_CD);
		session.setAttribute("dealdeptnm", CRM_MANG_DEPT_NM);
		session.setAttribute("ptph"	 , PTPH);
		session.setAttribute("dealmedicd", dealmedicd);		
		
		out.println("ACCT_CD           :" +  ACCT_CD);              
		out.println("EMPNO             :" +  EMPNO);                
		out.println("NM                :" +  NM);                   
		out.println("BLNG_CMPY_CD      :" +  BLNG_CMPY_CD);         
		out.println("BLNG_CMPY_NM      :" +  BLNG_CMPY_NM);         
		out.println("PART_CD           :" +  PART_CD);              
		out.println("PART_NM           :" +  PART_NM);              
		out.println("CRM_SELL_DEPT_CD  :" +  CRM_SELL_DEPT_CD);     
		out.println("CRM_SELL_DEPT_NM  :" +  CRM_SELL_DEPT_NM);     
		out.println("CRM_MANG_AREA_CD  :" +  CRM_MANG_AREA_CD);     
		out.println("CRM_MANG_AREA_NM  :" +  CRM_MANG_AREA_NM);     
		out.println("JOB_CLSF_CD       :" +  JOB_CLSF_CD);          
		out.println("JOB_CLSF_NM       :" +  JOB_CLSF_NM);          
		out.println("DTY_CD            :" +  DTY_CD);               
		out.println("DTY_NM            :" +  DTY_NM);               
		out.println("EMP_CLSF_CD       :" +  EMP_CLSF_CD);          
		out.println("EMP_CLSF_NM       :" +  EMP_CLSF_NM);          
		out.println("EMAIL_ID          :" +  EMAIL_ID);             
		out.println("CRM_MANG_DEPT_CD  :" +  CRM_MANG_DEPT_CD);     
		out.println("CRM_MANG_DEPT_NM  :" +  CRM_MANG_DEPT_NM);     
		out.println("PTPH              :" +  PTPH);                 
		out.println("dealmedicd        :" +  dealmedicd);		
%>                                                                   