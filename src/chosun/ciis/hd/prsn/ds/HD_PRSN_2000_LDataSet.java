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


package chosun.ciis.hd.prsn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.prsn.dm.*;
import chosun.ciis.hd.prsn.rec.*;

/**
 * 
 */


public class HD_PRSN_2000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_PRSN_2000_LDataSet(){}
	public HD_PRSN_2000_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			HD_PRSN_2000_LCURLISTRecord rec = new HD_PRSN_2000_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.pgm_id = Util.checkString(rset0.getString("pgm_id"));
			rec.pgm_nm = Util.checkString(rset0.getString("pgm_nm"));
			rec.pgm_url = Util.checkString(rset0.getString("pgm_url"));
			rec.job_clsf = Util.checkString(rset0.getString("job_clsf"));
			rec.job_clsf_nm = Util.checkString(rset0.getString("job_clsf_nm"));
			rec.annc_frdt = Util.checkString(rset0.getString("annc_frdt"));
			rec.annc_todt = Util.checkString(rset0.getString("annc_todt"));
			rec.annc_cont = Util.checkString(rset0.getString("annc_cont"));
			rec.annc_clsf = Util.checkString(rset0.getString("annc_clsf"));
			rec.annc_clsf_nm = Util.checkString(rset0.getString("annc_clsf_nm"));
			rec.lg_id = Util.checkString(rset0.getString("lg_id"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_PRSN_2000_LDataSet ds = (HD_PRSN_2000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_PRSN_2000_LCURLISTRecord curlistRec = (HD_PRSN_2000_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.flnm%>
<%= curlistRec.dept_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_cd%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_cd%>
<%= curlistRec.posi_nm%>
<%= curlistRec.pgm_id%>
<%= curlistRec.pgm_nm%>
<%= curlistRec.pgm_url%>
<%= curlistRec.job_clsf%>
<%= curlistRec.job_clsf_nm%>
<%= curlistRec.annc_frdt%>
<%= curlistRec.annc_todt%>
<%= curlistRec.annc_cont%>
<%= curlistRec.annc_clsf%>
<%= curlistRec.annc_clsf_nm%>
<%= curlistRec.lg_id%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Apr 12 14:05:43 KST 2009 */