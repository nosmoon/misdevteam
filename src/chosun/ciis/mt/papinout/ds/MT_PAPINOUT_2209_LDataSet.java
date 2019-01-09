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


package chosun.ciis.mt.papinout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_2209_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_PAPINOUT_2209_LDataSet(){}
	public MT_PAPINOUT_2209_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_PAPINOUT_2209_LCURLISTRecord rec = new MT_PAPINOUT_2209_LCURLISTRecord();
			rec.cnsm_dt = Util.checkString(rset0.getString("cnsm_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.pcsim62cnt = Util.checkString(rset0.getString("pcsim62cnt"));
			rec.mssim62cnt = Util.checkString(rset0.getString("mssim62cnt"));
			rec.pcsim31cnt = Util.checkString(rset0.getString("pcsim31cnt"));
			rec.mssim31cnt = Util.checkString(rset0.getString("mssim31cnt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_PAPINOUT_2209_LDataSet ds = (MT_PAPINOUT_2209_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_PAPINOUT_2209_LCURLISTRecord curlistRec = (MT_PAPINOUT_2209_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cnsm_dt%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.pcsim62cnt%>
<%= curlistRec.mssim62cnt%>
<%= curlistRec.pcsim31cnt%>
<%= curlistRec.mssim31cnt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 28 20:23:27 KST 2009 */