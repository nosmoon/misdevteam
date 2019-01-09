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


package chosun.ciis.en.innexp.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.en.innexp.dm.*;
import chosun.ciis.en.innexp.rec.*;

/**
 * 
 */


public class EN_INNEXP_1011_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public EN_INNEXP_1011_LDataSet(){}
	public EN_INNEXP_1011_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			EN_INNEXP_1011_LCURLISTRecord rec = new EN_INNEXP_1011_LCURLISTRecord();
			rec.evnt_code = Util.checkString(rset0.getString("evnt_code"));
			rec.evnt_nm = Util.checkString(rset0.getString("evnt_nm"));
			rec.dlco_clsf_cd_nm = Util.checkString(rset0.getString("dlco_clsf_cd_nm"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.chrg_pers_emp_no = Util.checkString(rset0.getString("chrg_pers_emp_no"));
			rec.chrg_pers_emp_nm = Util.checkString(rset0.getString("chrg_pers_emp_nm"));
			rec.misu_amt = Util.checkString(rset0.getString("misu_amt"));
			rec.evnt_yy = Util.checkString(rset0.getString("evnt_yy"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.evnt_seq = Util.checkString(rset0.getString("evnt_seq"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_nm = Util.checkString(rset0.getString("budg_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	EN_INNEXP_1011_LDataSet ds = (EN_INNEXP_1011_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		EN_INNEXP_1011_LCURLISTRecord curlistRec = (EN_INNEXP_1011_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.evnt_code%>
<%= curlistRec.evnt_nm%>
<%= curlistRec.dlco_clsf_cd_nm%>
<%= curlistRec.dlco_no%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.chrg_pers_emp_no%>
<%= curlistRec.chrg_pers_emp_nm%>
<%= curlistRec.misu_amt%>
<%= curlistRec.evnt_yy%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.evnt_seq%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 14 16:26:35 KST 2009 */