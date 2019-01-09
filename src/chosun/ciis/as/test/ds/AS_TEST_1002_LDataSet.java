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


package chosun.ciis.as.test.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.test.dm.*;
import chosun.ciis.as.test.rec.*;

/**
 * 
 */


public class AS_TEST_1002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_TEST_1002_LDataSet(){}
	public AS_TEST_1002_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			AS_TEST_1002_LCURLISTRecord rec = new AS_TEST_1002_LCURLISTRecord();
			rec.dev_src = Util.checkString(rset0.getString("dev_src"));
			rec.real_src = Util.checkString(rset0.getString("real_src"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_COMMATR_5010_LDataSet ds = (MT_COMMATR_5010_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_5010_LCURLISTRecord curlistRec = (MT_COMMATR_5010_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.issu_dt%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.fac_nm%>
<%= curlistRec.issu_pcnt_0100%>
<%= curlistRec.issu_pcnt_0200%>
<%= curlistRec.issu_pcnt_9999%>
<%= curlistRec.issu_pcnt%>
<%= curlistRec.basi_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 12 14:44:41 KST 2010 */