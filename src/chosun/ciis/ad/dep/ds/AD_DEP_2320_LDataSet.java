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


package chosun.ciis.ad.dep.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.dep.rec.AD_DEP_2320_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_2320_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String start_dt;
	public String pubc_dt;

	public AD_DEP_2320_LDataSet(){}
	public AD_DEP_2320_LDataSet(String errcode, String errmsg, String start_dt, String pubc_dt){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.start_dt = start_dt;
		this.pubc_dt = pubc_dt;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setStart_dt(String start_dt){
		this.start_dt = start_dt;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getStart_dt(){
		return this.start_dt;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.start_dt = Util.checkString(cstmt.getString(6));
		this.pubc_dt = Util.checkString(cstmt.getString(7));
		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			AD_DEP_2320_LCURLISTRecord rec = new AD_DEP_2320_LCURLISTRecord();
			rec.medi_nm = Util.checkString(rset0.getString("medi_nm"));
			rec.gjavfee1 = Util.checkString(rset0.getString("gjavfee1"));
			rec.gjavfee2 = Util.checkString(rset0.getString("gjavfee2"));
			rec.gjavfee3 = Util.checkString(rset0.getString("gjavfee3"));
			rec.gjavfee4 = Util.checkString(rset0.getString("gjavfee4"));
			rec.gjavfee5 = Util.checkString(rset0.getString("gjavfee5"));
			rec.gjavfee7 = Util.checkString(rset0.getString("gjavfee7"));
			rec.igavfee1 = Util.checkString(rset0.getString("igavfee1"));
			rec.igavfee2 = Util.checkString(rset0.getString("igavfee2"));
			rec.igavfee3 = Util.checkString(rset0.getString("igavfee3"));
			rec.igavfee4 = Util.checkString(rset0.getString("igavfee4"));
			rec.igavfee5 = Util.checkString(rset0.getString("igavfee5"));
			rec.igavfee7 = Util.checkString(rset0.getString("igavfee7"));
			rec.nu_igavfee1 = Util.checkString(rset0.getString("nu_igavfee1"));
			rec.nu_igavfee2 = Util.checkString(rset0.getString("nu_igavfee2"));
			rec.nu_igavfee3 = Util.checkString(rset0.getString("nu_igavfee3"));
			rec.nu_igavfee4 = Util.checkString(rset0.getString("nu_igavfee4"));
			rec.nu_igavfee5 = Util.checkString(rset0.getString("nu_igavfee5"));
			rec.nu_igavfee7 = Util.checkString(rset0.getString("nu_igavfee7"));
			rec.dm_igavfee1 = Util.checkString(rset0.getString("dm_igavfee1"));
			rec.dm_igavfee2 = Util.checkString(rset0.getString("dm_igavfee2"));
			rec.dm_igavfee3 = Util.checkString(rset0.getString("dm_igavfee3"));
			rec.dm_igavfee4 = Util.checkString(rset0.getString("dm_igavfee4"));
			rec.dm_igavfee5 = Util.checkString(rset0.getString("dm_igavfee5"));
			rec.dm_igavfee7 = Util.checkString(rset0.getString("dm_igavfee7"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_2320_LDataSet ds = (AD_DEP_2320_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_2320_LCURLISTRecord curlistRec = (AD_DEP_2320_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getStart_dt()%>
<%= ds.getPubc_dt()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.medi_nm%>
<%= curlistRec.gjavfee1%>
<%= curlistRec.gjavfee2%>
<%= curlistRec.gjavfee3%>
<%= curlistRec.gjavfee4%>
<%= curlistRec.gjavfee5%>
<%= curlistRec.gjavfee7%>
<%= curlistRec.igavfee1%>
<%= curlistRec.igavfee2%>
<%= curlistRec.igavfee3%>
<%= curlistRec.igavfee4%>
<%= curlistRec.igavfee5%>
<%= curlistRec.igavfee7%>
<%= curlistRec.nu_igavfee1%>
<%= curlistRec.nu_igavfee2%>
<%= curlistRec.nu_igavfee3%>
<%= curlistRec.nu_igavfee4%>
<%= curlistRec.nu_igavfee5%>
<%= curlistRec.nu_igavfee7%>
<%= curlistRec.dm_igavfee1%>
<%= curlistRec.dm_igavfee2%>
<%= curlistRec.dm_igavfee3%>
<%= curlistRec.dm_igavfee4%>
<%= curlistRec.dm_igavfee5%>
<%= curlistRec.dm_igavfee7%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 23 10:25:25 KST 2009 */