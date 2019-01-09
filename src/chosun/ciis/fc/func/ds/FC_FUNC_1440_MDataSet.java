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


public class FC_FUNC_1440_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList note_clsf_cd = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_stat_cd_010;
	public String xx_stat_cd_020;
	public String xx_stat_cd_030;
	public String xx_stat_cd_040;

	public FC_FUNC_1440_MDataSet(){}
	public FC_FUNC_1440_MDataSet(String errcode, String errmsg, String xx_stat_cd_010, String xx_stat_cd_020, String xx_stat_cd_030, String xx_stat_cd_040){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_stat_cd_010 = xx_stat_cd_010;
		this.xx_stat_cd_020 = xx_stat_cd_020;
		this.xx_stat_cd_030 = xx_stat_cd_030;
		this.xx_stat_cd_040 = xx_stat_cd_040;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_stat_cd_010(String xx_stat_cd_010){
		this.xx_stat_cd_010 = xx_stat_cd_010;
	}

	public void setXx_stat_cd_020(String xx_stat_cd_020){
		this.xx_stat_cd_020 = xx_stat_cd_020;
	}

	public void setXx_stat_cd_030(String xx_stat_cd_030){
		this.xx_stat_cd_030 = xx_stat_cd_030;
	}

	public void setXx_stat_cd_040(String xx_stat_cd_040){
		this.xx_stat_cd_040 = xx_stat_cd_040;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_stat_cd_010(){
		return this.xx_stat_cd_010;
	}

	public String getXx_stat_cd_020(){
		return this.xx_stat_cd_020;
	}

	public String getXx_stat_cd_030(){
		return this.xx_stat_cd_030;
	}

	public String getXx_stat_cd_040(){
		return this.xx_stat_cd_040;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_1440_MNOTE_CLSF_CDRecord rec = new FC_FUNC_1440_MNOTE_CLSF_CDRecord();
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			rec.cd = Util.checkString(rset0.getString("cd"));
			this.note_clsf_cd.add(rec);
		}
		this.xx_stat_cd_010 = Util.checkString(cstmt.getString(6));
		this.xx_stat_cd_020 = Util.checkString(cstmt.getString(7));
		this.xx_stat_cd_030 = Util.checkString(cstmt.getString(8));
		this.xx_stat_cd_040 = Util.checkString(cstmt.getString(9));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_1440_MDataSet ds = (FC_FUNC_1440_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.note_clsf_cd.size(); i++){
		FC_FUNC_1440_MNOTE_CLSF_CDRecord note_clsf_cdRec = (FC_FUNC_1440_MNOTE_CLSF_CDRecord)ds.note_clsf_cd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getNote_clsf_cd()%>
<%= ds.getXx_stat_cd_010()%>
<%= ds.getXx_stat_cd_020()%>
<%= ds.getXx_stat_cd_030()%>
<%= ds.getXx_stat_cd_040()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= note_clsf_cdRec.cd_nm%>
<%= note_clsf_cdRec.cd%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jan 04 14:18:41 KST 2012 */