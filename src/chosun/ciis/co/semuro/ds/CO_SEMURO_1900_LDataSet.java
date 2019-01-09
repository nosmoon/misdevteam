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


package chosun.ciis.co.semuro.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.semuro.dm.*;
import chosun.ciis.co.semuro.rec.*;

/**
 * 
 */


public class CO_SEMURO_1900_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_SEMURO_1900_LDataSet(){}
	public CO_SEMURO_1900_LDataSet(String errcode, String errmsg){
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
			CO_SEMURO_1900_LCURLISTRecord rec = new CO_SEMURO_1900_LCURLISTRecord();
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.slip_occr_dt = Util.checkString(rset0.getString("slip_occr_dt"));
			rec.slip_occr_cd = Util.checkString(rset0.getString("slip_occr_cd"));
			rec.slip_seq = Util.checkString(rset0.getString("slip_seq"));
			rec.stat_clsf = Util.checkString(rset0.getString("stat_clsf"));
			rec.rmsg_pers_eps_no = Util.checkString(rset0.getString("rmsg_pers_eps_no"));
			rec.semuro_no = Util.checkString(rset0.getString("semuro_no"));
			rec.rmsg_pers_presi_nm = Util.checkString(rset0.getString("rmsg_pers_presi_nm"));
			rec.rmsg_pers_nm = Util.checkString(rset0.getString("rmsg_pers_nm"));
			rec.rmsg_pers_email = Util.checkString(rset0.getString("rmsg_pers_email"));
			rec.tot_suply_amt = Util.checkString(rset0.getString("tot_suply_amt"));
			rec.tot_tax_amt = Util.checkString(rset0.getString("tot_tax_amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_SEMURO_1900_LDataSet ds = (CO_SEMURO_1900_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		CO_SEMURO_1900_LCURLISTRecord curlistRec = (CO_SEMURO_1900_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.seq%>
<%= curlistRec.slip_occr_dt%>
<%= curlistRec.slip_occr_cd%>
<%= curlistRec.slip_seq%>
<%= curlistRec.stat_clsf%>
<%= curlistRec.rmsg_pers_eps_no%>
<%= curlistRec.semuro_no%>
<%= curlistRec.rmsg_pers_presi_nm%>
<%= curlistRec.rmsg_pers_nm%>
<%= curlistRec.rmsg_pers_email%>
<%= curlistRec.tot_suply_amt%>
<%= curlistRec.tot_tax_amt%>
<%= curlistRec.tot_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 17 11:58:19 KST 2009 */