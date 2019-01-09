/***************************************************************************************************
* 占쏙옙占싹몌옙 : 
* 占쏙옙占� : 
* 占쌜쇽옙占쏙옙占쏙옙 : 2017-01-05
* 占쌜쇽옙占쏙옙 : 占쏙옙 占쏙옙 홍
***************************************************************************************************/
/***************************************************************************************************
* 占쏙옙占쏙옙占쏙옙占쏙옙 : 
* 占쏙옙占쏙옙占쏙옙 :  
* 占쏙옙占쏙옙占쏙옙占쏙옙 : 
* 占쏙옙占� : 
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

 
public class SS_SLS_EXTN_5830_UDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;

	public SS_SLS_EXTN_5830_UDataSet(){}
	public SS_SLS_EXTN_5830_UDataSet(String errcode, String errmsg){
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
Web Tier�뿉�꽌 DataSet 媛앹껜 愿��젴 肄붾뱶 �옉�꽦�떆 �궗�슜�븯�떗�떆�삤.

<%
	SS_SLS_EXTN_5830_UDataSet ds = (SS_SLS_EXTN_5830_UDataSet)request.getAttribute("ds");
%>
Web Tier�뿉�꽌 Record 媛앹껜 愿��젴 肄붾뱶 �옉�꽦�떆 �궗�슜�븯�떗�떆�삤.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier�뿉�꽌 DataSet 媛앹껜�쓽 <%= %> �옉�꽦�떆 �궗�슜�븯�떗�떆�삤.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier�뿉�꽌 Record 媛앹껜�쓽 <%= %> �옉�꽦�떆 �궗�슜�븯�떗�떆�삤.

----------------------------------------------------------------------------------------------------*/


/* �옉�꽦�떆媛� : Mon Feb 19 16:55:38 KST 2018 */