/***************************************************************************************************
* �뜝�룞�삕�뜝�떦紐뚯삕 : 
* �뜝�룞�삕�뜝占� : 
* �뜝�뙗�눦�삕�뜝�룞�삕�뜝�룞�삕 : 2017-01-05
* �뜝�뙗�눦�삕�뜝�룞�삕 : �뜝�룞�삕 �뜝�룞�삕 �솉
***************************************************************************************************/
/***************************************************************************************************
* �뜝�룞�삕�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕 : 
* �뜝�룞�삕�뜝�룞�삕�뜝�룞�삕 :  
* �뜝�룞�삕�뜝�룞�삕�뜝�룞�삕�뜝�룞�삕 : 
* �뜝�룞�삕�뜝占� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */

 
public class SS_SLS_EXTN_5820_UDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;

	public SS_SLS_EXTN_5820_UDataSet(){}
	public SS_SLS_EXTN_5820_UDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}
	
	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier占쏙옙占쏙옙 DataSet 揶쏉옙筌ｏ옙 �꽴占쏙옙占� �굜占쏙옙占� 占쏙옙占쎄퉮占쏙옙 占싼딉옙�뫚占쏙옙占쏙옙占쏙옙占쏙옙.

<%
	SS_SLS_EXTN_5820_UDataSet ds = (SS_SLS_EXTN_5820_UDataSet)request.getAttribute("ds");
%>
Web Tier占쏙옙占쏙옙 Record 揶쏉옙筌ｏ옙 �꽴占쏙옙占� �굜占쏙옙占� 占쏙옙占쎄퉮占쏙옙 占싼딉옙�뫚占쏙옙占쏙옙占쏙옙占쏙옙.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier占쏙옙占쏙옙 DataSet 揶쏉옙筌ｋ똻占쏙옙 <%= %> 占쏙옙占쎄퉮占쏙옙 占싼딉옙�뫚占쏙옙占쏙옙占쏙옙占쏙옙.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier占쏙옙占쏙옙 Record 揶쏉옙筌ｋ똻占쏙옙 <%= %> 占쏙옙占쎄퉮占쏙옙 占싼딉옙�뫚占쏙옙占쏙옙占쏙옙占쏙옙.

----------------------------------------------------------------------------------------------------*/


/* 占쏙옙占쎄퉮占쏙옙揶쏉옙 : Wed Feb 14 13:15:31 KST 2018 */