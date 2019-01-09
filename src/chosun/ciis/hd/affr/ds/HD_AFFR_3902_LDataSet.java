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


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_3902_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_3902_LDataSet(){}
	public HD_AFFR_3902_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			HD_AFFR_3902_LCURLISTRecord rec = new HD_AFFR_3902_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.aplc_dt = Util.checkString(rset0.getString("aplc_dt"));
			rec.acq_pers = Util.checkString(rset0.getString("acq_pers"));
			rec.start_plac = Util.checkString(rset0.getString("start_plac"));
			rec.ariv_plac = Util.checkString(rset0.getString("ariv_plac"));
			rec.use_purp = Util.checkString(rset0.getString("use_purp"));
			rec.cont_item = Util.checkString(rset0.getString("cont_item"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.aplc_cnfm_yn = Util.checkString(rset0.getString("aplc_cnfm_yn"));
			rec.aplc_cnfm_ynnm = Util.checkString(rset0.getString("aplc_cnfm_ynnm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_3902_LDataSet ds = (HD_AFFR_3902_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_3902_LCURLISTRecord curlistRec = (HD_AFFR_3902_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.aplc_dt%>
<%= curlistRec.acq_pers%>
<%= curlistRec.start_plac%>
<%= curlistRec.ariv_plac%>
<%= curlistRec.use_purp%>
<%= curlistRec.cont_item%>
<%= curlistRec.remk%>
<%= curlistRec.aplc_cnfm_yn%>
<%= curlistRec.aplc_cnfm_ynnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 11 09:50:47 KST 2018 */