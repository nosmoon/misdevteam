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


package chosun.ciis.hd.lvcmpy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.lvcmpy.dm.*;
import chosun.ciis.hd.lvcmpy.rec.*;

/**
 * 
 */


public class HD_LVCMPY_3502_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_LVCMPY_3502_LDataSet(){}
	public HD_LVCMPY_3502_LDataSet(String errcode, String errmsg){
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
			HD_LVCMPY_3502_LCURLISTRecord rec = new HD_LVCMPY_3502_LCURLISTRecord();
			rec.dept_name = Util.checkString(rset0.getString("dept_name"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dty_name = Util.checkString(rset0.getString("dty_name"));
			rec.posi_name = Util.checkString(rset0.getString("posi_name"));
			rec.acml_amt01 = Util.checkString(rset0.getString("acml_amt01"));
			rec.acml_amt02 = Util.checkString(rset0.getString("acml_amt02"));
			rec.acml_amt03 = Util.checkString(rset0.getString("acml_amt03"));
			rec.acml_amt04 = Util.checkString(rset0.getString("acml_amt04"));
			rec.acml_amt05 = Util.checkString(rset0.getString("acml_amt05"));
			rec.acml_amt06 = Util.checkString(rset0.getString("acml_amt06"));
			rec.acml_amt07 = Util.checkString(rset0.getString("acml_amt07"));
			rec.acml_amt08 = Util.checkString(rset0.getString("acml_amt08"));
			rec.acml_amt09 = Util.checkString(rset0.getString("acml_amt09"));
			rec.acml_amt10 = Util.checkString(rset0.getString("acml_amt10"));
			rec.acml_amt11 = Util.checkString(rset0.getString("acml_amt11"));
			rec.acml_amt12 = Util.checkString(rset0.getString("acml_amt12"));
			rec.lvcmpy_saly_estm_amt = Util.checkString(rset0.getString("lvcmpy_saly_estm_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_LVCMPY_3502_LDataSet ds = (HD_LVCMPY_3502_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_LVCMPY_3502_LCURLISTRecord curlistRec = (HD_LVCMPY_3502_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.dept_name%>
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dty_name%>
<%= curlistRec.posi_name%>
<%= curlistRec.acml_amt01%>
<%= curlistRec.acml_amt02%>
<%= curlistRec.acml_amt03%>
<%= curlistRec.acml_amt04%>
<%= curlistRec.acml_amt05%>
<%= curlistRec.acml_amt06%>
<%= curlistRec.acml_amt07%>
<%= curlistRec.acml_amt08%>
<%= curlistRec.acml_amt09%>
<%= curlistRec.acml_amt10%>
<%= curlistRec.acml_amt11%>
<%= curlistRec.acml_amt12%>
<%= curlistRec.lvcmpy_saly_estm_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Jun 13 16:32:55 KST 2009 */