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


package chosun.ciis.hd.saly.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.rec.*;

/**
 * 
 */


public class HD_SALY_6210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_SALY_6210_LDataSet(){}
	public HD_SALY_6210_LDataSet(String errcode, String errmsg){
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
			HD_SALY_6210_LCURLISTRecord rec = new HD_SALY_6210_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.mang_no = Util.checkString(rset0.getString("mang_no"));
			rec.cmpy_blng_cd = Util.checkString(rset0.getString("cmpy_blng_cd"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.fit_yy = Util.checkString(rset0.getString("fit_yy"));
			rec.fit_no = Util.checkString(rset0.getString("fit_no"));
			rec.fitness_dus = Util.checkString(rset0.getString("fitness_dus"));
			rec.locker_yn = Util.checkString(rset0.getString("locker_yn"));
			rec.locker_pay = Util.checkString(rset0.getString("locker_pay"));
			rec.fitness_sum = Util.checkString(rset0.getString("fitness_sum"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.magam_yn = Util.checkString(rset0.getString("magam_yn"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_SALY_6210_LDataSet ds = (HD_SALY_6210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_SALY_6210_LCURLISTRecord curlistRec = (HD_SALY_6210_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.mang_no%>
<%= curlistRec.cmpy_blng_cd%>
<%= curlistRec.nm_korn%>
<%= curlistRec.tel_no%>
<%= curlistRec.fit_yy%>
<%= curlistRec.fit_no%>
<%= curlistRec.fitness_dus%>
<%= curlistRec.locker_yn%>
<%= curlistRec.locker_pay%>
<%= curlistRec.fitness_sum%>
<%= curlistRec.remk%>
<%= curlistRec.magam_yn%>
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 17 14:12:39 KST 2015 */