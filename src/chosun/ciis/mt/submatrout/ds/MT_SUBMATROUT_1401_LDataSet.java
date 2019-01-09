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


public class MT_SUBMATROUT_1401_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATROUT_1401_LDataSet(){}
	public MT_SUBMATROUT_1401_LDataSet(String errcode, String errmsg){
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
			MT_SUBMATROUT_1401_LCURLISTRecord rec = new MT_SUBMATROUT_1401_LCURLISTRecord();
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.maeipdan = Util.checkString(rset0.getString("maeipdan"));
			rec.ewh_budg_cd = Util.checkString(rset0.getString("ewh_budg_cd"));
			rec.owh_budg_cd = Util.checkString(rset0.getString("owh_budg_cd"));
			rec.std_modl = Util.checkString(rset0.getString("std_modl"));
			rec.safe_stok = Util.checkString(rset0.getString("safe_stok"));
			rec.hjg_cnt = Util.checkString(rset0.getString("hjg_cnt"));
			rec.hjg_amt = Util.checkString(rset0.getString("hjg_amt"));
			rec.igacctcdnm = Util.checkString(rset0.getString("igacctcdnm"));
			rec.cgacctcdnm = Util.checkString(rset0.getString("cgacctcdnm"));
			rec.dstb_rat_cd = Util.checkString(rset0.getString("dstb_rat_cd"));
			rec.ordr_qunt = Util.checkString(rset0.getString("ordr_qunt"));
			rec.matr_cnfm_qunt = Util.checkString(rset0.getString("matr_cnfm_qunt"));
			rec.matr_acpn_yn = Util.checkString(rset0.getString("matr_acpn_yn"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATROUT_1401_LDataSet ds = (MT_SUBMATROUT_1401_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATROUT_1401_LCURLISTRecord curlistRec = (MT_SUBMATROUT_1401_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.fac_clsf%>
<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.unit%>
<%= curlistRec.maeipdan%>
<%= curlistRec.ewh_budg_cd%>
<%= curlistRec.owh_budg_cd%>
<%= curlistRec.std_modl%>
<%= curlistRec.safe_stok%>
<%= curlistRec.hjg_cnt%>
<%= curlistRec.hjg_amt%>
<%= curlistRec.igacctcdnm%>
<%= curlistRec.cgacctcdnm%>
<%= curlistRec.dstb_rat_cd%>
<%= curlistRec.ordr_qunt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu May 07 14:56:52 KST 2009 */