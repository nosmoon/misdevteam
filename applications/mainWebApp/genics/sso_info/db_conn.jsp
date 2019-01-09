<%@ page pageEncoding="euc-kr"%>
<%@ page import="java.sql.*, javax.naming.*, javax.sql.*" %>
<%
	String poolimp = "N";	//커넥션풀 사용유무 Y일경우 사용	
	
	String poolName = "";
	String className = "";
	String jdbcURL   = "";
	String userId        = "";
	String userPwd      = "";

	String selected_db = "oracle";


	 //개발기
	if(selected_db.equals("oracle")){
		poolName = "jdbc/sso";
		userId        = "miscom";
		userPwd      = "dev_miscom";
		className = "oracle.jdbc.driver.OracleDriver";
		jdbcURL   = "jdbc:oracle:thin:@192.168.1.101:1521:DEVCRMSL";		
	}
	
	//운영기
	/*
	if(selected_db.equals("oracle")){
		poolName = "jdbc/sso";
		userId        = "miscom";
		userPwd      = "cs_miscom";
		className = "oracle.jdbc.driver.OracleDriver";
		jdbcURL   = "jdbc:oracle:thin:@220.73.135.88:1521:CRMSL1";
		
		
	}
	*/

	String sqls      = "select aes_key,aes_lv from bsso_aes_key";
	String result    = "";
	
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
	
	String aes_key = "";
	String aes_lv = "";

	try{
		if(poolimp.equals("Y")){
			Context initContext = new InitialContext();
	   		Context envContext  = (Context)initContext.lookup("java:/comp/env");
	   		DataSource ds = (DataSource)envContext.lookup("jdbc/sso");
			//initCtx = new InitialContext();
			//sso_ds = (DataSource) initCtx.lookup(poolName);
			conn = ds.getConnection();
		}else{
			conn = DriverManager.getConnection(jdbcURL, userId, userPwd);
		}
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sqls);

		while(rs.next()){
			aes_key = rs.getString("aes_key");
			aes_lv = rs.getString("aes_lv");
		}

	}catch(SQLException e){
		result = "SQL Exception 발생 \n" + e.getMessage();	
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
%>