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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_4040_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList xx_stat_cd_list = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_cd_020;
	public String xx_cd_030;
	public String xx_cd_040;
	public String xx_cd_050;

	public FC_FUNC_4040_MDataSet(){}
	public FC_FUNC_4040_MDataSet(String errcode, String errmsg, String xx_cd_020, String xx_cd_030, String xx_cd_040, String xx_cd_050){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_cd_020 = xx_cd_020;
		this.xx_cd_030 = xx_cd_030;
		this.xx_cd_040 = xx_cd_040;
		this.xx_cd_050 = xx_cd_050;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_cd_020(String xx_cd_020){
		this.xx_cd_020 = xx_cd_020;
	}

	public void setXx_cd_030(String xx_cd_030){
		this.xx_cd_030 = xx_cd_030;
	}

	public void setXx_cd_040(String xx_cd_040){
		this.xx_cd_040 = xx_cd_040;
	}

	public void setXx_cd_050(String xx_cd_050){
		this.xx_cd_050 = xx_cd_050;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_cd_020(){
		return this.xx_cd_020;
	}

	public String getXx_cd_030(){
		return this.xx_cd_030;
	}

	public String getXx_cd_040(){
		return this.xx_cd_040;
	}

	public String getXx_cd_050(){
		return this.xx_cd_050;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_4040_MCURLIST1Record rec = new FC_FUNC_4040_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			FC_FUNC_4040_MXX_STAT_CD_LISTRecord rec = new FC_FUNC_4040_MXX_STAT_CD_LISTRecord();
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			rec.cd = Util.checkString(rset1.getString("cd"));
			this.xx_stat_cd_list.add(rec);
		}
		this.xx_cd_020 = Util.checkString(cstmt.getString(7));
		this.xx_cd_030 = Util.checkString(cstmt.getString(8));
		this.xx_cd_040 = Util.checkString(cstmt.getString(9));
		this.xx_cd_050 = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_4040_MDataSet ds = (FC_FUNC_4040_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_FUNC_4040_MCURLIST1Record curlist1Rec = (FC_FUNC_4040_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_stat_cd_list.size(); i++){
		FC_FUNC_4040_MXX_STAT_CD_LISTRecord xx_stat_cd_listRec = (FC_FUNC_4040_MXX_STAT_CD_LISTRecord)ds.xx_stat_cd_list.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getXx_stat_cd_list()%>
<%= ds.getXx_cd_020()%>
<%= ds.getXx_cd_030()%>
<%= ds.getXx_cd_040()%>
<%= ds.getXx_cd_050()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.cd_abrv_nm%>
<%= curlist1Rec.cdnm_cd%>
<%= curlist1Rec.cdabrvnm_cd%>
<%= xx_stat_cd_listRec.cd_nm%>
<%= xx_stat_cd_listRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 06 14:41:50 KST 2012 */