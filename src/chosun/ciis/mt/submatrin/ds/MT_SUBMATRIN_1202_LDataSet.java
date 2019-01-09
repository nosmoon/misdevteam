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


package chosun.ciis.mt.submatrin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrin.dm.*;
import chosun.ciis.mt.submatrin.rec.*;

/**
 * 
 */


public class MT_SUBMATRIN_1202_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATRIN_1202_LDataSet(){}
	public MT_SUBMATRIN_1202_LDataSet(String errcode, String errmsg){
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
			MT_SUBMATRIN_1202_LCURLISTRecord rec = new MT_SUBMATRIN_1202_LCURLISTRecord();
			rec.ewh_dt = Util.checkString(rset0.getString("ewh_dt"));
			rec.purc_clsf = Util.checkString(rset0.getString("purc_clsf"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.ewh_qunt = Util.checkString(rset0.getString("ewh_qunt"));
			rec.ewh_unit = Util.checkString(rset0.getString("ewh_unit"));
			rec.ewh_uprc = Util.checkString(rset0.getString("ewh_uprc"));
			rec.ewh_amt = Util.checkString(rset0.getString("ewh_amt"));
			rec.use_deptcd = Util.checkString(rset0.getString("use_deptcd"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.owh_dt = Util.checkString(rset0.getString("owh_dt"));
			rec.owh_seq = Util.checkString(rset0.getString("owh_seq"));
			rec.owh_sub_seq = Util.checkString(rset0.getString("owh_sub_seq"));
			rec.incmg_slip_dt = Util.checkString(rset0.getString("incmg_slip_dt"));
			rec.ewh_budg_cd = Util.checkString(rset0.getString("ewh_budg_cd"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.medi_cd = Util.checkString(rset0.getString("medi_cd"));
			rec.medi_ser_no = Util.checkString(rset0.getString("medi_ser_no"));
			rec.bo_item_yn = Util.checkString(rset0.getString("bo_item_yn"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.owh_budg_cd = Util.checkString(rset0.getString("owh_budg_cd"));
			rec.factcdnm = Util.checkString(rset0.getString("factcdnm"));
			rec.bimccdnm = Util.checkString(rset0.getString("bimccdnm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.dlco_cd = Util.checkString(rset0.getString("dlco_cd"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATRIN_1202_LDataSet ds = (MT_SUBMATRIN_1202_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATRIN_1202_LCURLISTRecord curlistRec = (MT_SUBMATRIN_1202_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.ewh_dt%>
<%= curlistRec.purc_clsf%>
<%= curlistRec.fac_clsf%>
<%= curlistRec.matr_cd%>
<%= curlistRec.ewh_qunt%>
<%= curlistRec.ewh_unit%>
<%= curlistRec.ewh_uprc%>
<%= curlistRec.ewh_amt%>
<%= curlistRec.use_deptcd%>
<%= curlistRec.remk%>
<%= curlistRec.owh_dt%>
<%= curlistRec.owh_seq%>
<%= curlistRec.owh_sub_seq%>
<%= curlistRec.incmg_slip_dt%>
<%= curlistRec.ewh_budg_cd%>
<%= curlistRec.chg_pers%>
<%= curlistRec.medi_cd%>
<%= curlistRec.medi_ser_no%>
<%= curlistRec.bo_item_yn%>
<%= curlistRec.matr_nm%>
<%= curlistRec.owh_budg_cd%>
<%= curlistRec.factcdnm%>
<%= curlistRec.bimccdnm%>
<%= curlistRec.ern%>
<%= curlistRec.dlco_cd%>
<%= curlistRec.addr%>
<%= curlistRec.dlco_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 10 11:40:18 KST 2009 */