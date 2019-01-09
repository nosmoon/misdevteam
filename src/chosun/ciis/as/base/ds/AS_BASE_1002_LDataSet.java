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


package chosun.ciis.as.base.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.as.base.dm.*;
import chosun.ciis.as.base.rec.*;

/**
 * 
 */


public class AS_BASE_1002_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AS_BASE_1002_LDataSet(){}
	public AS_BASE_1002_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			AS_BASE_1002_LCURLISTRecord rec = new AS_BASE_1002_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.item_cd = Util.checkString(rset0.getString("item_cd"));
			rec.item_nm = Util.checkString(rset0.getString("item_nm"));
			rec.aset_cnt = Util.checkString(rset0.getString("aset_cnt"));
			rec.unit_cd = Util.checkString(rset0.getString("unit_cd"));
			rec.unit_nm = Util.checkString(rset0.getString("unit_nm"));
			rec.redm_clsf = Util.checkString(rset0.getString("redm_clsf"));
			rec.redm_clsf_nm = Util.checkString(rset0.getString("redm_clsf_nm"));
			rec.redm_mthd_cd = Util.checkString(rset0.getString("redm_mthd_cd"));
			rec.redm_mthd_cd_nm = Util.checkString(rset0.getString("redm_mthd_cd_nm"));
			rec.svc_yys_cnt = rset0.getInt("svc_yys_cnt");
			rec.accd_cd = Util.checkString(rset0.getString("accd_cd"));
			rec.budg_cd = Util.checkString(rset0.getString("budg_cd"));
			rec.budg_cd_nm = Util.checkString(rset0.getString("budg_cd_nm"));
			rec.use_yn = Util.checkString(rset0.getString("use_yn"));
			rec.incmg_pers_ipadd = Util.checkString(rset0.getString("incmg_pers_ipadd"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.nm_korn = Util.checkString(rset0.getString("nm_korn"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AS_BASE_1002_LDataSet ds = (AS_BASE_1002_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AS_BASE_1002_LCURLISTRecord curlistRec = (AS_BASE_1002_LCURLISTRecord)ds.curlist.get(i);%>
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
<%= curlistRec.item_cd%>
<%= curlistRec.item_nm%>
<%= curlistRec.aset_cnt%>
<%= curlistRec.unit_cd%>
<%= curlistRec.unit_nm%>
<%= curlistRec.redm_clsf%>
<%= curlistRec.redm_clsf_nm%>
<%= curlistRec.redm_mthd_cd%>
<%= curlistRec.redm_mthd_cd_nm%>
<%= curlistRec.svc_yys_cnt%>
<%= curlistRec.accd_cd%>
<%= curlistRec.budg_cd%>
<%= curlistRec.budg_cd_nm%>
<%= curlistRec.use_yn%>
<%= curlistRec.incmg_pers_ipadd%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.nm_korn%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 19 20:00:59 KST 2009 */