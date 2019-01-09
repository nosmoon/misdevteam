/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
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


public class HD_AFFR_9500_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList xx_lvcmpy_dty = new ArrayList();
	public ArrayList xx_bank_cd = new ArrayList();
	public ArrayList xx_memb_clsf = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_AFFR_9500_MDataSet(){}
	public HD_AFFR_9500_MDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			HD_AFFR_9500_MXX_MEMB_CLSFRecord rec = new HD_AFFR_9500_MXX_MEMB_CLSFRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cd_nm = Util.checkString(rset0.getString("cd_nm"));
			this.xx_memb_clsf.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			HD_AFFR_9500_MXX_LVCMPY_DTYRecord rec = new HD_AFFR_9500_MXX_LVCMPY_DTYRecord();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cd_nm = Util.checkString(rset1.getString("cd_nm"));
			this.xx_lvcmpy_dty.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			HD_AFFR_9500_MXX_BANK_CDRecord rec = new HD_AFFR_9500_MXX_BANK_CDRecord();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cd_nm = Util.checkString(rset2.getString("cd_nm"));
			this.xx_bank_cd.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_AFFR_9500_MDataSet ds = (HD_AFFR_9500_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.xx_memb_clsf.size(); i++){
		HD_AFFR_9500_MXX_MEMB_CLSFRecord xx_memb_clsfRec = (HD_AFFR_9500_MXX_MEMB_CLSFRecord)ds.xx_memb_clsf.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_lvcmpy_dty.size(); i++){
		HD_AFFR_9500_MXX_LVCMPY_DTYRecord xx_lvcmpy_dtyRec = (HD_AFFR_9500_MXX_LVCMPY_DTYRecord)ds.xx_lvcmpy_dty.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.xx_bank_cd.size(); i++){
		HD_AFFR_9500_MXX_BANK_CDRecord xx_bank_cdRec = (HD_AFFR_9500_MXX_BANK_CDRecord)ds.xx_bank_cd.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getXx_memb_clsf()%>
<%= ds.getXx_lvcmpy_dty()%>
<%= ds.getXx_bank_cd()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= xx_memb_clsfRec.cd%>
<%= xx_memb_clsfRec.cd_nm%>
<%= xx_lvcmpy_dtyRec.cd%>
<%= xx_lvcmpy_dtyRec.cd_nm%>
<%= xx_bank_cdRec.cd%>
<%= xx_bank_cdRec.cd_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Aug 25 14:52:16 KST 2017 */