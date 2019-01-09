/***************************************************************************************************
* 파일명 : FC_ACCT_2901_L.java
* 기능 :   명함신청관리 검색
* 작성일자 :
* 작성자 :
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
 * 명함신청관리 검색
 */

public class HD_AFFR_2900_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_2900_LDataSet(){}
	public HD_AFFR_2900_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(9);
		while(rset0.next()){
			HD_AFFR_2900_LCURLISTRecord rec = new HD_AFFR_2900_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.emp_no = Util.checkString(rset0.getString("emp_no"));
			rec.occr_dt = Util.checkString(rset0.getString("occr_dt"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.flnm = Util.checkString(rset0.getString("flnm"));
			rec.dept_cd = Util.checkString(rset0.getString("dept_cd"));
			rec.dty_cd = Util.checkString(rset0.getString("dty_cd"));
			rec.posi_cd = Util.checkString(rset0.getString("posi_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			rec.dty_nm = Util.checkString(rset0.getString("dty_nm"));
			rec.posi_nm = Util.checkString(rset0.getString("posi_nm"));
			rec.qunt_side_clam_qunt = Util.checkString(rset0.getString("qunt_side_clam_qunt"));
			rec.dn_side_clam_qunt = Util.checkString(rset0.getString("dn_side_clam_qunt"));
			rec.aplc_flnm = Util.checkString(rset0.getString("aplc_flnm"));
			rec.aplc_engl_flnm = Util.checkString(rset0.getString("aplc_engl_flnm"));
			rec.aplc_dty_nm = Util.checkString(rset0.getString("aplc_dty_nm"));
			rec.aplc_offi_nm = Util.checkString(rset0.getString("aplc_offi_nm"));
			rec.aplc_dept_nm = Util.checkString(rset0.getString("aplc_dept_nm"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.fax_no = Util.checkString(rset0.getString("fax_no"));
			rec.ceph_no = Util.checkString(rset0.getString("ceph_no"));
			rec.email = Util.checkString(rset0.getString("email"));
			rec.zip_1 = Util.checkString(rset0.getString("zip_1"));
			rec.zip_2 = Util.checkString(rset0.getString("zip_2"));
			rec.addr = Util.checkString(rset0.getString("addr"));
			rec.dtls_addr = Util.checkString(rset0.getString("dtls_addr"));
			rec.remk = Util.checkString(rset0.getString("remk"));
			rec.aplc_cnfm_yn = Util.checkString(rset0.getString("aplc_cnfm_yn"));
			rec.aplc_cnfm_ynnm = Util.checkString(rset0.getString("aplc_cnfm_ynnm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_2900_LDataSet ds = (HD_AFFR_2900_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_AFFR_2900_LCURLISTRecord curlistRec = (HD_AFFR_2900_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.dty_cd%>
<%= curlistRec.posi_cd%>
<%= curlistRec.dept_nm%>
<%= curlistRec.dty_nm%>
<%= curlistRec.posi_nm%>
<%= curlistRec.qunt_side_clam_qunt%>
<%= curlistRec.dn_side_clam_qunt%>
<%= curlistRec.aplc_flnm%>
<%= curlistRec.aplc_engl_flnm%>
<%= curlistRec.aplc_dty_nm%>
<%= curlistRec.aplc_offi_nm%>
<%= curlistRec.aplc_dept_nm%>
<%= curlistRec.tel_no%>
<%= curlistRec.fax_no%>
<%= curlistRec.ceph_no%>
<%= curlistRec.email%>
<%= curlistRec.zip_1%>
<%= curlistRec.zip_2%>
<%= curlistRec.addr%>
<%= curlistRec.dtls_addr%>
<%= curlistRec.remk%>
<%= curlistRec.aplc_cnfm_yn%>
<%= curlistRec.aplc_cnfm_ynnm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 01 19:41:59 KST 2009 */