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


package chosun.ciis.mt.submatrout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.rec.*;

/**
 * 
 */


public class MT_SUBMATROUT_3203_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATROUT_3203_LDataSet(){}
	public MT_SUBMATROUT_3203_LDataSet(String errcode, String errmsg){
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
			MT_SUBMATROUT_3203_LCURLISTRecord rec = new MT_SUBMATROUT_3203_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.ordr_dt = Util.checkString(rset0.getString("ordr_dt"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.dlvs_dt = Util.checkString(rset0.getString("dlvs_dt"));
			rec.dlvs_fac_cd = Util.checkString(rset0.getString("dlvs_fac_cd"));
			rec.dlvs_chrg_pers = Util.checkString(rset0.getString("dlvs_chrg_pers"));
			rec.chrg_pers_cntc_plac = Util.checkString(rset0.getString("chrg_pers_cntc_plac"));
			rec.chrg_pers_email = Util.checkString(rset0.getString("chrg_pers_email"));
			rec.amt_pay_mthd = Util.checkString(rset0.getString("amt_pay_mthd"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.ordr_yn = Util.checkString(rset0.getString("ordr_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATROUT_3203_LDataSet ds = (MT_SUBMATROUT_3203_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATROUT_3203_LCURLISTRecord curlistRec = (MT_SUBMATROUT_3203_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.occr_dt%>
<%= curlistRec.seq%>
<%= curlistRec.ordr_dt%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.dlco_nm%>
<%= curlistRec.dlvs_dt%>
<%= curlistRec.dlvs_fac_cd%>
<%= curlistRec.dlvs_chrg_pers%>
<%= curlistRec.chrg_pers_cntc_plac%>
<%= curlistRec.chrg_pers_email%>
<%= curlistRec.amt_pay_mthd%>
<%= curlistRec.remk%>
<%= curlistRec.ordr_yn%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 09:22:25 KST 2009 */