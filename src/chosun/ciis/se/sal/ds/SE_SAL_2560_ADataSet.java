/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매시스템
* 작성일자 : 2009-02-18
* 작성자 : 배창희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.sal.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.sal.dm.*;
import chosun.ciis.se.sal.rec.*;

/**
 * 
 */


public class SE_SAL_2560_ADataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList sendlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_SAL_2560_ADataSet(){}
	public SE_SAL_2560_ADataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(13);
		while(rset0.next()){
			SE_SAL_2560_ASENDLISTRecord rec = new SE_SAL_2560_ASENDLISTRecord();
			rec.col = Util.checkString(rset0.getString("col"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_occr_cd = Util.checkString(rset0.getString("slip_occr_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			this.sendlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_SAL_2560_ADataSet ds = (SE_SAL_2560_ADataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.sendlist.size(); i++){
		SE_SAL_2560_ASENDLISTRecord sendlistRec = (SE_SAL_2560_ASENDLISTRecord)ds.sendlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSendlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= sendlistRec.col%>
<%= sendlistRec.slip_occr_dt%>
<%= sendlistRec.slip_occr_cd%>
<%= sendlistRec.slip_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 22 20:30:58 KST 2009 */