/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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


public class FC_FUNC_6070_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String xx_deps_isav_stat_cd_010;
	public String xx_deps_isav_clsf_cd_010;

	public FC_FUNC_6070_MDataSet(){}
	public FC_FUNC_6070_MDataSet(String errcode, String errmsg, String xx_deps_isav_stat_cd_010, String xx_deps_isav_clsf_cd_010){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.xx_deps_isav_stat_cd_010 = xx_deps_isav_stat_cd_010;
		this.xx_deps_isav_clsf_cd_010 = xx_deps_isav_clsf_cd_010;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setXx_deps_isav_stat_cd_010(String xx_deps_isav_stat_cd_010){
		this.xx_deps_isav_stat_cd_010 = xx_deps_isav_stat_cd_010;
	}

	public void setXx_deps_isav_clsf_cd_010(String xx_deps_isav_clsf_cd_010){
		this.xx_deps_isav_clsf_cd_010 = xx_deps_isav_clsf_cd_010;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getXx_deps_isav_stat_cd_010(){
		return this.xx_deps_isav_stat_cd_010;
	}

	public String getXx_deps_isav_clsf_cd_010(){
		return this.xx_deps_isav_clsf_cd_010;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			FC_FUNC_6070_MCURLIST1Record rec = new FC_FUNC_6070_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			rec.cd_abrv_nm = Util.checkString(rset0.getString("cd_abrv_nm"));
			rec.cdnm_cd = Util.checkString(rset0.getString("cdnm_cd"));
			rec.cdabrvnm_cd = Util.checkString(rset0.getString("cdabrvnm_cd"));
			this.curlist1.add(rec);
		}
		this.xx_deps_isav_stat_cd_010 = Util.checkString(cstmt.getString(6));
		this.xx_deps_isav_clsf_cd_010 = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	FC_FUNC_6070_MDataSet ds = (FC_FUNC_6070_MDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_FUNC_6070_MCURLIST1Record curlist1Rec = (FC_FUNC_6070_MCURLIST1Record)ds.curlist1.get(i);%>
HTML �ڵ��....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getXx_deps_isav_stat_cd_010()%>
<%= ds.getXx_deps_isav_clsf_cd_010()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist1Rec.cd_abrv_nm%>
<%= curlist1Rec.cdnm_cd%>
<%= curlist1Rec.cdabrvnm_cd%>
----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Mon Jan 09 11:52:04 KST 2012 */