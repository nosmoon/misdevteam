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


package chosun.ciis.mt.submatrcla.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrcla.dm.*;
import chosun.ciis.mt.submatrcla.rec.*;

/**
 * 
 */


public class MT_SUBMATRCLA_4201_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_SUBMATRCLA_4201_LDataSet(){}
	public MT_SUBMATRCLA_4201_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			MT_SUBMATRCLA_4201_LCURLISTRecord rec = new MT_SUBMATRCLA_4201_LCURLISTRecord();
			rec.chk_yn = Util.checkString(rset0.getString("chk_yn"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.sub_seq = Util.checkString(rset0.getString("sub_seq"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.via_dept = Util.checkString(rset0.getString("via_dept"));
			rec.matr_cd = Util.checkString(rset0.getString("matr_cd"));
			rec.matr_nm = Util.checkString(rset0.getString("matr_nm"));
			rec.part_cd = Util.checkString(rset0.getString("part_cd"));
			rec.part_nm = Util.checkString(rset0.getString("part_nm"));
			rec.clam_qunt = Util.checkString(rset0.getString("clam_qunt"));
			rec.fix_qunt = Util.checkString(rset0.getString("fix_qunt"));
			rec.ewh_qunt = Util.checkString(rset0.getString("ewh_qunt"));
			rec.uprc = Util.checkString(rset0.getString("uprc"));
			rec.unit = Util.checkString(rset0.getString("unit"));
			rec.amt = Util.checkString(rset0.getString("amt"));
			rec.acpn_dt = Util.checkString(rset0.getString("acpn_dt"));
			rec.ewh_clsf = Util.checkString(rset0.getString("ewh_clsf"));
			rec.dlco_no = Util.checkString(rset0.getString("dlco_no"));
			rec.dlco_nm = Util.checkString(rset0.getString("dlco_nm"));
			rec.ern = Util.checkString(rset0.getString("ern"));
			rec.std_modl = Util.checkString(rset0.getString("std_modl"));
			rec.usag = Util.checkString(rset0.getString("usag"));
			rec.part_clas1_nm = Util.checkString(rset0.getString("part_clas1_nm"));
			this.curlist.add(rec);
		} 
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_SUBMATRCLA_4201_LDataSet ds = (MT_SUBMATRCLA_4201_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_SUBMATRCLA_4201_LCURLISTRecord curlistRec = (MT_SUBMATRCLA_4201_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.dept_cd%>
<%= curlistRec.via_dept%>
<%= curlistRec.matr_cd%>
<%= curlistRec.matr_nm%>
<%= curlistRec.clam_qunt%>
<%= curlistRec.fix_qunt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 13 17:19:37 KST 2016 */