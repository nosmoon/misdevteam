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


package chosun.ciis.hd.insr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.rec.*;

/**
 * 
 */


public class HD_INSR_1300_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_INSR_1300_LDataSet(){}
	public HD_INSR_1300_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_INSR_1300_LCURLISTRecord rec = new HD_INSR_1300_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_cd_nm = Util.checkString(rset0.getString("dept_cd_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_cd_nm = Util.checkString(rset0.getString("dty_cd_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_cd_nm = Util.checkString(rset0.getString("posi_cd_nm"));
			rec.lst_slf_burd_insr_fee = Util.checkString(rset0.getString("lst_slf_burd_insr_fee"));
			rec.lst_slf_burd_med_care_insr_fee = Util.checkString(rset0.getString("lst_slf_burd_med_care_insr_fee"));
			rec.slf_burd_insr_fee = Util.checkString(rset0.getString("slf_burd_insr_fee"));
			rec.slf_burd_med_care_insr_fee = Util.checkString(rset0.getString("slf_burd_med_care_insr_fee"));
			rec.hlth_insr_fee = Util.checkString(rset0.getString("hlth_insr_fee"));
			rec.hlth_insr_med_care_insr_fee = Util.checkString(rset0.getString("hlth_insr_med_care_insr_fee"));
			rec.slf_minus_insr = Util.checkString(rset0.getString("slf_minus_insr"));
			rec.slf_minus_care = Util.checkString(rset0.getString("slf_minus_care"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_INSR_1300_LDataSet ds = (HD_INSR_1300_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_INSR_1300_LCURLISTRecord curlistRec = (HD_INSR_1300_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.emp_no%>
<%= curlistRec.nm_korn%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_cd_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_cd_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_cd_nm%>
<%= curlistRec.lst_slf_burd_insr_fee%>
<%= curlistRec.lst_slf_burd_med_care_insr_fee%>
<%= curlistRec.slf_burd_insr_fee%>
<%= curlistRec.slf_burd_med_care_insr_fee%>
<%= curlistRec.hlth_insr_fee%>
<%= curlistRec.hlth_insr_med_care_insr_fee%>
<%= curlistRec.slf_minus_insr%>
<%= curlistRec.slf_minus_care%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri May 15 14:39:28 KST 2009 */