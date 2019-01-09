<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="java.text.*"%>
<%
        String sql = "",m_from_ip ="",entr_ip="";
        String db_from_ip = "";
        
       	String strMessage = "Success";
		String strCode = "";
        String strReturn = "";
        
        entr_ip = (String)request.getRemoteAddr();

		sql = "SELECT SF_CO_FIND_IP_CHK('"+entr_ip+"','1') AS FROM_IP FROM DUAL";

        Connection conn  = null;
        Statement stmt   = null;
        ResultSet rset   = null;

        /**
         * 데이타베이스에 연결합니다.
         * 준비된 쿼리문으로 정보를 조회합니다.
         * 먼저 사용자 테이블에 정보가 있으면 그걸로 비교한다.
         * 사용자 테이블에 정보가 없으면 이벤트 테이블에서 정보를 가져와서 비교한다.
        */
        try
        {
                //DB 연결
                Driver myDriver= (Driver)Class.forName("weblogic.jdbc.pool.Driver").newInstance();
                conn   = myDriver.connect("jdbc:weblogic:pool:CIIS_COM_POOL", null);

                stmt   = conn.createStatement();
                rset   = stmt.executeQuery(sql);

                if ( rset.next() )
                {
                        db_from_ip = rset.getString("FROM_IP");
                }

                rset.close();
                stmt.close();
                conn.close();

                if (db_from_ip != null && !db_from_ip.equals(""))
                	strReturn = "inner";
		else
			strReturn = "outer";
			

        }catch(SQLException e){
       		strMessage = "Error";
		strCode = (String)e.getMessage();
        }catch(Exception e){
       		strMessage = "Error";
		strCode = (String)e.getMessage();
        }finally {
                try { if(stmt  != null) stmt.close();}  catch(Exception e){ out.println("HI1");}
                try { if(rset  != null) rset.close();}  catch(Exception e){ out.println("HI2");}
                try { if(conn  != null && !conn.isClosed()) conn.close();}  catch(Exception e){ out.println("HI3");}
        }
%>
<%------------------------------------------------------------------------------
---------------------
* 파일명 :  http://220.73.135.220:5080/common/jsp/authactivex.jsp
* 기능 :
* 작성일자 :
* 작성자 :
--------------------------------------------------------------------------------
-------------------%>
<%------------------------------------------------------------------------------
---------------------
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업파일명 :
--------------------------------------------------------------------------------
-------------------%>
<?xml version="1.0" encoding="euc-kr"?>
<ndata>
	<status><%= strMessage %></status>
	<code><%= strCode %></code>
	<info>
		<![CDATA[
			<%= strReturn %>
		]]>
	</info>
</ndata>

