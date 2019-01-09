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


public class MT_SUBMATROUT_2002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATROUT_2002_LDataSet(){}
	public MT_SUBMATROUT_2002_LDataSet(String errcode, String errmsg){
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
			MT_SUBMATROUT_2002_LCURLISTRecord rec = new MT_SUBMATROUT_2002_LCURLISTRecord();
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.hjg_cnt = Util.checkString(rset0.getString("hjg_cnt"));
			rec.hjg_amt = Util.checkString(rset0.getString("hjg_amt"));
			rec.mov_inout_dt = Util.checkString(rset0.getString("mov_inout_dt"));
			rec.mov_out_fac_cd = Util.checkString(rset0.getString("mov_out_fac_cd"));
			rec.mov_out_deptcd = Util.checkString(rset0.getString("mov_out_deptcd"));
			rec.mov_out_budg_cd = Util.checkString(rset0.getString("mov_out_budg_cd"));
			rec.mov_out_budg_acctcd = Util.checkString(rset0.getString("mov_out_budg_acctcd"));
			rec.mov_out_budg_cd_nm = Util.checkString(rset0.getString("mov_out_budg_cd_nm"));
			rec.mov_out_budg_acctcdnm = Util.checkString(rset0.getString("mov_out_budg_acctcdnm"));
			rec.mov_out_qunt = Util.checkString(rset0.getString("mov_out_qunt"));
			rec.mov_out_unit = Util.checkString(rset0.getString("mov_out_unit"));
			rec.mov_out_uprc = Util.checkString(rset0.getString("mov_out_uprc"));
			rec.mov_out_amt = Util.checkString(rset0.getString("mov_out_amt"));
			rec.mov_in_fac_cd = Util.checkString(rset0.getString("mov_in_fac_cd"));
			rec.mov_in_deptcd = Util.checkString(rset0.getString("mov_in_deptcd"));
			rec.mov_in_budg_cd = Util.checkString(rset0.getString("mov_in_budg_cd"));
			rec.mov_in_budg_acctcd = Util.checkString(rset0.getString("mov_in_budg_acctcd"));
			rec.mov_in_budg_cd_nm = Util.checkString(rset0.getString("mov_in_budg_cd_nm"));
			rec.mov_in_budg_acctcdnm = Util.checkString(rset0.getString("mov_in_budg_acctcdnm"));
			rec.mov_in_qunt = Util.checkString(rset0.getString("mov_in_qunt"));
			rec.mov_in_unit = Util.checkString(rset0.getString("mov_in_unit"));
			rec.mov_in_uprc = Util.checkString(rset0.getString("mov_in_uprc"));
			rec.mov_in_amt = Util.checkString(rset0.getString("mov_in_amt"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_cd_nm = Util.checkString(rset0.getString("medi_cd_nm"));
			rec.medi_ser_no = Util.checkString(rset0.getString("medi_ser_no"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATROUT_2002_LDataSet ds = (MT_SUBMATROUT_2002_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATROUT_2002_LCURLISTRecord curlistRec = (MT_SUBMATROUT_2002_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.sub_seq%>
<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.unit%>
<%= curlistRec.hjg_cnt%>
<%= curlistRec.hjg_amt%>
<%= curlistRec.mov_inout_dt%>
<%= curlistRec.mov_out_fac_cd%>
<%= curlistRec.mov_out_deptcd%>
<%= curlistRec.mov_out_budg_cd%>
<%= curlistRec.mov_out_budg_acctcd%>
<%= curlistRec.mov_out_budg_cd_nm%>
<%= curlistRec.mov_out_budg_acctcdnm%>
<%= curlistRec.mov_out_qunt%>
<%= curlistRec.mov_out_unit%>
<%= curlistRec.mov_out_uprc%>
<%= curlistRec.mov_out_amt%>
<%= curlistRec.mov_in_fac_cd%>
<%= curlistRec.mov_in_deptcd%>
<%= curlistRec.mov_in_budg_cd%>
<%= curlistRec.mov_in_budg_acctcd%>
<%= curlistRec.mov_in_budg_cd_nm%>
<%= curlistRec.mov_in_budg_acctcdnm%>
<%= curlistRec.mov_in_qunt%>
<%= curlistRec.mov_in_unit%>
<%= curlistRec.mov_in_uprc%>
<%= curlistRec.mov_in_amt%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_cd_nm%>
<%= curlistRec.medi_ser_no%>
<%= curlistRec.remk%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 31 13:58:39 KST 2009 */