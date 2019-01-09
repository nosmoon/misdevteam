/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.hd.vaca.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.vaca.dm.*;
import chosun.ciis.hd.vaca.rec.*;

/**
 * 
 */


public class HD_VACA_1000_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{

	public HD_VACA_1000_ADataSet(){}

	public void getValues(CallableStatement cstmt) throws SQLException{
	}

	public String getErrcode() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getErrmsg() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setErrcode(String arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setErrmsg(String arg0) {
		// TODO Auto-generated method stub
		
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_VACA_1000_ADataSet ds = (HD_VACA_1000_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 26 20:31:00 KST 2009 */