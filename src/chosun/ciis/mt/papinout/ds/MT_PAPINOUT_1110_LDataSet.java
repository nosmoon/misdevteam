/***************************************************************************************************
* 파일명 : SE_BAS_1210_LDataSet.java
* 기능 : 기준정보관리 - 매체단가관리
* 작성일자 : 2009-03-11
* 작성자 : 이민효
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mt.papinout.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.rec.*;

/**
 * 
 */


public class MT_PAPINOUT_1110_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String issu_remk;

	public MT_PAPINOUT_1110_LDataSet(){}
	public MT_PAPINOUT_1110_LDataSet(String errcode, String errmsg, String issu_remk){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.issu_remk = issu_remk;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setIssu_remk(String issu_remk){
		this.issu_remk = issu_remk;
	}
	
	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getIssu_remk(){
		return this.issu_remk;
	}
	
	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			MT_PAPINOUT_1110_LCURLISTRecord rec = new MT_PAPINOUT_1110_LCURLISTRecord();
			rec.ewh_dt = Util.checkString(rset0.getString("ewh_dt"));
			rec.fac_clsf = Util.checkString(rset0.getString("fac_clsf"));
			rec.matr_cd  = Util.checkString(rset0.getString("matr_cd"));
			rec.ewh_roll_cnt = Util.checkString(rset0.getString("ewh_roll_cnt"));
			rec.ewh_wgt = Util.checkString(rset0.getString("ewh_wgt"));
			rec.roll_wgt = Util.checkString(rset0.getString("roll_wgt"));
			rec.incmg_pers = Util.checkString(rset0.getString("incmg_pers"));
			rec.incmg_dt_tm = Util.checkString(rset0.getString("incmg_dt_tm"));
			rec.chg_pers = Util.checkString(rset0.getString("chg_pers"));
			rec.chg_dt_tm = Util.checkString(rset0.getString("chg_dt_tm"));
			this.curlist.add(rec);
		}
		this.issu_remk = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SE_BAS_1210_LDataSet ds = (SE_BAS_1210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		SE_BAS_1210_LCURLISTRecord curlistRec = (SE_BAS_1210_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.medi_cd%>
<%= curlistRec.sell_net_clsf%>
<%= curlistRec.aply_yymm%>
<%= curlistRec.uprc_amt%>
<%= curlistRec.remk%>
<%= curlistRec.incmg_pers%>
<%= curlistRec.incmg_dt_tm%>
<%= curlistRec.chg_pers%>
<%= curlistRec.chg_dt_tm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 09 15:29:10 KST 2009 */