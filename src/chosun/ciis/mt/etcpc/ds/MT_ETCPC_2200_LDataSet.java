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


package chosun.ciis.mt.etcpc.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.rec.*;

/**
 * 
 */


public class MT_ETCPC_2200_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_ETCPC_2200_LDataSet(){}
	public MT_ETCPC_2200_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			MT_ETCPC_2200_LCURLIST1Record rec = new MT_ETCPC_2200_LCURLIST1Record();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.mchn_mang_no = Util.checkString(rset0.getString("mchn_mang_no"));
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.addm_clsf = Util.checkString(rset0.getString("addm_clsf"));
			rec.cmps_item_clsf = Util.checkString(rset0.getString("cmps_item_clsf"));
			rec.cmps_item_brand = Util.checkString(rset0.getString("cmps_item_brand"));
			rec.cmps_item_spec = Util.checkString(rset0.getString("cmps_item_spec"));
			rec.estb_dt = Util.checkString(rset0.getString("estb_dt"));
			rec.incmg_pers_ipaddr = Util.checkString(rset0.getString("incmg_pers_ipaddr"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_ETCPC_2200_LDataSet ds = (MT_ETCPC_2200_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		MT_ETCPC_2200_LCURLIST1Record curlist1Rec = (MT_ETCPC_2200_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cmpy_cd%>
<%= curlist1Rec.mchn_mang_no%>
<%= curlist1Rec.seq%>
<%= curlist1Rec.addm_clsf%>
<%= curlist1Rec.cmps_item_clsf%>
<%= curlist1Rec.cmps_item_brand%>
<%= curlist1Rec.cmps_item_spec%>
<%= curlist1Rec.estb_dt%>
<%= curlist1Rec.incmg_pers_ipaddr%>
<%= curlist1Rec.incmg_pers%>
<%= curlist1Rec.incmg_dt_tm%>
<%= curlist1Rec.chg_pers%>
<%= curlist1Rec.chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Mar 24 15:55:55 KST 2009 */