/***************************************************************************************************
* 파일명 : 
* 기능 : 
* 작성일자 : 
* 작성자 : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.bns.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.bns.dm.*;
import chosun.ciis.se.bns.rec.*;

/**
 * 
 */


public class SE_BNS_2110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SE_BNS_2110_LDataSet(){}
	public SE_BNS_2110_LDataSet(String errcode, String errmsg){
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

		ResultSet rset5 = (ResultSet) cstmt.getObject(13);
		while(rset5.next()){
			SE_BNS_2110_LCURLISTRecord rec = new SE_BNS_2110_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset5.getString("occr_dt"));
			rec.slip_clsf = Util.checkString(rset5.getString("slip_clsf"));
			rec.seq = Util.checkString(rset5.getString("seq"));
			rec.rcpm_dt = Util.checkString(rset5.getString("rcpm_dt"));
			rec.dept_nm = Util.checkString(rset5.getString("dept_nm"));
			rec.part_nm = Util.checkString(rset5.getString("part_nm"));
			rec.area_nm = Util.checkString(rset5.getString("area_nm"));
			rec.area_cd = Util.checkString(rset5.getString("area_cd"));
			rec.cnt = Util.checkString(rset5.getString("cnt"));
			rec.actu_slip_no = Util.checkString(rset5.getString("actu_slip_no"));
			rec.acct_slip_no = Util.checkString(rset5.getString("acct_slip_no"));
			rec.rcpm_amt = Util.checkString(rset5.getString("rcpm_amt"));
			rec.clos_yn = Util.checkString(rset5.getString("clos_yn"));
			rec.bank_cd = Util.checkString(rset5.getString("bank_cd"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BNS_2110_LDataSet ds = (SE_BNS_2110_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BNS_2110_LCURLISTRecord curlistRec = (SE_BNS_2110_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.occr_dt%>
<%= curlistRec.slip_clsf%>
<%= curlistRec.seq%>
<%= curlistRec.rcpm_dt%>
<%= curlistRec.dept_nm%>
<%= curlistRec.part_nm%>
<%= curlistRec.area_nm%>
<%= curlistRec.area_cd%>
<%= curlistRec.cnt%>
<%= curlistRec.actu_slip_no%>
<%= curlistRec.acct_slip_no%>
<%= curlistRec.rcpm_amt%>
<%= curlistRec.clos_yn%>
<%= curlistRec.bank_cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 14 16:15:43 KST 2009 */