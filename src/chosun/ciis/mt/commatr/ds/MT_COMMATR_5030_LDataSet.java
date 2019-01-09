/***************************************************************************************************
* 파일명 : .java
* 기능 : 기초정보관리 - 장표관리
* 작성일자 : 2010-04-12
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.commatr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_5030_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_COMMATR_5030_LDataSet(){}
	public MT_COMMATR_5030_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_COMMATR_5030_LCURLISTRecord rec = new MT_COMMATR_5030_LCURLISTRecord();
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.sect_cd = Util.checkString(rset0.getString("sect_cd"));
			rec.issu_dt = Util.checkString(rset0.getString("issu_dt"));
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.sect_nm = Util.checkString(rset0.getString("sect_nm"));
			rec.slip_qty = Util.checkString(rset0.getString("slip_qty"));
			rec.sect_yn = Util.checkString(rset0.getString("sect_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_COMMATR_5030_LDataSet ds = (MT_COMMATR_5030_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_5030_LCURLISTRecord curlistRec = (MT_COMMATR_5030_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.medi_cd%>
<%= curlistRec.sect_cd%>
<%= curlistRec.issu_dt%>
<%= curlistRec.medi_nm%>
<%= curlistRec.sect_nm%>
<%= curlistRec.slip_qty%>
<%= curlistRec.sect_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 13 10:10:33 KST 2010 */