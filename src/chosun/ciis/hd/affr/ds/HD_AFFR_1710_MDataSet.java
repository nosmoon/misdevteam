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


package chosun.ciis.hd.affr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_1710_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList xx_combo_020 = new ArrayList();
	public ArrayList xx_combo_010 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_proc_stat_010;
	public String xx_proc_stat_020;
	public String xx_proc_stat_030;
	public String xx_proc_stat_040;
	public String xx_proc_stat_050;
	public String xx_proc_stat_060;
	public String xx_scl_exps_clsf;

	public HD_AFFR_1710_MDataSet(){}
	public HD_AFFR_1710_MDataSet(String errcode, String errmsg, String xx_proc_stat_010, String xx_proc_stat_020, String xx_proc_stat_030, String xx_proc_stat_040, String xx_proc_stat_050, String xx_proc_stat_060, String xx_scl_exps_clsf){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_proc_stat_010 = xx_proc_stat_010;
		this.xx_proc_stat_020 = xx_proc_stat_020;
		this.xx_proc_stat_030 = xx_proc_stat_030;
		this.xx_proc_stat_040 = xx_proc_stat_040;
		this.xx_proc_stat_050 = xx_proc_stat_050;
		this.xx_proc_stat_060 = xx_proc_stat_060;
		this.xx_scl_exps_clsf = xx_scl_exps_clsf;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_proc_stat_010(String xx_proc_stat_010){
		this.xx_proc_stat_010 = xx_proc_stat_010;
	}

	public void setXx_proc_stat_020(String xx_proc_stat_020){
		this.xx_proc_stat_020 = xx_proc_stat_020;
	}

	public void setXx_proc_stat_030(String xx_proc_stat_030){
		this.xx_proc_stat_030 = xx_proc_stat_030;
	}

	public void setXx_proc_stat_040(String xx_proc_stat_040){
		this.xx_proc_stat_040 = xx_proc_stat_040;
	}

	public void setXx_proc_stat_050(String xx_proc_stat_050){
		this.xx_proc_stat_050 = xx_proc_stat_050;
	}

	public void setXx_proc_stat_060(String xx_proc_stat_060){
		this.xx_proc_stat_060 = xx_proc_stat_060;
	}

	public void setXx_scl_exps_clsf(String xx_scl_exps_clsf){
		this.xx_scl_exps_clsf = xx_scl_exps_clsf;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_proc_stat_010(){
		return this.xx_proc_stat_010;
	}

	public String getXx_proc_stat_020(){
		return this.xx_proc_stat_020;
	}

	public String getXx_proc_stat_030(){
		return this.xx_proc_stat_030;
	}

	public String getXx_proc_stat_040(){
		return this.xx_proc_stat_040;
	}

	public String getXx_proc_stat_050(){
		return this.xx_proc_stat_050;
	}

	public String getXx_proc_stat_060(){
		return this.xx_proc_stat_060;
	}

	public String getXx_scl_exps_clsf(){
		return this.xx_scl_exps_clsf;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			HD_AFFR_1710_MXX_COMBO_010Record rec = new HD_AFFR_1710_MXX_COMBO_010Record();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.xx_combo_010.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			HD_AFFR_1710_MXX_COMBO_020Record rec = new HD_AFFR_1710_MXX_COMBO_020Record();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.xx_combo_020.add(rec);
		}
		this.xx_proc_stat_010 = Util.checkString(cstmt.getString(7));
		this.xx_proc_stat_020 = Util.checkString(cstmt.getString(8));
		this.xx_proc_stat_030 = Util.checkString(cstmt.getString(9));
		this.xx_proc_stat_040 = Util.checkString(cstmt.getString(10));
		this.xx_proc_stat_050 = Util.checkString(cstmt.getString(11));
		this.xx_proc_stat_060 = Util.checkString(cstmt.getString(12));
		this.xx_scl_exps_clsf = Util.checkString(cstmt.getString(13));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_1710_MDataSet ds = (HD_AFFR_1710_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.xx_combo_010.size(); i++){
		HD_AFFR_1710_MXX_COMBO_010Record xx_combo_010Rec = (HD_AFFR_1710_MXX_COMBO_010Record)ds.xx_combo_010.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_combo_020.size(); i++){
		HD_AFFR_1710_MXX_COMBO_020Record xx_combo_020Rec = (HD_AFFR_1710_MXX_COMBO_020Record)ds.xx_combo_020.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_combo_010()%>
<%= ds.getXx_combo_020()%>
<%= ds.getXx_proc_stat_010()%>
<%= ds.getXx_proc_stat_020()%>
<%= ds.getXx_proc_stat_030()%>
<%= ds.getXx_proc_stat_040()%>
<%= ds.getXx_proc_stat_050()%>
<%= ds.getXx_proc_stat_060()%>
<%= ds.getXx_scl_exps_clsf()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= xx_combo_010Rec.cd_nm%>
<%= xx_combo_010Rec.cd%>
<%= xx_combo_020Rec.cd_nm%>
<%= xx_combo_020Rec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 16 16:33:33 KST 2012 */