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


package chosun.ciis.is.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.rec.*;

/**
 * 
 */


public class IS_BAS_1910_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BAS_1910_LDataSet(){}
	public IS_BAS_1910_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			IS_BAS_1910_LCURLISTRecord rec = new IS_BAS_1910_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.trgt_mm = Util.checkString(rset0.getString("trgt_mm"));
			rec.sale_clsf = Util.checkString(rset0.getString("sale_clsf"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.sub_dept_cd = Util.checkString(rset0.getString("sub_dept_cd"));
			rec.chrg_pers = Util.checkString(rset0.getString("chrg_pers"));
			rec.chrg_pers_nm = Util.checkString(rset0.getString("chrg_pers_nm"));
			rec.trgt_sale_amt = Util.checkString(rset0.getString("trgt_sale_amt"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_BAS_1910_LDataSet ds = (IS_BAS_1910_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		IS_BAS_1910_LCURLISTRecord curlistRec = (IS_BAS_1910_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.cmpy_cd%>
<%= curlistRec.trgt_mm%>
<%= curlistRec.sale_clsf%>
<%= curlistRec.dept_cd%>
<%= curlistRec.sub_dept_cd%>
<%= curlistRec.chrg_pers%>
<%= curlistRec.chrg_pers_nm%>
<%= curlistRec.trgt_sale_amt%>
<%= curlistRec.remk%>
<%= curlistRec.chg_dt_tm%>
<%= curlistRec.chg_pers%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 24 17:42:47 KST 2012 */